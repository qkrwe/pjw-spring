package spring5.chap08.copy;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import spring5.chap03.Member;

/**
 * p.204 [리스?�� 8.13]�? Main�? Service�? 분리?�� Service �?�?
 * 
 * @author Jacob
 */
public class MemberService {

	Logger logger = LogManager.getLogger();

	MemberDao memberDao = null;

	/**
	 * memberDao setter for injection
	 */
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	public void selectAll() {
		List<Member> members = memberDao.selectAll(0, 100);
		logger.debug(members);
	}

	public void updateMember() {
		Member member = memberDao.selectByEmail("sunha0822@naver.com");
		member.setPassword("b");
		memberDao.update(member);
		logger.debug("Update complete.");
	}

	public void insertMember() {
		Member member = new Member();
		member.setEmail("qkrwe98@naver.com");
		member.setPassword("5412");
		member.setName("박진?��");
		memberDao.insert(member);
		logger.debug("Insert complete.");
	}
}