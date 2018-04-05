import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame{
Label myLabel;
Button b1, b2, b3;
Checkbox c1, c2 ,c3,c4;
CheckboxGroup cbg;
Choice myList;
Scrollbar vertSB, horzSB;
TextField name, pass;
MyFrame(){
setSize(400, 200);
setTitle("My Application");
setLayout(new FlowLayout());
setVisible(true);
myLabel = new Label("This is a label!");
add(myLabel);
b1 = new Button("Red");
b2 = new Button("Green");
b3 = new Button("Blue");
add(b1);
add(b2);
add(b3);

c1 = new Checkbox("Male");
c2 = new Checkbox("Female");
add(c1);
add(c2);
cbg = new CheckboxGroup();
c3 = new Checkbox("Male", cbg, false);
c4 = new Checkbox("Female", cbg, false);
add(c3);
add(c4);
myList = new Choice();
myList.add("CSE");
myList.add("ECE");
myList.add("EEE");
myList.add("IT");
add(myList);
vertSB = new Scrollbar(Scrollbar.VERTICAL, 0, 1, 0, 200);
horzSB = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 300);
add(vertSB);
add(horzSB);
Label namep = new Label("Name: ", Label.RIGHT);
Label passp = new Label("Password: ", Label.RIGHT); 
name = new TextField(12);
pass = new TextField(8);
pass.setEchoChar('?');
add(namep);
add(name);
add(passp);
add(pass);
String val =
"Java 8 is the latest version of the most\n" +
"widely-used computer language for Internet programming.\n" +
"Building on a rich heritage, Java has advanced both\n" +
"the art and science of computer language design.\n\n" +
"One of the reasons for Java's ongoing success is its\n" +
"course for others to follow svnsjnlnflnfldkrldngldnrg\n."+"hiiiii\n";
TextArea text = new TextArea(val, 8, 30);
add(text);
}
}
class everything{
	public static void main(String[] args) {
		MyFrame f=new MyFrame();
	}
}