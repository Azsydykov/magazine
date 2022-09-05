package kg.megacom;

public class Cashier {


    private String name;
    private String login;
    private int age;


    public Cashier(String name, String login, int age) {
        this.name = name;
        this.login = login;
        this.age = age;

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
