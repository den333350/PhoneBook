package ua.hillel.Contacts;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Contact {
    private String name;
    private String phone;

}
