package login_app.models;

public class Profile {
    private String fullName;
    private int age;
    private String hobby;
    private String nickName;

    
    public Profile() {
    }

    public Profile(String fullName, int age, String hobby, String nickName) {
        this.fullName = fullName;
        this.age = age;
        this.hobby = hobby;
        this.nickName = nickName;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getHobby() {
        return hobby;
    }

    public String getNickName() {
        return nickName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
