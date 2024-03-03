import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User implements Serializable {
    private transient Long id;
    private String name;
    private String email;
    private String surname;
    private String password;
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", surname='" + surname + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public User() {
    }

    @Deprecated
    public void method() {

    }

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        User user = new User();
        user.method();
        Date date = new Date();
        System.out.println(date.getDay());
        List list = new ArrayList<>();
        list.add("asdgfd");
    }

    public User(Long id, String name, String email, String surname) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.surname = surname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
