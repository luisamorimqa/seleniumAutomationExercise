package datatest;

import com.github.javafaker.Faker;
import dto.AddressDTO;
import dto.UserDTO;
import support.AddressDataGenerator;
import support.SharedData;

public class CreateAccountDataTest {
    public static UserDTO setValue() {

        Faker faker = new Faker();
        UserDTO userDTO = new UserDTO();

        AddressDTO addressDTO = AddressDataGenerator.generateAddress();

        userDTO.setFirstname(faker.name().firstName());
        userDTO.setLastname(faker.name().lastName());
        userDTO.setEmail(faker.internet().emailAddress());
        userDTO.setPassword(faker.internet().password());
        userDTO.setCompany(faker.company().name());
        userDTO.setAddress(faker.address().fullAddress());
        userDTO.setPaís(addressDTO.getCountry());
        userDTO.setState(addressDTO.getState());
        userDTO.setCity(addressDTO.getCity());
        userDTO.setZipCode(addressDTO.getZipCode());
        userDTO.setMobileNumber(faker.phoneNumber().cellPhone());

        SharedData.set("userDTO", userDTO);
        return userDTO;
    }
}