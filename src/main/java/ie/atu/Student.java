package ie.atu;

public class Student
{
    private String name;
    private String email;
    private String course;

    public Student() {
    }

    //constructor created for the third instance of GetDetails
    public Student(String name, String email, String course) {
        this.name = name;
        this.email = email;
        this.course = course;
    }

    //getter and setters created for first and second instances of GetDetails
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
