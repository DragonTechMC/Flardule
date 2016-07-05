package us.illyohs.flardule.internal;

/**
 * Created by illyohs on 6/26/16.
 */
public class FlarduleMeta
{

    private String name;
    private String url;
    private String description;
    private String[] authors;
    private String[] pluginDeps;
    private boolean defualtEnable;
    private boolean hardFail;

    public FlarduleMeta(String name, String url, String description, String[] authors, String[] pluginDeps,
                        boolean defualtEnable, boolean hardFail)
    {
        this.name = name;
        this.url = url;
        this.authors = authors;
        this.description = description;
        this.pluginDeps = pluginDeps;
        this.defualtEnable = defualtEnable;
        this.hardFail = hardFail;
    }

    public String getName()
    {
        return name;
    }

    public String getDescription()
    {
        return description;
    }

    public String getUrl()
    {
        return url;
    }

    public String[] getAuthors()
    {
        return authors;
    }

    public String[] getPluginDeps()
    {
        return pluginDeps;
    }

    public boolean isDefualtEnable()
    {
        return defualtEnable;
    }

    public boolean canHardFail()
    {
        return hardFail;
    }
}
