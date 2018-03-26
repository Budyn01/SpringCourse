package pl.budyn.demo.components;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Budyn on 21.02.2018.
 */
@Component
public class IndexController {

    User user = new User("Marta", 22, "Pysia");

    @RequestMapping("/user")
    public String getUserPage(){
        return "index";
    }

}
