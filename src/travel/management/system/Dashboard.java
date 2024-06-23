package travel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener {
    String username;
    JButton addPersonalDetails, viewPersonalDetails;

    public Dashboard(String username) {
        super("Dashboard"); // Calling the super constructor with the title
        this.username = username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);

        JPanel pl = new JPanel();
        pl.setLayout(null);
        pl.setBackground(new Color(0, 0, 102));
        pl.setBounds(0, 0, 1600, 65);
        add(pl);

        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("dashboard.png"));
        Image i2 = il.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(5, 0, 70, 70);
        pl.add(icon);

        JLabel heading = new JLabel("Dashboard");
        heading.setBounds(80, 10, 300, 40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        pl.add(heading);

        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0, 0, 102));
        p2.setBounds(0, 65, 300, 900); // Here
        add(p2);

        addPersonalDetails = new JButton("Add Personal Detail");
        addPersonalDetails.setBounds(0, 0, 300, 50);
        addPersonalDetails.setBackground(Color.WHITE);
        addPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        addPersonalDetails.setMargin(new Insets(0, 0, 0, 60));
        addPersonalDetails.addActionListener(this);
        p2.add(addPersonalDetails);

        updatePersonalDetails = new JButton("Update Personal Detail");
        updatePersonalDetails.setBounds(0, 50, 300, 50);
        updatePersonalDetails.setBackground(Color.WHITE);
        updatePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        updatePersonalDetails.setMargin(new Insets(0, 0, 0, 30));
        p2.add(updatePersonalDetails);

        viewPersonalDetails = new JButton("View Details");
        viewPersonalDetails.setBounds(0, 100, 300, 50);
        viewPersonalDetails.setBackground(Color.WHITE);
        viewPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewPersonalDetails.setMargin(new Insets(0, 0, 0, 130));
        viewPersonalDetails.addActionListener(this);
        p2.add(viewPersonalDetails);

        JButton deletePersonalDetails = new JButton("Delete Personal Details");
        deletePersonalDetails.setBounds(0, 150, 300, 50);
        deletePersonalDetails.setBackground(Color.WHITE);
        deletePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        deletePersonalDetails.setMargin(new Insets(0, 0, 0, 40));
        p2.add(deletePersonalDetails);

        JButton checkPackages = new JButton("Check Packages");
        checkPackages.setBounds(0, 200, 300, 50);
        checkPackages.setBackground(Color.WHITE);
        checkPackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
        checkPackages.setMargin(new Insets(0, 0, 0, 110));
        p2.add(checkPackages);

        JButton bookPackages = new JButton("Book Packages");
        bookPackages.setBounds(0, 250, 300, 50);
        bookPackages.setBackground(Color.WHITE);
        bookPackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookPackages.setMargin(new Insets(0, 0, 0, 120));
        p2.add(bookPackages);

        JButton viewPackages = new JButton("View Packages");
        viewPackages.setBounds(0, 300, 300, 50);
        viewPackages.setBackground(Color.WHITE);
        viewPackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewPackages.setMargin(new Insets(0, 0, 0, 120));
        p2.add(viewPackages);

        JButton viewHotels = new JButton("View Hotels");
        viewHotels.setBounds(0, 350, 300, 50);
        viewHotels.setBackground(Color.WHITE);
        viewHotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewHotels.setMargin(new Insets(0, 0, 0, 140));
        p2.add(viewHotels);

        JButton bookHotels = new JButton("Book Hotel");
        bookHotels.setBounds(0, 400, 300, 50);
        bookHotels.setBackground(Color.WHITE);
        bookHotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookHotels.setMargin(new Insets(0, 0, 0, 140));
        p2.add(bookHotels);

        JButton viewBookedHotels = new JButton("View Booked Hotel");
        viewBookedHotels.setBounds(0, 450, 300, 50);
        viewBookedHotels.setBackground(Color.WHITE);
        viewBookedHotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewBookedHotels.setMargin(new Insets(0, 0, 0, 70));
        p2.add(viewBookedHotels);

        JButton destinations = new JButton("Destinations");
        destinations.setBounds(0, 500, 300, 50);
        destinations.setBackground(Color.WHITE);
        destinations.setFont(new Font("Tahoma", Font.PLAIN, 20));
        destinations.setMargin(new Insets(0, 0, 0, 140));
        p2.add(destinations);

        JButton payments = new JButton("Payments");
        payments.setBounds(0, 550, 300, 50);
        payments.setBackground(Color.WHITE);
        payments.setFont(new Font("Tahoma", Font.PLAIN, 20));
        payments.setMargin(new Insets(0, 0, 0, 155));
        p2.add(payments);

        JButton calculator = new JButton("Calculator");
        calculator.setBounds(0, 600, 300, 50);
        calculator.setBackground(Color.WHITE);
        calculator.setFont(new Font("Tahoma", Font.PLAIN, 20));
        calculator.setMargin(new Insets(0, 0, 0, 145));
        p2.add(calculator);

        JButton notepad = new JButton("Notepad");
        notepad.setBounds(0, 650, 300, 50);
        notepad.setBackground(Color.WHITE);
        notepad.setFont(new Font("Tahoma", Font.PLAIN, 20));
        notepad.setMargin(new Insets(0, 0, 0, 145));
        p2.add(notepad);

        JButton about = new JButton("About");
        about.setBounds(0, 700, 300, 50);
        about.setBackground(Color.WHITE);
        about.setFont(new Font("Tahoma", Font.PLAIN, 20));
        about.setMargin(new Insets(0, 0, 0, 145));
        p2.add(about);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("home.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(0, 0, 1650, 1000);
        add(image);

        JLabel text = new JLabel("Travel And Tourism Management System");
        text.setBounds(400, 70, 1200, 70);
        text.setBackground(Color.WHITE);
        text.setFont(new Font("Raleway", Font.PLAIN, 45));
        image.add(text);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == addPersonalDetails) {
            new AddCustomer(username);
        } else if (ae.getSource() == viewPersonalDetails) {
            new ViewCustomer(username);
        } else if(ae.getSource() == updatePersonalDetails) {
           new UpdateCustomer(username); 
        }
    }

    public static void main(String[] args) {
        new Dashboard("sampleUsername"); // Passing a sample username
    }
}
