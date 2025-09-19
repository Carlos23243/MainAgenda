import java.util.Date;

public class Evento {
    private final Date fecha;
    private final Date hora;
    private final String descripcion;

    public Evento(Date fecha, Date hora, String descripcion) {
        this.fecha = fecha;
        this.hora = hora;
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Date getHora() {
        return hora;
    }

    public String getDescripcion() {
        return descripcion;
    }
}

