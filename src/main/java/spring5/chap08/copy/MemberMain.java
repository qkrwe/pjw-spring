package spring5.chap08.copy;

import java.io.InputStream;
import java.util.Properties;

import javax.sql.DataSource;

import org.mariadb.jdbc.MariaDbDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * p.204 [리스?�� 8.13]�? Main�? Service�? 분리?�� Main �?�?<br>
 * Spring?���? bean?�� �?리하�? ?��?��
 * 
 * @author Jacob
 */
public class MemberMain {

	public static void main(String[] args) throws Exception {
		new MemberMain().go();
	}

	public void go() throws Exception {
		Properties props = new Properties();

		// ?��?��?��?��?��?�� ?��?�� db.properties ?��?��?��?�� ?��?��?��?���? ?��?��?��.
		InputStream in = getClass().getClassLoader()
				.getResourceAsStream("db.properties");
		props.load(in);

		// db.url ?��?��?��?�� 값으�? ?��?��?��?��?�� 초기?��
		DataSource dataSource = new MariaDbDataSource(
				props.getProperty("db.url"));

		// dataSource�? jdbcTemplate?�� ?��?��?��. (Injection)
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource);

		// jdbcTemplate?�� memberDao?�� ?��?��?��. (Injection)
		MemberDaoImplUsingSpringJdbc memberDao = new MemberDaoImplUsingSpringJdbc();
		memberDao.setJdbcTemplate(jdbcTemplate);

		// memberDao�? memberService?�� ?��?��?��. (Injection)
		MemberService memberService = new MemberService();
		memberService.setMemberDao(memberDao);

		// 비즈?��?�� 메서?�� ?��?��
		memberService.insertMember();
		memberService.selectAll();
	}
	
}