package latihan.aplication;

import latihan.latihanExecption.CreateUserRequest;
import latihan.latihanExecption.ValidationUtil;

public class ReflectionApp {
    public static void main(String[] args) {
        CreateUserRequest user = new CreateUserRequest();
        user.setUsername("fajar");
        user.setPassword("sukses");
        ValidationUtil.validationRequest(user);
    }
}
