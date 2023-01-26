import java.time.Year;

public class Person {
    private String fName;
    private String lName;
    private String title;
    private String iD;
    private int yob;



    private String fullName;
    private int age;
    private String record;



    public Person(String fName, String lName, String title, String iD, int yob) {
        this.fName = fName;
        this.lName = lName;
        this.title = title;
        this.iD = iD;
        this.yob = yob;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }




    public String getFullName()
    {
        return fName + " " + lName;
    }

    public String getFormalName()
    {
        return title + " " + fName + " " + lName;
    }

    public int getAge()
    {
        return Integer.parseInt(Year.now().toString()) - yob;
    }


    public String toString()
    {
        return iD + ", " + fName + ", " + lName + ", " + title + ", " + yob;
    }




}