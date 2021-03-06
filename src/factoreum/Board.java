package factoreum;

public class Board implements IBoard {

    private static Board ourInstance = new Board();

    private static Board single_instance = null;

    public static Board getInstance()
    {
        if (single_instance == null)
            single_instance = new Board();

        return single_instance;
    }
                                                    //Zmienne związane z planszą
    private int[] minX = {0, 0, 0, 0, 0, 0};
    private int[] minY = {0, 0, 0, 0, 0, 0};
    private int[][] boardField = {{-1, -1, -1, -1, -1, -1}, {-1, -1, -1, -1, -1, -1}, {-1, -1, -1, -1, -1, -1}, {-1, -1, -1, -1, -1, -1}, {-1, -1, -1, -1, -1, -1}, {-1, -1, -1, -1, -1, -1} };
    private int[][] boardFieldOre = {{0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, };
    private int fx, fy;
    private ITEM[] item = new ITEM[36];
    private int[] ore = new int[36];

    public enum FIELDTYPE {
        FieldSolar,
        FieldFuel,
        FieldNuclear,
        FieldMiner,
        FieldCrafter,
        FieldAdvancedMiner,
        FieldCooler,
    }
    private FIELDTYPE fieldtype;

    private OVERLAP overlap = OVERLAP.Items;



    public int[][] getBoardField() {
        return boardField;
    }
    public void setBoardField(int[][] boardField) {
        this.boardField = boardField;
    }
    public int[][] getBoardFieldOre() {
        return boardFieldOre;
    }
    public void setBoardFieldOre(int[][] boardFieldOre) {
        this.boardFieldOre = boardFieldOre;
    }
    public int getFx() {
        return fx;
    }
    public void setFx(int fx) {
        this.fx = fx;
    }
    public int getFy() {
        return fy;
    }
    public void setFy(int fy) {
        this.fy = fy;
    }
    public int[] getMinX() { return minX; }
    public void setMinX(int[] minX) { this.minX = minX; }
    public int[] getMinY() { return minY; }
    public void setMinY(int[] minY) { this.minY = minY; }

    public OVERLAP getOverlap() { return overlap; }
    public void setOverlap(OVERLAP overlap) { this.overlap = overlap; }

    public ITEM[] getItem() { return item; }
    public void setItem(ITEM[] item) { this.item = item; }

    public int[] getOre() { return ore; }
    public void setOre(int[] ore) { this.ore = ore; }

    public FIELDTYPE getFieldtype() {
        return fieldtype;
    }

    public void setFieldtype(FIELDTYPE fieldtype) {
        this.fieldtype = fieldtype;
    }
}
