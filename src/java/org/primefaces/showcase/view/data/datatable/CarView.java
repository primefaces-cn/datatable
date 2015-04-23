package org.primefaces.showcase.view.data.datatable;

import org.primefaces.showcase.service.CarDao;
import com.cn.lotary.base.web.BaseController;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.showcase.service.Car;

@ManagedBean(name = "dtColumnsView")
@ViewScoped
public class CarView extends BaseController<Car> {

    @Override
    protected CarDao dao() {
        return new CarDao();
    }

    @Override
    protected String getCustomColumnsKey() {
        return "ColumnsView";
    }

    private final static String[] colors;

    private final static String[] brands;

    static {
        colors = new String[10];
        colors[0] = "Black";
        colors[1] = "White";
        colors[2] = "Green";
        colors[3] = "Red";
        colors[4] = "Blue";
        colors[5] = "Orange";
        colors[6] = "Silver";
        colors[7] = "Yellow";
        colors[8] = "Brown";
        colors[9] = "Maroon";

        brands = new String[10];
        brands[0] = "BMW";
        brands[1] = "Mercedes";
        brands[2] = "Volvo";
        brands[3] = "Audi";
        brands[4] = "Renault";
        brands[5] = "Fiat";
        brands[6] = "Volkswagen";
        brands[7] = "Honda";
        brands[8] = "Jaguar";
        brands[9] = "Ford";
    }

    public void createCars(int size) {
        for (int i = 0; i < size; i++) {
            dao().create(new Car(getRandomId(), getRandomBrand(), getRandomYear(), getRandomColor(), getRandomPrice()));
        }

    }

    private String getRandomId() {
        return UUID.randomUUID().toString().substring(0, 8);
    }

    private int getRandomYear() {
        return (int) (Math.random() * 50 + 1960);
    }

    private String getRandomColor() {
        return colors[(int) (Math.random() * 10)];
    }

    private String getRandomBrand() {
        return brands[(int) (Math.random() * 10)];
    }

    public int getRandomPrice() {
        return (int) (Math.random() * 100000);
    }

    public boolean getRandomSoldState() {
        return (Math.random() > 0.5);
    }

    public List<String> getColors() {
        return Arrays.asList(colors);
    }

    public List<String> getBrands() {
        return Arrays.asList(brands);
    }
    private boolean cellEdit;
    private boolean filter;
    private boolean deleteRow;
    private boolean select;
    private boolean showIndex;
    private boolean sort;
    private boolean draggableColumns;
    private boolean columnToggler;

    public boolean isCellEdit() {
        return cellEdit;
    }

    public void setCellEdit(boolean cellEdit) {
        this.cellEdit = cellEdit;
    }

    public boolean isFilter() {
        return filter;
    }

    public void setFilter(boolean filter) {
        this.filter = filter;
    }

    public boolean isDeleteRow() {
        return deleteRow;
    }

    public void setDeleteRow(boolean deleteRow) {
        this.deleteRow = deleteRow;
    }

    public boolean isSelect() {
        return select;
    }

    public void setSelect(boolean select) {
        this.select = select;
    }

    public boolean isShowIndex() {
        return showIndex;
    }

    public void setShowIndex(boolean showIndex) {
        this.showIndex = showIndex;
    }

    public boolean isSort() {
        return sort;
    }

    public void setSort(boolean sort) {
        this.sort = sort;
    }

    public boolean isDraggableColumns() {
        return draggableColumns;
    }

    public void setDraggableColumns(boolean draggableColumns) {
        this.draggableColumns = draggableColumns;
    }

    public boolean isColumnToggler() {
        return columnToggler;
    }

    public void setColumnToggler(boolean columnToggler) {
        this.columnToggler = columnToggler;
    }

    public void test() {

    }
}
