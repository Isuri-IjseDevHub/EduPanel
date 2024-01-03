package lk.ijse.dep11.edupanel.repository;

import javax.persistence.EntityManager;

public interface SuperRepository {
    void setEntityManager(EntityManager em);
}
