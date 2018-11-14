package Task_06;

/*
Цветная лампочка имеет цвет который может быть красным, желтым, синим или зеленым.
Для цветной лампочки должно быть возможно установить цвет с помощью типа Цвет, и получить цвет в виде строки
*/

public enum Colour
{
    Red(1),
    Yellow(2),
    Green(3),
    Blue(4);

    private final int currentColourValue;

    Colour(int colourValue) {
        this.currentColourValue = colorValue;
    }

 }


