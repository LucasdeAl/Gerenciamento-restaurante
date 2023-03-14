package restaurante.repositorio;

import restaurante.dados.mesa.Mesa;

public class VetorMesas {

    private Mesa[] mesas = new Mesa[30];

    public VetorMesas()
    {
        for(int i=0 ;i<30; i++)
        {
            mesas[i].setNumero(i+1);
        }
    }


}
