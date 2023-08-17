import javax.annotation.processing.Generated;


@RestController
public class ApiController {

    @Value("${val}")
    private String name;
    @GetMapping("/")
    public String getName(){
        return "Welcome "+name+"!";
    }
}
