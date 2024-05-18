package com.tesji.practicaspinner.model;

public class CarrerasModel {
    private  int carrera;

    public String mostrarInfo(){
        String inforCarrera ="";
        switch (carrera){
            case 0:
                inforCarrera = "Por favor seleccione Carrera";
                break;
            case 1:
                inforCarrera = "Ingeniería Industrial te permíte ...";
                break;
            case 2:
                inforCarrera = "Ing. Sistemas es una carreraa donde podrás desarrollar software, diseño y admon de redes y bases de datos";
                break;
            case 3:
                inforCarrera = "La mejor Ingeniería en Construcción";
                break;
            case 4:
                inforCarrera = "Barcos, camiones y contenedores";
                break;
            case 5:
                inforCarrera = "Ingenieria en mecatronica";
                break;
            case 6:
                inforCarrera = "Ingenieria en TICS";
                break;
            case 7:
                inforCarrera = "Ingenieria en administracion de empresas";
                break;
            case 8:
                inforCarrera = "Ingenieria en quimica";
                break;
        }
        return inforCarrera;
    }
    public int getCarrera(){
        return carrera;
    }
    public void setCarrera(int carrera) {
        this.carrera = carrera;
    }
}
