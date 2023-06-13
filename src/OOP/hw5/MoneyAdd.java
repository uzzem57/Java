package OOP.hw5;

public class MoneyAdd {
    public static void balanceAdd(String name, double money) {
        if(UserAdd.baseUser.containsKey(name) == true){
            UserAdd.baseUser.replace(name,(UserAdd.baseUser.get(name) + money));
        }
        else {
            System.out.println("Пользователя с такой фамилией не существует!");
        }
    }
}
