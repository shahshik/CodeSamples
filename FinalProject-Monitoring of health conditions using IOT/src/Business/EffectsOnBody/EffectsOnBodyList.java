/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EffectsOnBody;

//import Business.Device.Device;
import java.util.ArrayList;

/**
 *
 * @author NARESH SHAH
 */
public class EffectsOnBodyList {
    private ArrayList<EffectsOnBody> bodyEffectsList;
   
   public EffectsOnBodyList() {
        bodyEffectsList = new ArrayList<>();
    }

    public ArrayList<EffectsOnBody> getEffectsOnBodyList() {
        return bodyEffectsList;
    }
    
    public EffectsOnBody addEffects() {
        EffectsOnBody e = new EffectsOnBody();
        bodyEffectsList.add(e);
        return e;
    } 
}
