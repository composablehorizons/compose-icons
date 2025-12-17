package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Syringe: ImageVector
    get() {
        if (_Syringe != null) return _Syringe!!
        
        _Syringe = ImageVector.Builder(
            name = "syringe",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(201.5f, 174.8f)
                lineToRelative(55.7f, 55.8f)
                curveToRelative(3.1f, 3.1f, 3.1f, 8.2f, 0f, 11.3f)
                lineToRelative(-11.3f, 11.3f)
                curveToRelative(-3.1f, 3.1f, -8.2f, 3.1f, -11.3f, 0f)
                lineToRelative(-55.7f, -55.8f)
                lineToRelative(-45.3f, 45.3f)
                lineToRelative(55.8f, 55.8f)
                curveToRelative(3.1f, 3.1f, 3.1f, 8.2f, 0f, 11.3f)
                lineToRelative(-11.3f, 11.3f)
                curveToRelative(-3.1f, 3.1f, -8.2f, 3.1f, -11.3f, 0f)
                lineTo(111f, 265.2f)
                lineToRelative(-26.4f, 26.4f)
                curveToRelative(-17.3f, 17.3f, -25.6f, 41.1f, -23f, 65.4f)
                lineToRelative(7.1f, 63.6f)
                lineTo(2.3f, 487f)
                curveToRelative(-3.1f, 3.1f, -3.1f, 8.2f, 0f, 11.3f)
                lineToRelative(11.3f, 11.3f)
                curveToRelative(3.1f, 3.1f, 8.2f, 3.1f, 11.3f, 0f)
                lineToRelative(66.3f, -66.3f)
                lineToRelative(63.6f, 7.1f)
                curveToRelative(23.9f, 2.6f, 47.9f, -5.4f, 65.4f, -23f)
                lineToRelative(181.9f, -181.9f)
                lineToRelative(-135.7f, -135.7f)
                lineToRelative(-64.9f, 65f)
                close()
                moveToRelative(308.2f, -93.3f)
                lineTo(430.5f, 2.3f)
                curveToRelative(-3.1f, -3.1f, -8.2f, -3.1f, -11.3f, 0f)
                lineToRelative(-11.3f, 11.3f)
                curveToRelative(-3.1f, 3.1f, -3.1f, 8.2f, 0f, 11.3f)
                lineToRelative(28.3f, 28.3f)
                lineToRelative(-45.3f, 45.3f)
                lineToRelative(-56.6f, -56.6f)
                lineToRelative(-17f, -17f)
                curveToRelative(-3.1f, -3.1f, -8.2f, -3.1f, -11.3f, 0f)
                lineToRelative(-33.9f, 33.9f)
                curveToRelative(-3.1f, 3.1f, -3.1f, 8.2f, 0f, 11.3f)
                lineToRelative(17f, 17f)
                lineTo(424.8f, 223f)
                lineToRelative(17f, 17f)
                curveToRelative(3.1f, 3.1f, 8.2f, 3.1f, 11.3f, 0f)
                lineToRelative(33.9f, -34f)
                curveToRelative(3.1f, -3.1f, 3.1f, -8.2f, 0f, -11.3f)
                lineToRelative(-73.5f, -73.5f)
                lineToRelative(45.3f, -45.3f)
                lineToRelative(28.3f, 28.3f)
                curveToRelative(3.1f, 3.1f, 8.2f, 3.1f, 11.3f, 0f)
                lineToRelative(11.3f, -11.3f)
                curveToRelative(3.1f, -3.2f, 3.1f, -8.2f, 0f, -11.4f)
                close()
            }
        }.build()
        
        return _Syringe!!
    }

private var _Syringe: ImageVector? = null

