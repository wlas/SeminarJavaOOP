package model;

public class Contact {

    private User user;
    private Phone phone;

    public Contact(){
        
    }

    public Contact(User user, Phone phone) {
        this.user = user;
        this.phone = phone;
    }

    public User getUser() {
        return user;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

}
