package spring5.chap03;

/**
 * MemberRegisterService�� �׽�Ʈ�Ѵ�.<br>
 * new�� ����ؼ� ���� �ν��Ͻ��� �����Ѵ�.
 * 
 * @author 
 */
public class MemberMain {

	public static void main(String[] args) {
		//MemberDao memberDao = new MemberDao();//
		//MemberRegisterService regService = new MemberRegisterService(memberDao);//

		// registerRequest �ʱ�ȭ
		RegisterRequest req = new RegisterRequest();
		req.setEmail("jacob@irafe.com");
		req.setPassword("xxxx");
		req.setName("Jacob");

		// ȸ�� ���
		//regService.regist(req);
	}
}