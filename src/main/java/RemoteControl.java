public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[2];
        offCommands = new Command[2];
    }

    public void setCommand(int slot, Command on, Command off) {
        onCommands[slot] = on;
        offCommands[slot] = off;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }
    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    @Override
    public String toString() {
        StringBuffer stringBuf = new StringBuffer();
        stringBuf.append("\n-------- Remote Control --------\n");
        for(int i = 0; i < onCommands.length; i++) {
            stringBuf.append("[slot " + i + "] " + onCommands[i].getClass().getName() + " "
                    + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuf.toString();
    }
}
