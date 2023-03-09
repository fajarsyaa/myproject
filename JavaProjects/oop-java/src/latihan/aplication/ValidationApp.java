package latihan.aplication;

import latihan.fiturExperimental.LoginRequest;
import latihan.latihanExecption.ValidationExecption;
import latihan.latihanExecption.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {

        // checked exception
        LoginRequest loginRequest = new LoginRequest("fajar",null);
        try{
            ValidationUtil.validate(loginRequest);
            System.out.println("success validate");
        }catch (ValidationExecption err){
            System.out.println("error : "+ err.getMessage());
        }catch (NullPointerException error){
            System.out.println("error : "+ error.getMessage());
        } finally {
            System.out.println("Error gak Error tetep jalan");
        }

        // runtime exception
        LoginRequest loginRequest2 = new LoginRequest("fajar","");
        ValidationUtil.validateRuntime(loginRequest2);
        System.out.println("sukses");

        // error


    }
}
