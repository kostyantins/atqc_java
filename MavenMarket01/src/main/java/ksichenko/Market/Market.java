package ksichenko.Market;

import java.util.LinkedList;
import java.util.List;

public class Market extends Client {

    List<Client> allClientList = new LinkedList<>();
    List<Client> simpleClient = new LinkedList<>();
    List<Client> constantClient = new LinkedList<>();
    List<Client> vipClient = new LinkedList<>();
}
