package spring5.chap03;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * p.55 [����Ʈ 3.1] MemberRegisterService ����<br>
 * ȸ���� ����ϴ� ����
 * 
 * @author Jacob
 */
public class MemberRegisterService {

	private MemberDao memberDao;

	static Logger logger = LogManager.getLogger();

	/**
	 * memberDao�� �ʱ�ȭ�ϴ� ����Ʈ����
	 */
	//public MemberRegisterService(MemberDao memberDao) {//
		//this.memberDao = memberDao;///
	//}//

	/**
	 * ȸ�� ���
	 * 
	 * @param req ����ڰ� �Է��� ȸ�� ����
	 * @throws DuplicateMemberException �̸����� �ߺ��� ��쿡 �߻�
	 */
	public void regist(RegisterRequest req) throws DuplicateMemberException {
		logger.debug(req);
		Member member = memberDao.selectByEmail(req.getEmail());

		// ȸ���� �̹� �����ϸ� ���� �߻�
		if (member != null) {
			throw new DuplicateMemberException("�̸��� �ߺ� " + req.getEmail());
		}

		// ȸ������ ����
		Member newMember = new Member(req.getEmail(), req.getPassword(),
				req.getName());
		memberDao.insert(newMember);
		logger.debug("ȸ�� ������ �����߽��ϴ�.");
	}
}