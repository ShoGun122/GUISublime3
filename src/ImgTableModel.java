import javax.swing.*;
import javax.swing.table.AbstractTableModel;

public class ImgTableModel extends AbstractTableModel {
    public ImgTableModel(String[] columns) {
    }
    private JTable table ;

    @Override
    public int getRowCount() {
        return 0;
    }

    @Override
    public int getColumnCount() {
        return 0;
    }

    public Object getValueAt(JTable table,int rowIndex, int columnIndex) {
        return table.getValueAt(rowIndex,columnIndex);
    }

}
