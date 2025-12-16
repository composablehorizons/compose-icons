package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.FontStyle: ImageVector
    get() {
        if (_FontStyle != null) return _FontStyle!!
        
        _FontStyle = ImageVector.Builder(
            name = "font-style",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.2429f, 2.68752f)
                curveTo(6.91676f, 2.68752f, 7.97395f, 3.33531f, 8.43821f, 4.31056f)
                curveTo(8.57073f, 4.58896f, 8.5763f, 4.91325f, 8.22825f, 5.19142f)
                curveTo(7.88005f, 5.46962f, 7.52338f, 5.3477f, 7.23313f, 5.0381f)
                curveTo(6.4721f, 4.22638f, 5.99496f, 4.04982f, 5.25559f, 4.04982f)
                curveTo(4.13963f, 4.04992f, 3.54669f, 4.63617f, 3.54661f, 5.27931f)
                curveTo(3.54661f, 5.86581f, 3.9632f, 6.23149f, 4.947f, 6.53419f)
                lineTo(5.67845f, 6.76173f)
                curveTo(7.22975f, 7.23471f, 7.97434f, 7.96011f, 7.97434f, 9.17091f)
                curveTo(7.97412f, 10.7725f, 6.69369f, 12.0907f, 4.46165f, 12.0908f)
                curveTo(2.86634f, 12.0908f, 1.39997f, 11.1128f, 1.03782f, 9.98048f)
                curveTo(0.934859f, 9.65813f, 1.11617f, 9.3775f, 1.40013f, 9.24904f)
                curveTo(1.68407f, 9.12061f, 2.0941f, 9.13425f, 2.27024f, 9.45412f)
                curveTo(2.85336f, 10.5143f, 3.64557f, 10.7285f, 4.48606f, 10.7285f)
                curveTo(5.52662f, 10.7285f, 6.29661f, 10.2613f, 6.29661f, 9.45412f)
                curveTo(6.29655f, 8.80466f, 5.9113f, 8.46419f, 4.87083f, 8.14259f)
                lineTo(4.15891f, 7.92189f)
                curveTo(2.6454f, 7.44892f, 1.88843f, 6.69209f, 1.88841f, 5.45607f)
                curveTo(1.88841f, 3.7976f, 3.27551f, 2.68766f, 5.2429f, 2.68752f)
                close()
                moveTo(12.613f, 5.04689f)
                curveTo(13.8546f, 5.047f, 14.6624f, 5.63373f, 14.9773f, 6.63478f)
                curveTo(15.0437f, 6.846f, 14.9592f, 6.97977f, 14.7478f, 7.04884f)
                curveTo(14.5397f, 7.11667f, 14.3178f, 7.09975f, 14.238f, 6.8965f)
                curveTo(13.9357f, 6.12312f, 13.3516f, 5.76271f, 12.5993f, 5.76271f)
                curveTo(11.6466f, 5.7628f, 11.0136f, 6.25168f, 11.0134f, 6.91603f)
                curveTo(11.0134f, 7.45028f, 11.3461f, 7.75077f, 12.2468f, 8.04396f)
                lineTo(12.8347f, 8.23244f)
                curveTo(14.0618f, 8.62985f, 14.5514f, 9.13814f, 14.5515f, 10.0176f)
                curveTo(14.5515f, 11.1968f, 13.481f, 12.0438f, 11.9929f, 12.044f)
                curveTo(10.6442f, 12.044f, 9.65631f, 11.2808f, 9.41966f, 10.336f)
                curveTo(9.3653f, 10.1188f, 9.41181f, 10.0287f, 9.69993f, 9.96193f)
                curveTo(9.98836f, 9.8951f, 10.0715f, 9.89907f, 10.1716f, 10.1367f)
                curveTo(10.4556f, 10.8111f, 11.1532f, 11.3272f, 12.032f, 11.3272f)
                curveTo(12.9914f, 11.3271f, 13.6833f, 10.7801f, 13.6833f, 10.0635f)
                curveTo(13.6833f, 9.53572f, 13.3958f, 9.28835f, 12.4363f, 8.9756f)
                lineTo(11.8493f, 8.78029f)
                curveTo(10.6614f, 8.3959f, 10.1649f, 7.86125f, 10.1648f, 6.9883f)
                curveTo(10.1648f, 5.86761f, 11.1638f, 5.04689f, 12.613f, 5.04689f)
                close()
            }
        }.build()
        
        return _FontStyle!!
    }

private var _FontStyle: ImageVector? = null

