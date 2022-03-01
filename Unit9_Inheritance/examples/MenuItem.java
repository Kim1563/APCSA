package Unit9_Inheritance.examples;

public class MenuItem {
    private String name;

    public MenuItem() {
        name = "none given";
        System.out.println("Created a MenuItem without a name?!?!?");
    }

    public MenuItem(String name) {
        this.name = name;
        System.out.println("Created a MenuItem called " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        String output = "Menu item: " + this.name;
        return output;
    }
}
