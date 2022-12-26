package Lesson01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HotDrinkVendingMachine extends VendingMachine {

    private Map<Integer, HotDrink> hotDrinkMap = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    public void addHotDrink(int key, HotDrink hotDrink) {
        hotDrinkMap.put(key, hotDrink);

    }

    @Override
    public int inputNumber() {
        int hotDrinkNumber = scanner.nextInt();
        System.out.println("Выбран номер -> " + hotDrinkNumber);
        return hotDrinkNumber;
    }

    @Override
    public HotDrink showSelectedProduct(int hotDrinkNumber) {
        System.out.println("Выбран следующий товар -> " + hotDrinkMap.get(hotDrinkNumber));
        return hotDrinkMap.get(hotDrinkNumber);
    }

    @Override
    public void productPay(Product product) {
        System.out.println("Необходимо внести следующую сумму -> ");
        float deposit = 0f;
        while (true) {
            int cash = scanner.nextInt();
            System.out.printf("Внесено %d рублей ", cash);
            deposit += cash;
            if (deposit < product.getPrice()) {
                System.out.printf("Необходимо внести ещё %.2f рублей\n", product.getPrice() - deposit);

            } else if (deposit > product.getPrice()) {
                System.out.printf("Сдача = %.2f рублей\n", deposit - product.getPrice());
                System.out.println("Возьмите товар, спасибо.");
                getProduct(product);
                break;
            } else {
                System.out.println("Возьмите товар, спасибо.");
                getProduct(product);
                break;
            }
        }
        System.out.println("Благодарим за использование нашего торгового автомата");
    }

    private void getProduct(Product product) {
        int amountGoods = product.getAmount();
        product.setAmount(amountGoods - 1);
        System.out.println("Количество товара -> " + product.getAmount());
    }

    @Override
    public void showListProducts() {
        System.out.println("В ассортименте имеются следующие товары -> ");
        for (HashMap.Entry<Integer, HotDrink> item : hotDrinkMap.entrySet()) {
            System.out.printf("%d - %s %s температура %d градусов\n", item.getKey(), item.getValue().getType(),
                    item.getValue().getName(), item.getValue().getTemperature());
        }
    }

}
