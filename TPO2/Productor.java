/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPO_2;

/**
 *
 * @author Matias
 */
public class Productor extends Thread {

    private Buffer buffer;

    public Productor(String nombre, Buffer bf) {
        super(nombre);
        this.buffer = bf;
    }

    public void run() {
        while (true) {
            buffer.agregar();
        }
    }
}
