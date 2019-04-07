package spring5.article.copy;

import java.util.List;

/**
 * Data Access Object.<br>
 * ?��?��?��베이?��?�� ?��?��?��?�� ?��?��?���? 조작?��?�� ?��?��?��?��?��.
 * 
 * @author Jacob
 */
public interface ArticleDao {

	/**
	 * 목록
	 */
	List<Article> listArticles();

	/**
	 * 조회
	 */
	Article getArticle(String articleId);

	/**
	 * ?���?
	 * 
	 * @return 추�??�� ?��?�� �??��
	 */
	int addArticle(Article article);

	/**
	 * ?��?��
	 * 
	 * @return ?��?��?�� ?��?�� �??��
	 */
	int updateArticle(Article article);

	/**
	 * ?��?��
	 * 
	 * @return ?��?��?�� ?��?�� �??��
	 */
	int deleteArticle(String articleId);
}