package Unit2_UsingObjects.examples;

public class Influencer {
    private String name;
    private String genre;
    private long followers;
    private boolean isPopular = false;
    public Influencer(String name, String genre, long followers, boolean isPopular){
        this.name = name;
        this.genre = genre;
        this.followers = followers;
        this.isPopular = isPopular;
    }
    public Influencer(String name, String genre, long followers){
        this.name = name;
        this.genre = genre;
        this.followers = followers;

        if (followers >= 1000000){
            isPopular = true;
        }
    }
    public String getName(){
        return name;
    }
    public String getGenre(){
        return genre;
    }
    public long getFollowers(){
        return followers;
    }
    public boolean getIsPopular(){
        return isPopular;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public void setFollowers(long followers){
        this.followers = followers;
    }
    public void setPopularity(boolean popularity){
        isPopular = popularity;
    }
    public void displayInfo(){
        String popularity = "";
        if (isPopular){
            popularity = " is popular";
        }
        System.out.println(name + popularity + " on " + genre + " with " + followers + " followers.\n");
    }
    public void getReward(){
        if (isPopular){
            System.out.println(name + " receives the Popularity Award\n");
        } else {
            System.out.println(name + " isn't popular\n");
        }
    }
}
