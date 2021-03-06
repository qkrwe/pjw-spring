package spring5.article.copy;

import java.util.List;

/**
 * Data Access Object.<br>
 * ?°?΄?°λ² μ΄?€? ? ??΄? ?°?΄?°λ₯? μ‘°μ?? ?Έ?°??΄?€.
 * 
 * @author Jacob
 */
public interface ArticleDao {

	/**
	 * λͺ©λ‘
	 */
	List<Article> listArticles();

	/**
	 * μ‘°ν
	 */
	Article getArticle(String articleId);

	/**
	 * ?±λ‘?
	 * 
	 * @return μΆκ?? ?? κ°??
	 */
	int addArticle(Article article);

	/**
	 * ?? 
	 * 
	 * @return ?? ? ?? κ°??
	 */
	int updateArticle(Article article);

	/**
	 * ?­? 
	 * 
	 * @return ?­? ? ?? κ°??
	 */
	int deleteArticle(String articleId);
}