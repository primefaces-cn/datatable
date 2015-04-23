package org.primefaces.showcase.service;



import org.primefaces.showcase.service.Car;
import com.cn.lotary.base.dao.BaseEMDao;
import java.util.List;

/**
 *
 * @author jason
 */
public class CarDao extends BaseDemoDao<Car> {

    public List<Car> getCurrentAds() {
        return super.findByJPQL("select o from AD o where o.isOut = false order by o.sort asc");
    }
}
