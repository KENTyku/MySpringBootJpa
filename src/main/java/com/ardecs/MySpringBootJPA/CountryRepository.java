/*
 * Use and copying for commercial purposes
 * only with the author's permission
 */
package com.ardecs.MySpringBootJPA;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 *
 * @author Yuri Tveritin, e-mail: kentyku@bk.ru
 */

public interface CountryRepository extends CrudRepository<Country, Long> {
    Country findByCountryName(String name);
//    Optional<Country> findById(Long id);




}
