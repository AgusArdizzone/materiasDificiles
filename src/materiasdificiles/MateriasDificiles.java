/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package materiasdificiles;

import java.util.Random;

public class MateriasDificiles extends MetodosSteve {

    public static int sacarPromedio(int matriz[][],int materia,int alumnos){
        int i=0, promedio=0;
        for (i=0;i<alumnos;i++){
            promedio+= matriz[i][materia];
        }
        promedio= promedio/alumnos;
        return promedio;
    }
    
    public static void imprimirMateriaMasFacil (int promedios[],char materias[]){
        switch (materias[3]){
            case 'm':
                imprimir("La materia mas facil es Matematica. El promedio es de: "+ promedios[3]);
                break;
            case 'l':
                imprimir("La materia mas facil es Lengua. El promedio es de: "+ promedios[3]);
                break;
            case 'g':
                imprimir("La materia mas facil es Geografia. El promedio es de: "+ promedios[3]);
                break;
            case 'h':
                imprimir("La materia mas facil es Historia. El promedio es de: "+ promedios[3]);
                break;
            default:
                imprimir("Error");
        }
    }
    
    public static void imprimirMateriaMasDificil (int promedios[],char materias[]){
        switch (materias[0]){
            case 'm':
                imprimir("La materia mas dificil es Matematica. El promedio es de: "+ promedios[0]);
                break;
            case 'l':
                imprimir("La materia mas dificil es Lengua. El promedio es de: "+ promedios[0]);
                break;
            case 'g':
                imprimir("La materia mas dificil es Geografia. El promedio es de: "+ promedios[0]);
                break;
            case 'h':
                imprimir("La materia mas dificil es Historia. El promedio es de: "+ promedios[0]);
                break;
            default:
                imprimir("Error");
        }
    }
    
    public static void main(String[] args) {
        Random rand = new Random();
        int cantAlumnos = 0;
        imprimir("Ingrese la cantidad de alumnos: ");
        cantAlumnos = tomarInt();
        int[][] matriz = new int [cantAlumnos][4];
        int[] dificultad = new int[4];
        char[] posMateria= new char[4];
        int i=0, j=0, auxInt=0;
        char auxChar=0;
        int promMatematica=0, promLengua=0, promGeografia=0, promHistoria=0;
        
        for (i=0; i<cantAlumnos; i++){
            for (j=0; j<4;j++){
                matriz[i][j]= rand.nextInt(10)+1 ;
            }
        }
        
        promMatematica= sacarPromedio(matriz, 0, cantAlumnos);
        posMateria[0]='m';
        dificultad[0]= promMatematica;
        imprimir(dificultad[0]);
        promLengua= sacarPromedio(matriz, 1, cantAlumnos);
        posMateria[1]='l';
        dificultad[1]= promLengua;
        imprimir(dificultad[1]);
        promGeografia= sacarPromedio(matriz, 2, cantAlumnos);
        posMateria[2]='g';
        dificultad[2]= promGeografia;
        imprimir(dificultad[2]);
        promHistoria= sacarPromedio(matriz, 3, cantAlumnos);
        posMateria[3]='h';
        dificultad[3]= promHistoria;
        imprimir(dificultad[3]);
        
        for(i=0;i<4;i++){
            for(j=0;j<3;j++){
                if(dificultad[j]>=dificultad[j+1]){
                    auxInt= dificultad[j];
                    auxChar= posMateria[j];
                    dificultad[j]= dificultad[j+1];
                    posMateria[j]= posMateria[j+1];
                    dificultad[j+1]=auxInt;
                    posMateria[j+1]=auxChar;
                }
            }
        }
        
        imprimirMateriaMasFacil(dificultad, posMateria);
        imprimirMateriaMasDificil(dificultad, posMateria);
    }
}
