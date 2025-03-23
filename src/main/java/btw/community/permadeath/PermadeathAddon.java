package btw.community.permadeath;

import btw.AddonHandler;
import btw.BTWAddon;
import btw.BTWMod;

public class PermadeathAddon extends BTWAddon {
    private static PermadeathAddon instance;

    public PermadeathAddon() {
        super();
        BTWMod.allowHardcore = true;
    }

    @Override
    public void initialize() {
        AddonHandler.logMessage(this.getName() + " Version " + this.getVersionString() + " Initializing...");
    }
}