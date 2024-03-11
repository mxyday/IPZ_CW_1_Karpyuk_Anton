package ua.edu.lntu.cw_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import ua.edu.lntu.cw_1.ui.theme.IPZ_CW_1_Karpyuk_AntonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IPZ_CW_1_Karpyuk_AntonTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Card("Karpyuk Anton")
                }
            }
        }
    }
}

@Composable
fun Card(name: String, ) {
    Column {
        Image(
            painter = painterResource(id = R.drawable.flower),
            contentDescription = "Settings Icon",
        )
        Text(
            text = "Karpyuk Anton",
            modifier = Modifier,
            fontSize = 36.sp
        )
        Text(
            text = "Software engineer student",
            modifier = Modifier,
            fontSize = 24.sp
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CardPreview() {
    IPZ_CW_1_Karpyuk_AntonTheme {
        Card("")
    }
}