package spring5.chap08.copy;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * p.204 [Î¶¨Ïä§?ä∏ 8.13]Î•? MainÍ≥? ServiceÎ°? Î∂ÑÎ¶¨?ïú Main Î∂?Î∂?<br>
 * Spring?úºÎ°? bean?ùÑ Í¥?Î¶¨Ìï®
 * 
 * @author Jacob
 */
public class MemberMainUsingSpring {

	/**
	 * main() Î©îÏÑú?ìú
	 */
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext(
				"chap08.xml");
		MemberService memberService = ctx.getBean(MemberService.class);
		memberService.insertMember();
		memberService.selectAll();
		ctx.close();
	}
}