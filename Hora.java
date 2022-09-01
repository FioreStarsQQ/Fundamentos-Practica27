import java.text.*;

// CLASE HORA
public class Hora {
    DecimalFormat df = new DecimalFormat("00");
    private int hora, min, seg;

    // Establece una hora en especifico
    public void setUnaHora(int hh, int mm, int ss) {
        setHora(hh);
        setMinuto(mm);
        setSegundo(ss);
    }

    // Establece la hora
    public void setHora(int horas) {
        hora = horas;
    }

    // Establece los minutos
    public void setMinuto(int minutos) {
        min = minutos;
    }

    // Establece los segundos
    public void setSegundo(int segundos) {
        seg = segundos;
    }

    // Aumenta los segundos
    public void aumentarSegundo(int segs) {
        if (segs < 0) {
            seg += 0;
        } else {
            for (int i = segs; i > 0; --i) {
                seg += 1;
                if (seg == 60) {
                    // min +=1;
                    setSegundo(0);
                    aumentarMinuto(1);

                }
            }
        }
    }

    // Aumenta los minutos
    public void aumentarMinuto(int mins) {
        if (mins < 0) {
            min += 0;
        } else {
            for (int i = mins; i > 0; i--) {
                min += 1;
                if (min == 60) {
                    setMinuto(0);
                    aumentarHora(1);
                }
            }
        }
    }

    // Aumenta la hora
    public void aumentarHora(int hr) {
        if (hr < 0) {
            hora += 0;
        } else {
            for (int i = hr; i > 0; i--, hora++) {
                // min +=1;
                if (hora == 24) {
                    setHora(0);
                }
            }
        }
    }

    // Devuelve los valores de la hora, minuto y segundo
    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return min;
    }

    public int getSegundo() {
        return seg;
    }

    // Retorna la hora
    public String toString() {
        return ">>> Hora " + df.format(hora) + ":" + df.format(min) + ":" + df.format(seg);
    }
}
