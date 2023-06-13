package De;

public class DiceFactoryImpl implements DiceFactory{

    @Override
    public Dice CreateDice(int dice_value) {
        Dice dice = switch (dice_value){
            case 4 -> new D4();
            case 6 -> new D6();
            case 12 -> new D12();
            case 20 -> new D20();
            default -> throw new IllegalStateException("Unexpected value: " + dice_value);
        };
        return dice;
    }
}
