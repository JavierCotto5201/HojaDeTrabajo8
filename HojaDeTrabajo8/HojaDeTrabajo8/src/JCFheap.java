import java.util.PriorityQueue;

/**
 * @param <E> vector
 */
public class JCFheap<E> {

    // Atributos
    protected PriorityQueue CustomHeap;

    /**
     * Nuevo ourHeapJCF
     */
    public JCFheap() {
        CustomHeap = new PriorityQueue<E>();
    }

    /**
     * @param vector vector de tipo PriorityQueue
     */
    public JCFheap(PriorityQueue<E> vec) {
        CustomHeap = new PriorityQueue<E>(vec.size());
        for (int i = 0; i < vec.size(); i++) {
            vec.poll();
        }
    }

    /**
     * Agrega pacientes nuevos
     *
     * @param value paciente
     */
    public void add(E value) {
        CustomHeap.add(value);
    }

    /**
     * Se llama al paciente siguiente y lo atiende sacandolo de la cola
     * @return nombre del paciente atendido
     */
    public String next() {
        if (!CustomHeap.isEmpty()) {
            String patient = CustomHeap.poll().toString();
            return patient;
        } else {
            String message = "No hay pacientes";
            return message;
        }
    }
    /**
     * Revisa el paciente siguiente con mayor prioridad
     * @return retorna el paciente con mayor prioridad
     */
    public String check() {
        if (!CustomHeap.isEmpty()) {
            String patient = CustomHeap.peek().toString();
            return patient;
        } else {
            String message = "No hay pacientes";
            return message;
        }
    }
}