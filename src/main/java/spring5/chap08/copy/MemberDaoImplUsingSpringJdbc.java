package spring5.chap08.copy;

import java.util.List;

import spring5.chap03.Member;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


@Repository("memberDao")
public class MemberDaoImplUsingSpringJdbc implements MemberDao {

	static final String SELECT_BY_EMAIL = "SELECT memberId, email, name FROM member WHERE email=?";

	static final String INSERT = "INSERT member(email, password, name) VALUES(?, sha2(?,256), ?)";

	static final String UPDATE = "UPDATE member SET email=?, password=sha2(?,256), name=? WHERE memberId=?";

	static final String SELECT_ALL = "SELECT memberId, email, name FROM member ORDER BY memberId desc LIMIT ?,?";

	JdbcTemplate jdbcTemplate;

	/**
	 * jdbcTemplate setter for injection
	 */
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	/**
	 * p.194?ùò memberRowMapper<br>
	 * Member ?ò§Î∏åÏ†ù?ä∏?? member ?Öå?ù¥Î∏îÏùò ?ïú ?ñâ?ùÑ Îß§Ìïë?ïò?äî rowMapper
	 */
	RowMapper<Member> memberRowMapper = new BeanPropertyRowMapper<>(
			Member.class);

	/**
	 * p.192 [Î¶¨Ïä§?ä∏ 8.8]?ùò selectByEmail() Î©îÏÑú?ìú ?àò?†ï
	 */
	@Override
	public Member selectByEmail(String email) {
		return jdbcTemplate.queryForObject(SELECT_BY_EMAIL, memberRowMapper,
				email);
	}

	/**
	 * p.201 [Î¶¨Ïä§?ä∏ 8.12]?ùò insert() Î©îÏÑú?ìú ?àò?†ï
	 */
	@Override
	public void insert(Member member) {
		jdbcTemplate.update(INSERT, member.getEmail(), member.getPassword(),
				member.getName());
	}

	/**
	 * p.198 [Î¶¨Ïä§?ä∏ 8.11]?ùò update() Î©îÏÑú?ìú ?àò?†ï
	 */
	@Override
	public void update(Member member) {
		jdbcTemplate.update(UPDATE, member.getEmail(), member.getPassword(),
				member.getName(), member.getMemberId());
	}

	/**
	 * p.195 [Î¶¨Ïä§?ä∏ 8.9] selectAll() Î©îÏÑú?ìú ?àò?†ï
	 */
	@Override
	public List<Member> selectAll(int offset, int count) {
		return jdbcTemplate.query(SELECT_ALL, memberRowMapper, 0, 100);
	}
}
