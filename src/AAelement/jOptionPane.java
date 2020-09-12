package AAelement;

import javax.swing.JOptionPane;

public class jOptionPane {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Defnault", "title",JOptionPane.DEFAULT_OPTION);
        JOptionPane.showMessageDialog(null, "Information", "title",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Question", "title",JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Warning", "title",JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "Error", "title",JOptionPane.ERROR_MESSAGE);
    }

}
