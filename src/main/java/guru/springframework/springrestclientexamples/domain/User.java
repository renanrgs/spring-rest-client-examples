package guru.springframework.springrestclientexamples.domain;


import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class User implements Serializable {
    private Name name;
    private Location location;
    private String gender;
    private Login login;
    private String phone;
    private Job job;
    private Billing billing;
    private String language;
    private String currency;
    private Map<String, Object> additionalProperties = new HashMap<>();

    private static final long serialVersionUID = -5500302421576067605L;

    public Name getName() {
        return name;
    }

    public Location getLocation() {
        return location;
    }

    public String getGender() {
        return gender;
    }

    public Login getLogin() {
        return login;
    }

    public String getPhone() {
        return phone;
    }

    public Job getJob() {
        return job;
    }

    public Billing getBilling() {
        return billing;
    }

    public String getLanguage() {
        return language;
    }

    public String getCurrency() {
        return currency;
    }

    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public void setBilling(Billing billing) {
        this.billing = billing;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }
}
