package latihan.aplication;

import latihan.latihanExecption.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        connectDatabase("fajar",null);
        System.out.println("success connect");
    }

    public static void connectDatabase(String usernameDB,String passwordDB){
        if (usernameDB == null || passwordDB == null){
            throw new DatabaseError("Database error");
        }
    }
}
