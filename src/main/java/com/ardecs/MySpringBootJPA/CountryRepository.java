/*
 * Use and copying for commercial purposes
 * only with the author's permission
 */
package com.ardecs.MySpringBootJPA;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Yuri Tveritin, e-mail: kentyku@bk.ru
 */

public interface CountryRepository extends CrudRepository<Country, Long> {


}
