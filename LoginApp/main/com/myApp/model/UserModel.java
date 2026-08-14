package main.com.myApp.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Setter
@Getter
public class UserModel
{
    private String firstName;
    private String lastName;
    private String email;
    private String dateOfBirth;
    private String city;
}