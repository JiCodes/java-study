
// Factory Method pattern implementation

// Super Class
abstract class Chef {
    public abstract void cook();
}

// Sub Classes
class IndianChef extends Chef {
    public void cook() {
        System.out.println("Cooking Indian Cuisine");
    }
}
class VietnameseChef extends Chef {
    public void cook() {
        System.out.println("Cooking Vietnamese Food");
    }
}


// Factory Class
class Kitchen {
    public Chef getChef(String chefType) {
        if (chefType == null) {
            return null;
        }
        if (chefType.equalsIgnoreCase("IndianChef")) {
            return new IndianChef();
        } else if (chefType.equalsIgnoreCase("VietnameseChef")) {
            return new VietnameseChef();
        }
        return null;
    }
}