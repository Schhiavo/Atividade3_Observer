package state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EstadoCandidatoTeste {
	Candidato candidato;
	
	@BeforeEach
    public void setUp() {
        candidato = new Candidato();
    }

//CANDIDATO EM ANALISE ----------------------------------------------------------------------------

    @Test
    public void naoDeveAnalisarCandidatoEmAnalise() {
        candidato.setEstado(EstadoCandidatoEmAnalise.getInstance());
        assertFalse(candidato.colocarEmAnalise());
    }
    
    @Test
    public void naoDeveHomologarCandidatoEmAnalise() {
        candidato.setEstado(EstadoCandidatoEmAnalise.getInstance());
        assertFalse(candidato.homologar());
    }
    
    @Test
    public void naoDeveColocarEmRecursoCandidatoEmAnalise() {
        candidato.setEstado(EstadoCandidatoEmAnalise.getInstance());
        assertFalse(candidato.colocarEmRecurso());
    }

    @Test
    public void deveReprovarCandidatoEmAnalise() {
        candidato.setEstado(EstadoCandidatoEmAnalise.getInstance());
        assertTrue(candidato.reprovar());
        assertEquals(EstadoCandidatoEmAnalise.getInstance(), candidato.getEstado());
    }
    
    @Test
    public void deveAprovarCandidatoEmAnalise() {
        candidato.setEstado(EstadoCandidatoEmAnalise.getInstance());
        assertTrue(candidato.aprovar());
        assertEquals(EstadoCandidatoEmAnalise.getInstance(), candidato.getEstado());
    }
    
    @Test
    public void deveColocarEmExcedenteCandidatoEmAnalise() {
        candidato.setEstado(EstadoCandidatoEmAnalise.getInstance());
        assertTrue(candidato.colocarEmExcedente());
        assertEquals(EstadoCandidatoEmAnalise.getInstance(), candidato.getEstado());
    }
    
    @Test
    public void deveEliminarCandidatoEmAnalise() {
        candidato.setEstado(EstadoCandidatoEmAnalise.getInstance());
        assertTrue(candidato.eliminar());
        assertEquals(EstadoCandidatoEmAnalise.getInstance(), candidato.getEstado());
    }
    
// CANDIDATO APROVADO--------------------------------------------------------------------------------------
    
    @Test
    public void naoDeveAprovarCandidatoAprovado() {
        candidato.setEstado(EstadoCandidatoAprovado.getInstance());
        assertFalse(candidato.aprovar());
    }
    
    @Test
    public void naoDeveReprovarCandidatoAprovado() {
        candidato.setEstado(EstadoCandidatoAprovado.getInstance());
        assertFalse(candidato.reprovar());
    }
    
    @Test
    public void naoDeveColocarEmExcedenteCandidatoAprovado() {
        candidato.setEstado(EstadoCandidatoAprovado.getInstance());
        assertFalse(candidato.colocarEmExcedente());
    }
    
    @Test
    public void naoDeveEliminarCandidatoAprovado() {
        candidato.setEstado(EstadoCandidatoAprovado.getInstance());
        assertFalse(candidato.eliminar());
    }
    
    @Test
    public void naoDeveColocarEmRecursoCandidatoAprovado() {
        candidato.setEstado(EstadoCandidatoAprovado.getInstance());
        assertFalse(candidato.colocarEmRecurso());
    }
    
    @Test
    public void deveHomologarCandidatoAprovado() {
        candidato.setEstado(EstadoCandidatoAprovado.getInstance());
        assertTrue(candidato.homologar());
        assertEquals(EstadoCandidatoAprovado.getInstance(), candidato.getEstado());
    }
    
    @Test
    public void deveColocarEmAnaliseCandidatoAprovado() {
        candidato.setEstado(EstadoCandidatoAprovado.getInstance());
        assertTrue(candidato.colocarEmAnalise());
        assertEquals(EstadoCandidatoAprovado.getInstance(), candidato.getEstado());
    }
    
// CANDIDATO REPROVADO--------------------------------------------------------------------------------------
 
    @Test
    public void naoDeveReprovarCandidatoReprovado() {
        candidato.setEstado(EstadoCandidatoReprovado.getInstance());
        assertFalse(candidato.reprovar());
    }
    
    @Test
    public void naoDeveColocarEmAnaliseCandidatoReprovado() {
        candidato.setEstado(EstadoCandidatoReprovado.getInstance());
        assertFalse(candidato.colocarEmAnalise());
    }
    
    @Test
    public void naoDeveAprovarCandidatoReprovado() {
        candidato.setEstado(EstadoCandidatoReprovado.getInstance());
        assertFalse(candidato.aprovar());
    }
    
    @Test
    public void naoDeveHomologarCandidatoReprovado() {
        candidato.setEstado(EstadoCandidatoReprovado.getInstance());
        assertFalse(candidato.homologar());
    }
    
    @Test
    public void naoDeveColocarEmExcedenteCandidatoReprovado() {
        candidato.setEstado(EstadoCandidatoReprovado.getInstance());
        assertFalse(candidato.colocarEmExcedente());
    }
    
    @Test
    public void deveColocarEmRecursoCandidatoReprovado() {
        candidato.setEstado(EstadoCandidatoReprovado.getInstance());
        assertTrue(candidato.colocarEmRecurso());
        assertEquals(EstadoCandidatoReprovado.getInstance(), candidato.getEstado());
    }
    
    @Test
    public void deveEliminarCandidatoReprovado() {
        candidato.setEstado(EstadoCandidatoReprovado.getInstance());
        assertTrue(candidato.eliminar());
        assertEquals(EstadoCandidatoReprovado.getInstance(), candidato.getEstado());
    }

 // CANDIDATO HOMOLOGADO--------------------------------------------------------------------------------------
    
    @Test
    public void naoDeveHomologarCandidatoHomologado() {
        candidato.setEstado(EstadoCandidatoHomologado.getInstance());
        assertFalse(candidato.homologar());
    }
    
    @Test
    public void naoDeveAprovarCandidatoHomologado() {
        candidato.setEstado(EstadoCandidatoHomologado.getInstance());
        assertFalse(candidato.aprovar());
    }
    
    @Test
    public void naoDeveColocarEmAnaliseCandidatoHomologado() {
        candidato.setEstado(EstadoCandidatoHomologado.getInstance());
        assertFalse(candidato.colocarEmAnalise());
    }
    
    @Test
    public void naoDeveReprovarCandidatoHomologado() {
        candidato.setEstado(EstadoCandidatoHomologado.getInstance());
        assertFalse(candidato.reprovar());
    }
    
    @Test
    public void naoDeveColocarEmExcedenteCandidatoHomologado() {
        candidato.setEstado(EstadoCandidatoHomologado.getInstance());
        assertFalse(candidato.colocarEmExcedente());
    }
    
    @Test
    public void naoDeveColocarEmRecursoCandidatoHomologado() {
        candidato.setEstado(EstadoCandidatoHomologado.getInstance());
        assertFalse(candidato.colocarEmRecurso());
    }
    
    @Test
    public void naoDeveEliminarCandidatoHomologado() {
        candidato.setEstado(EstadoCandidatoHomologado.getInstance());
        assertFalse(candidato.eliminar());
    }

// CANDIDATO ELIMINADO--------------------------------------------------------------------------------------
    
    @Test
    public void naoDeveEliminarCandidatoEliminado() {
        candidato.setEstado(EstadoCandidatoEliminado.getInstance());
        assertFalse(candidato.eliminar());
    }
    
    @Test
    public void naoDeveColocarEmAnaliseCandidatoEliminado() {
        candidato.setEstado(EstadoCandidatoEliminado.getInstance());
        assertFalse(candidato.colocarEmAnalise());
    }
    
    @Test
    public void naoDeveAprovarCandidatoEliminado() {
        candidato.setEstado(EstadoCandidatoEliminado.getInstance());
        assertFalse(candidato.aprovar());
    }
    
    @Test
    public void naoDeveHomologarCandidatoEliminado() {
        candidato.setEstado(EstadoCandidatoEliminado.getInstance());
        assertFalse(candidato.homologar());
    }
    
    @Test
    public void naoDeveReprovarCandidatoEliminado() {
        candidato.setEstado(EstadoCandidatoEliminado.getInstance());
        assertFalse(candidato.reprovar());
    }
    
    @Test
    public void naoDeveColocarEmExcedenteCandidatoEliminado() {
        candidato.setEstado(EstadoCandidatoEliminado.getInstance());
        assertFalse(candidato.colocarEmExcedente());
    }
    
    @Test
    public void naoDeveColocarEmRecursoCandidatoEliminado() {
        candidato.setEstado(EstadoCandidatoEliminado.getInstance());
        assertFalse(candidato.colocarEmRecurso());
    }
    
// CANDIDATO EM RECURSO--------------------------------------------------------------------------------------
    
    @Test
    public void naoDeveColocarEmRecursoCandidatoEmRecurso() {
        candidato.setEstado(EstadoCandidatoEmRecurso.getInstance());
        assertFalse(candidato.colocarEmRecurso());
    }
    
    @Test
    public void naoDeveReprovarCandidatoEmRecurso() {
        candidato.setEstado(EstadoCandidatoEmRecurso.getInstance());
        assertFalse(candidato.reprovar());
    }
    
    @Test
    public void naoDeveColocarEmExcedenteCandidatoEmRecurso() {
        candidato.setEstado(EstadoCandidatoEmRecurso.getInstance());
        assertFalse(candidato.colocarEmExcedente());
    }
    
    @Test
    public void naoDeveColocarEmAnaliseCandidatoEmRecurso() {
        candidato.setEstado(EstadoCandidatoEmRecurso.getInstance());
        assertFalse(candidato.colocarEmAnalise());
    }
    
    @Test
    public void naoDeveAprovarCandidatoEmRecurso() {
        candidato.setEstado(EstadoCandidatoEmRecurso.getInstance());
        assertFalse(candidato.aprovar());
    }
    
    @Test
    public void deveEliminarCandidatoEmRecurso() {
        candidato.setEstado(EstadoCandidatoEmRecurso.getInstance());
        assertTrue(candidato.eliminar());
        assertEquals(EstadoCandidatoEmRecurso.getInstance(), candidato.getEstado());
    }
    
    @Test
    public void deveHomologarCandidatoEmRecurso() {
        candidato.setEstado(EstadoCandidatoEmRecurso.getInstance());
        assertTrue(candidato.homologar());
        assertEquals(EstadoCandidatoEmRecurso.getInstance(), candidato.getEstado());
    }
    
// CANDIDATO EXCEDENTE--------------------------------------------------------------------------------------
    
    @Test
    public void naoDeveColocarEmExcedenteCandidatoExcedente() {
        candidato.setEstado(EstadoCandidatoExcedente.getInstance());
        assertFalse(candidato.colocarEmExcedente());
    }
    
    @Test
    public void naoDeveAprovarCandidatoExcedente() {
        candidato.setEstado(EstadoCandidatoExcedente.getInstance());
        assertFalse(candidato.aprovar());
    }
    
    @Test
    public void naoDeveReprovarCandidatoExcedente() {
        candidato.setEstado(EstadoCandidatoExcedente.getInstance());
        assertFalse(candidato.reprovar());
    }
    
    @Test
    public void naoDeveHomologarCandidatoExcedente() {
        candidato.setEstado(EstadoCandidatoExcedente.getInstance());
        assertFalse(candidato.homologar());
    }
    
    @Test
    public void deveColocarEmAnaliseCandidatoExcedente() {
        candidato.setEstado(EstadoCandidatoExcedente.getInstance());
        assertTrue(candidato.colocarEmAnalise());
        assertEquals(EstadoCandidatoExcedente.getInstance(), candidato.getEstado());
    }
    
    @Test
    public void deveColocarEmRecursoCandidatoExcedente() {
        candidato.setEstado(EstadoCandidatoExcedente.getInstance());
        assertTrue(candidato.colocarEmRecurso());
        assertEquals(EstadoCandidatoExcedente.getInstance(), candidato.getEstado());
    }
    
    @Test
    public void deveEliminarCandidatoExcedente() {
        candidato.setEstado(EstadoCandidatoExcedente.getInstance());
        assertTrue(candidato.eliminar());
        assertEquals(EstadoCandidatoExcedente.getInstance(), candidato.getEstado());
    }
}
