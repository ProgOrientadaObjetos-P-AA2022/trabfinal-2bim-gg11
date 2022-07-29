package Paquete03;

import Paquete01.*;
import Paquete02.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) throws SQLException {
        Principal obj = new Principal();
        int op;
        ArrayList<PlanCelular> lista = new ArrayList<>();
        Enlace1 e1 = new Enlace1();
        Enlace2 e2 = new Enlace2();
        Enlace3 e3 = new Enlace3();
        Enlace4 e4 = new Enlace4();
        do {
            op = obj.menu();
            switch (op) {
                case 1 -> {
                    obj.entrada.nextLine();
                    System.out.println("Ingrese su nombre:");
                    String nombre1 = obj.entrada.nextLine();
                    System.out.println("Ingrese su cedula:");
                    String cedula1 = obj.entrada.nextLine();
                    System.out.println("Ingrese su ciudad de residencia:");
                    String ciudad1 = obj.entrada.nextLine();
                    System.out.println("Ingrese la marca de su dispositivo:");
                    String marca1 = obj.entrada.nextLine();
                    System.out.println("Ingrese el modelo de su dispositivo:");
                    String modelo1 = obj.entrada.nextLine();
                    System.out.println("Ingrese su numero celular:");
                    String numero1 = obj.entrada.nextLine();

                    System.out.println("Ingrese los minutos nacionales:");
                    int minutosN1 = obj.entrada.nextInt();
                    System.out.println("Ingrese el costo por minuto nacional:");
                    double costoMinN1 = obj.entrada.nextDouble();
                    System.out.println("Ingrese los minutos internacionales:");
                    int minutosInt1 = obj.entrada.nextInt();
                    System.out.println("Ingrese el costo por minuto internacional:");
                    double costoMinInt1 = obj.entrada.nextDouble();

                    PlanPostPagoMinutos p1 = new PlanPostPagoMinutos(
                            minutosN1, costoMinN1, minutosInt1, costoMinInt1, nombre1,
                            cedula1, ciudad1, marca1, modelo1, numero1
                    );
                    lista.add(p1);
                    e1.insertarPlanPostPagoMinutos(p1);
                }
                case 2 -> {
                    obj.entrada.nextLine();
                    System.out.println("Ingrese su nombre:");
                    String nombre2 = obj.entrada.nextLine();
                    System.out.println("Ingrese su cedula:");
                    String cedula2 = obj.entrada.nextLine();
                    System.out.println("Ingrese su ciudad de residencia actual:");
                    String ciudad2 = obj.entrada.nextLine();
                    System.out.println("Ingrese la marca de su dispositivo:");
                    String marca2 = obj.entrada.nextLine();
                    System.out.println("Ingrese el modelo de su dispositivo:");
                    String modelo2 = obj.entrada.nextLine();
                    System.out.println("Ingrese su numero celular:");
                    String numero2 = obj.entrada.nextLine();

                    System.out.println("Ingrese la tarifa base:");
                    double tarifa2 = obj.entrada.nextDouble();
                    System.out.println("Ingrese el numero de Gigas:");
                    int gigas2 = obj.entrada.nextInt();
                    System.out.println("Ingrese el costo por Giga:");
                    double costoXgiga2 = obj.entrada.nextDouble();

                    PlanPostPagoMegas p2 = new PlanPostPagoMegas(
                            gigas2, costoXgiga2, tarifa2, nombre2,
                            cedula2, ciudad2, marca2, modelo2, numero2
                    );
                    lista.add(p2);
                    e2.insertarPlanPostPagoMegas(p2);
                }
                case 3 -> {
                    obj.entrada.nextLine();
                    System.out.println("Ingrese su nombre:");
                    String nombre3 = obj.entrada.nextLine();
                    System.out.println("Ingrese su cedula:");
                    String cedula3 = obj.entrada.nextLine();
                    System.out.println("Ingrese su ciudad de residencia actual:");
                    String ciudad3 = obj.entrada.nextLine();
                    System.out.println("Ingrese la marca de su dispositivo:");
                    String marca3 = obj.entrada.nextLine();
                    System.out.println("Ingrese el modelo de su dispositivo:");
                    String modelo3 = obj.entrada.nextLine();
                    System.out.println("Ingrese su numero celular:");
                    String numero3 = obj.entrada.nextLine();

                    System.out.println("Ingrese los minutos:");
                    int minutos3 = obj.entrada.nextInt();
                    System.out.println("Ingrese el costo por minuto:");
                    double costoMin3 = obj.entrada.nextDouble();
                    System.out.println("Ingrese el numero de Gigas:");
                    int gigas3 = obj.entrada.nextInt();
                    System.out.println("Ingrese el costo por Giga:");
                    double costoXgiga3 = obj.entrada.nextDouble();

                    PlanPostPagoMinMeg p3 = new PlanPostPagoMinMeg(
                            minutos3, costoMin3, gigas3, costoXgiga3, nombre3,
                            cedula3, ciudad3, marca3, modelo3, numero3
                    );
                    lista.add(p3);
                    e3.insertarPlanPostPagoMinMeg(p3);
                }
                case 4 -> {
                    obj.entrada.nextLine();
                    System.out.println("Ingrese su nombre:");
                    String nombre4 = obj.entrada.nextLine();
                    System.out.println("Ingrese su cedula:");
                    String cedula4 = obj.entrada.nextLine();
                    System.out.println("Ingrese su ciudad de residencia actual:");
                    String ciudad4 = obj.entrada.nextLine();
                    System.out.println("Ingrese la marca de su dispositivo:");
                    String marca4 = obj.entrada.nextLine();
                    System.out.println("Ingrese el modelo de su dispositivo:");
                    String modelo4 = obj.entrada.nextLine();
                    System.out.println("Ingrese su numero celular:");
                    String numero4 = obj.entrada.nextLine();

                    System.out.println("Ingrese los minutos:");
                    int minutos4 = obj.entrada.nextInt();
                    System.out.println("Ingrese el costo por minuto:");
                    double costoMin4 = obj.entrada.nextDouble();
                    System.out.println("Ingrese el numero de Gigas:");
                    int gigas4 = obj.entrada.nextInt();
                    System.out.println("Ingrese el costo por Giga:");
                    double costoXgiga4 = obj.entrada.nextDouble();
                    System.out.println("Ingrese el descuento otorgado(%):");
                    int descuento4 = obj.entrada.nextInt();

                    PlanPostpagoMinMegEco p4 = new PlanPostpagoMinMegEco(
                            minutos4, costoMin4, gigas4, costoXgiga4, descuento4,
                            nombre4, cedula4, ciudad4, marca4, modelo4, numero4
                    );
                    lista.add(p4);
                    e4.insertarPlanPostPagoMinMegEco(p4);
                }
                case 5 -> {
                    for (int i = 0; i < lista.size(); i++) {
                        lista.get(i).calcularPagoMensual();
                        lista.get(i).obtenerPagoMensual();
                    }
                    for (int i = 0; i < e1.obtenerDataPppMinutos().size(); i++) {
                        System.out.printf("%s\n", e1.obtenerDataPppMinutos().get(i));
                    }
                    for (int i = 0; i < e2.obtenerDataPppMegas().size(); i++) {
                        System.out.printf("%s\n", e2.obtenerDataPppMegas().get(i));
                    }
                    for (int i = 0; i < e3.obtenerDataPppmm().size(); i++) {
                        System.out.printf("%s\n", e3.obtenerDataPppmm().get(i));
                    }
                    for (int i = 0; i < e4.obtenerDataPppmmEco().size(); i++) {
                        System.out.printf("%s\n", e4.obtenerDataPppmmEco().get(i));
                    }
                }
                case 0 -> {
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println(lista.get(i));
                    }
                }
                default -> {
                    break;
                }
            }
        } while (op != 0);
    }

    public int menu() {
        int opc;
        System.out.println("Crear Plan Post Pago Minutos                 |1|");
        System.out.println("Crear Plan Post PagoMegas                    |2|");
        System.out.println("Crear Plan Post Pago Minutos Megas           |3|");
        System.out.println("Crear Plan Post Pago Minutos Megas Economico |4|");
        System.out.println("Mostar objetos en base de datos              |5|");
        System.out.println("Terminar y Mostrar objetos ingresados        |0|");
        opc = entrada.nextInt();
        return opc;
    }

}
