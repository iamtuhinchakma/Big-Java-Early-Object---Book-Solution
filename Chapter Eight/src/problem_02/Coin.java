package problem_02;

public class Coin {
    private double coinValue;
    private String coinName;

    // Constructors
    /**
     * Constructs an object Coin with a value and a name
     * @param value value of the coin
     * @param name name of the coin
     */
    public Coin(double value, String name)
    {
        coinValue = value;
        coinName = name;
    }

    // Methods
    /**
     * Gets the value of the coin
     * @return value of the coin
     */
    public double getCoinValue()
    {
        return coinValue;
    }

    /**
     * Gets the name of the coin
     * @return name of the coin
     */
    public String getCoinName()
    {
        return coinName;
    }
}
