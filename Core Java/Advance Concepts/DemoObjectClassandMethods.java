class Laptop {
    String model;
    double price;
    int serialNo;

    public String toString() {
        return "Laptop [model=" + model + ", price=" + price + ", serialNo=" + serialNo + "]";
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        long temp;
        temp = Double.doubleToLongBits(price);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + serialNo;
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
            return false;
        if (serialNo != other.serialNo)
            return false;
        return true;
    }

}

public class DemoObjectClassandMethods {
    public static void main(String[] args) {

        Laptop obj1 = new Laptop();
        obj1.model = "Lenovo";
        obj1.price = 55000;
        obj1.serialNo = 000001;

        Laptop obj2 = new Laptop();
        obj2.model = "Lenovo";
        obj2.price = 55000;
        obj2.serialNo = 000002;

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj1.equals(obj2));

    }

}