package spring5.article.copy;

/**
 * Article ?„ë©”ì¸ ?˜¤ë¸Œì ?Š¸.<br>
 * ?°?´?„°ë² ì´?Š¤?˜ article ?…Œ?´ë¸”ì— ë§¤í•‘?•œ?‹¤.
 * 
 * @author Jacob
 */
public class Article {
	// ê¸?ë²ˆí˜¸
	String articleId;

	// ? œëª?
	String title;

	// ?‚´?š©
	String content;

	// ?‘?„±? ?•„?´?””
	String userId;

	// ?‘?„±? ?´ë¦?
	String name;

	// ?“±ë¡ì¼?‹œ
	String cdate;

	/*
	 * Getter and Setter methods
	 */
	public String getArticleId() {
		return articleId;
	}

	public void setArticleId(String articleId) {
		this.articleId = articleId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCdate() {
		return cdate;
	}

	public void setCdate(String cdate) {
		this.cdate = cdate;
	}

	@Override
	public String toString() {
		return "Article [articleId=" + articleId + ", title=" + title
				+ ", content=" + content + ", userId=" + userId + ", name="
				+ name + ", cdate=" + cdate + "]";
	}
}