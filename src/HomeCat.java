public class HomeCat extends Cat {
    private String name, breed;
    private Master master;

    public HomeCat(String name, String breed, Master master) {
        this.name = name;
        this.breed = breed;
        this.master = master;
    }

    public void layOnSofa() {
        System.out.println(name +" " + breed +": I'm laying on sofa. ZZzzzzzzzzzzzz");
        //layOnSofa
    }

    public void spoilShoes( ) {
        System.out.println(name +" " + breed +": The bomb has planted");
        master.decreaseMoney(10);
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public Master getMaster() {
        return master;
    }
}
