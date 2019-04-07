package spring5.chap08.copy;

import java.util.List;

import spring5.chap03.Member;

/**
 * p.184 [λ¦¬μ€?Έ 8.2] MemberDao λ₯? interfaceλ‘? ?? <br>
 * ?? ??΄λΈμ μ‘°μ?? Data Access Object
 * 
 * @author Jacob
 */
public interface MemberDao {

	/**
	 * ?΄λ©μΌλ‘? ?? ? λ³? κ°?? Έ?΄
	 */
	Member selectByEmail(String email);

	/**
	 * ??? λ³? ???₯
	 */
	void insert(Member member);

	/**
	 * ??? λ³? ?? 
	 */
	void update(Member member);

	/**
	 * ?? λͺ©λ‘
	 */
	List<Member> selectAll(int offset, int count);
}