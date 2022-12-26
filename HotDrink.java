package Lesson01;

public class HotDrink extends Product {

    private String type;
    private String name;
    private int vendorCode;
    private float price;
    private float volume;
    private int amount;
    private int temperature;

    public HotDrink(String type, String name, int vendorCode, float price, float volume, int amount, int temperature) {
        super(type, name, vendorCode, price, volume, amount);
        this.type = type;
        this.name = name;
        this.vendorCode = vendorCode;
        this.price = price;
        this.volume = volume;
        this.amount = amount;
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + vendorCode;
        result = prime * result + Float.floatToIntBits(price);
        result = prime * result + Float.floatToIntBits(volume);
        result = prime * result + amount;
        result = prime * result + temperature;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        HotDrink other = (HotDrink) obj;
        if (type == null) {
            if (other.type != null)
                return false;
        } else if (!type.equals(other.type))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (vendorCode != other.vendorCode)
            return false;
        if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
            return false;
        if (Float.floatToIntBits(volume) != Float.floatToIntBits(other.volume))
            return false;
        if (amount != other.amount)
            return false;
        if (temperature != other.temperature)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "HotDrink {" +
                "type = " + type +
                ", name = " + name +
                ", vendorCode = " + vendorCode +
                ", price = " + price +
                ", volume = " + volume +
                ", amount = " + amount +
                ", temperature = " + temperature +
                '}';
    }

}