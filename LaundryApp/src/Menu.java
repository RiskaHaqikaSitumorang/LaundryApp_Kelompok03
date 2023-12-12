package proses;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;

public class Menu {
    
    private HashMap<String, Integer> menu;

    public Menu() {
        menu = new HashMap<String, Integer>();
        setMenu();
    }

    public int retHarga(String key) {
        return menu.get(key);
    }

    public void setMenu()
    {
        menu.put("Dress", 40000);
        menu.put("Sweater", 35000);
        menu.put("Blanket", 30000);
        menu.put("Jacket", 25000);
        menu.put("Kebaya", 20000);
        menu.put("Jas", 20000);
        menu.put("Shoes", 25000);
        menu.put("Outher", 10000);
    }

    public HashMap<String, Integer> getMenu() {
        return menu;
    }

    public String JenisCucian(int noMenu) {
        int index = noMenu - 1;

        Set<String> menuSet = menu.keySet();

        ArrayList<String> listMenu = new ArrayList<String>(menuSet);

        String key = listMenu.get(index);

        return key;
    }

}
