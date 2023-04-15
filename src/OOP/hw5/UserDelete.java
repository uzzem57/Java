package OOP.hw5;

public class UserDelete {

public static void userDelete(String name){
    if(UserAdd.baseUser.containsKey(name) == true){
        UserAdd.baseUser.remove(name);
    }
    else {
        System.out.println("Пользователя с такой фамилией не существует!");
    }
}
}
