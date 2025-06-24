package support;

import com.github.javafaker.Faker;
import dto.AddressDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class AddressDataGenerator {

    private static final String country = "United States";

    private static final Map<String, String> states = Map.of(
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

    public static AddressDTO generateAddress() {
        Faker faker = new Faker();
        List<Map.Entry<String, String>> entries = new ArrayList<>(states.entrySet());
        Map.Entry<String, String> randomState = entries.get(ThreadLocalRandom.current().nextInt(entries.size()));

        String state = randomState.getKey();
        String abbreviation = randomState.getValue();

        String zipCode = faker.address().zipCodeByState(abbreviation);

        if(zipCode == null) {
            zipCode = faker.address().zipCode();
        }

        AddressDTO addressDTO = new AddressDTO();
        addressDTO.setCountry(country);
        addressDTO.setState(state);
        addressDTO.setCity(faker.address().cityName());
        addressDTO.setZipCode(zipCode);
        addressDTO.setFullAddress(faker.address().fullAddress());

        return addressDTO;
    }
}