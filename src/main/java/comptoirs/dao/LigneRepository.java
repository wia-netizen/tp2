package comptoirs.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import comptoirs.entity.Ligne;

// This will be AUTO IMPLEMENTED by Spring into a Bean called LigneRepository

public interface LigneRepository extends JpaRepository<Ligne, Integer> {
    @Query("SELECT SUM(l.quantite) FROM Ligne l WHERE l.produit.id = :produitRef")
    int getQuantiteCommandeePourProduit(@Param("produitRef") int produitRef);


}
