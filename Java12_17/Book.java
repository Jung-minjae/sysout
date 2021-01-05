package Java12_17;

public class Book {
	String title = "채식주의자";
	String author = "한강";
	static int page = 360;

	String note = "채식주의자는! 클래스 개어렵다 진짜로 레알 ";

	public static int read_page(int page) {
		// this.page=page-1;
		page = page + 1;
		// Book.page = Book.page-page;

		return page;
	}

}
