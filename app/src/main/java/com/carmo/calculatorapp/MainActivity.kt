package com.carmo.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.carmo.calculatorapp.databinding.ActivityMainBinding
import org.mariuszgromada.math.mxparser.Expression

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val calculo = binding.calculo
        val resultado = binding.resultado

        binding.um.setOnClickListener{
            calculo.text = "${calculo.text}1"
        }

        binding.dois.setOnClickListener{
            calculo.text = "${calculo.text}2"
        }

        binding.tres.setOnClickListener{
            calculo.text = "${calculo.text}3"
        }

        binding.quatro.setOnClickListener{
            calculo.text = "${calculo.text}4"
        }

        binding.cinco.setOnClickListener{
            calculo.text = "${calculo.text}5"
        }

        binding.seis.setOnClickListener{
            calculo.text = "${calculo.text}6"
        }

        binding.sete.setOnClickListener{
            calculo.text = "${calculo.text}7"
        }

        binding.oito.setOnClickListener{
            calculo.text = "${calculo.text}8"
        }

        binding.nove.setOnClickListener{
            calculo.text = "${calculo.text}9"
        }

        binding.zero.setOnClickListener{
            calculo.text = "${calculo.text}0"
        }
        //operacoes
        binding.parenteseAbrindo.setOnClickListener{
            calculo.text = "${calculo.text}("
        }

        binding.parenteseFechando.setOnClickListener{
            calculo.text = "${calculo.text})"
        }

        binding.divisao.setOnClickListener{
            calculo.text = "${calculo.text}/"
        }

        binding.multiplicacao.setOnClickListener{
            calculo.text = "${calculo.text}*"
        }

        binding.subtracao.setOnClickListener{
            calculo.text = "${calculo.text}-"
        }

        binding.soma.setOnClickListener{
            calculo.text = "${calculo.text}+"
        }

        binding.ponto.setOnClickListener{
            calculo.text = "${calculo.text}."
        }

        binding.delete.setOnClickListener{
            calculo.text = calculo.text.dropLast(1)
        }

        binding.ce.setOnClickListener{
            calculo.text = ""
            resultado.text = ""
        }

        binding.igual.setOnClickListener{
            val resultadoCalculo = Expression(calculo.text.toString()).calculate()

            if (resultadoCalculo.isNaN()){
                resultado.text = "Expreção inválida"
            }else {
                resultado.text = resultadoCalculo.toString()
            }
        }
    }
}