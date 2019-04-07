package spring5.article.copy;

import java.util.List;

/**
 * articleDao�? ?��?��?��?�� �? 목록, 조회, 추�?, ?��?��, ?��?���? ?��?��.
 * 
 * @author Jacob
 */
public class ArticleService {

	ArticleDao articleDao;

	public void setArticleDao(ArticleDao articleDao) {
		this.articleDao = articleDao;
	}

	/**
	 * �? 목록
	 */
	public void listArticles() {
		List<Article> articles = articleDao.listArticles();
		System.out.println(articles);
	}

	/**
	 * �? 조회
	 */
	public void getArticle() {
		Article article = articleDao.getArticle("3");
		System.out.println(article);
	}

	/**
	 * �? ?���?
	 */
	public void addArticle() {
		Article article = new Article();
		article.setTitle("?��로운 '?��미네?��?��' ?��?��?�� ?��?��?�� 공개?��?��(?���? 6?��)");
		article.setContent(
				"�??�� 2?��, ?��?��?�� 카메�? 감독?? ?��?��?�� ?��?��중인 ?��로운 ?�터미네?��?��?? ?��?��?�� �??���? 공개?��?��. ?�터미네?��?�� : ?��?�� ?��?��?��(Terminator: Dark Fate)?��. ?�� ?��목�? ?��?�� �??���? ?��?�� ?��?�� ?��목이 ?���?, 20?���? ?��?��?�� 4?�� 6?��, ?�� ?��?��?�� ?��?��?�� 공개?��?��.");
		article.setUserId("1");
		article.setName("조원?��");
		if (articleDao.addArticle(article) > 0)
			System.out.println("�??�� 추�??��?��?��?��.");
		else
			System.out.println("�??�� 추�??���? 못했?��?��?��.");
	}

	/**
	 * �? ?��?��
	 */
	public void updateArticle() {
		Article article = new Article();
		article.setArticleId("7");
		article.setTitle("This is modified title.");
		article.setContent("This is modified content");
		if (articleDao.updateArticle(article) > 0)
			System.out.println("�??�� ?��?��?��?��?��?��.");
		else
			System.out.println("�??�� ?��?��?���? 못했?��?��?��.");
	}

	/**
	 * �? ?��?��
	 */
	public void deleteArticle() {
		if (articleDao.deleteArticle("8") > 0)
			System.out.println("�??�� ?��?��?��?��?��?��.");
		else
			System.out.println("�??�� ?��?��?���? 못했?��?��?��.");
	}
}