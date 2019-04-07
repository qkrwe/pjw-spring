package spring5.article.copy;

import java.util.List;

/**
 * Data Access Object.<br>
 * ?°?´?„°ë² ì´?Š¤?— ? ‘?†?•´?„œ ?°?´?„°ë¥? ì¡°ì‘?•˜?Š” ?¸?„°?˜?´?Š¤.
 * 
 * @author Jacob
 */
public interface ArticleDao {

	/**
	 * ëª©ë¡
	 */
	List<Article> listArticles();

	/**
	 * ì¡°íšŒ
	 */
	Article getArticle(String articleId);

	/**
	 * ?“±ë¡?
	 * 
	 * @return ì¶”ê??œ ?–‰?˜ ê°??ˆ˜
	 */
	int addArticle(Article article);

	/**
	 * ?ˆ˜? •
	 * 
	 * @return ?ˆ˜? •?œ ?–‰?˜ ê°??ˆ˜
	 */
	int updateArticle(Article article);

	/**
	 * ?‚­? œ
	 * 
	 * @return ?‚­? œ?œ ?–‰?˜ ê°??ˆ˜
	 */
	int deleteArticle(String articleId);
}