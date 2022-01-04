package com.hai.encap;

/*
    姓名：长度为2、3或4
    余额：必须大于20
    密码：必须是六位
    如果不满足给出提示信息，并给出默认值
 */
public class Account {

    public String name;
    private double balance; // 余额
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        }else{
            System.out.println("姓名长度不合法，需满足2-4位，默认姓名为：王二");
            this.name = "王二";
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance < 20 ){
            System.out.println("余额不合法，需要大于20，默认为0");
            this.balance = 0;
        }else {
            this.balance = balance;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.length() != 6){
            System.out.println("密码长度必须为6，默认密码为：000000");
            this.password = "000000";
        }else {
            this.password = password;
        }
    }

    public void info(){
        System.out.println("姓名："+this.name + "\t余额：" + this.balance + "\t密码：" + this.password);
    }
}
