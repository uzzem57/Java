package OOP.hw5;

public class MoneyAdd {
    public static void balanceAdd(String name, double money) {
        if(UserAdd.baseUser.containsKey(name) == true){
            Double count = UserAdd.baseUser.get(name) + money;
            UserAdd.baseUser.replace(name,count);
        }
        else {
            System.out.println("Пользователя с такой фамилией не существует!");
        }
    }
}
