package Base.MapLoaders;

import Base.Objects.Abstracts.AbstractFigur;
import Base.Objects.Implementation.Player;

public interface Loader {

    AbstractFigur[][] loading(AbstractFigur data[][], Player player);
}
