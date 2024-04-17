package com.example.firebasestorage.ui.theme.screens.dashboard

import android.content.Intent
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.firebasestorage.InsertActivity
import com.example.firebasestorage.R
import com.example.firebasestorage.navigation.ROUT_CLOTHES
import com.example.firebasestorage.navigation.ROUT_DETAILS
import com.example.firebasestorage.ui.theme.lBlue
import com.example.firebasestorage.ui.theme.screens.clothes.ClothesScreen

@Composable
fun DashBoardScreen(navController:NavHostController) {
    Column(modifier = Modifier.fillMaxSize()) {
        val mContext = LocalContext.current
//Start of TopAppBar
        TopAppBar (title = {Text(text = "Amazon Shop")},
            backgroundColor = Color.Blue)
        //End of TopAppBar

        Spacer(modifier = Modifier.height(30.dp))
//Beginning of Row
        Row (modifier = Modifier.padding(start = 20.dp, end=20.dp)){
            Column {
                Text(text = "Amazon" ,fontSize = 35.sp, color = Color.Blue, fontWeight = FontWeight.ExtraBold, fontFamily = FontFamily.Default)
                Text(text = "Shop from A-Z", fontSize = 15.sp)
            }

            Image(painter = painterResource(id = R.drawable.img),
                contentDescription = "icon",
                modifier = Modifier.size(100.dp)
            )
        }
//End of Row
        Spacer(modifier = Modifier.height(30.dp))

        Column (modifier = Modifier.padding(start = 20.dp,)){
            //Row1
            val mContext = LocalContext.current
            Row {
                Card (modifier = Modifier
                    .size(width = 200.dp, height = 120.dp)
                    .clickable {
                    },
                    elevation = 20.dp
                ){
                    Column {
                        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                            Image(painter = painterResource(id = R.drawable.cloth), contentDescription ="Amazon" ,
                                modifier = Modifier
                                    .size(50.dp)
                                    .clip(shape = CircleShape),
                                contentScale = ContentScale.Crop
                            )
                        }
                        Text(text = "Clothing",
                            fontSize = 20.sp,
                            color = Color.Blue,
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable {
                                    navController.navigate(ROUT_CLOTHES)
                                    Toast.makeText(mContext, "Go to clothing screen!",
                                        Toast.LENGTH_SHORT).show()
                                },
                            textAlign = TextAlign.Center
                        )

                    }
                }

                Spacer(modifier = Modifier.width(20.dp))

                Card (modifier = Modifier.size(width = 200.dp,height = 120.dp),
                    elevation = 20.dp
                ){
                    Column {
                        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                            Image(painter = painterResource(id = R.drawable.electronics), contentDescription ="Amazon" ,
                                modifier = Modifier
                                    .size(50.dp)
                                    .clip(shape = CircleShape),
                                contentScale = ContentScale.Crop
                            )
                        }
                        Text(text = "Electronics",
                            fontSize = 20.sp,
                            color = Color.Blue,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )
                    }

                }
            }
            //End of Row1

            Spacer(modifier = Modifier.height(10.dp))
            //Row2
            Row {
                Card (modifier = Modifier.size(width = 200.dp,height = 120.dp),
                    elevation = 20.dp
                ){
                    Column {
                        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                            Image(painter = painterResource(id = R.drawable.home), contentDescription ="Amazon" ,
                                modifier = Modifier
                                    .size(50.dp)
                                    .clip(shape = CircleShape),
                                contentScale = ContentScale.Crop
                            )
                        }
                        Text(text = "Home",
                            fontSize = 20.sp,
                            color = Color.Blue,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )

                    }
                }

                Spacer(modifier = Modifier.width(20.dp))

                Card (modifier = Modifier.size(width = 200.dp,height = 120.dp),
                    elevation = 20.dp
                ){
                    Column {
                        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                            Image(painter = painterResource(id = R.drawable.beauty), contentDescription ="Amazon" ,
                                modifier = Modifier
                                    .size(50.dp)
                                    .clip(shape = CircleShape),
                                contentScale = ContentScale.Crop
                            )
                        }
                        Text(text = "Beauty",
                            fontSize = 20.sp,
                            color = Color.Blue,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )
                    }

                }
            }
            //End of Row2

            Spacer(modifier = Modifier.height(10.dp))
            //Row3
            Row {
                Card (modifier = Modifier.size(width = 200.dp,height = 120.dp),
                    elevation = 20.dp
                ){
                    Column {
                        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                            Image(painter = painterResource(id = R.drawable.pharmacy), contentDescription ="Amazon" ,
                                modifier = Modifier
                                    .size(50.dp)
                                    .clip(shape = CircleShape),
                                contentScale = ContentScale.Crop
                            )
                        }
                        Text(text = "Pharmacy",
                            fontSize = 20.sp,
                            color = Color.Blue,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )

                    }
                }

                Spacer(modifier = Modifier.width(20.dp))

                Card (modifier = Modifier.size(width = 200.dp,height = 120.dp),
                    elevation = 20.dp
                ){
                    Column {
                        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                            Image(painter = painterResource(id = R.drawable.groceries), contentDescription ="Amazon" ,
                                modifier = Modifier
                                    .size(50.dp)
                                    .clip(shape = CircleShape),
                                contentScale = ContentScale.Crop
                            )
                        }
                        Text(text = "Groceries",
                            fontSize = 20.sp,
                            color = Color.Blue,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )
                    }

                }
            }
            //End of Row3

            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Register",
                color = lBlue,
                modifier = Modifier
                    .clickable {
                        navController.navigate(ROUT_DETAILS)
                        Toast.makeText(mContext, "Register!",
                            Toast.LENGTH_SHORT).show()

                    }
                    .padding(8.dp)
            )





        }

    }



}

@Preview
@Composable()
fun DashBoardScreenPreview() {
    DashBoardScreen(rememberNavController())
}