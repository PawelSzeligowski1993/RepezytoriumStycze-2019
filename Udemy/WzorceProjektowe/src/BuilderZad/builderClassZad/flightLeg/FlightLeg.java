package BuilderZad.builderClassZad.flightLeg;

public class FlightLeg {

    private String surname;
    private String forname;
    private String age;
    private String weight;
    private String growth;
    private String plane;
    private String terminal;
    private String ticketClass;
    private String from;
    private String to;
    private String delayed;
    private String price;


    private FlightLeg (FlightLegBuilder flightLegBuilder){
        this.surname = flightLegBuilder.surname;
        this.forname = flightLegBuilder.forname;
        this.age = flightLegBuilder.age;
        this.weight = flightLegBuilder.weight;
        this.growth = flightLegBuilder.growth;
        this.plane = flightLegBuilder.plane;
        this.terminal = flightLegBuilder.terminal;
        this.ticketClass = flightLegBuilder.ticketClass;
        this.from = flightLegBuilder.from;
        this.to = flightLegBuilder.to;
        this.delayed = flightLegBuilder.delayed;
        this.price = flightLegBuilder.price;
    }

    public String getSurname() {
        return surname;
    }

    public String getForname() {
        return forname;
    }
    public String getAge() {
        return age;
    }
    public String getWeight() {
        return weight;
    }

    public String getGrowth() {
        return growth;
    }

    public String getPlane() {
        return plane;
    }

    public String getTerminal() {
        return terminal;
    }

    public String getTicketClass() {
        return ticketClass;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getDelayed() {
        return delayed;
    }

    public String getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "FlightLeg{" +
                "surname='" + surname + '\'' +
                ", forname='" + forname + '\'' +
                ", age='" + age + '\'' +
                ", weight='" + weight + '\'' +
                ", growth='" + growth + '\'' +
                ", plane='" + plane + '\'' +
                ", terminal='" + terminal + '\'' +
                ", ticketClass='" + ticketClass + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", delayed='" + delayed + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public static class FlightLegBuilder
    {
        private String surname;
        private String forname;
        private String age;
        private String weight;
        private String growth;
        private String plane;
        private String terminal;
        private String ticketClass;
        private String from;
        private String to;
        private String delayed;
        private String price;


        public FlightLegBuilder buildSurname(String surname){
            this.surname = surname;
            return this;
        }

        public FlightLegBuilder buildForname(String forname){
            this.forname = forname;
            return this;
        }

        public FlightLegBuilder buildAge(String age){
            this.age = age;
            return this;
        }

        public FlightLegBuilder buildWeight(String weight){
            this.weight = weight;
            return this;
        }


        public FlightLegBuilder buildGrowth(String growth){
            this.growth = growth;
            return this;
        }

        public FlightLegBuilder buildPlane(String plane){
            this.plane = plane;
            return this;
        }

        public FlightLegBuilder buildTerminal(String terminal){
            this.terminal = terminal;
            return this;
        }

        public FlightLegBuilder buildTicketClass(String ticketClass){
            this.ticketClass = ticketClass;
            return this;
        }

        public FlightLegBuilder buildFrom(String from){
            this.from = from;
            return this;
        }

        public FlightLegBuilder buildTo(String to){
            this.to = to;
            return this;
        }


        public FlightLegBuilder buildDelayed(String delayed){
            this.delayed = delayed;
            return this;
        }


        public FlightLegBuilder buildPrice(String price){
            this.price = price;
            return this;
        }

        public FlightLeg build(){
            return new FlightLeg(this);
        }

    }
}
