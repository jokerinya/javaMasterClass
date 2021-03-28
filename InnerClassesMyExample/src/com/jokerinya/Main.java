package com.jokerinya;

public class Main {

    private static CarRadio myCarRadio = new CarRadio("My Car's RadioStation");

    public static void main(String[] args) {
        class RadioStation implements CarRadio.PlayMusic {
            private String name;
            public RadioStation(String name) {
                this.name = name;
            }
            @Override
            public void music(String music) {
                System.out.println(this.name + " = "+ music);
            }
        }

        RadioStation popFm = new RadioStation("POP FM");

        //popFm.music("Shakira - Vacca Vacca"); can be set like this
        myCarRadio.setMakeSound(popFm);
        myCarRadio.music("Shakira Vacca Vacca");
        myCarRadio.setMakeSound(new RadioStation("SUPER FM"));
        myCarRadio.music("Justin Timberlake - Cry me a river");
        /*
         * CarRadio class has a public interface,
         * every RadioStation class implements CarRadio's interface should have a music method
         *
         */

        // ANOTHER EXAMPLE

        class CD {
            private String name;

            public CD(String name) {
                this.name = name;
            }

        }
//        throws an error because setMakeSound should get interface type
//        myCarRadio.setMakeSound(new CD("Best of 2000s"));

        // Anonymous Classes
        myCarRadio.setMakeSound(new CarRadio.PlayMusic() {
            @Override
            public void music(String music) {
                System.out.println("Driver singing " + music + ". :) \u23F3");
            }
        });
        myCarRadio.music("the best song");

    }
}

