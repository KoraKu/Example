package bot;

public class bot {
    private boolean active = false;
    private String token;
    private String name;

    bot(String token, String name) {
        this.token = token;
        this.name = name;
    }

    public void doBotStuff() {
        System.out.println("Hey i'm a bot !");
    }
}
