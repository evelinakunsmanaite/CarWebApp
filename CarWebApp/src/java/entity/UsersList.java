/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;
 /*
 * @author Administrator
 */
public class UsersList {
    private static User[] users
;    
      static {
        users = new User[5];
        users[0] = new User("20031","Рябицкий",  "Андрей", "Викторович", "lina2002");
        users[1] = new User("20092","Кунсманайте",  "Эвелина", "Арвидасовна", "+375 33 317 5235");
        users[2] = new User("20025","Сараев",  "Никита", "Олегович", "+375 29 816 8761");
        users[3] = new User("20030","Хлуденко",  "Александр", "Сергеевич", "+375 29 133 7228");
        users[4] = new User("20032","Рыбиков",  "Даниил", "Александрович", "+375 29 121 2851");
    }

    public static User[] getUsers() {
        return users;
    }
    
}
