// При решении этих задач следуйте принципам абстракции, инкапсуляции, наследования, полиморфизма.
// 1. Создайте унаследованный класс ГорячийНапиток с дополнительным полем int температура.
// 2. Создайте класс АвтоматГорячихНапитков, реализующий интерфейс ТорговыйАвтомат
// и реализуйте перегруженный метод getProduct(int name, int volume, int temperature),
// выдающий продукт, соответствующий имени, объему и температуре.
// 3. В main проинициализируйте несколько ГорячихНапитков и АвтоматГорячихНапитков и позвольте покупателю купить товар.

package Lesson01;

public class Main {
    public static void main(String[] args) {

        GoodsVendingMachine GoodsVendingMachine = new GoodsVendingMachine();
        HotDrinkVendingMachine hotDrinkVendingMachine = new HotDrinkVendingMachine();

        GoodsVendingMachine.addProduct(1, new Product("чипсы", "Хрустик", 10001, 49.55f, 0.2f, 20));
        GoodsVendingMachine.addProduct(2, new Product("стрипсы", "Хрумчик", 10002, 40.70f, 0.2f, 15));
        GoodsVendingMachine.addProduct(3, new Product("чипсы", "Чипсомен", 10003, 99.99f, 0.3f, 10));
        GoodsVendingMachine.addProduct(4, new Product("шоколад", "Лисичка", 10004, 75.9f, 0.1f, 9));
        GoodsVendingMachine.addProduct(5, new Product("конфеты", "Белочка", 10005, 115.9f, 0.1f, 5));
        GoodsVendingMachine.addProduct(6, new Product("шоколад", "Волчок", 10006, 80.9f, 0.1f, 7));

        hotDrinkVendingMachine.addHotDrink(7, new HotDrink("кофе", "Арабика", 10007, 35.4f, 0.2f, 35, 75));
        hotDrinkVendingMachine.addHotDrink(8, new HotDrink("чай", "Индия", 10008, 15.3f, 0.2f, 42, 75));
        hotDrinkVendingMachine.addHotDrink(9, new HotDrink("какао", "Черный снег", 10009, 28.75f, 0.2f, 15, 75));
        hotDrinkVendingMachine.addHotDrink(10, new HotDrink("чай", "Высота", 10010, 12.5f, 0.2f, 22, 70));

        hotDrinkVendingMachine.showListProducts();
        System.out.println("Выберите номер товара -> ");

        int number = hotDrinkVendingMachine.inputNumber();
        HotDrink hotDrink = (HotDrink) hotDrinkVendingMachine.showSelectedProduct(number);
        hotDrinkVendingMachine.productPay(hotDrink);

    }
}