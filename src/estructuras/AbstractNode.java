/**
 * 
 */
package estructuras;

/**
 * @author teto
 * Clase que define tipo de Nodo
 *
 */
public class AbstractNode {
	
	Integer id;
	Integer capacidadTotal;
	
	public AbstractNode() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCapacidadTotal() {
		return capacidadTotal;
	}

	public void setCapacidadTotal(Integer capacidadTotal) {
		this.capacidadTotal = capacidadTotal;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractNode other = (AbstractNode) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	

}
