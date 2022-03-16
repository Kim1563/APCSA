package PracticePlan;

public class Account {
    private String name, password;
    private int minsPracticed;

    public Account (String name, String password) {
        this.name = name;
        this.password = password;
        this.minsPracticed = 0;
    }

    public Account (String password) {
        this.name = "Anonymous";
        this.password = "123";
        this.minsPracticed = 0;
    }


}
