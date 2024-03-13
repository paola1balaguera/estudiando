package com.campusland.impresora;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Reporte reporteConsola=context.getBean("reporteConsola",Reporte.class);
        reporteConsola.generarReporte("Reporte de clientes");
        Reporte reporteArchivo=context.getBean("reporteArchivo",Reporte.class);
        reporteArchivo.generarReporte("Reporte de Clientes");
        
    }
}
