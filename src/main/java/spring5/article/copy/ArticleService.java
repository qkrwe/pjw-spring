package spring5.article.copy;

import java.util.List;

/**
 * articleDaoë¥? ?‚¬?š©?•´?„œ ê¸? ëª©ë¡, ì¡°íšŒ, ì¶”ê?, ?ˆ˜? •, ?‚­? œë¥? ?•œ?‹¤.
 * 
 * @author Jacob
 */
public class ArticleService {

	ArticleDao articleDao;

	public void setArticleDao(ArticleDao articleDao) {
		this.articleDao = articleDao;
	}

	/**
	 * ê¸? ëª©ë¡
	 */
	public void listArticles() {
		List<Article> articles = articleDao.listArticles();
		System.out.println(articles);
	}

	/**
	 * ê¸? ì¡°íšŒ
	 */
	public void getArticle() {
		Article article = articleDao.getArticle("3");
		System.out.println(article);
	}

	/**
	 * ê¸? ?“±ë¡?
	 */
	public void addArticle() {
		Article article = new Article();
		article.setTitle("?ƒˆë¡œìš´ '?„°ë¯¸ë„¤?´?„°' ?˜?™”?˜ ?Š¤?‹¸?´ ê³µê°œ??‹¤(?‚¬ì§? 6?¥)");
		article.setContent(
				"ì§??‚œ 2?›”, ? œ?„?Š¤ ì¹´ë©”ë¡? ê°ë…?? ??‹ ?´ ? œ?‘ì¤‘ì¸ ?ƒˆë¡œìš´ ?˜í„°ë¯¸ë„¤?´?„°?? ?˜?™”?˜ ê°?? œë¥? ê³µê°œ?–ˆ?‹¤. ?™í„°ë¯¸ë„¤?´?„° : ?‹¤?¬ ?˜?´?Š¸(Terminator: Dark Fate)?‹¤. ?´ ? œëª©ì? ?´? œ ê°?? œê°? ?•„?‹Œ ? •?‹ ? œëª©ì´ ?ê³?, 20?„¸ê¸? ?­?Š¤?Š” 4?›” 6?¼, ?´ ?˜?™”?˜ ?Š¤?‹¸?„ ê³µê°œ?–ˆ?‹¤.");
		article.setUserId("1");
		article.setName("ì¡°ì›?„");
		if (articleDao.addArticle(article) > 0)
			System.out.println("ê¸??„ ì¶”ê??–ˆ?Šµ?‹ˆ?‹¤.");
		else
			System.out.println("ê¸??„ ì¶”ê??•˜ì§? ëª»í–ˆ?Šµ?‹ˆ?‹¤.");
	}

	/**
	 * ê¸? ?ˆ˜? •
	 */
	public void updateArticle() {
		Article article = new Article();
		article.setArticleId("7");
		article.setTitle("This is modified title.");
		article.setContent("This is modified content");
		if (articleDao.updateArticle(article) > 0)
			System.out.println("ê¸??„ ?ˆ˜? •?–ˆ?Šµ?‹ˆ?‹¤.");
		else
			System.out.println("ê¸??„ ?ˆ˜? •?•˜ì§? ëª»í–ˆ?Šµ?‹ˆ?‹¤.");
	}

	/**
	 * ê¸? ?‚­? œ
	 */
	public void deleteArticle() {
		if (articleDao.deleteArticle("8") > 0)
			System.out.println("ê¸??„ ?‚­? œ?–ˆ?Šµ?‹ˆ?‹¤.");
		else
			System.out.println("ê¸??„ ?‚­? œ?•˜ì§? ëª»í–ˆ?Šµ?‹ˆ?‹¤.");
	}
}