package OnlineShopping;

public class ShoppingCart {
    double[] itemPrices;
    int[] quantities;

    public ShoppingCart(double[] itemPrices, int[] quantities) {
        this.itemPrices = itemPrices;
        this.quantities = quantities;
    }

    double calculateTotal() {
        double total = 0;

        for (int i = 0; i < itemPrices.length; i++) {
            total = total + (itemPrices[i] * quantities[i]);
        }

        return total;
    }

    int calculateNumberOfItems() {
        int numberOfItems = 0;

        for (int quantity : quantities) {
            numberOfItems = numberOfItems + quantity;
        }

        return numberOfItems;
    }

    double calculateAverage() {
        int numberOfItems = calculateNumberOfItems();

        if (numberOfItems == 0) {
            throw new ArithmeticException("Cannot divide by zero items");
        }

        return calculateTotal() / numberOfItems;
    }
}
