package pizza;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


class PizzaPickUI extends JFrame implements MouseListener{
   PizzaPickControl ppc = new PizzaPickControl(); //여기에 있는 피자정보를 장바구니에 꼭 넘겨줘야함
   
   JButton pizza1;
   JButton pizza2;
   JButton pizza3;
   JButton pizza4;
   
   Icon pizzaIcon;
   
   /*
   Image background = new ImageIcon
         ("./images/pizzapickback.png").getImage();//배경이미지
*/
   PizzaPickUI(){
      Container container = getContentPane();   
      container.setLayout(null);
      container.setBackground(Color.white);
      
            //상단 로고
            JButton logo = new JButton(new ImageIcon("./images/logo.jpg"));
            logo.setBorderPainted(false);
            logo.setContentAreaFilled(false);
            logo.setBounds(0, 0, 400, 120);
            container.add(logo);
      
            //토핑탑텐
            ImageIcon topten = new ImageIcon("./images/topten.png");
            ImageIcon toptenb = new ImageIcon("./images/topten2.png");
            ImageIcon toptenc = new ImageIcon("./images/topten2.png");
            pizza1 = new JButton(topten);
            pizza1.setBorderPainted(false);
            pizza1.setContentAreaFilled(false);
            pizza1.setFocusPainted(false);
            pizza1.setRolloverIcon(toptenb);
            pizza1.setPressedIcon(toptenc);
            pizza1.setBounds(30, 120, 150, 150);
            container.add(pizza1);
            
            JButton toptenM = new JButton(new ImageIcon("./images/toptenM.png"));
            toptenM.setBounds(30, 270, 150, 70);
            toptenM.setBorderPainted(false);
            toptenM.setContentAreaFilled(false);
            toptenM.setFocusPainted(false);
            container.add(toptenM);
            
            //미트미트미트
            ImageIcon meat = new ImageIcon("./images/meat.png");
            ImageIcon meatb = new ImageIcon("./images/meat2.png");
            ImageIcon meatc = new ImageIcon("./images/meat3.png");
            pizza2 = new JButton(meat);
            pizza2.setBorderPainted(false);
            pizza2.setContentAreaFilled(false);
            pizza2.setFocusPainted(false);
            pizza2.setRolloverIcon(meatb);
            pizza2.setPressedIcon(meatc);
            pizza2.setBounds(220, 120, 150, 150);
            container.add(pizza2);
            JButton meatM = new JButton(new ImageIcon("./images/meatM.png"));
            meatM.setBorderPainted(false);
            meatM.setContentAreaFilled(false);
            meatM.setFocusPainted(false);
            meatM.setBounds(220, 270, 150, 70);
            container.add(meatM);

         
            //치즈&뉴욕 스트립 스테이크
            ImageIcon steak = new ImageIcon("./images/steak.png");
            ImageIcon steakb = new ImageIcon("./images/steak2.png");
            ImageIcon steakc = new ImageIcon("./images/steak2.png");
            pizza3 = new JButton(steak);
            pizza3.setBorderPainted(false);
            pizza3.setContentAreaFilled(false);
            pizza3.setFocusPainted(false);
            pizza3.setRolloverIcon(steakb);
            pizza3.setPressedIcon(steakc);
            pizza3.setBounds(30, 400, 150, 150);
            container.add(pizza3);
            JButton steakM = new JButton(new ImageIcon("./images/steakM.png"));
            steakM.setBounds(30, 550, 150, 70);
            steakM.setBorderPainted(false);
            steakM.setContentAreaFilled(false);
            steakM.setFocusPainted(false);
            container.add(steakM);
            
            //블랙타이거 쉬림프
            ImageIcon shrim = new ImageIcon("./images/shrim.png");
            ImageIcon shrimb = new ImageIcon("./images/shrim2.png");
            ImageIcon shrimc = new ImageIcon("./images/shrim2.png");
            pizza4 = new JButton(shrim);
            pizza4.setBorderPainted(false);
            pizza4.setContentAreaFilled(false);
            pizza4.setFocusPainted(false);
            pizza4.setRolloverIcon(shrimb);
            pizza4.setPressedIcon(shrimc);
            pizza4.setBounds(220, 400, 150, 150);
            container.add(pizza4);
            JButton shrimM = new JButton(new ImageIcon("./images/shrimM.png"));
            shrimM.setBounds(220, 550, 150, 70);

            shrimM.setBorderPainted(false);
            shrimM.setContentAreaFilled(false);
            shrimM.setFocusPainted(false);
            container.add(shrimM);
            
              


            pizza1.addMouseListener(this);
            pizza2.addMouseListener(this);
            pizza3.addMouseListener(this);
            pizza4.addMouseListener(this);


            setTitle("메뉴 선택");
            setSize(400,700); 
            setBackground(Color.black);
            setResizable(false);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //화면상에 안보임
            setVisible(true); //화면상에 구현
      
   }
   
   
   
   //선택시 주소값을 넘겨줘서 푸드에 넣어주는 형식
   @Override
   public void mouseClicked(MouseEvent e) {//화면 넘기는 액션 메서드
      if(e.getSource() == pizza1) {
         ppc.setChoice(0);
         this.pizzaIcon=pizza1.getIcon();
      }else if(e.getSource() == pizza2) {
         ppc.setChoice(1);
         this.pizzaIcon=pizza2.getIcon();
      }
      else if(e.getSource() == pizza3) {
         ppc.setChoice(2);
         this.pizzaIcon=pizza3.getIcon();
      }
      else if(e.getSource() == pizza4) {
         ppc.setChoice(3);
         this.pizzaIcon=pizza4.getIcon();
      }


      new BasketUI(ppc,pizzaIcon);

      this.dispose();//현재창 닫기
      
   }
   
   @Override
   public void mouseEntered(MouseEvent e) {
      
   }

   @Override
   public void mouseExited(MouseEvent e) {
      
   }

   @Override
   public void mousePressed(MouseEvent e) {
      
   }

   @Override
   public void mouseReleased(MouseEvent e) {
      
   }   
   
}
