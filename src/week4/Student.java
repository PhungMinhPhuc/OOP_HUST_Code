package week4;

public class Student {
    private String name;
    private int year;

    public Student (String name, int year)
    {
        this.name = name;
        this.year = year;
    }

    // Getter
    public String getName(){
        return name;
    }
    public int getYear(){
        return year;
    }

    // Setter
    public void setName(String name){
        this.name = name;
    }
    public void setYear(int year){
        this.year = year;
    }
}
