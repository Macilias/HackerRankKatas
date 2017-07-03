package anonymousClasses;

/**
 * Some Description
 *
 * @author maciej.niemczyk@voipfuture.com
 */
public class HelloWorldAnonymousClasses {

    interface HelloWorld {
        public void greet();

        public void greetSomeone(String someone);
    }

    public void sayHello() {

        class EnglishGreeting implements HelloWorld {
            String name = "world";

            public void greet() {
                greetSomeone("world");
            }

            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hello " + name);
            }
        }

        HelloWorld englishGreeting = new EnglishGreeting();

        HelloWorld frenchGreeting = new HelloWorld() {
            String name = "tout le monde";

            public void greet() {
                greetSomeone("tout le monde");
            }

            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Salut " + name);
            }
        };

        HelloWorld spanishGreeting = new HelloWorld() {
            String name = "mundo";

            public void greet() {
                greetSomeone("mundo");
            }

            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hola, " + name);
            }
        };

        HelloWorld polishGreeting = new HelloWorld() {

            @Override
            public void greet() {
                greetSomeone("swiecie");
            }

            @Override
            public void greetSomeone(String someone) {
                System.out.println("Witaj " + someone);
            }
        };
        englishGreeting.greet();
        frenchGreeting.greetSomeone("Fred");
        spanishGreeting.greet();
        polishGreeting.greet();
        polishGreeting.greetSomeone("Macku");

    }

    public static void main(String... args) {
        HelloWorldAnonymousClasses myApp = new HelloWorldAnonymousClasses();
        myApp.sayHello();
    }
}
