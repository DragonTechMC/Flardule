package us.illyohs.flardtest;

import org.spongepowered.api.event.game.state.*;
import us.illyohs.flardule.IFlardule;
import us.illyohs.flardule.annotation.Flardule;

/**
 * Created by illyohs on 6/26/16.
 */
@Flardule(name = "Flardule")
public class Module implements IFlardule {

    @Override
    public void aboutToStart(GameAboutToStartServerEvent event) {

    }

    @Override
    public void init(GameInitializationEvent event) {

    }

    @Override
    public void loadComplete(GameLoadCompleteEvent event) {

    }

    @Override
    public void postInit(GamePostInitializationEvent event) {

    }

    @Override
    public void preInit(GamePreInitializationEvent event) {

    }

    @Override
    public void serverStopping(GameStoppingServerEvent event) {

    }

    @Override
    public void serverStoped(GameStoppedServerEvent event) {

    }
}
