/*
 * Use and copying for commercial purposes
 * only with the author's permission
 */
package com.ardecs.MySpringBootJPA;

import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Yuri Tveritin, e-mail: kentyku@bk.ru
 */

public interface CountryRepository extends CrudRepository<Country, Long> {


}