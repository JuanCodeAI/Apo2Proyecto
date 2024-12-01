public class Main {
    public static void main(String[] args) {
        /*
        Funcion para que se ejecute el "hilo" de eventos creado en la clase MainWindow
         */
        javax.swing.SwingUtilities.invokeLater(() -> {

        /* Se cre el metodo MainWindow para llamar la clase MainWindow y poder obtener sus valores, en este caso
        se ejecuta una ventana con valores propios de otras clases.
         */
            MainWindow ventana = new MainWindow();
            ventana.setVisible(true);
        });
    }
}
