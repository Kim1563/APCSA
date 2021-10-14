package Unit3_BooleansAndConditionals.examples;

public class Student {
    private String fName;
    private String lName;
    private int idNum;

    public Student(String fName, String lName, int idNum) {
        this.fName = fName;
        this.lName = lName;
        this.idNum = idNum;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getIdNum() {
        return idNum;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }

    // Retyrns true if both first name and last name are equal; false otherwise
    public boolean equals(Student other){
        return this.fName.equals(other.fName) && this.lName.equals(other.lName);
    }

    // Returns positive if last name comes before other last name; if last names are equal, returns compared to first names
    public int compareTo(Student other){
        int compareNum = this.lName.compareTo(other.lName);
        if (compareNum == 0){
            return this.fName.compareTo(other.fName);
        }
        return compareNum;
    }
}
