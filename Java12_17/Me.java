package Java12_17;

public class Me {

	static int read_page = 1;

	public static void main(String[] args) {

		boolean reading = true;
		while (reading) {
			int i = 1;
			Book book = new Book();
			for (int j = 0; j < book.note.length(); j++) {
				String sub = book.note.substring(j, j + 1);
				System.out.println(sub);
			}
			read_page = book.read_page(read_page);
			System.out.println(read_page);
			if (book.page == read_page) {
				System.out.println("나는" + book.title + "를 다 읽었다");
				break;
			}
			i++;
		}

	}
}
