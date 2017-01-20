package me.clark.martyn.pagination.app;

import me.clark.martyn.pagination.app.models.Bookings;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * User: martyn
 * Date: 23/04/2016
 * Time: 12:05
 */
public class Main {

    private EntityManager entityManager;

    private Main() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("appPU");
        this.entityManager = emf.createEntityManager();
    }

    private Long countBookings(Class T) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<?> root = cq.from(T);
        cq.select(cb.count(root));
        TypedQuery<Long> tq = entityManager.createQuery(cq);
        return tq.getSingleResult();
    }

    private List<Bookings> paginateBookings(int pageNumber) {
        int pageSize = 10;
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Bookings> cq = cb.createQuery(Bookings.class);
        Root<Bookings> bookingsRoot = cq.from(Bookings.class);
        cq.select(bookingsRoot).orderBy(cb.asc(bookingsRoot.get("id")));
        TypedQuery<Bookings> tq = entityManager.createQuery(cq);
        tq.setFirstResult((pageNumber -1) * pageSize);
        tq.setMaxResults(pageSize);
        return tq.getResultList();
    }

    public static void main(String[] args) {
        Main m = new Main();
        Long totalRows = m.countBookings(Bookings.class);
        double pages =  (totalRows / 10);
        System.out.println("Total Rows : " + totalRows);
        System.out.println("Pages: " + pages);
        m.paginateBookings(2).stream().forEach(b -> System.out.println(b.toString()));
    }

}
