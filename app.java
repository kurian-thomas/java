import javax.swing.*;


class BasicSwing extends JFrame{
   
   JPanel p=new JPanel();
   JButton b=new JButton("Hello");
   JTextField t=new JTextField("Hi,java",29);
   JTextArea ta=new JTextArea("How\nare\nyou?",5,20);
   JLabel l=new JLabel("What's up");
   String choices[]={
      "Hallo",
      "Bonjour",
      "Conichuwa"};

   JComboBox cb=new JComboBox(choices);

     public BasicSwing(){
      super("Basic Swing App");
      
      setSize(400,300);
      setResizable(true);
      
      p.add(b);
      p.add(t);
      p.add(ta);
      p.add(l);
      p.add(cb);
      add(p);
      
      setVisible(true);
   }
   
   
   public static void main(String[] args){
      new BasicSwing();
   }
   
 
}