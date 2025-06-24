package datatest;

import com.github.javafaker.Faker;
import dto.UserDTO;
import support.SharedData;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class CreateAccountDataTest {
    public static UserDTO setValue() {

        Faker faker = new Faker();
        UserDTO userDTO = new UserDTO();

        String country = "United States";

        Map<String, String> siglas = Map.of(
                "Alabama", "AL",
                "California", "CA",
                "Florida", "FL",
                "Indiana", "IN",
                "New York", "NY",
                "Texas", "TX",
                "Ohio", "OH",
                "Illinois", "IL",
                "Georgia", "GA",
                "Michigan", "MI"
        );

        List<Map.Entry<String, String>> entries = new ArrayList<>(siglas.entrySet());
        Map.Entry<String, String> randomState = entries.get(new Random().nextInt(entries.size()));

        String state = randomState.getKey();
        String stateAbreviation = randomState.getValue();
        String zipCode = faker.address().zipCodeByState(stateAbreviation);

        userDTO.setFirstname(faker.name().firstName());
        userDTO.setLastname(faker.name().lastName());
        userDTO.setEmail(faker.internet().emailAddress());
        userDTO.setPassword(faker.internet().password());
        userDTO.setCompany(faker.company().name());
        userDTO.setAddress(faker.address().fullAddress());
        userDTO.setPaís(country);
        userDTO.setState(state);
        userDTO.setCity(faker.address().cityName());
        userDTO.setZipCode(zipCode);
        userDTO.setMobileNumber(faker.phoneNumber().cellPhone());

        SharedData.set("userDTO", userDTO);
        return userDTO;
    }
}