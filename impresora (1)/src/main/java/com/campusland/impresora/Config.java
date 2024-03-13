package com.campusland.impresora;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    
    @Bean
    public Impresora impresoraConsola(){
       return new ImpresoraConsola();
    }

    @Bean
    public Reporte reporteConsola(Impresora impresora){
        return new Reporte(impresora);  
    }

    @Bean
    public Reporte reporteArchivo(Impresora impresora){
        return new Reporte(impresora);
    }
}
