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
    
    public static void main(String[] args) {
        Random rand = new Random();
        int cantAlumnos = 0;
        imprimir("Ingrese la cantidad de alumnos: ");
        cantAlumnos = tomarInt();
        int[][] matriz = new int [cantAlumnos][4];
        int i=0, j=0;
        int promMatematica=0, promLengua=0, promGeografia=0, promHistoria=0;
        
        for (i=0; i<cantAlumnos; i++){
            for (j=0; j<4;j++){
                matriz[i][j]= rand.nextInt(10)+1 ;
            }
        }
        
        promMatematica= sacarPromedio(matriz, 0, cantAlumnos);
        promLengua= sacarPromedio(matriz, 1, cantAlumnos);
        promGeografia= sacarPromedio(matriz, 2, cantAlumnos);
        promHistoria= sacarPromedio(matriz, 3, cantAlumnos);
        
        imprimir(promMatematica);
        
        imprimir(promLengua);
        
        imprimir(promGeografia);
        
        imprimir(promHistoria);
    }
    
}
