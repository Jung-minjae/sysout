package contents;

public class Contents {
	private int contentID;
	private String Title;
	private String userID;
	private String Date;
	private String content;
	private int Available;
	
	public int getContentID() {
		return contentID;
	}
	public void setContentID(int contentID) {
		this.contentID = contentID;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getAvailable() {
		return Available;
	}
	public void setAvailable(int available) {
		Available = available;
	}

}