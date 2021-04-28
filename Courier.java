package feige.bean;

public class Courier extends Person{
    private String courierId;

    public Courier(){
    }
    public Courier(String courierId, String pwd){
        super.setPwd(pwd);
        this.courierId = courierId;
    }
    public Courier(String courierId, String name, String sex, int age , String pwd) {
        super(name,age,pwd,sex);//super只能出现在方法的第一行
        this.courierId = courierId;
    }

    public String getCourierId() {
        return courierId;
    }

    public void setCourierId(String courierId) {
        this.courierId = courierId;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "CourierId'" + courierId +'\''+
                ",name='" +getName() +'\'' +
                ",age='" +getAge() +'\'' +
                ",pwd='" +getPwd() +'\'' +
                ",sex='" +getSex() +'\'' +
                '}';
    }
}
