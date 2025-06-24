package support;

import dto.UserDTO;
import pages.CreateAccountPage;

public class AccountUtils {

    public void createAccount(UserDTO userDTO) {
        CreateAccountPage createAccountPage = new CreateAccountPage();

        createAccountPage.fillPasswordField(userDTO.getPassword());
        createAccountPage.fillFirstname(userDTO.getFirstname());
        createAccountPage.fillLastName(userDTO.getLastname());
        createAccountPage.fillCompany(userDTO.getCompany());
        createAccountPage.fillState(userDTO.getState());
        createAccountPage.fillCity(userDTO.getCity());
        createAccountPage.fillAddress(userDTO.getAddress());
        createAccountPage.fillCountry(userDTO.getPaís());
        createAccountPage.fillZipCode(userDTO.getZipcode());
        createAccountPage.fillMobileNumber(userDTO.getMobileNumber());
        createAccountPage.clickCreateAccountButton();
    }
}
