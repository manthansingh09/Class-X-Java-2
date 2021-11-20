public class TheNainiRetreat
{
    public static void main(String customerName,int membershipCode,String typeOfRooms,int days,int NoOfppl)
    {
        double tariff=0,dis1=0,dis2=0,dis3=0,bill=0,dis=0,pay=0;
        System.out.println("***************************************");
        System.out.println("\tThe Naini Retreat Hotel");
        System.out.println("\tNainital(Uttarakhand)");
        System.out.println("***************************************");
        System.out.println("Customer Name:"+customerName);
        System.out.println("Membership Code: "+membershipCode);
        switch(membershipCode)
        {
            case 1:
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
            System.out.println("Dear "+customerName+",you are Silver Member");
            System.out.println("Discount Rates for Silver Member are:");
            System.out.println("Deluxe 2.5%, Super Deluxe 5%, Suit 10%");
            dis1=2.5;
            dis2=5;
            dis3=10;
            break;
            case 2:
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
            System.out.println("Dear "+customerName+",you are Gold Member");
            System.out.println("Discount Rates for Gold Member are:");
            System.out.println("Deluxe 5%, Super Deluxe 10%, Suit 15%");
            dis1=5;
            dis2=10;
            dis3=15;
            break;
            case 3:
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
            System.out.println("Dear "+customerName+",you are Diamond Member");
            System.out.println("Discount Rates for Diamond Member are:");
            System.out.println("Deluxe 10%, Super Deluxe 15%, Suit 20%");
            dis1=10;
            dis2=15;
            dis3=20;
            break;
            case 4:
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
            System.out.println("Dear "+customerName+",you are Platimun Member");
            System.out.println("Discount Rates for Platimun Member are:");
            System.out.println("Deluxe 15%, Super Deluxe 20%, Suit 25%");
            dis1=15;
            dis2=20;
            dis3=25;
            break;
            default:
            System.out.println("Wrong");
        }
        System.out.println();
        if(typeOfRooms=="D")
        {
            System.out.println("Deluxe Room");
            tariff=12500;
            bill=tariff*days*NoOfppl;
            dis=bill*dis1/100;
            pay=bill-dis;
        }
        else if(typeOfRooms=="SD")
        {
            System.out.println("Super Deluxe Room");
            tariff=14500;
            bill=tariff*days*NoOfppl;
            dis=bill*dis2/100;
            pay=bill-dis;
        }
        else if(typeOfRooms=="S")
        {
            System.out.println("Suit Room");
            tariff=16000;
            bill=tariff*days*NoOfppl;
            dis=bill*dis3/100;
            pay=bill-dis;
        }
        System.out.println("***************************************");
        System.out.println("\tTariff Details");
        System.out.println("***************************************");
        System.out.println("Tariff Per Day: "+tariff);
        System.out.println("No of Days: "+days);
        System.out.println("No of People: "+NoOfppl);
        System.out.println("------------------------------------");
        System.out.println("Bill Amount: "+bill);
        System.out.println("Seasonal Discount: "+dis);
        System.out.println("Net Payabe: "+pay);
        System.out.println("------------------------------------");
        System.out.println("\tThank You. Visit Again");
    }
}
