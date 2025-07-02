package com.example.atividade_02072025_lanchonete;

import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.fragment.app.Fragment;

public class FragmentFazerPedido extends Fragment {

    private EditText editTextNome;
    private Spinner spinnerPao, spinnerCarne, spinnerSalada, spinnerOvo, spinnerBacon, spinnerMolho;

    public FragmentFazerPedido(){
        super(R.layout.fragment_fazer_pedido);
    }

    @Override
    public void onResume() {
        super.onResume();
        editTextNome = getView().findViewById(R.id.editTextNome);
        spinnerPao = getView().findViewById(R.id.spinnerPao);
        spinnerCarne = getView().findViewById(R.id.spinnerCarne);
        spinnerSalada = getView().findViewById(R.id.spinnerSalada);
        spinnerOvo = getView().findViewById(R.id.spinnerOvo);
        spinnerBacon = getView().findViewById(R.id.spinnerBacon);
        spinnerMolho = getView().findViewById(R.id.spinnerMolho);

        adapterSpinner(spinnerPao, R.array.opcoes_pao);
        adapterSpinner(spinnerCarne, R.array.opcoes_carne);
        adapterSpinner(spinnerSalada, R.array.opcoes_salada);
        adapterSpinner(spinnerOvo, R.array.opcoes_sim_nao);
        adapterSpinner(spinnerBacon, R.array.opcoes_sim_nao);
        adapterSpinner(spinnerMolho, R.array.opcoes_molho);

    }

    private void adapterSpinner(Spinner spinner, int arrayResId) {
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                requireContext(), arrayResId, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }
}
