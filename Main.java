import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String recommendation = "phone";

        System.out.println("Ok, so you're looking for a new phone. Do you like iPhone or Android? (must pick one)");

        String appleOrNot = in.nextLine();
        appleOrNot = appleOrNot.toLowerCase();

        if (appleOrNot.equals("iphone")) {
            System.out.println("Do you need the telephoto (zoom) lens? (true/false)");
            boolean telephoto = in.nextBoolean();

            if (telephoto) {
                recommendation = "iPhone 15 Pro, get the Max if you like big phones or the most battery possible.";
            } else {
                System.out.println("Do you want the Dynamic Island or USB-C or a super bright screen? (true/false)");
                boolean featuresFitfteen = in.nextBoolean();

                if (featuresFitfteen) {
                    recommendation = "iPhone 15, get the Plus if you like big phones or the most battery possible.";
                } else {
                    recommendation = "iPhone 13. It's two years old but it's new from Apple and the only thing the 14 " +
                            "\nhas different is Emergency SOS via Satellite and Crash Detection, so unless you're " +
                            "\nparanoid about that then the 13 is perfect. We aren't recommending the SE because it's just " +
                            "\nnot a good deal anymore, wait for the update if you want the price.";
                }
            }
        } else {
            System.out.println("Are you looking for a flagship (f), midrange (m), or budget (b) phone?");
            String priceRange = in.next();

            if (priceRange.equals("f")) {
                System.out.println("Are you open to trying foldables, considering the price hike? (true/false)");
                boolean fold = in.nextBoolean();
                if (fold) {
                    System.out.println("Samsung Z Flip or Z Fold");
                }
                else {
                    System.out.println("Do you like a maximalist (max) or minimalist (min) approach when it comes to features and hardware?");
                    String approachF = in.next();

                    if (approachF.equals("max")) {
                        recommendation = "anything from the Samsung S23 series, look at the features and pricing of each to determine exactly what you like.";
                    } else if (approachF.equals("min")) {
                        recommendation = "new Pixel 8 series, Google just knows what they are doing.";
                    }
                }
            }
            else if (priceRange.equals("m")) {
                    System.out.println("Do you like a maximalist (max) or minimalist (min) approach when it comes to features and hardware?");
                    String approachM = in.next();

                    if (approachM.equals("max")) {
                        recommendation = "Samsung A54, one of the most popular phones this year, and for good reason. 85% of the " +
                                "flagship phone for half the price.";
                    }
                    if (approachM.equals("min")) {
                        recommendation = "Pixel 7a, especially because it takes some of the best pictures of any smartphone.";
                    }
                } else {
                    recommendation = "Samsung A13, the most popular Android phone this year because of how much it delivers for such a low price.";
                }
            }


            System.out.println("My recommendation is the " + recommendation);
        }
    }
