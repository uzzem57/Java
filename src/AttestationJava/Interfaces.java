package AttestationJava;

import java.io.IOException;

public interface Interfaces {
    public void addGames(int id, String name, int volume, double toyDropRate, String model);
    public void setToyDropRate(int id, double toyDropRate);
    public void play();
    public void getPrizeToyCars() throws IOException;

}
