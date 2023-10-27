package com.mycompany.calculadora;

public class Calculadora {
    //Atributos
    private String digito;
    private double resultado;
    private boolean suma;
    private boolean resta;
    private boolean multiplicacion;
    private boolean division;
    private boolean cambioSigno;
    private boolean coma;
    private boolean unoSobre;
    private boolean cuadrado;
    private boolean raiz;
    private boolean porcentaje;
    
    
    //Constructor
    public Calculadora(){
        digito = "";
        resultado = 0;
        suma = false;
        resta = false;
        multiplicacion = false;
        division = false;
        cambioSigno = false;
        unoSobre = false;
        cuadrado = false;
        raiz = false;
        porcentaje = false;
    }

    public String getDigito() {
        return digito;
    }

    public void setDigito(String digito) {
        this.digito = digito;
    }
    
    
    //Métodos
    public void agregarNum(int num){
        setDigito(digito + num);
    }
    
    public void suma(String num){
        this.resultado = Double.parseDouble(num);
        suma = true;
        setDigito("");
    }
    
    public void resta(String num){
        this.resultado = Double.parseDouble(num);
        resta = true;
        setDigito("");
    }
    
    public void multiplicacion(String num){
        this.resultado = Double.parseDouble(num);
        multiplicacion = true;
        setDigito("");
    }
    
    public void division(String num){
        this.resultado = Double.parseDouble(num);
        division = true;
        setDigito("");
    }
    
    public void cambioSigno(String num){
        this.resultado = Double.parseDouble(num);
        cambioSigno = true;
        setDigito("");
    }
    
    public void unoSobre(String num){
        this.resultado = Double.parseDouble(num);
        unoSobre = true;
        setDigito("");
    }
    
    public void cuadrado(String num){
        this.resultado = Double.parseDouble(num);
        cuadrado = true;
        setDigito("");
    }
    
    public void raiz(String num){
        this.resultado = Double.parseDouble(num);
        raiz = true;
        setDigito("");
    }
    
    public void porcentaje(String num){
        this.resultado = Double.parseDouble(num);
        porcentaje = true;
        setDigito("");
    }
    
    //Funciones
    public double resultadofinal(String numero){
        if(suma == true){
            resultado = resultado + Double.parseDouble(numero);
        }
        if(resta == true){
            resultado = resultado - Double.parseDouble(numero);
        }
        if(multiplicacion == true){
            resultado = resultado * Double.parseDouble(numero);
        }
        if(division == true){
            resultado = resultado / Double.parseDouble(numero);
        }
        if(cambioSigno == true){
            resultado = Double.parseDouble(numero) * -1;
        }
        if(unoSobre == true){
            resultado = 1 / Double.parseDouble(numero);
        }
        if(cuadrado == true){
            resultado = Math.pow(resultado,2);
        }
        if(raiz == true){
            resultado = Math.sqrt(Double.parseDouble(numero));
        }
        if(porcentaje == true){
            resultado = Double.parseDouble(numero)/100;
        }
        
     //Pongo en falso las flags  
     suma = false;
     resta = false;
     multiplicacion = false;
     division = false;
     cambioSigno = false;
     unoSobre = false;
     cuadrado = false;
     raiz = false;
     porcentaje = false;
     
     //Retorno
     return resultado;
    }
}