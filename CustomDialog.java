import javax.management.monitor.Monitor;
import javax.swing.*;

public class CustomDialog extends JOptionPane {
    private MonitorWindow monitorWindow;
    public CustomDialog(MonitorWindow monitorWindow, String message) {
        this.monitorWindow = monitorWindow;
        setMessage(message);
        setOptionType(JOptionPane.DEFAULT_OPTION);
        setSelectionValues(new Object[]{"OK"});
        setInitialSelectionValue("OK");
    }

    @Override
    public void selectInitialValue() {
        super.selectInitialValue();
        this.monitorWindow.refresh();

    }
}
