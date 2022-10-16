public class telephone {
    void call() {
        System.out.println("I can make Calls");
    }

    void receive_call() {
        System.out.println("I can receive Calls");
    }
}

class cellphone extends telephone {
    void message() {
        super.call();
        super.receive_call();
        System.out.println("I can message with others");
    }
}

class smartphone extends cellphone {
    {
        super.message();
    }

    void videocall() {
        System.out.println("I can videocall");
    }

    void voice_msg() {
        System.out.println("I can Voice message");
    }
}
