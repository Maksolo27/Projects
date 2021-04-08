package Base.MapLoaders;

public class LoaderFactory {

    public Loader getLoader(LoaderType type){
        Loader loader = null;
        switch (type) {
            case EASYLOADER:
                loader = new EasyLoader();
            case MEDIUMLOADER:
                loader = new MediumLoader();
            case HARDLOADER:
                loader = new HardLoader();
        }
        return loader;
        }
    }


