import java.math.BigDecimal;
import java.util.List;

/**
 * Interface representing a change-making service.
 */
public interface ChangeMaker {

    /**
     * Sets the denominations of money that can be used to make change.
     *
     * @param denominations An array of BigDecimals representing the denominations.
     */
    void setDenominations(BigDecimal[] denominations);

    /**
     * Finds all possible ways to make change for the given amount.
     *
     * @param amount The amount of money to make change for.
     * @return A list of lists, where each inner list represents a combination
     *         of coins that add up to the given amount.
     */
    List<List<BigDecimal>> findAllWaysToMakeChange(BigDecimal amount);
}

/**
 * Example Usage.
 */
public class ChangeMakerExample {
    public static void main(String[] args) {
        ChangeMaker changeMaker = new ChangeMakerImpl();

        // Set the denominations to be used (e.g., U.S. coins: pennies, nickels, dimes, quarters)
        changeMaker.setDenominations(new BigDecimal[]{new BigDecimal("0.01"), new BigDecimal("0.05"),
                new BigDecimal("0.10"), new BigDecimal("0.25")});

        // Find all ways to make change for 7 cents
        BigDecimal amount = new BigDecimal("0.07");
        List<List<BigDecimal>> allWays = changeMaker.findAllWaysToMakeChange(amount);

        // Output all ways to make change
        for (List<BigDecimal> way : allWays) {
            System.out.println(way);
        }
    }
}
