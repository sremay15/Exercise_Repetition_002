
import java.time.LocalDate;
import java.time.LocalTime;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marcs
 */
public class WetterWerte {
    
    private int temp,lf;
    private LocalDate date;
    private LocalTime time;

    public WetterWerte(int temp, int lf, LocalDate date, LocalTime time) {
        this.date = date;
        this.temp = temp;
        this.lf = lf;
        this.time = time;
    }

    @Override
    public String toString() {
        return String.format("%s - %s: %d - %d ",date,time,temp,lf);
    }
    
    
    
}
