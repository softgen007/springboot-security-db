package demo.webservices.rest.security.db.resource;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {

    //No Authentication, No Authorization
	@GetMapping("/hello")
    public String hello() {
        return "Hello UnSecure";
    }

	//Authentication & Authorization both
	@PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping("/secured/hello")
    public String securedHello() {
        return "Secured Hello";
    }

	//Only Authentication, No Authorization since since global method security is enabled in Security Config for "**/secured/**" URls
	@GetMapping("/secured/alternate")
    public String alternate() {
        return "alternate";
    }
}
