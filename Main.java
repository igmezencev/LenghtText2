/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * //Прописываем, какой нужно использовать метод при нажатии на кнопку
 */
package lenghttext;

//Имортируем компонент JOptionPane пакета javax.swing
import javax.swing.JOptionPane;

/**
 * @author Старцев Владислав, Рустем Еникеев, Игорь Мезенцев, Рустам Хайруллин
 */

//Инициализируем главный класс программы
public class Main extends javax.swing.JFrame {

    //Инициализируем переменные форм
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    
    //В главном методе инициализируем сгенерированные компоненты форм
    public Main() {
        initComponents();
    }
    /**
     * @param args the command line arguments
     */
    //Инициализируем статический метод в котором запускаем главный метод Main
    //для отрисовки формы
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    
    //Указываем компилятору подавить предупреждения компиляции, 
    //определённые в параметрах аннотации
    @SuppressWarnings("unchecked")
    
    //Инициализируем компоненты формы
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        
        //Указываем интерпретатору, что при зиакрытии окна
        //нужно выйти из приложения
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        //Устанавливаем Title фрейма
        setTitle("Текстовычислятор");
        
        //Устанавливаем необходимые формы на панеле
        jScrollPane1.setViewportView(jTextPane1);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Вставьте или введите текст");

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("Рассчитать");
        //Прописываем, какой нужно использовать метод при нажатии на кнопку
        //Расчитать
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
  
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
