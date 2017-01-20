/**
 * Created by andykim on 1/18/17.
 */
public class SuperHuman extends Human {

    String goodOrBad;

    String heroName;

    String superPower;

    public SuperHuman(String name, int age, String gender, String occupation, String address, String goodOrBad, String heroName, String superPower){

        super(name, age, gender, occupation, address);

        this.goodOrBad = goodOrBad;

        this.heroName = heroName;

        this.superPower = superPower;

    };


    public String getGoodOrBad() {
        return goodOrBad;
    }

    public String getHeroName() {
        return heroName;
    }

    public String getSuperPower() {
        return superPower;
    }

}
