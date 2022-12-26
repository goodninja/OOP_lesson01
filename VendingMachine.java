package Lesson01;

abstract public class VendingMachine {

    public abstract int inputNumber();

    public abstract Product showSelectedProduct(int productNumber);

    public abstract void productPay(Product product);

    public abstract void showListProducts();

}
