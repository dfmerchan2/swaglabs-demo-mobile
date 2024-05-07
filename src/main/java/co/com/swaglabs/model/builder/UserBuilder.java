package co.com.swaglabs.model.builder;

import co.com.swaglabs.model.User;
import com.github.javafaker.Faker;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

import java.util.Locale;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class UserBuilder {

    private static final Faker faker = new Faker(new Locale("es-MX"));

    public static User getDataUser(){
        return User.builder()
                .firstName(faker.name().firstName())
                .lastName(faker.name().lastName())
                .codePostal(faker.address().zipCode())
                .build();
    }
}
