/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenghttext;

//Имортируем компонент JOptionPane пакета javax.swing
import javax.swing.JOptionPane;

/**
 * @author Старцев Владислав, Рустем Еникеев, Игорь Мезенцев, Рустам Хайруллин
 */

//Инициализируем главный класс программы
public class Main extends javax.swing.JFrame {

  
    //Инициализируем метод для обработки резутата после нажатия кнопки "Расчитать"
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        //Создаем переменные str тип String, a тип int
        String str;
        int a;
        
        //Записываем текст из формы в переменную str
        str = jTextPane1.getText();
        //Из переменной str удаляем лишние пробелы (с начала и конца текста)
        str = str.trim();
        
        //Используя метод length считаем общее количество символов 
        //из переменной str и записываем в переменную a
        a = str.length();
        
        //Создаем переменную words и присваиваем ей тип String и указываем,
        //что данная строка будет массивом, созданным с помощью
        //метода split разбивая текст на слова через регулярное выражение
        //из переменной str
        String[] words = str.split("[\\s,.:!?-]+");
        
        //Делаем проверку на количество символов
        //Если пользователь не ввел ни одного символа и нажал на кнопку 
        //Расчитать, то выводим сообщение об ошибке, при а равным нулю
        if(a==0){
            //Выводим мообщение об ошибке с помощью метода showMessageDialog
            JOptionPane.showMessageDialog(null,"Вы не ввели текст!","Ошибка" ,
            JOptionPane.ERROR_MESSAGE);
        }
        //Либо печаем в метках количество символов/слов
        else{
            //Заполняем метку jLabel4 общим количеством символов
            jLabel4.setText(""+a);
            //Заполняем метку jLabel5 количеством слов, в данном примере 
            //метод length считает не количество символов, а количество 
            //элементов массива words
            jLabel5.setText(""+words.length);
        }
        
        
    }                                        
    
    //Инициализируем метод для сброса текста в текстовом поле
    //А также стираем количество символов/слов
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        //Устанавливаем для jTextPane1, jLabel4, jLabel5 пустое значение:
        jTextPane1.setText("");
        jLabel4.setText("");
        jLabel5.setText("");
    } 
}
