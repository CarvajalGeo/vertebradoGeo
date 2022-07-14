public class GeneradorVertebrados {
    public static Vertebrado[] generarArrayVertebrados(){
        Vertebrado[] miVertebrados = new Vertebrado[4];
        miVertebrados[0] = new Vertebrado(nombreVertebrado: "Camello", claseVertebrado: "Mamifero"); 
        miVertebrados[1] = new Vertebrado(nombreVertebrado: "Vaca", claseVertebrado: "Mamifero");
        miVertebrados[2] = new Vertebrado(nombreVertebrado: "Tiburón", claseVertebrado: "Pez");
        
        return miVertebrados;
    }
}
