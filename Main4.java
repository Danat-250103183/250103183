
class ModernConsole {
    public void playDigital() {
        System.out.println("Playing a digital game on ModernConsole!");
    }
}
class RetroCartridge {
    public void insertCartridge() {
        System.out.println("Retro cartridge inserted. Playing classic game!");
    }
}


interface Game {
    void playDigital();
}
class CartridgeAdapter implements Game {
    private RetroCartridge cartridge;

    public CartridgeAdapter(RetroCartridge cartridge) {
        this.cartridge = cartridge;
    }

    @Override
    public void playDigital() {
        cartridge.insertCartridge();
    }
}
public class Main4 {
    public static void main(String[] args) {
        ModernConsole console = new ModernConsole();


        console.playDigital();


        RetroCartridge retroGame = new RetroCartridge();
        Game adapter = new CartridgeAdapter(retroGame);


        adapter.playDigital();
    }
}
