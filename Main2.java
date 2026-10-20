

        interface Pizza {
            double getCost();
            String getDescription();
        }
        class PlainPizza implements Pizza {
            @Override
            public double getCost() {
                return 5.0;
            }

            @Override
            public String getDescription() {
                return "Plain Dough & Sauce";
            }
        }

        abstract class ToppingDecorator implements Pizza {
            protected Pizza pizza;

            public ToppingDecorator(Pizza pizza) {
                this.pizza = pizza;
            }
        }


        class Cheese extends ToppingDecorator {
            public Cheese(Pizza pizza) {
                super(pizza);
            }

            @Override
            public double getCost() {
                return pizza.getCost() + 2.0;
            }

            @Override
            public String getDescription() {
                return pizza.getDescription() + ", Cheese";
            }
        }


        class Olives extends ToppingDecorator {
            public Olives(Pizza pizza) {
                super(pizza);
            }

            @Override
            public double getCost() {
                return pizza.getCost() + 1.0;
            }

            @Override
            public String getDescription() {
                return pizza.getDescription() + ", Olives";
            }
        }


        class Pineapple extends ToppingDecorator {
            public Pineapple(Pizza pizza) {
                super(pizza);
            }

            @Override
            public double getCost() {
                return pizza.getCost() + 1.5;
            }

            @Override
            public String getDescription() {
                return pizza.getDescription() + ", Pineapple";
            }
        }


         class Main2 {
            public static void main(String[] args) {
                Pizza pizza = new PlainPizza();

                pizza = new Cheese(pizza);
                pizza = new Olives(pizza);
                pizza = new Pineapple(pizza);

                System.out.println("Description: " + pizza.getDescription());
                System.out.printf("Total Cost: $%.2f%n", pizza.getCost());
            }
        }




