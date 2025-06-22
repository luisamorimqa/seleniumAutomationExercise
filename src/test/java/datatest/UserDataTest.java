package datatest;

import dto.UserDTO;
import support.SharedData;

import static support.Commands.*;

public class UserDataTest {

    public static UserDTO setValue() {

        UserDTO userDTO = new UserDTO();

        userDTO.setFirstname(getRegisterName());
        userDTO.setEmail(getValidEmail());
        userDTO.setPassword(getValidPassword());

        SharedData.set("userDTO", userDTO);
        return userDTO;
    }
}