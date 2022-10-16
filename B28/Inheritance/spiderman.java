public class spiderman {
    void movie() {
        System.out.println("No way Home");
    }
}

class Tobey extends spiderman {
    void movie() {
        System.out.println("Tobey Magurie movies:");
        System.out.println("Spider Man-1");
        System.out.println("Spider Man-2");
        System.out.println("Spider Man-3");
        super.movie();
    }
}

class Andrew extends spiderman {
    void movie() {
        System.out.println("Andrew Garfield movies:");
        System.out.println("The Amazing SpiderMan-1");
        System.out.println("The Amazing SpiderMan-2");
        super.movie();
    }
}

class TomHolland extends spiderman {
    void movie() {
        System.out.println("Tom Holland movies:");
        System.out.println("SpiderMan Home coming");
        System.out.println("Far from Home");
        super.movie();

    }
}
