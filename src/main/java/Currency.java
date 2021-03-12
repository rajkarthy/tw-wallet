public class Currency {
    private final double rupees;

    public Currency(double rupees) {
        this.rupees = rupees;
    }


    public boolean ifEquals(double dollar) {
        return (dollar*74.85 == this.rupees);
    }
}
