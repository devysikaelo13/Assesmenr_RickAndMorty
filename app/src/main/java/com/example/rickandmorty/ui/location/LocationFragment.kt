//package com.example.rickandmorty.ui.location
//
//import android.os.Bundle
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.Toast
//import androidx.core.os.bundleOf
//import androidx.fragment.app.Fragment
//import androidx.fragment.app.viewModels
//import androidx.lifecycle.Observer
//import androidx.navigation.fragment.findNavController
//import androidx.recyclerview.widget.LinearLayoutManager
//import com.example.rickandmorty.R
//import com.example.rickandmorty.databinding.CharactersFragmentBinding
//import com.example.rickandmorty.utils.Resource
//import com.example.rickandmorty.utils.autoCleared
//import dagger.hilt.android.AndroidEntryPoint
//
//@AndroidEntryPoint
//class LocationFragment : Fragment(), LocationAdapter.CharacterItemListener {
//
//    private var binding: CharactersFragmentBinding by autoCleared()
//    private val viewModel: LocationViewModel by viewModels()
//    private lateinit var adapter: LocationAdapter
//
////    override fun onCreateView(
////        inflater: LayoutInflater, container: ViewGroup?,
////        savedInstanceState: Bundle?
////    ): View?
////    {
////        binding = LocationFragmentBinding.inflater(inflater, container, false)
////        return binding.root
////    }
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        setupRecyclerView()
//        setupObservers()
//    }
//
//    private fun setupRecyclerView() {
//        adapter = LocationAdapter(this)
//        binding.charactersRv.layoutManager = LinearLayoutManager(requireContext())
//        binding.charactersRv.adapter = adapter
//    }
//
//    private fun setupObservers() {
//        viewModel.location.observe(viewLifecycleOwner, Observer {
//            when (it.status) {
//                Resource.Status.SUCCESS -> {
//                    binding.progressBar.visibility = View.GONE
//                    if (!it.data.isNullOrEmpty()) adapter.setItems(ArrayList(it.data))
//                }
//                Resource.Status.ERROR ->
//                    Toast.makeText(requireContext(), it.message, Toast.LENGTH_SHORT).show()
//
//                Resource.Status.LOADING ->
//                    binding.progressBar.visibility = View.VISIBLE
//            }
//        })
//    }
//
//    override fun onClickedCharacter(characterId: Int) {
//        findNavController().navigate(
//            R.id.action_charactersFragment_to_characterDetailFragment,
//            bundleOf("id" to characterId)
//        )
//    }
//}