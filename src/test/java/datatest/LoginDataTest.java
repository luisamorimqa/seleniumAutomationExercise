package datatest;

import dto.UserDTO;
import support.SharedData;

import static support.Commands.*;

public class LoginDataTest {

    public static UserDTO setValue() {

        UserDTO userDTO = new UserDTO();

        userDTO.setFirstname(getRegisteredName());
        userDTO.setEmail(getRegisteredEmail());
        userDTO.setPassword(getValidPassword());

        SharedData.set("userDTO", userDTO);
        return userDTO;
    }
}