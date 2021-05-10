package Base.MapLoaders.mapLoaders;

import Base.MapLoaders.*;
import Base.Objects.Abstracts.AbstractFigur;
import Base.Objects.Abstracts.AbstractMovingFigur;
import Base.Objects.Implementation.Emptiness;
import Base.Objects.Implementation.Wall;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapLoaderFactory {

    private String readFile(String path) {
        StringBuilder mapTxt = new StringBuilder();
        try (FileReader reader = new FileReader(path)) {
            int c;
            while ((c = reader.read()) != -1) {
                mapTxt.append((char) c);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return mapTxt.toString();
    }

    private AbstractFigur[][] parseStringToGameMap(String stringMap) {
        String[] strings = stringMap.split(" ");
        System.out.println(Arrays.toString(strings));
        List<AbstractFigur> abstractFigurList = new ArrayList<>();
        for (int i = 0; i < abstractFigurList.size(); i++) {
            if (strings[i].equals("W")) {
                abstractFigurList.add(new Wall());
            } else {
                abstractFigurList.add(new Emptiness());
            }
        }
        AbstractFigur[][] data = (AbstractFigur[][]) abstractFigurList.toArray();
        return data;
    }


    public AbstractFigur[][] getMap(Maps type){
        AbstractFigur[][] map = null;
        switch (type) {
            case SPIRAL:
                String fileConsist = readFile("C:\\Users\\maxim\\IdeaProjects\\Project\\Game\\src\\Base\\MapLoaders\\mapLoaders\\spiral.txt");
                map = parseStringToGameMap(fileConsist);
                break;
        }
        return map;
    }
}

