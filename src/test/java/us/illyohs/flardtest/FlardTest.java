package us.illyohs.flardtest;

import org.spongepowered.api.event.game.state.GameAboutToStartServerEvent;
import org.spongepowered.api.plugin.Plugin;
import us.illyohs.flardule.FlarduleManger;

/**
 * Created by illyohs on 6/26/16.
 */
@Plugin(id = "test")
public class FlardTest {

    private FlarduleManger manger = new FlarduleManger("test");


    public void aboutToStart(GameAboutToStartServerEvent event) {
        manger.registerFlardule(new Module());
    }

}
