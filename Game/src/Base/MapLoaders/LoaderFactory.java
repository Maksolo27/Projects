package Base.MapLoaders;

public class LoaderFactory {

    public Loader getLoader(LoaderType type){
        Loader loader = null;
        switch (type) {
            case EASYLOADER:
                loader = new EasyLoader();
                break;
            case MEDIUMLOADER:
                loader = new MediumLoader();
                break;
            case HARDLOADER:
                loader = new HardLoader();
                break;
        }
        return loader;
        }
    }


