package com.example.kopidannyemil.ui.checkout

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.kopidannyemil.data.MenuItem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddressScreen(
    selectedItem: MenuItem,
    onProceedToConfirmation: (address: String, note: String, paymentMethod: String) -> Unit
) {
    var address by remember { mutableStateOf("") }
    var note by remember { mutableStateOf("") }
    var paymentMethod by remember { mutableStateOf("QRIS") }

    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Alamat Pengiriman") })
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Card(modifier = Modifier.fillMaxWidth()) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text("Item yang Dipesan", style = MaterialTheme.typography.titleMedium)
                    Spacer(modifier = Modifier.height(4.dp))
                    Text("${selectedItem.name} (${selectedItem.price})", style = MaterialTheme.typography.bodyLarge)
                }
            }

            OutlinedTextField(
                value = address,
                onValueChange = { address = it },
                label = { Text("Alamat Lengkap (Jl, No. Rumah, Patokan)") },
                placeholder = { Text("Jl. A.H. Nasution No. 105, Cipadung, Bandung") },
                modifier = Modifier.fillMaxWidth(),
                minLines = 3
            )

            OutlinedTextField(
                value = note,
                onValueChange = { note = it },
                label = { Text("Catatan untuk Kurir (Contoh: Jangan terlalu manis)") },
                modifier = Modifier.fillMaxWidth()
            )

            Text(text = "Metode Pembayaran", style = MaterialTheme.typography.titleMedium)

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Button(
                    onClick = { paymentMethod = "QRIS" },
                    modifier = Modifier.weight(1f),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = if (paymentMethod == "QRIS") MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.secondary
                    )
                ) {
                    Text("QRIS")
                }
                Button(
                    onClick = { paymentMethod = "Cash" },
                    modifier = Modifier.weight(1f),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = if (paymentMethod == "Cash") MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.secondary
                    )
                ) {
                    Text("Cash (COD)")
                }
            }

            Spacer(modifier = Modifier.weight(1f))

            Button(
                onClick = {
                    val finalAddress = address.ifBlank { "Jl. A.H. Nasution No. 105, Cipadung, Cibiru, Bandung" }
                    onProceedToConfirmation(finalAddress, note, paymentMethod)
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Lanjut ke Konfirmasi Pesanan")
            }
        }
    }
}