package main.com.myApp.controller;

import main.com.myApp.Database.DatabaseConnection;
import main.com.myApp.model.UserModel;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Controller
public class HomeController
{
    @RequestMapping("/")
    public String showFormMethod(Model model)
    {
        model.addAttribute("userModel", new UserModel());
        return "formPage";
    }

    @RequestMapping("/processForm")
    public String processFormMethod(
            @Valid @ModelAttribute("userModel") UserModel userModel,
            BindingResult result,
            Model model)
    {
        if (result.hasErrors())
        {
            return "formPage";
        }

        if (!userModel.getPassword().equals(userModel.getConfirmPassword()))
        {
            model.addAttribute(
                    "passwordError",
                    "Password and Confirm Password do not match"
            );

            return "formPage";
        }

        String sql =
                "INSERT INTO employees (username, email, password) VALUES (?, ?, ?)";

        try (
                Connection connection = DatabaseConnection.getConnection();
                PreparedStatement preparedStatement =
                        connection.prepareStatement(sql)
        )
        {
            preparedStatement.setString(1, userModel.getUsername());
            preparedStatement.setString(2, userModel.getEmail());
            preparedStatement.setString(3, userModel.getPassword());

            int rows = preparedStatement.executeUpdate();

            System.out.println("Rows inserted: " + rows);
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

        model.addAttribute("userModelResult", userModel);

        return "resultPage";
    }
}
