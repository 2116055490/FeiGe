package feige.bean;

public class Person {
    private String name;
    private String sex;
    private String pwd;
    private Integer age;
    public Person(){
    }

    public Person(String name, int age, String pwd,String sex){
        this.name = name;
        this.age = age;
        this.pwd = pwd;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}

