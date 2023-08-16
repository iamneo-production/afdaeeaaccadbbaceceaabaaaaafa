import javax.annotation.processing.Generated;


@RestController
public class ApiController {

    @GetMapping("/")
    public String getName(){
        String ans = "Welcome "+studentName+" !";
        returna ans;
    }
}
