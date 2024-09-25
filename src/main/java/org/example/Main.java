package org.example;

import org.example.ayudas.Proveedor;
import org.example.ayudas.Repartidor;
import org.example.modelos.Cliente;
import org.example.modelos.Flor;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 10 atributos
        // cada clase constructor vacio
        // cada clase constructor llenos
        //main crear un objeto de cada clase
        // mostrar todos los atributos de cada objeto (getter y setter)
        // al final subir al github

        // Imprimir los datos de cada cliente

        // Crear una lista para almacenar los clientes
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        ArrayList<Flor> listaFlores = new ArrayList<>();
        ArrayList<Repartidor> listaRepartidores = new ArrayList<>();
        ArrayList<Proveedor> listaProveedores = new ArrayList<>();

        // Crear 10 objetos Cliente y añadirlos a la lista

        listaClientes.add(new Cliente(1, 25, "Ana Martínez", "Femenino", "Calle del Sol 45", "600123456", "Rojo", "Tulipanes", "Caja decorada", true));
        listaClientes.add(new Cliente(2, 32, "Luis Fernández", "Masculino", "Avenida Libertad 23", "601987654", "Azul", "Rosas", "Bolsa reciclable", false));
        listaClientes.add(new Cliente(3, 45, "Carmen López", "Femenino", "Calle Nueva 12", "600345678", "Verde", "Margaritas", "Papel kraft", true));
        listaClientes.add(new Cliente(4, 29, "Pedro Sánchez", "Masculino", "Plaza Mayor 9", "602123890", "Amarillo", "Girasoles", "Caja regalo", true));
        listaClientes.add(new Cliente(5, 38, "Laura Gómez", "Femenino", "Calle Real 56", "603234567", "Naranja", "Orquídeas", "Bolsa de lujo", false));
        listaClientes.add(new Cliente(6, 27, "José Ruiz", "Masculino", "Avenida del Mar 3", "604345678", "Violeta", "Lirios", "Cesta de mimbre", true));
        listaClientes.add(new Cliente(7, 40, "María Jiménez", "Femenino", "Calle Jardines 67", "605123789", "Rosa", "Claveles", "Empaque simple", false));
        listaClientes.add(new Cliente(8, 35, "Carlos Torres", "Masculino", "Camino Verde 78", "606456789", "Blanco", "Dalias", "Papel reciclado", true));
        listaClientes.add(new Cliente(9, 50, "Isabel Vázquez", "Femenino", "Calle Central 34", "607567890", "Negro", "Violetas", "Caja elegante", false));
        listaClientes.add(new Cliente(10, 60, "Miguel Hernández", "Masculino", "Paseo de la Estrella 89", "608678901", "Gris", "Peonías", "Bolsa con logo", true));

        // Crear 10 objetos Flor y añadirlos a la lista

        listaFlores.add(new Flor(1, 8, 10, LocalDate.of(2023, 9, 1), "Rosa", "Rojo", "30 cm", "Fresca", "Europa", true, true));
        listaFlores.add(new Flor(2, 10, 15, LocalDate.of(2023, 9, 2), "Lirio", "Blanco", "40 cm", "Cortada", "Asia", true, false));
        listaFlores.add(new Flor(3, 5, 7, LocalDate.of(2023, 9, 3), "Margarita", "Amarillo", "25 cm", "Fresca", "Europa", true, false));
        listaFlores.add(new Flor(4, 12, 20, LocalDate.of(2023, 9, 4), "Tulipán", "Rosa", "35 cm", "Cortada", "Holanda", true, false));
        listaFlores.add(new Flor(5, 6, 12, LocalDate.of(2023, 9, 5), "Girasol", "Amarillo", "50 cm", "Fresca", "América", true, false));
        listaFlores.add(new Flor(6, 15, 25, LocalDate.of(2023, 9, 6), "Clavel", "Rojo", "20 cm", "Cortada", "España", true, true));
        listaFlores.add(new Flor(7, 8, 30, LocalDate.of(2023, 9, 7), "Orquídea", "Violeta", "30 cm", "Cortada", "Brasil", true, false));
        listaFlores.add(new Flor(8, 9, 18, LocalDate.of(2023, 9, 8), "Azucena", "Blanco", "45 cm", "Fresca", "Egipto", true, false));
        listaFlores.add(new Flor(9, 7, 22, LocalDate.of(2023, 9, 9), "Peonía", "Rosa", "35 cm", "Cortada", "China", true, false));
        listaFlores.add(new Flor(10, 4, 5, LocalDate.of(2023, 9, 10), "Violeta", "Morado", "15 cm", "Fresca", "Francia", true, false));

        // Crear 10 objetos Repartidor y añadirlos a la lista

        listaRepartidores.add(new Repartidor(1, 28, "Moto", "Calle Luna 45", "600123456", "Carlos Pérez", 5, "carlos.perez@correo.com", 1500, "Repartos Rápidos"));
        listaRepartidores.add(new Repartidor(2, 32, "Coche", "Avenida Sol 23", "601987654", "Ana Gómez", 4, "ana.gomez@correo.com", 1800, "Entregas Express"));
        listaRepartidores.add(new Repartidor(3, 24, "Bicicleta", "Calle Estrella 12", "602345678", "Luis Fernández", 5, "luis.fernandez@correo.com", 1200, "EcoReparto"));
        listaRepartidores.add(new Repartidor(4, 29, "Moto", "Plaza Mayor 9", "603123890", "María López", 3, "maria.lopez@correo.com", 1400, "Mensajeros Seguros"));
        listaRepartidores.add(new Repartidor(5, 35, "Camioneta", "Calle Falsa 56", "604234567", "Pedro Sánchez", 4, "pedro.sanchez@correo.com", 2200, "Logística Total"));
        listaRepartidores.add(new Repartidor(6, 27, "Moto", "Avenida del Mar 3", "605345678", "Sofía Ruiz", 5, "sofia.ruiz@correo.com", 1600, "Envíos Ahora"));
        listaRepartidores.add(new Repartidor(7, 40, "Coche", "Calle Jardines 67", "606123789", "José Jiménez", 4, "jose.jimenez@correo.com", 1800, "Rutas Seguras"));
        listaRepartidores.add(new Repartidor(8, 38, "Bicicleta", "Camino Verde 78", "607456789", "Laura Torres", 5, "laura.torres@correo.com", 1100, "BiciReparto"));
        listaRepartidores.add(new Repartidor(9, 50, "Camioneta", "Calle Central 34", "608567890", "Raúl Vázquez", 3, "raul.vazquez@correo.com", 2300, "Transporte Integral"));
        listaRepartidores.add(new Repartidor(10, 45, "Moto", "Paseo de la Estrella 89", "609678901", "Elena Hernández", 4, "elena.hernandez@correo.com", 1700, "Envíos Rápidos"));

        // Crear 10 objetos Proveedor y añadirlos a la lista

        // Crear 10 objetos Proveedor y añadirlos a la lista
        listaProveedores.add(new Proveedor(1, "Flores del Sol", "Calle Luna 45", "Rosas", 1000, "600123456", LocalDate.of(2023, 10, 1), 5, "Madrid", "Las flores más frescas"));
        listaProveedores.add(new Proveedor(2, "Jardines de la Reina", "Avenida Sol 23", "Tulipanes", 1500, "601987654", LocalDate.of(2023, 10, 2), 7, "Sevilla", "Cultivando belleza"));
        listaProveedores.add(new Proveedor(3, "Floristería López", "Calle Estrella 12", "Margaritas", 800, "602345678", LocalDate.of(2023, 10, 3), 4, "Valencia", "Flores con amor"));
        listaProveedores.add(new Proveedor(4, "Nature Bloom", "Plaza Mayor 9", "Orquídeas", 500, "603123890", LocalDate.of(2023, 10, 4), 6, "Barcelona", "Belleza natural"));
        listaProveedores.add(new Proveedor(5, "Flor y Jardín", "Calle Falsa 56", "Claveles", 1200, "604234567", LocalDate.of(2023, 10, 5), 10, "Bilbao", "Flores para cada ocasión"));
        listaProveedores.add(new Proveedor(6, "Florista Martínez", "Avenida del Mar 3", "Lirios", 900, "605345678", LocalDate.of(2023, 10, 6), 3, "Granada", "Elegancia en cada flor"));
        listaProveedores.add(new Proveedor(7, "Tierra de Flores", "Calle Jardines 67", "Girasoles", 1300, "606123789", LocalDate.of(2023, 10, 7), 8, "Alicante", "Sol en tus manos"));
        listaProveedores.add(new Proveedor(8, "Floral Express", "Camino Verde 78", "Peonías", 600, "607456789", LocalDate.of(2023, 10, 8), 5, "Málaga", "Entrega rápida, flores frescas"));
        listaProveedores.add(new Proveedor(9, "Flores del Norte", "Calle Central 34", "Rosas", 2000, "608567890", LocalDate.of(2023, 10, 9), 9, "Santander", "Flores de calidad garantizada"));
        listaProveedores.add(new Proveedor(10, "EcoFlora", "Paseo de la Estrella 89", "Violetas", 700, "609678901", LocalDate.of(2023, 10, 10), 2, "Valladolid", "Naturaleza y frescura"));


        // Mostrar los detalles de cada cliente usando el método toString
        for (Cliente cliente : listaClientes) {
            System.out.println(cliente.toString());
            System.out.println("-------------------------------------");
        }
        // Mostrar los detalles de cada flor usando el método toString
        for (Flor flor : listaFlores) {
            System.out.println(flor.toString());
            System.out.println("-------------------------------------");
        }
        // Mostrar los detalles de cada repartidor usando el método toString
        for (Repartidor repartidor : listaRepartidores) {
            System.out.println(repartidor.toString());
            System.out.println("-------------------------------------");
        }
        // Mostrar los detalles de cada proveedor usando el método toString
        for (Proveedor proveedor : listaProveedores) {
            System.out.println(proveedor.toString());
            System.out.println("-------------------------------------");
        }

    }
}
