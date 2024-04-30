package map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    
    Map<LocalDate, Evento> agendaEvento;

    public AgendaEventos() {
        this.agendaEvento = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nomeEvento, String atracao) {
        agendaEvento.put(data,new Evento(nomeEvento, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(agendaEvento);
        System.out.println(eventoTreeMap);
    }

    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(agendaEvento);
        for(Map.Entry<LocalDate, Evento> entry: eventoTreeMap.entrySet()) {
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                System.out.println("O proximo evento: "+entry.getValue()+" Acontecerá em "+entry.getKey());
                break;
            }
        }
    }

    public static void main(String[] args) {

        AgendaEventos agenda = new AgendaEventos();

        agenda.adicionarEvento(LocalDate.of(2017, Month.DECEMBER, 7), "Evento 1", "Atração 1");

        agenda.adicionarEvento(LocalDate.of(2009, Month.MARCH, 15), "Evento 2", "Atração 2");

        agenda.adicionarEvento(LocalDate.of(2020, Month.FEBRUARY, 25), "Evento 3", "Atração 3");

        agenda.adicionarEvento(LocalDate.of(2011, Month.MAY, 17), "Evento 4", "Atração 4");

        agenda.adicionarEvento(LocalDate.of(2024, Month.APRIL, 30), "Evento 5", "Atração 5");


        agenda.exibirAgenda();

        agenda.obterProximoEvento();
    }
}
