package us.illyohs.flardule;

import org.spongepowered.api.event.game.state.*;

/**
 * Created by illyohs on 6/26/16.
 */
public interface IFlardule {

    void aboutToStart(GameAboutToStartServerEvent event);

    void init(GameInitializationEvent event);

    void loadComplete(GameLoadCompleteEvent event);

    void postInit(GamePostInitializationEvent event);

    void preInit(GamePreInitializationEvent event);

    void serverStopping(GameStoppingServerEvent event);

    void serverStoped(GameStoppedServerEvent event);
}
