
//import java.math.BigDecimal;

public class TaxCalc {
    public static void main(String[] args) {

        double PriceWithoutVat = 9.99;

        System.out.println("Net Price of the Product: " + PriceWithoutVat);

        double priceWithVat = PriceWithoutVat * 1.23;
        System.out.println("Price With Vat: " + priceWithVat);

        double valueWithVat = priceWithVat * 10000;
        System.out.println("Value with Vat: " + valueWithVat);

        double PriceWithoutVat2 = valueWithVat / 1.23;
        System.out.println("Value without Vat: " + PriceWithoutVat2);


        System.out.println("Same thing after using Big decimal:");



        /*BigDecimal dbPriceWithoutVat = new BigDecimal( val: 9.99);
        System.out.println("Price without Vat: " + dbPriceWithoutVat);

        BigDecimal dbPriceWithVat = dbPriceWithVat.multiply(
                new BigDecimal( val: "1.23"));

        dbPriceWithVat = dbPriceWithVat.setScale(newScale: 2,
        BigDecimal.ROUND_HALF_EVEN);

        System.out.println("Price with VAT rounded: "+ dbPriceWithVat);

        BigDecimal dbValueWithVat = dbPriceWithVat.multiply(
                new BigDecimal(val: 10000));
        System.out.println("Value with VAT: "+ dbValueWithVat);

        BigDecimal dbPriceWithoutVat2 = dbValueWithVat.divide(
                new BigDecimal(val: "1.23"),
                BigDecimal.ROUND_HALF_EVEN);
        System.out.println("Value Without VAT: "+ dbPriceWithoutVat2);

.*/





    }
}

