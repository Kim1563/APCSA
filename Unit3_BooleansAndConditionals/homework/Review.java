package Unit3_BooleansAndConditionals.homework;

public class Review {
    private String reviewerName, businessName;
    private int rating;

    public Review(String reviewerName, String businessName, int rating) {
        this.reviewerName = reviewerName;
        this.businessName = businessName;
        this.rating = rating;
    }

    public String getReviewerName() {
        return reviewerName;
    }

    public void setReviewerName(String reviewerName) {
        this.reviewerName = reviewerName;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String toString(){
        String returnString = "";
        returnString += reviewerName + ", " + businessName + ", " + rating;
        if (rating == 5){
            returnString += "\n\t** Highly Recommended";
        } else if (rating == 1){
            returnString += "\n\t** Strongly Discouraged";
        }
        return returnString;
    }
}
