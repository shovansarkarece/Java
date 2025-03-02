![image](https://github.com/user-attachments/assets/124e4b5b-fc47-4ac6-ba78-9358e5e99016)

![image](https://github.com/user-attachments/assets/5d5e2c6a-8ecc-4d92-9811-1ac3ca0c7d58)
![image](https://github.com/user-attachments/assets/18019577-e726-4430-b9ba-91c5fbb8af20)
![image](https://github.com/user-attachments/assets/7af37f75-682f-422d-8eed-40dd8c3488c4)
![image](https://github.com/user-attachments/assets/c40d4135-b606-4df0-a6ec-13fbc2c7739d)
```
interface ATM{
/////----------------interface contains only abstract method */
int amount = 10000; ////by default this variable is public static and final
public static final String bankName = "Reserve Bank";
String withDraw(); ////by dfault this method is abstract and public also
public abstract String checkBal();
public String checkBankName();
}
class User1 implements ATM{
///// amount , bankName
public String withDraw(){
    return "User want to withdraw 1000 Euro";
}
public String checkBal(){
    return "User balance is 40000 Euro";
}
public String checkBankName(){
    return "User want to check bankname";
}
}
class User2 implements ATM{
    ///// amount , bankName
    public String withDraw(){
        return "User want to withdraw 5000 Euro";
    }
    public String checkBal(){
        return "User balance is 100000 Euro";
    }
    public String checkBankName(){
        return "User want to check bankname";
    }
}
public class Interface{
    public static void main(String[] args) {
        User1 user1= new User1();
        System.out.println(user1.amount+":"+user1.bankName);
        System.out.println(user1.withDraw()+":"+user1.checkBal());
        System.out.println();
        User2 user2 = new User2();
        System.out.println(user2.amount+":"+user2.bankName);
        System.out.println(user2.withDraw()+":"+user2.checkBal());
        System.out.println();
    }
}
```
# Output:
```
10000:Reserve Bank
User want to withdraw 1000 Euro:User balance is 40000 Euro

10000:Reserve Bank
User want to withdraw 5000 Euro:User balance is 100000 Euro
```
