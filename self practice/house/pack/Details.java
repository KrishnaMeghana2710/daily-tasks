package house.pack;

public class Details {
    public static void main(String[] args) {
        HouseArchitecture details;
        System.out.println("\nBelow are the details of prices and bank loans for house purchasing purpose: ");
        details = new Apartment();
        System.out.println("\nPrice of an apartment is "+details.getPrice());
        System.out.println("Banks tdetailst provide loan to the buy an apartment are "+details.banks());

        details = new Villa();
        System.out.println("\nPrice of a villa is "+details.getPrice());
        System.out.println("Banks tdetailst provide loans to get a villa are "+details.banks());

        details = new Plot();
        System.out.println("\nThe price of a plot is "+details.getPrice());
        System.out.println("Banks tdetailst provide loans to get a plot are "+details.banks());
    
    }
}
