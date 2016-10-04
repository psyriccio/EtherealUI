/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psyriccio.etherealui.plaf;

import ch.qos.logback.classic.Logger;
import javax.swing.UIDefaults;
import org.slf4j.LoggerFactory;

/**
 *
 * @author psyriccio
 */
public class EtherealLookAndFeel extends freeseawind.lf.LittleLuckLookAndFeel {

    public static Logger log = (Logger) LoggerFactory.getLogger(EtherealLookAndFeel.class);

    @Override
    public String getID() {
        return "Ethereal";
    }

    @Override
    public String getDescription() {
        return "Lightweight swing LookAndFeel";
    }

    @Override
    public String getName() {
        return "Ethereal";
    }

    public EtherealLookAndFeel() {
        super();
    }

    @Override
    public UIDefaults getDefaults() {
        UIDefaults defaults = super.getDefaults(); //To change body of generated methods, choose Tools | Templates.
        defaults.forEach((key, val) -> {

        });
        return defaults;
    }

}
