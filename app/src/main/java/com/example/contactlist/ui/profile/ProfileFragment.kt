package com.example.contactlist.ui.profile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.contactlist.R
import com.example.contactlist.databinding.FragmentGalleryBinding
import com.example.contactlist.databinding.FragmentProfileBinding

/**
 * A simple [Fragment] subclass.
 * Use the [ProfileFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ProfileFragment : Fragment() {

    private var _binding: FragmentProfileBinding? = null //? = means it can hold null variable, no null pointer exception
    private val binding get() = _binding!! //get() = getter() when binding value available, get and assign to biding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) { //current state stored in this bundle exp: user input
        super.onViewCreated(view, savedInstanceState)
        val editTextName: EditText = view.findViewById(R.id.editTextName)
        val editTextContact: EditText = view.findViewById(R.id.editTextContact)
        val buttonSave: Button = view.findViewById(R.id.buttonSave)

        buttonSave.setOnClickListener {
            Toast.makeText(context, "Record saved", Toast.LENGTH_SHORT).show()
        }
    }
}