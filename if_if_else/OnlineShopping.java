class OnlineShopping
{
    public static void main(String[] args)
    {
        int price = 1500;
        String delivery = "EXPRESS";
        int products = 4;

        if(price >= 5000)
        {
            System.out.println("Free Gift Added");
        }
        else if(price >= 2000)
        {
            System.out.println("Free Delivery");
        }
        else
        {
            System.out.println("Delivery Charges Applied");
        }

        switch(delivery)
        {
            case "NORMAL":
                System.out.println("Delivery in 5 Days");
                break;
            case "EXPRESS":
                System.out.println("Delivery in 2 Days");
                break;
            default:
                System.out.println("Invalid Option");
        }

        for(int i = 1; i <= products; i++)
        {
            System.out.println("Product " + i);
        }

        int tracking = 1;
        while(tracking <= 2)
        {
            System.out.println("Tracking Update " + tracking);
            tracking++;
        }

        int order = 1;
        do
        {
            System.out.println("Order Confirmed");
            order++;
        }
        while(order <= 1);
    }
}