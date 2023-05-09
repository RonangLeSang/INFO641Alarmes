import javax.swing.*;

public class CustomDialog extends JOptionPane {
    private MonitorWindow monitorWindow;
    private Monitor monitor;

    public CustomDialog(MonitorWindow monitorWindow, Monitor monitor, String message) {
        this.monitorWindow = monitorWindow;
        this.monitor = monitor;
        setMessage(message);
        setOptionType(JOptionPane.DEFAULT_OPTION);
        setSelectionValues(new Object[]{"OK"});
        setInitialSelectionValue("OK");
    }

    @Override
    public void selectInitialValue() {
        super.selectInitialValue();
        this.monitorWindow.refresh(monitor.getListEvent());

    }
}
