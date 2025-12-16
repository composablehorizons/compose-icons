package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.People: ImageVector
    get() {
        if (_People != null) return _People!!
        
        _People = ImageVector.Builder(
            name = "people",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 8.90039f)
                curveTo(6.43913f, 8.90046f, 7.6804f, 9.15211f, 8.5752f, 9.75488f)
                curveTo(9.50225f, 10.3797f, 10f, 11.3432f, 10f, 12.6006f)
                curveTo(9.99965f, 12.8763f, 9.77567f, 13.1003f, 9.5f, 13.1006f)
                curveTo(9.22426f, 13.1004f, 9.00035f, 12.8763f, 9f, 12.6006f)
                curveTo(9.00002f, 11.643f, 8.64164f, 11.0053f, 8.0166f, 10.584f)
                curveTo(7.35911f, 10.1411f, 6.3499f, 9.90046f, 5f, 9.90039f)
                curveTo(3.65022f, 9.90044f, 2.6409f, 10.1412f, 1.9834f, 10.584f)
                curveTo(1.35846f, 11.0053f, 1f, 11.643f, 1f, 12.6006f)
                curveTo(0.999652f, 12.8763f, 0.775703f, 13.1003f, 0.5f, 13.1006f)
                curveTo(0.224252f, 13.1004f, 3.48561E-4f, 12.8763f, 0f, 12.6006f)
                curveTo(0f, 11.3434f, 0.49706f, 10.3797f, 1.42383f, 9.75488f)
                curveTo(2.31864f, 9.15205f, 3.56076f, 8.90044f, 5f, 8.90039f)
                close()
                moveTo(9.97461f, 8.90039f)
                curveTo(11.4139f, 8.9004f, 12.6549f, 9.15204f, 13.5498f, 9.75488f)
                curveTo(14.4771f, 10.3797f, 14.9746f, 11.343f, 14.9746f, 12.6006f)
                curveTo(14.9743f, 12.8764f, 14.7505f, 13.1006f, 14.4746f, 13.1006f)
                curveTo(14.1989f, 13.1004f, 13.975f, 12.8763f, 13.9746f, 12.6006f)
                curveTo(13.9746f, 11.6428f, 13.6165f, 11.0053f, 12.9912f, 10.584f)
                curveTo(12.4734f, 10.2352f, 11.7376f, 10.0138f, 10.7891f, 9.93457f)
                curveTo(10.5558f, 9.55417f, 10.2666f, 9.20728f, 9.91992f, 8.90137f)
                curveTo(9.93812f, 8.90129f, 9.95635f, 8.90039f, 9.97461f, 8.90039f)
                close()
                moveTo(5.00098f, 1.84961f)
                curveTo(6.74004f, 1.8502f, 8.15018f, 3.26085f, 8.15039f, 5f)
                curveTo(8.15018f, 6.73915f, 6.74004f, 8.14882f, 5.00098f, 8.14941f)
                curveTo(3.26141f, 8.14941f, 1.8508f, 6.73951f, 1.85059f, 5f)
                curveTo(1.8508f, 3.26048f, 3.26141f, 1.84961f, 5.00098f, 1.84961f)
                close()
                moveTo(9.97559f, 1.84961f)
                curveTo(11.7149f, 1.84994f, 13.1248f, 3.26069f, 13.125f, 5f)
                curveTo(13.1248f, 6.73931f, 11.7149f, 8.14908f, 9.97559f, 8.14941f)
                curveTo(9.45224f, 8.14941f, 8.95974f, 8.01975f, 8.52539f, 7.79395f)
                curveTo(8.73332f, 7.53194f, 8.91351f, 7.24709f, 9.05957f, 6.94238f)
                curveTo(9.33776f, 7.07372f, 9.64758f, 7.14941f, 9.97559f, 7.14941f)
                curveTo(11.1626f, 7.14908f, 12.1248f, 6.18703f, 12.125f, 5f)
                curveTo(12.1248f, 3.81297f, 11.1626f, 2.84994f, 9.97559f, 2.84961f)
                curveTo(9.64775f, 2.84961f, 9.33765f, 2.92435f, 9.05957f, 3.05566f)
                curveTo(8.91343f, 2.75109f, 8.73336f, 2.46598f, 8.52539f, 2.2041f)
                curveTo(8.95962f, 1.97833f, 9.45244f, 1.84961f, 9.97559f, 1.84961f)
                close()
                moveTo(5.00098f, 2.84961f)
                curveTo(3.81369f, 2.84961f, 2.8508f, 3.81277f, 2.85059f, 5f)
                curveTo(2.8508f, 6.18723f, 3.8137f, 7.14941f, 5.00098f, 7.14941f)
                curveTo(6.18775f, 7.14882f, 7.15018f, 6.18686f, 7.15039f, 5f)
                curveTo(7.15018f, 3.81313f, 6.18775f, 2.8502f, 5.00098f, 2.84961f)
                close()
            }
        }.build()
        
        return _People!!
    }

private var _People: ImageVector? = null

