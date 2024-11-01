package br.com.cafeteria.inteligente.userpreferences;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PreferenceRepository extends JpaRepository<UserPreferences, Integer> {
    List<UserPreferences> findAllUserPreferencesByidSmartCoffeUsers(Integer idUser);
}
