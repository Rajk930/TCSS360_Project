import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {
    private boolean carbon_check = false;
    private boolean smoke_check = false;
    private boolean motion_check = false;
    private boolean entry_check = false;
    private boolean fire_check = false;
    private boolean flood_check = false;
    private boolean temp_check = false;
    private boolean glass_check = false;
    private boolean time_check = false;
    private final JButton carbonMonoxideDetector;
    private final JButton motionSensor;
    private final JButton smokeDetector;
    private final JButton glassBreakSensorButton;
    private final JButton floodSensorButton;
    private final JButton timeSensorButton;
    private final JButton entrySensorButton;
    private final JButton temperatureSensorButton;

    GridLayout layout = new GridLayout(0, 2);

    public GUI(String name) {
        super(name);
        carbonMonoxideDetector = new JButton("carbonMonoxideDetector");
        motionSensor = new JButton("motionSensor");
        smokeDetector = new JButton("smokeDetector");
        glassBreakSensorButton = new JButton("glassBreakSensorButton");
        floodSensorButton = new JButton("floodSensorButton");
        timeSensorButton = new JButton("timeSensorButton");
        entrySensorButton = new JButton("entrySensorButton");
        temperatureSensorButton = new JButton("temperatureSensorButton");
        setResizable(false);
    }
    public static void main(String[] args) {
        showGUI();
    }

    public void addButton(final Container pane) {
        final JPanel panel = new JPanel();
        panel.setLayout(layout);
        JPanel control = new JPanel();
        control.setLayout(new GridLayout(3, 3));
        panel.add(carbonMonoxideDetector);
        panel.add(motionSensor);
        panel.add(smokeDetector);
        panel.add(glassBreakSensorButton);
        panel.add(floodSensorButton);
        panel.add(timeSensorButton);
        panel.add(entrySensorButton);
        panel.add(temperatureSensorButton);
        pane.add(panel, BorderLayout.NORTH);
        pane.add(new JSeparator(), BorderLayout.CENTER);
        pane.add(control, BorderLayout.SOUTH);
        carbonMonoxideDetector.addActionListener(carbon_listener);
        motionSensor.addActionListener(motion_listener);
        smokeDetector.addActionListener(smoke_listener);
        glassBreakSensorButton.addActionListener(glass_listener);
        floodSensorButton.addActionListener(flood_listener);
        timeSensorButton.addActionListener(time_listener);
        entrySensorButton.addActionListener(entry_listener);
        temperatureSensorButton.addActionListener(temp_listener);

    }
    ActionListener temp_listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Object source = e.getSource();
            if (source instanceof Component) {
                if (temp_check == true) {
                    ((Component) source).setBackground(Color.GREEN);
                    temp_check = false;
                } else {
                    ((Component) source).setBackground(Color.RED);
                    temp_check = true;

                }
            }
        }
    };
    ActionListener entry_listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Object source = e.getSource();
            if (source instanceof Component) {
                if (entry_check == true) {
                    ((Component) source).setBackground(Color.GREEN);
                    entry_check = false;
                } else {
                    ((Component) source).setBackground(Color.RED);
                    entry_check = true;

                }
            }
        }
    };

    ActionListener time_listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Object source = e.getSource();
            if (source instanceof Component) {
                if (time_check == true) {
                    ((Component) source).setBackground(Color.GREEN);
                    time_check = false;
                } else {
                    ((Component) source).setBackground(Color.RED);
                    time_check = true;

                }
            }
        }
    };

    ActionListener flood_listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Object source = e.getSource();
            if (source instanceof Component) {
                if (flood_check == true) {
                    ((Component) source).setBackground(Color.GREEN);
                    flood_check = false;
                } else {
                    ((Component) source).setBackground(Color.RED);
                    flood_check = true;

                }
            }
        }
    };

    ActionListener glass_listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Object source = e.getSource();
            if (source instanceof Component) {
                if (glass_check == true) {
                    ((Component) source).setBackground(Color.GREEN);
                    glass_check = false;
                } else {
                    ((Component) source).setBackground(Color.RED);
                    glass_check
                            = true;

                }
            }
        }
    };

    ActionListener smoke_listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Object source = e.getSource();
            if (source instanceof Component) {
                if (smoke_check == true) {
                    ((Component) source).setBackground(Color.GREEN);
                    smoke_check = false;
                } else {
                    ((Component) source).setBackground(Color.RED);
                    smoke_check = true;

                }
            }
        }
    };

    ActionListener motion_listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Object source = e.getSource();
            if (source instanceof Component) {
                if (motion_check == true) {
                    ((Component) source).setBackground(Color.GREEN);
                    motion_check = false;
                } else {
                    ((Component) source).setBackground(Color.RED);
                    motion_check = true;

                }
            }
        }
    };

    ActionListener carbon_listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Object source = e.getSource();
            if (source instanceof Component) {
                if (carbon_check == true) {
                    ((Component) source).setBackground(Color.GREEN);
                    carbon_check = false;
                } else {
                    ((Component) source).setBackground(Color.RED);
                    carbon_check = true;

                }
            }
        }
    };



        private static void showGUI() {
            GUI frame = new GUI("GUI");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.addButton(frame.getContentPane());
            frame.pack();
            frame.setVisible(true);


        }


    }


