package org.primefaces.showcase.view.data.datatable;

import com.cn.lotary.util.ObjectUtil;
import org.primefaces.showcase.service.Car;


/**
 *
 * @author jason
 * @date Apr 19, 2015
 */
public class Test {
public static void main(String[] a){
    ObjectUtil.getEntityFieldWithTableColumn(Car.class);
}
}
