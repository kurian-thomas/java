import java.awt.*;  
class First extends Frame{  
First(){  
setSize(300,300);//frame size 300 width and 300 height  
setLayout(null);//no layout manager  
setVisible(true);//now frame will be visible, by default not visible  
setTitle("My new frame");
}  
}
class wrkingwithawt{
public static void main(String args[]){  
First f=new First();  
}
}  
