package us.illyohs.flardtest;

import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.*;
import org.spongepowered.api.plugin.Plugin;
import us.illyohs.flardule.FlarduleManger;

/**
 * Created by illyohs on 6/26/16.
 */
@Plugin(id = "test")
public class FlardTest
{

    private FlarduleManger manger = new FlarduleManger("test");

    @Listener
    public void preInit(GamePreInitializationEvent event)
    {
        manger.registerFlardule(new Module());
        manger.setUpFlardules();
        manger.preInit(event);

    }

    @Listener
    public void init(GameInitializationEvent event)
    {
        manger.init(event);
    }

    @Listener
    public void postInit(GamePostInitializationEvent event)
    {
        manger.postInit(event);
    }

    @Listener
    public void aboutToStart(GameAboutToStartServerEvent event)
    {
        manger.aboutToStart(event);
    }

    @Listener
    public void serverStarting(GameStartingServerEvent event)
    {
        manger.serverStarting(event);
    }

    @Listener
    public void serverStarted(GameStartedServerEvent event)
    {
        manger.serverStarted(event);
    }

    @Listener
    public void loadComplete(GameLoadCompleteEvent event)
    {
        manger.loadComplete(event);
    }

    @Listener
    public void serverStopping(GameStoppingServerEvent event)
    {
        manger.serverStopping(event);
    }

    @Listener
    public void serverStoped(GameStoppedServerEvent event)
    {
        manger.serverStopped(event);
    }

}
