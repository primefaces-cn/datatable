package org.primefaces.showcase.service;


import com.cn.lotary.base.dao.AbstractEntity;
import com.cn.lotary.base.dao.BaseDao;
import com.cn.lotary.util.SystemConfig;
import java.util.HashMap;
import java.util.Map;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import static org.eclipse.persistence.config.PersistenceUnitProperties.JDBC_PASSWORD;
import static org.eclipse.persistence.config.PersistenceUnitProperties.JDBC_URL;
import static org.eclipse.persistence.config.PersistenceUnitProperties.JDBC_USER;

/**
 *
 * @author jason
 * @date Apr 18, 2015
 */
public abstract class BaseDemoDao<T extends AbstractEntity> extends BaseDao<T> {

//    @PersistenceContext(unitName = "bae")
    private EntityManagerFactory em;

    @Override
    protected EntityManagerFactory getEntityManagerFactory() {
        try {
            Map properties = new HashMap();
            properties.put(JDBC_URL, SystemConfig.LOCAL_DB_URL);
            properties.put(JDBC_USER, SystemConfig.LOCAL_DB_USER);
            properties.put(JDBC_PASSWORD, SystemConfig.LOCAL_DB_PASSWORD);
            em = Persistence.createEntityManagerFactory("bae", properties);
        } catch (Exception e) {
            logger.error("---------INIT EMF ERROR ----------");
            logger.error("---------LOCAL_DB_URL ----------" + SystemConfig.LOCAL_DB_URL);
            logger.error("---------LOCAL_DB_USER ----------" + SystemConfig.LOCAL_DB_USER);
            logger.error("---------LOCAL_DB_PASSWORD ----------" + SystemConfig.LOCAL_DB_PASSWORD);
            logger.error(e.getLocalizedMessage());
        }
        return em;
    }
}
