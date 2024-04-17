package com.example.firebasestorage.ui.theme.screens.clothes

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.firebasestorage.MainActivity
import com.example.firebasestorage.R
import com.example.firebasestorage.navigation.ROUT_CLOTHES

class DestinationActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ClothesScreen()
        }
    }
}


@Composable
fun ClothesScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        val mContext = LocalContext.current
        //TopApp Bar
        TopAppBar(
            title = { Text(text = "Clothes", color = Color.White) }, navigationIcon = {
                IconButton(onClick = {
                    mContext.startActivity(Intent(mContext, MainActivity::class.java))
                }) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Arrowback",
                        tint = Color.White
                    )
                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Share,
                        contentDescription = "Menu",
                        tint = Color.White
                    )
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Settings,
                        contentDescription = "Menu",
                        tint = Color.White
                    )
                }
            }
        )
        //End TopApp Bar
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(R.drawable.clothing1),
                contentDescription = "Blue",
                modifier = Modifier.fillMaxSize()
                    .clickable {
                        Toast.makeText(mContext,
                            "Winter collection",
                            Toast.LENGTH_SHORT).show() },
                contentScale = ContentScale.Crop

            )
            Text(
                text = "WINTER COLLECTION",
                fontSize = 20.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color.White,
                textAlign = TextAlign.Center
            )
            Text(
                text = "Purchase Your Products",
                fontSize = 20.sp,
                color = Color.White
            )
        }
        //End Of Box
        Spacer(modifier = Modifier.height(10.dp))

        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(start = 10.dp)
        ) {
            //Row
            Row {
                //Column
                Column {
                    Image(
                        painter = painterResource(id = R.drawable.clothing2),
                        contentDescription = "i dont know",
                        modifier = Modifier.size(width = 180.dp, height = 200.dp)
                    )
                    Text(text = "Shirt 1", fontSize = 20.sp)
                    Text(text = "Ksh.1300", fontSize = 20.sp)
                    OutlinedButton(onClick = { /*TODO*/ }) {
                        Text(text = "PAY", color = Color.Black)

                    }
                }
                //Column
                Column {
                    Image(
                        painter = painterResource(id = R.drawable.clothing3),
                        contentDescription = "i dont know",
                        modifier = Modifier.size(width = 180.dp, height = 200.dp)
                    )
                    Text(text = "Shirt 1", fontSize = 20.sp)
                    Text(text = "Ksh.1300", fontSize = 20.sp)
                    OutlinedButton(onClick = { /*TODO*/ }) {
                        Text(text = "PAY", color = Color.Black)

                    }
                }
            }
            Row {
                //Column
                Column {
                    Image(
                        painter = painterResource(id = R.drawable.clothing4),
                        contentDescription = "i dont know",
                        modifier = Modifier.size(width = 180.dp, height = 200.dp)
                    )
                    Text(text = "Dress", fontSize = 20.sp)
                    Text(text = "Ksh.1300", fontSize = 20.sp)
                    OutlinedButton(onClick = { /*TODO*/ }) {
                        Text(text = "PAY", color = Color.Black)

                    }
                }
                //Column
                Column {
                    Image(
                        painter = painterResource(id = R.drawable.clothing5),
                        contentDescription = "i dont know",
                        modifier = Modifier.size(width = 180.dp, height = 200.dp)
                    )
                    Text(text = "Sweater", fontSize = 20.sp)
                    Text(text = "Ksh.1300", fontSize = 20.sp)
                    OutlinedButton(onClick = { /*TODO*/ }) {
                        Text(text = "PAY", color = Color.Black)

                    }
                }
            }
            Row {
                //Column
                Column {
                    Image(
                        painter = painterResource(id = R.drawable.clothing6),
                        contentDescription = "i dont know",
                        modifier = Modifier.size(width = 180.dp, height = 200.dp)
                    )
                    Text(text = "Shirt", fontSize = 20.sp)
                    Text(text = "Ksh.1300", fontSize = 20.sp)
                    OutlinedButton(onClick = { /*TODO*/ }) {
                        Text(text = "PAY", color = Color.Black)

                    }
                }
                //Column
                Column {
                    Image(
                        painter = painterResource(id = R.drawable.clothing7),
                        contentDescription = "i dont know",
                        modifier = Modifier.size(width = 180.dp, height = 200.dp)
                    )
                    Text(text = "Not Sock", fontSize = 20.sp)
                    Text(text = "Ksh.1300", fontSize = 20.sp)
                    OutlinedButton(onClick = { /*TODO*/ }) {
                        Text(text = "PAY", color = Color.Black)

                    }
                }
            }

        }
    }

}


@Preview(showBackground = true)
@Composable
fun ClothesPreview(){
    ClothesScreen()
}
