public class User {
    private String userName;
    private int age;
    private long adharNumber;   // private
    private String address;     // private

    public User(String userName, int age, long adharNumber, String address) {
        this.userName = userName;
        this.age = age;
        this.adharNumber = adharNumber;
        this.address = address;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getAdharNumber() {
        return adharNumber;
    }

    public void setAdharNumber(long adharNumber) {
        this.adharNumber = adharNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                ", adharNumber=" + adharNumber +
                ", address='" + address + '\'' +
                '}';
    }
}