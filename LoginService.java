package feige.service;

import feige.bean.Customer;
import java.util.Scanner;
public class LoginService {
    private Scanner sc = null;

    public LoginService(Scanner scanner) {
        this.sc = scanner;
    }

    //注册
    public void register() {
        System.out.println("请输入用户的编号：");
        String clientId = sc.next();
        System.out.println("请输入用户的密码：");
        String pwd = sc.next();
        System.out.println("请输入用户名：");
        String name = sc.next();
        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        System.out.println("请输入性别：");
        String sex = sc.next();
        System.out.println("请输入手机号：");
        String phone = sc.next();

        Customer customer = Customer.builder().setCustomerId(clientId).Pwd(pwd);
        customer.setName(name);
        customer.setAge(age);
        customer.Pwd(pwd);
        customer.setSex(sex);
        // 把上面的对象保存到数组
        // CustomerData.save(customer);
    }
}
