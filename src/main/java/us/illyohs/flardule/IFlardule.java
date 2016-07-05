package us.illyohs.flardule;

import org.spongepowered.api.event.game.state.*;

/**
 * Created by illyohs on 6/26/16.
 */
public interface IFlardule
{

    void preInit(GamePreInitializationEvent event);

    void init(GameInitializationEvent event);

    void postInit(GamePostInitializationEvent event);

    void aboutToStart(GameAboutToStartServerEvent event);

    void serverStarting(GameStartingServerEvent event);

    void serverStarted(GameStartedServerEvent event);

    void loadComplete(GameLoadCompleteEvent event);

    void serverStopping(GameStoppingServerEvent event);

    void serverStopped(GameStoppedServerEvent event);
}
