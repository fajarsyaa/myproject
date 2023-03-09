package kawah.edu;

import javax.inject.Inject;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.ws.rs.*;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;


/**
 *  Validator
 */

@Path("fruit")
public class FruitResource {

    @Inject
    Validator validator;
    private Set<Fruit> fruits = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));

    public FruitResource(){
        fruits.add(new Fruit("Avocado","the best fruit for make an juice"));
        fruits.add(new Fruit("Manggo","the best fruit for make an sweet rujak"));
    }

    @GET
    public Set<Fruit> list(){
        return fruits;
    }

    @POST
    public Result add(Fruit fruit){
        Set<ConstraintViolation<Fruit>> violations = validator.validate(fruit);
        if (violations.isEmpty()){
            fruits.add(fruit);
            return new Result("success");
        }else {
            return new Result(violations);
        }
    }

    @DELETE
    public Result delete(Fruit fruit){
        Set<ConstraintViolation<Fruit>> voilations = validator.validate(fruit);
        if (voilations.isEmpty()){
            fruits.removeIf(checkExistFruit -> checkExistFruit.name.contentEquals(fruit.name));
            return new Result("success deleted");
        }else{
            return new Result(voilations);
        }


    }


}