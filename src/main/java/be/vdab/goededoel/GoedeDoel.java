package be.vdab.goededoel;

import java.math.BigDecimal;
import java.util.Objects;

public class GoedeDoel {
	private final String naam;
	private BigDecimal opbrengst = BigDecimal.ZERO;

	public GoedeDoel(String naam) {
		this.naam = naam;
	}

	public String getNaam() {
		return naam;
	}

	public BigDecimal getOpbrengst() {
		return opbrengst;
	}

	@Override
	public boolean equals(Object o) {
		return o instanceof GoedeDoel ander && naam.equalsIgnoreCase(ander.naam);
	}

	@Override
	public int hashCode() {
		return Objects.hash(naam.toLowerCase());
	}
}
