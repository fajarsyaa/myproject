package latihan.aplication;

import latihan.fiturExperimental.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest("fajar","aku sukses");

        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());
        System.out.println(loginRequest);

        loginRequest.sayHello();

        System.out.println(new LoginRequest("dahlan"));
        System.out.println(new LoginRequest("dahlan","sukses"));


    }
}
