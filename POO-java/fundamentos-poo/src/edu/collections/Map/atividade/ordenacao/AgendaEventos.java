package edu.collections.Map.atividade.ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AgendaEventos {
    Map<LocalDate, Evento> agendaEventosMap;

    public AgendaEventos(){
        this.agendaEventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome);
        evento.setAtracao(atracao);
        agendaEventosMap.put(data, evento);
    }

    public void adicionarAtracao(String nome, String novaAtracao){
        if(!agendaEventosMap.isEmpty()){
            for(Evento evento: agendaEventosMap.values()){
                if(evento.getNome() == nome){
                    evento.setAtracao(novaAtracao);
                }
            }
        }
    }

    public void exibirAgenda(){
        //O TreeMap vai receber o agendaMap que tem o LocalDate como Type do Map e por ter uma interface do ChromolLocalDate que extends um comparaple, O TreeMap quando instanciado vai organizar "automaticamente" os  eventos.

        Map<LocalDate, Evento> eventosThreeMap = new TreeMap<>(agendaEventosMap);
        System.out.println(eventosThreeMap);
    }

    public void obterProximoEvento(){
        // Eles não tem relações entre si.
        // key set retorna o set com todos os todas as chaves / key:
        // Set<LocalDate> dataSet = agendaEventosMap.keySet();

        //Retorna todas as coleções em uma collection:
        // Collection<Evento> values = agendaEventosMap.values();

        LocalDate dataAtual = LocalDate.now();

        Map<LocalDate, Evento> eventosThreeMap = new TreeMap<>(agendaEventosMap);

        //entrySet retorna um Set com Maps dentro que possuem value e key:

        for (Map.Entry<LocalDate, Evento> entry : eventosThreeMap.entrySet()) {
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                System.out.print("O próximo evento: " + entry.getValue() + "acontecerá na data: " + entry.getKey());
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        // Adiciona eventos à agenda
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Conferência de Tecnologia", "Palestrante renomado");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Workshop de Programação", "Aula prática de desenvolvimento");
        agendaEventos.adicionarEvento(LocalDate.of(2000, 1, 10), "Lançamento de Software", "Demonstração da nova versão");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.NOVEMBER, 28), "Hackathon de Inovação", "Competição de soluções criativas");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 20), "Seminário de Inteligência Artificial", "Discussão sobre IA avançada");

        //adicionando atração em evento existente.
        agendaEventos.adicionarAtracao("Seminário de Inteligência Artificial", "Usando IA como suporte para programadores");

        // Exibe a agenda completa de eventos
        agendaEventos.exibirAgenda();

        // Obtém e exibe o próximo evento na agenda
        agendaEventos.obterProximoEvento();
  }
}
