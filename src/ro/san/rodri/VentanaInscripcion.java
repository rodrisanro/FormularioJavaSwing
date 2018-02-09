package ro.san.rodri;

import javax.swing.*;
import java.awt.*;

public class VentanaInscripcion extends JFrame {
 private JLabel nombre;
 private JLabel apellido;
 private JLabel cedula;
 private JLabel emitido;
 private JLabel intereses;
 private JTextField campoN;
 private JTextField campoA;
 private JTextField campoC;
 private JComboBox depa ;
  private JRadioButton op1, op2, op3, op4;
  private  JButton guardar;
    GridBagConstraints gbc = new GridBagConstraints();
 public VentanaInscripcion(){
   super("FORMULARIO DE INSCRIPCION:");
   nombre = new JLabel("NOMBRES:");
   apellido = new JLabel("APELLIDOS:");
   cedula = new JLabel("C.I:");
   emitido = new JLabel("EMITIDO EN:");
   intereses = new JLabel("INTERESES:");
   campoN = new JTextField(10);
   campoA = new JTextField(10);
   campoC = new JTextField(10);
   op1= new JRadioButton("jugar");
   op2 = new JRadioButton("escuchar musica");
   op3 = new JRadioButton("ver tele");
   op4 = new JRadioButton("dormir");
   guardar = new JButton("Guardar");

   setLayout(new GridBagLayout());
     gbc.gridx = 1;
     gbc.gridy = 1;
     add(nombre, gbc);
     gbc.gridx = 3;
     gbc.gridy = 1;
     add(campoN, gbc);
     gbc.gridx = 1;
     gbc.gridy = 3;
     add(apellido, gbc);
     gbc.gridx = 3;
     gbc.gridy = 3;
     add(campoA,gbc);
     gbc.gridx = 1;
     gbc.gridy = 4;
     add(cedula, gbc);
     gbc.gridx = 3;
     gbc.gridy = 4;
     add(campoC, gbc);
     gbc.gridx = 1;
     gbc.gridy = 5;
     add(emitido,gbc);
     gbc.gridx = 3;
     gbc.gridy = 5;

   depa = new JComboBox();
   add(depa, gbc);

     depa.addItem("Cochabamba");
     depa.addItem("Santa Cruz");
     depa.addItem("Oruro");
     depa.addItem("Potosi");
     depa.addItem("Pando");
     depa.addItem("Beni");
     depa.addItem("La Paz");
     depa.addItem("Tarija");
     depa.addItem("Chuquisaca");
   gbc.gridx = 1;
   gbc.gridy = 6;
   add(intereses, gbc);
   gbc.gridx = 1;
   gbc.gridy = 7;
   add(op1, gbc);
   gbc.gridx = 3;
   gbc.gridy = 7;
   add(op2, gbc);
   gbc.gridx = 1;
   gbc.gridy = 8;
   add(op3, gbc);
   gbc.gridx = 3;
   gbc.gridy = 8;
   add(op4, gbc);
   gbc.gridx = 2;
   gbc.gridy = 9;
   add(guardar, gbc);



 }
}
