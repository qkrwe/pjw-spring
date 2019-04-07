package spring5.chap08.copy;

import java.io.InputStream;
import java.util.Properties;

import javax.sql.DataSource;

import org.mariadb.jdbc.MariaDbDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * p.204 [ë¦¬ìŠ¤?Š¸ 8.13]ë¥? Mainê³? Serviceë¡? ë¶„ë¦¬?•œ Main ë¶?ë¶?<br>
 * Spring?œ¼ë¡? bean?„ ê´?ë¦¬í•˜ì§? ?•Š?Œ
 * 
 * @author Jacob
 */
public class MemberMain {

	public static void main(String[] args) throws Exception {
		new MemberMain().go();
	}

	public void go() throws Exception {
		Properties props = new Properties();

		// ?´?˜?Š¤?Œ¨?Š¤?— ?ˆ?Š” db.properties ?ŒŒ?¼?—?„œ ?”„?¼?¼?‹°ë¥? ?½?Š”?‹¤.
		InputStream in = getClass().getClassLoader()
				.getResourceAsStream("db.properties");
		props.load(in);

		// db.url ?”„?¼?¼?‹° ê°’ìœ¼ë¡? ?°?´?„°?†Œ?Š¤ ì´ˆê¸°?™”
		DataSource dataSource = new MariaDbDataSource(
				props.getProperty("db.url"));

		// dataSourceë¥? jdbcTemplate?— ?„£?Š”?‹¤. (Injection)
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource);

		// jdbcTemplate?„ memberDao?— ?„£?Š”?‹¤. (Injection)
		MemberDaoImplUsingSpringJdbc memberDao = new MemberDaoImplUsingSpringJdbc();
		memberDao.setJdbcTemplate(jdbcTemplate);

		// memberDaoë¥? memberService?— ?„£?Š”?‹¤. (Injection)
		MemberService memberService = new MemberService();
		memberService.setMemberDao(memberDao);

		// ë¹„ì¦ˆ?‹ˆ?Š¤ ë©”ì„œ?“œ ?‹¤?–‰
		memberService.insertMember();
		memberService.selectAll();
	}
	
}