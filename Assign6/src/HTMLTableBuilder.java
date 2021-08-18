public class HTMLTableBuilder {
private int columns;
private final StringBuilder table = new StringBuilder();
public static String TABLE_START = " ";
public static String TABLE_END = "";
public static String HEADER_START = "";
public static String HEADER_END = "";
public static String ROW_START = "";
public static String ROW_END = "";
public static String COLUMN_START = "";
public static String COLUMN_END = "";
/**
 * @param columns
 */
public HTMLTableBuilder(int columns) {
    this.columns = columns;
    table.append(TABLE_START);
    table.append(TABLE_END);
}

/**
 * @param values
 */
public void addTableHeader(Object... values) {
    int lastIndex = table.lastIndexOf(TABLE_END);
    if (lastIndex <= 0) {
        return;
    }
    StringBuilder sb = new StringBuilder();
    sb.append(ROW_START);
    if (values.length != columns) {
        for (int i = 0; i < columns; i++) {
            sb.append(HEADER_START);
            sb.append("values size error");
            sb.append(HEADER_END);
        }
    } else {
        for (Object value : values) {
            sb.append(HEADER_START);
            sb.append(value == null ? "" : value.toString());
            sb.append(HEADER_END);
        }
    }
    sb.append(ROW_END);
    table.insert(lastIndex, sb.toString());
}

/**
 * @param values
 */
public void addRowValues(Object... values) {
    int lastIndex = table.lastIndexOf(TABLE_END);
    if (lastIndex <= 0) {
        return;
    }
    StringBuilder sb = new StringBuilder();
    sb.append(ROW_START);

    if (values.length != columns) {
        for (int i = 0; i < columns; i++) {
            sb.append(COLUMN_START);
            sb.append("values size error");
            sb.append(COLUMN_END);
        }
    } else {
        for (Object value : values) {
            sb.append(COLUMN_START);
            sb.append(value == null ? "" : value.toString());
            sb.append(COLUMN_END);
        }
    }
    sb.append(ROW_END);
    table.insert(lastIndex, sb.toString());
}

/**
 * @return
 */
public String build() {
    return table.toString();
}

/**
 * @param args
 */
public static void main(String[] args) {
    HTMLTableBuilder htmlBuilder = new HTMLTableBuilder(3);
    htmlBuilder.addTableHeader("1H", "2H", "3H");
    htmlBuilder.addRowValues("1", "2", "3");
    htmlBuilder.addRowValues("4", "5", 6);
    htmlBuilder.addRowValues("9", "8", "7");
    String table = htmlBuilder.build();
    System.out.println(table.toString());
}
}