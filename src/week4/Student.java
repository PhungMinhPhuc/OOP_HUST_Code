/*• Viết lớp Student
• name
• year
• 1 phương thức khởi dựng
• Student(String name, int year)
• Tự tạo phương thức geãer, seãer cho đủ dùng
• Đảm bảo đóng gói, che dấu dữ liệu */

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
