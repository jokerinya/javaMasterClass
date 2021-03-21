package com.jokerinya;

class Movie {
    private String name;
    public Movie(String name) {
        this.name = name;
    }
    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }
    public String plot() {
        return "A shark eats lots of people";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay () {
        super("Independence Day");
    }
    @Override
    public String plot() {
        return "Aliens attempt to take over the planet earth";
    }
}

class MazeRunner extends Movie{
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze";
    }
}

class StarWars extends Movie{
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Impreial forces try to take over the universe";
    }
}

class Forgetable extends Movie{
    public Forgetable() {
        super("Forgetable");
    }
//    No plot method
}




public class Main {

    public static void main(String[] args) {
	// write your code here
        for (int i = 0; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println(movie.getName() + ": " + movie.plot());
        }
    }

    public static Movie randomMovie(){
        int randomNumber = (int) (Math.random() * 5) +1;
        System.out.print("Generated number was " + randomNumber + " -> ");
        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
        }
        return null;
    }
}
