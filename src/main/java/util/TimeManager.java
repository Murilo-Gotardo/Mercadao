/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.time.LocalTime;

/**
 *
 * @author murilo
 */
public class TimeManager {
    
    private static final int MORNING = 6;
    private static final int AFTERNOON = 12;
    private static final int NIGHT = 18;
    
    public static String getGretting(){
        if (LocalTime.now().getHour() >= MORNING && LocalTime.now().getHour() <= AFTERNOON) {
            return "Bom dia";
        } else if (LocalTime.now().getHour() >= AFTERNOON && LocalTime.now().getHour() <= NIGHT) {
            return "Boa tarde";
        } else {
            return "Boa noite";
        }
    }
        
}
