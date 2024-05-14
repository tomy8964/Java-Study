package class1;

public class 영화_리뷰_관리하기 {

    public static void main(String[] args) {
        MovieReview movieReview1 = new MovieReview();
        movieReview1.title = "인셉션";
        movieReview1.review = "인생은 무한 루프";

        MovieReview movieReview2 = new MovieReview();
        movieReview2.title = "어바웃 타임";
        movieReview2.review = " 인생 시간 영화!";

        MovieReview[] arr = new MovieReview[2];
        arr[0] = movieReview1;
        arr[1] = movieReview2;

        for (MovieReview movieReview : arr) {
            System.out.println("영화 제목: " + movieReview.title + ", 리뷰: " + movieReview.review);
        }
    }
    public static class MovieReview {
        String title;
        String review;
    }
}
