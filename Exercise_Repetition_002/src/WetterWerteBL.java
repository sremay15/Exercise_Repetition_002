
import java.util.ArrayList;
import javax.swing.AbstractListModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marcs
 */
public class WetterWerteBL extends AbstractListModel{
    
    private ArrayList<WetterWerte> liste = new ArrayList();
    
    public void add(WetterWerte ww){
        liste.add(ww);
        fireContentsChanged(ww, 0, 0);
    }

    @Override
    public int getSize() {
        return liste.size();
    }

    @Override
    public Object getElementAt(int i) {
        return liste.get(i);
    }
    
}
