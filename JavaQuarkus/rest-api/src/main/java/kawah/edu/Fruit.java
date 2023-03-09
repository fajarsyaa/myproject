package kawah.edu;

import javax.inject.Inject;
import javax.validation.constraints.NotBlank;
import javax.xml.validation.Validator;

public class Fruit {
    @NotBlank(message = "name tidak boleh kosoong")
    public String name;
    @NotBlank(message = "description tidak boleh kosong")
    public String description;

    public Fruit(){}

    public Fruit(String name,String description){
        this.name = name;
        this.description = description;
    }
}