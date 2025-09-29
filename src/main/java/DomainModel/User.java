package DomainModel;

import java.util.Date;

public class User {
    private String name;
    private String surname;
    private String password;
    private String email;
    private String phone_number;
    private String tax_code;
    private Date birth_date;
    private String username;

    public User(String name, String surname, String password, String email, String phone_number, String tax_code, Date birth_date, String username){
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.email = email;
        this.phone_number = phone_number;
        this.tax_code = tax_code;
        this.birth_date = birth_date;
        this.username = username;
    }
}
