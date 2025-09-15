public class User {

    private String UserName;
    private int age;
    public long aadhaarNumber;
    public String address;

    public void setUserName(String name) {
        this.UserName = name;
    }

    public String getUserName() {
        return UserName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return UserName;
    }
}