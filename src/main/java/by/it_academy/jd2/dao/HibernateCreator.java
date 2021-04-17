package by.it_academy.jd2.dao;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.model.source.spi.MetadataSourceProcessor;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.Service;
import org.hibernate.service.ServiceRegistry;

public class HibernateCreator {

    private static SessionFactory sessionFactory = buildFactory();

    private static SessionFactory buildFactory() {

        try {
            StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .configure("hibernate.cfg.xml")
                    .build();
            Metadata metadata = new MetadataSources(serviceRegistry)
                    .getMetadataBuilder().build();
            return metadata.getSessionFactoryBuilder().build();
        }catch (Throwable t){
            throw new RuntimeException(t);
        }
    }

    public  static  SessionFactory getInstance(){

        return sessionFactory;
    }
}