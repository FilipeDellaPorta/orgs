package br.com.alura.orgs.ui.activity

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.alura.orgs.ui.recyclerview.adapter.ListaProdutosAdapter
import br.com.alura.orgs.R
import java.math.BigDecimal
import br.com.alura.orgs.model.Produto

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaProdutosAdapter(context = this, produtos = listOf(
            Produto(nome = "teste", descricao = "teste desc", valor = BigDecimal("29.99")),
            Produto(nome = "teste2", descricao = "teste desc2", valor = BigDecimal("39.99")),
            Produto(nome = "teste3", descricao = "teste desc3", valor = BigDecimal("19.99")),

        ))
        //recyclerView.layoutManager = LinearLayoutManager(this)
    }
}