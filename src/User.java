
class User {

    private String name = "";

    private double balance = 0.0d;

    User() {

    }

    User(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return name + "'s balance: " + balance;
    }
    
}
