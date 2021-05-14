public class WildCat extends Cat {
    private  String name;
    private  String breed;

    public WildCat(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void hatePeople() {
        System.out.println(name +" " + breed +": I hate you leather!!!");
    }

    public void saveWorld() {
        System.out.println(name +" " + breed +": I'm a Super Cat " + name + " and I saved the World");
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }
}
