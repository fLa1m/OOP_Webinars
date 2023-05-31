import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Market implements QueueBehaviour, MarketBehaviour {

    private List<Human> humansInMarket;
    private Queue<Human> humansQueue;

    public Market() {
        this.humansInMarket = new ArrayList<>();
        this.humansQueue = new LinkedList<>();
    }

    @Override
    public void acceptToMarket(Human actor) {
        humansInMarket.add(actor);
    }

    @Override
    public void releaseFromMarket(Human humans) {
        humansInMarket.remove(humans);
    }

    @Override
    public void takeInQueue(Human actor) {
        humansQueue.offer(actor);
    }

    @Override
    public void takeOrders() {
        humansQueue.peek().setMakeOrder();
    }

    @Override
    public void giveOrders() {
        humansQueue.peek().isTakeOrder();
    }

    @Override
    public void releseFromQueue() {
        System.out.println("Good buy " + humansQueue.peek().name);
        releaseFromMarket(humansQueue.poll());
        System.out.println("Humans in market " + humansInMarket.size());
    }

    public void update() {
        for (Human h : humansInMarket) {
            humansQueue.offer(h);
        }
        while (!humansQueue.isEmpty()) {
            takeOrders();
            giveOrders();
            releseFromQueue();
        }
        System.out.println("Queue is empty!");
    }
}
