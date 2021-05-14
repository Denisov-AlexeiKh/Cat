public class main {


    public static void main(String[] args) {
        Master Vasya = new Master("Vasya", "Pupkin", 1000);
        Master Ivan = new Master("Ivan", "Ivanov", 1000000);

        HomeCat Kuzya = new HomeCat("Kuzya", "Abyssinian", Vasya);
        HomeCat Bali = new HomeCat("Bali", "Balinese", Ivan);

        WildCat Murzik = new WildCat("Murzik", "Maine Coon");
        WildCat Vaska = new WildCat("Vaska", "Bengal");

        Kuzya.layOnSofa();

        //---------------------
        System.out.print(Bali.getName() + " " + Bali.getBreed() + ":  ");
        System.out.println("Masters money:  " + Bali.getMaster().money());
        Bali.spoilShoes();
        System.out.println("Masters money:  " + Bali.getMaster().money());
        //---------------------

        Murzik.hatePeople();
        Vaska.saveWorld();


    }

}
