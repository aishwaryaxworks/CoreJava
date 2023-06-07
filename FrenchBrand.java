public class FrenchBrand {
    public static void main(String[] args) {
        int[] integerArray = {2, 4, 6, 8, 4, 10, 12, 14, 4, 16, 18, 20, 4, 22, 24};
        String[] stringArray = {"Chanel", "Dior", "Gucci", "Louis Vuitton", "Dior", "Hermès", "Givenchy", "Dior", "Celine",
		"Chanel", "Dior", "Saint Laurent", "Dior", "Balenciaga", "Valentino"};

        // Check if 4 is present in the integer array
        int countOfFour = 0;
        for (int num : integerArray) {
            if (num == 4) {
                countOfFour++;
            }
        }
        System.out.println("Count of 4 in the integer array: " + countOfFour);

        // Check if element "Dior" is present in the string array
        int countOfDior = 0;
        for (String brand : stringArray) {
            if (brand.equals("Dior")) {
                countOfDior++;
                break; // Stop checking the condition once "Dior" is found
            }
        }
        System.out.println("Count of 'Dior' in the string array: " + countOfDior);
    }
}
