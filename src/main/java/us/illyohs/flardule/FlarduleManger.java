package us.illyohs.flardule;

import org.spongepowered.api.Sponge;

import javax.annotation.Nonnull;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by illyohs on 6/26/16.
 */
public class FlarduleManger {

    private Set<IFlardule> flardReg = new LinkedHashSet<>();

    public FlarduleManger(String modid) {

    }

    public void registerFlardule(@Nonnull IFlardule flardule) {
        flardReg.add(flardule);
    }

    public void setUpModuleLoader() {

    }
}
