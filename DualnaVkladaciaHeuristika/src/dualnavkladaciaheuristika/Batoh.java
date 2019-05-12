/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dualnavkladaciaheuristika;

import java.util.ArrayList;

/**
 *
 * @author Erik
 */
public class Batoh {
    
    private int _maxCapacity = 0;
    private int _actualCapacity = 0;
    private int _hodnotaBatohu = 0;
    
    private ArrayList<BatohItem> _items = new ArrayList();
    
    public void AddItem(BatohItem item)
    {
        if (item != null)
        {
            _items.add(item);
            _actualCapacity += item.GetVaha();
            _hodnotaBatohu += item.GetCena();
            
            //System.out.println("Added to bag " + item.toString());
            
        } else {
            System.out.println("Tried to insert null");
        }
        
    }
    
    public void RemoveTheHardestItem()
    {
        if (_items.isEmpty() == false)
        {
            BatohItem hardest = _items.get(0);
            int theHardestIndex = 0;
            
            int tmpIndex = 0;
            
            for (BatohItem tmpItem : _items)
            {
                if (tmpItem.GetVaha() > hardest.GetVaha())
                {
                    hardest = tmpItem;
                    theHardestIndex = tmpIndex;
                }
                tmpIndex++;
            }
            
            if (hardest != null)
            {
                _actualCapacity -= hardest.GetVaha();
                _hodnotaBatohu -= hardest.GetCena();
                
                System.out.println("Removing from bag " + hardest.toString());
                System.out.println("Actual bag capacity " + _actualCapacity);
                System.out.println("Hodnota batoha " + _hodnotaBatohu);
                System.out.println("---");
                
                _items.remove(theHardestIndex);
            }
            
            
        } 
    }
    
    public void SetMaximalCapacity(int capacity)
    {
        _maxCapacity = capacity;        
    }   
    
    public int GetMaxCapacity()
    {
        return _maxCapacity;
    }
    
    public int GetActualCapacity()
    {
        return _actualCapacity;
    }
    
    public int GetHodnotaBatohu()
    {
        return _hodnotaBatohu;
    }
    
    public int GetFreeCapacity()
    {
        return _maxCapacity - _actualCapacity;
    }
        
    public int GetPocetItemov()
    {
        return _items.size();
    }
    
    
    
    
    
    
    
}
