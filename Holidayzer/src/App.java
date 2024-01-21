public class App {
    public static void listHolidays(Holiday[] calendar){
        for(int i=0; i<calendar.length; i++){
            String day = calendar[i].getDay();
            String name = calendar[i].getName();
            System.out.println(day+" => "+name);
        }
    }

    public static int isHoliday(Holiday[] calendar, String date){
        for(int i=0; i<calendar.length; i++){
            String day = calendar[i].getDay();
            if(date == day){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws Exception {
        Holiday[] calendar = {new Holiday("01-01-2024", "Confraternização Mundial"),
        new Holiday("12-02-2024", "Carnaval"),
        new Holiday("13-02-2024", "Carnaval"),
        new Holiday("29-03-2024", "Sexta-feira Santa"),
        new Holiday("21-04-2024", "Tiradentes"),
        new Holiday("01-05-2024", "Dia do Trabalho"),
        new Holiday("30-05-2024", "Corpus Christi"),
        new Holiday("07-09-2024", "Independência do Brasil"),
        new Holiday("12-10-2024", "Nossa Senhora Aparecida"),
        new Holiday("02-11-2024", "Finados"),
        new Holiday("15-11-2024", "Proclamação da República"),
        new Holiday("20-11-2024", "Dia Nacional de Zumbi e da Consciência Negra"),
        new Holiday("25-12-2024", "Natal")
        };
        listHolidays(calendar);
        String date = "01-02-2024";
        int result = isHoliday(calendar, date);
        if(result == -1){
            System.out.println("Dia "+date+" não é feriado 🥲");
        }else{
            System.out.println("Dia "+date+" é "+calendar[result].getName()+"! 🎉");
        }
    }
}
