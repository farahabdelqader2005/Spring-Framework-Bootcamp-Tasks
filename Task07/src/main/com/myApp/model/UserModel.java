package main.com.myApp.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


public class UserModel
{
    @NotNull(message = "this field cannot empty or null")
    @Size(min = 1, message = "this field cannot empty or null")
    private String username;


    @NotNull(message = "this field cannot empty or null")
    @Size(min = 1, message = "this field cannot empty or null")
    @Pattern(
            regexp = "^(.+)@(\\S+)$",
            message = "please enter a valid email address"
    )
    private String email;

    @NotNull(message = "this field cannot empty or null")
    @Size(min = 1, message = "this field cannot empty or null")
    private String password;

    @NotNull(message = "this field cannot empty or null")
    @Size(min = 1, message = "this field cannot empty or null")
    private String confirmPassword;


    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }


    public String getPassword()
    {
        return password;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }


    public String getConfirmPassword()
    {
        return confirmPassword;
    }
    public void setConfirmPassword(String confirmPassword)
    {
        this.confirmPassword = confirmPassword;
    }
}
