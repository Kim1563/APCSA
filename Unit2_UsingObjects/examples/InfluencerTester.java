package Unit2_UsingObjects.examples;

public class InfluencerTester {
    public static void main(String[] args) {
        Influencer SaiKovour = new Influencer("Saigon", "YT", 10000, false);
        SaiKovour.displayInfo();
        SaiKovour.getReward();

        Influencer StephThomas = new Influencer("Stephen", "Insta", 1000000);
        StephThomas.displayInfo();
        StephThomas.setFollowers(10000000);
        StephThomas.getReward();
    }
}
