/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dualnavkladaciaheuristika;

/**
 *
 * @author Erik
 */
public class BatohItem {
    
    private int _vaha = 0;
    private int _cena = 0;
    
    public void SetVaha(int vaha)
    {
        _vaha = vaha;
    }
    
    public void SetCena(int cena)
    {
        _cena = cena;
    }
    
    public int GetVaha()
    {
        return _vaha;
    }
    
    public int GetCena()
    {
        return _cena;
    }

    @Override
    public String toString() {
        return "BatohItem: vaha - " + _vaha + " cena - " + _cena + "";
    }
    
}
