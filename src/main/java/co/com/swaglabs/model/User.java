package co.com.swaglabs.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class User {

    private String firstName;
    private String lastName;
    private String codePostal;
}
