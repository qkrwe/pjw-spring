package spring5.article.copy;

/**
 * Article ?λ©μΈ ?€λΈμ ?Έ.<br>
 * ?°?΄?°λ² μ΄?€? article ??΄λΈμ λ§€ν??€.
 * 
 * @author Jacob
 */
public class Article {
	// κΈ?λ²νΈ
	String articleId;

	// ? λͺ?
	String title;

	// ?΄?©
	String content;

	// ??±? ??΄?
	String userId;

	// ??±? ?΄λ¦?
	String name;

	// ?±λ‘μΌ?
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