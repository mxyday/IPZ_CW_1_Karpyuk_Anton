package ua.edu.lntu.cw_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ua.edu.lntu.cw_1.ui.theme.IPZ_CW_1_Karpyuk_AntonTheme
import java.util.concurrent.ConcurrentLinkedDeque

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
        Column(modifier = Modifier) {
            Image(
                painter = painterResource(id = R.drawable.flower),
                contentDescription = "Settings Icon",
                modifier = Modifier
                    .width(224.dp)
                    .padding(5.dp)
            )
            Text(
                text = "Karpyuk Anton",
                modifier = Modifier
                    .padding(5.dp),
                fontSize = 36.sp
            )
            Text(
                text = "Software engineer student",
                modifier = Modifier
                    .padding(5.dp),
                fontSize = 24.sp
            )
        }
        Column {
            Row {
                Image(
                    painter = painterResource(id = R.drawable.flower),
                    contentDescription = "Settings Icon",
                    modifier = Modifier
                        .width(50.dp)
                        .padding(5.dp)
                )
                Text(
                    text = "+00 (00) 000 000",
                    modifier = Modifier
                        .padding(5.dp),
                    fontSize = 24.sp
                )
            }
            Row {
                Image(
                    painter = painterResource(id = R.drawable.flower),
                    contentDescription = "Settings Icon",
                    modifier = Modifier
                        .width(50.dp)
                        .padding(5.dp)
                )
                Text(
                    text = "@socialmediahandle",
                    modifier = Modifier
                        .padding(5.dp),
                    fontSize = 24.sp
                )
            }
            Row {
                Image(
                    painter = painterResource(id = R.drawable.flower),
                    contentDescription = "Settings Icon",
                    modifier = Modifier
                        .width(50.dp)
                        .padding(5.dp)
                )
                Text(
                    text = "email@domail.com",
                    modifier = Modifier
                        .padding(5.dp),
                    fontSize = 24.sp
                )
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CardPreview() {
    IPZ_CW_1_Karpyuk_AntonTheme {
        Card("")
    }
}