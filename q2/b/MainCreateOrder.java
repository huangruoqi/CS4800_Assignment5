package b;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainCreateOrder {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                                    .configure("hibernate.cfg.xml")
                                    .addAnnotatedClass(Order.class)
                                    .addAnnotatedClass(Product.class)
                                    .buildSessionFactory();
        Session session = factory.getCurrentSession();
        try {
            session.beginTransaction();
            Order order = new Order();
            order.add(new Product());
            order.add(new Product());
            session.save(order);
            session.getTransaction().commit();
        }
        finally {
            session.close();
            factory.close();
        }

    }    
}
