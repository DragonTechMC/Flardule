package us.illyohs.flardule;

import org.spongepowered.api.Sponge;
import org.spongepowered.api.event.game.state.*;
import us.illyohs.flardule.annotation.Flardule;

import javax.annotation.Nonnull;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by illyohs on 6/26/16.
 */
public class FlarduleManger
{

    //I really hate IFlardule and would love to move to an annotation somthing i.e @EventFlard
    private Set<IFlardule> flardReg = new LinkedHashSet<>();
    private Set<IFlardule> enabledFlardules = new LinkedHashSet<>();
    private Set<IFlardule> disabledFladules = new LinkedHashSet<>();

    private String modid;

    public FlarduleManger(@Nonnull String modid)
    {
        this.modid = modid;
    }

    public void registerFlardule(@Nonnull IFlardule flardule)
    {
        flardReg.add(flardule);
    }

    public void setUpFlardules()
    {
        System.out.println("There are" + flardReg.size() + "Flardule candidates for" + modid);

        for (IFlardule i : flardReg) {
            Flardule flardule = i.getClass().getAnnotation(Flardule.class);
            if (lookForDeps(flardule.pluginDeps())) {
                enabledFlardules.add(i);
            } else {
                disabledFladules.add(i);
            }
        }

    }

    public void preInit(GamePreInitializationEvent event)
    {

    }

    public void init(GameInitializationEvent event)
    {

    }

    public void postInit(GamePostInitializationEvent event)
    {

    }

    public void aboutToStart(GameAboutToStartServerEvent event)
    {

    }

    public void serverStarting(GameStartingServerEvent event)
    {

    }

    public void serverStarted(GameStartedServerEvent event)
    {

    }

    public void loadComplete(GameLoadCompleteEvent event)
    {

    }

    public void serverStopping(GameStoppingServerEvent event)
    {

    }

    public void serverStopped(GameStoppedServerEvent event)
    {

    }

    private boolean lookForDeps(String... plugins)
    {
        if (plugins != new String[]{""}) {
            for (String plugin : plugins) {
                return hasPlugin(plugin);
            }
        } else {
            return true;
        }
        return true;
    }

    private boolean hasPlugin(String id)
    {
        return Sponge.getPluginManager().isLoaded(id);
    }

}
