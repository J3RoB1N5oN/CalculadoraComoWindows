package com.mycompany.calculadora;

public class Calculadora {
    //Atributos
    private String digito;
    private String retorno;
    private double resultado;
    private double mem1;
    private boolean suma;
    private boolean resta;
    private boolean multiplicacion;
    private boolean division;
    private boolean cambioSigno;
    private boolean unoSobre;
    private boolean porcentaje;
    private boolean cuadrado;
    private boolean raiz;
    private boolean CE;
    
    //Constructor
    public Calculadora(){
        digito = "";
        resultado = 0;
        mem1 = 0;
        suma = false;
        resta = false;
        multiplicacion = false;
        division = false;
        cambioSigno = false;
        unoSobre = false;
        porcentaje = false;
        cuadrado = false;
        raiz = false;
        CE = false;
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
    
    public void agregarComa(){
        if(!(digito.contains("."))){
            setDigito(digito + '.');
        }
    }
    
    public void eliminarNum(){
        retorno = digito.substring(0, digito.length()-1);
        digito = retorno;
        setDigito(digito);
    }
    
    public void botonC(){
        setDigito("");
    }
    
    public void suma(String num){
        this.mem1 = Double.parseDouble(num);
        suma = true;
        setDigito("");
    }
    
    public void resta(String num){
        this.mem1 = Double.parseDouble(num);
        resta = true;
        setDigito("");
    }
    
    public void multiplicacion(String num){
        this.mem1 = Double.parseDouble(num);
        multiplicacion = true;
        setDigito("");
    }
    
    public void division(String num){
        this.mem1 = Double.parseDouble(num);
        division = true;
        setDigito("");
    }
    
    public void cambioSigno(String num){
        this.mem1 = Double.parseDouble(num);
        cambioSigno = true;
        setDigito("");
    }
    
    public void unoSobre(String num){
        this.mem1 = Double.parseDouble(num);
        unoSobre = true;
    }
    
    public void porcentaje(String num){
        this.mem1 = Double.parseDouble(num);
        porcentaje = true;
    }
    
    public void cuadrado(String num){
        this.mem1 = Double.parseDouble(num);
        cuadrado = true;
    }
    
    public void raiz(String num){
        this.mem1 = Double.parseDouble(num);
        raiz = true;
    }
    
    public void CE(String num){
        this.mem1 = Double.parseDouble(num);
        CE = true;
        setDigito("");
    }
    
    //Funciones
    public double resultadofinal(String numero){
        if(suma == true){
            resultado = mem1 + Double.parseDouble(numero);
        }
        if(resta == true){
            resultado = mem1 - Double.parseDouble(numero);
        }
        if(multiplicacion == true){
            resultado = mem1 * Double.parseDouble(numero);
        }
        if(division == true){
            resultado = mem1 / Double.parseDouble(numero);
        }
        if(cambioSigno == true){
            resultado = mem1 * -1;
        }
        if(unoSobre == true){
            resultado = 1 / mem1;
        }
        if(porcentaje == true){
            resultado = mem1 / 100;
        }
        if(cuadrado == true){
            resultado = Math.pow(mem1,2);
        }
        if(raiz == true){
            resultado = Math.sqrt(mem1);
        }
        if(CE == true){
            resultado = 0;
        }
        
     //Pongo en falso las flags  
     suma = false;
     resta = false;
     multiplicacion = false;
     division = false;
     cambioSigno = false;
     unoSobre = false;
     porcentaje = false;
     cuadrado = false;
     raiz = false;
     CE = false;
     
     //Retorno
     return resultado;
    }
}