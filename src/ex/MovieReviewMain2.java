package ex;

public class MovieReviewMain2 {
    public static void main(String[] args) {

     MovieReview inception = new MovieReview();
     inception.review = "인생영화";
     inception.title = "인셉션";

     MovieReview aboutTime = new MovieReview();
     aboutTime.review = "인생영화";
     aboutTime.title = "인셉션";

     MovieReview reviews[] = new MovieReview[2];
     reviews[0] = inception;
     reviews[1] = aboutTime;

     for (int i = 0; i < reviews.length; i++) {
         System.out.println("영화제목 : " + reviews[i].title + "영화리뷰 : " + reviews[i].review);
     }

    }
}
