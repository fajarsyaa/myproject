package latihan.latihanExecption;

import latihan.annotation.NotBlank;
import latihan.fiturExperimental.LoginRequest;

import java.lang.reflect.Field;

public class ValidationUtil{
    public static void validate(LoginRequest loginRequest) throws ValidationExecption, NullPointerException{
        if (loginRequest.username() == null){
            throw new NullPointerException("username is null");
        } else if (loginRequest.username().isBlank()) {
            throw new ValidationExecption("username is blank");
        } else if (loginRequest.password() == null){
            throw new NullPointerException("password is null");
        } else if (loginRequest.password().isBlank()) {
            throw new ValidationExecption("password is blank");
        }
    }

    public static void validateRuntime(LoginRequest loginRequest){
        if (loginRequest.username() == null){
            throw new NullPointerException("username is null");
        } else if (loginRequest.username().isBlank()) {
            throw new BlankExecption("username is blank");
        } else if (loginRequest.password() == null){
            throw new NullPointerException("password is null");
        } else if (loginRequest.password().isBlank()) {
            throw new BlankExecption("password is blank");
        }
    }


    // reflecsion for validate (validasi otomatis), on annotation pakcage
    public static void validationRequest(Object object){
        Class aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields(); // mendapatkan semua field (public/private/dll)

        for(var field : fields){
            /** memaksa field bisa diakses walau private */
            field.setAccessible(true);

            if (field.getAnnotation(NotBlank.class) != null){
                try{
                    String value = (String) field.get(object);

                    if (value == null || value.isBlank()){
                        throw new BlankExecption("Fiel "+field.getName()+" is blank");
                    }
                }catch (IllegalAccessException err){
                    System.out.println("tidak bisa mengakses field " + field.getName());
                }
            }
        }

    }

}