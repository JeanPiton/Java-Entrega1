package com.holidayzer.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/holidays")
public class HolidayController {
    Holiday[] calendar = {new Holiday("01-01-2024", "Confraternização Mundial"),
        new Holiday("12-02-2024", "Carnaval"),
        new Holiday("13-02-2024", "Carnaval"),
        new Holiday("29-03-2024", "Sexta-feira Santa"),
        new Holiday("21-04-2024", "Tiradentes"),
        new Holiday("01-05-2024", "Dia do Trabalho"),
        new Holiday("30-05-2024", "Corpus Christi"),
        new Holiday("07-09-2024", "Independência do Brasil"),
        new Holiday("12-10-2024", "Nossa Senhora Aparecida"),
        new Holiday("02-11-2024", "Finados"),
        new Holiday("15-11-2024", "Proclamação da República"),
        new Holiday("20-11-2024", "Dia Nacional de Zumbi e da Consciência Negra"),
        new Holiday("25-12-2024", "Natal")
    };
    
    @GetMapping
    public String[] getHolidayList() {
        String[] data = new String[calendar.length];
        for(int i=0; i<calendar.length; i++){
            String day = calendar[i].getDay();
            String name = calendar[i].getName();
            data[i] = day+" => "+name;
        }
        return data;
    }

    @GetMapping("/{date}")
    public String getIsDay(@PathVariable String date) {
        for(int i=0; i<calendar.length; i++){
            String day = calendar[i].getDay();
            
            if(date.equals(day)){
                return "Dia "+date+" é "+calendar[i].getName()+"! 🎉";
            }
        }
        return "Dia "+date+" não é feriado 🥲";
    }
}
