import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MainWindow extends JFrame {
    private List<ListaReproduccion> listas;
    private List<Artista> artistas;
    private List<Cancion> canciones;

    private JPanel panelListas, panelArtistas, panelCanciones;
    private JList<String> listaListas, listaArtistas, listaCanciones;
    private DefaultListModel<String> modelListas, modelArtistas, modelCanciones;

    public MainWindow() {
        listas = new ArrayList<>();
        artistas = new ArrayList<>();
        canciones = new ArrayList<>();

        // ConfiguraciÃ³n bÃ¡sica de la ventana
        setTitle("Gestor de Colecciones de MÃºsica");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());


        panelListas = new JPanel();
        panelArtistas = new JPanel();
        panelCanciones = new JPanel();


        panelListas.setLayout(new BorderLayout());
        panelArtistas.setLayout(new BorderLayout());
        panelCanciones.setLayout(new BorderLayout());


        modelListas = new DefaultListModel<>();
        modelArtistas = new DefaultListModel<>();
        modelCanciones = new DefaultListModel<>();


        listaListas = new JList<>(modelListas);
        listaArtistas = new JList<>(modelArtistas);
        listaCanciones = new JList<>(modelCanciones);


        panelListas.add(new JScrollPane(listaListas), BorderLayout.CENTER);
        panelArtistas.add(new JScrollPane(listaArtistas), BorderLayout.CENTER);
        panelCanciones.add(new JScrollPane(listaCanciones), BorderLayout.CENTER);


        JButton botonNuevaLista = new JButton("Nueva Lista");
        botonNuevaLista.addActionListener(e -> nuevaLista());

        JButton botonNuevoArtista = new JButton("Nuevo Artista");
        botonNuevoArtista.addActionListener(e -> nuevoArtista());

        JButton botonNuevaCancion = new JButton("Nueva CanciÃ³n");
        botonNuevaCancion.addActionListener(e -> nuevaCancion());


        JPanel panelListasBotones = new JPanel();
        panelListasBotones.add(botonNuevaLista);
        panelListas.add(panelListasBotones, BorderLayout.SOUTH);

        JPanel panelArtistasBotones = new JPanel();
        panelArtistasBotones.add(botonNuevoArtista);
        panelArtistas.add(panelArtistasBotones, BorderLayout.SOUTH);

        JPanel panelCancionesBotones = new JPanel();
        panelCancionesBotones.add(botonNuevaCancion);
        panelCanciones.add(panelCancionesBotones, BorderLayout.SOUTH);

        JSplitPane splitPane1 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panelListas, panelArtistas);
        JSplitPane splitPane2 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, splitPane1, panelCanciones);
        add(splitPane2, BorderLayout.CENTER);
    }

    private void nuevaCancion() {
    }

    private void nuevoArtista() {
    }

    private void nuevaLista() {
    }

}
