package nested.test.ex1;

public class Library {
    private int index;
    private Book[] list;

    public Library(int size) {
        this.list = new Book[size];
    }

    public void addBook(String title, String author) {
        if (index >= list.length) {
            System.out.println("도서관 저장 공간이 부족합니다.");
            return;
        }
        list[index++] = new Book(title, author);
    }

    public void showBooks() {
        System.out.println("== 책 목록 출력==");
        for (Book book : list) {
            System.out.println("도서 제목: " + book.title + ", 저자: " + book.author);
        }
    }

    private static class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}
