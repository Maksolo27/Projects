package Base.MapLoaders.mapLoaders;

import Base.MapLoaders.*;
import Base.Objects.Abstracts.AbstractFigur;
import Base.Objects.Abstracts.AbstractMovingFigur;
import Base.Objects.Implementation.Emptiness;
import Base.Objects.Implementation.Exit;
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

    private AbstractFigur[][] parseStringToGameMap(String stringMap, int height, int width) {
        AbstractFigur[][] abstractFigurs = new Emptiness[height][width];
        int k = 0;
        while (k < stringMap.length()) {
            for (int i = 0; i < abstractFigurs.length; i++) {
                for (int j = 0; j < abstractFigurs[i].length; j++) {
                    abstractFigurs[i][j] = new Wall();
                    k++;
                }
            }

        }
        return abstractFigurs;

    }


    public AbstractFigur[][] getMap(Maps type){
        AbstractFigur[][] map = null;
        switch (type) {
            case SPIRAL:
                String fileConsist = readFile("C:\\Users\\maxim\\IdeaProjects\\Project\\Game\\src\\Base\\MapLoaders\\mapLoaders\\spiral.txt");
                map = parseStringToGameMap(fileConsist, 11, 11);
                break;
        }
        return map;
    }
}

