import java.util.ArrayList;

public class StockAnalysis {

    // 1. Calculate average stock price for array
    public static float calculateAveragePrice(float[] prices) {
        float sum = 0;
        for (float price : prices) {
            sum += price;
        }
        return sum / prices.length;
    }

    // Overloaded method for ArrayList
    public static float calculateAveragePrice(ArrayList<Float> prices) {
        float sum = 0;
        for (float price : prices) {
            sum += price;
        }
        return sum / prices.size();
    }

    // 2. Find maximum stock price for array
    public static float findMaximumPrice(float[] prices) {
        float max = prices[0];
        for (float price : prices) {
            if (price > max) {
                max = price;
            }
        }
        return max;
    }

    // Overloaded method for ArrayList
    public static float findMaximumPrice(ArrayList<Float> prices) {
        float max = prices.get(0);
        for (float price : prices) {
            if (price > max) {
                max = price;
            }
        }
        return max;
    }

    // 3. Count occurrences of a specific price in array
    public static int countOccurrences(float[] prices, float target) {
        int count = 0;
        for (float price : prices) {
            if (price == target) {
                count++;
            }
        }
        return count;
    }

    // Overloaded method for ArrayList
    public static int countOccurrences(ArrayList<Float> prices, float target) {
        int count = 0;
        for (float price : prices) {
            if (price == target) {
                count++;
            }
        }
        return count;
    }

    // 4. Compute cumulative sum of stock prices
    public static ArrayList<Float> computeCumulativeSum(ArrayList<Float> prices) {
        ArrayList<Float> cumulative = new ArrayList<>();
        float sum = 0;
        for (float price : prices) {
            sum += price;
            cumulative.add(sum);
        }
        return cumulative;
    }

    // Main method for demonstration
    public static void main(String[] args) {
        float[] stockArray = {100.5f, 102.0f, 98.7f, 101.3f, 105.5f, 99.9f, 103.2f, 104.5f, 100.0f, 102.8f};
        ArrayList<Float> stockList = new ArrayList<>();
        for (float price : stockArray) {
            stockList.add(price);
        }

        System.out.println("Average price (array): " + calculateAveragePrice(stockArray));
        System.out.println("Average price (ArrayList): " + calculateAveragePrice(stockList));

        System.out.println("Maximum price (array): " + findMaximumPrice(stockArray));
        System.out.println("Maximum price (ArrayList): " + findMaximumPrice(stockList));

        float target = 102.0f;
        System.out.println("Occurrences of " + target + " in array: " + countOccurrences(stockArray, target));
        System.out.println("Occurrences of " + target + " in ArrayList: " + countOccurrences(stockList, target));

        System.out.println("Cumulative sum (ArrayList): " + computeCumulativeSum(stockList));
    }
}
