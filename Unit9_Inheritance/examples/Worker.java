package Unit9_Inheritance.examples;

public class Worker extends Person{
    private int salary;
    private String title;

    public Worker(String name, String birthday, int salary, String title) {
        super(name, birthday);
        this.salary = salary;
        this.title = title;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
