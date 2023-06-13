package OOP.hw5;

public class MoneyDel {
    public static void balanceDel(String name, double money) {
        if (UserAdd.baseUser.containsKey(name) == true && UserAdd.baseUser.get(name) > money) {
            UserAdd.baseUser.replace(name, (UserAdd.baseUser.get(name) - money));
        } else {
            System.out.println("Пользователя с такой фамилией не существует или баланс пользователя меньше суммы изьятия");
        }
    }
}
