package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.CoinMonero: ImageVector
    get() {
        if (_CoinMonero != null) return _CoinMonero!!
        
        _CoinMonero = ImageVector.Builder(
            name = "coin-monero",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 11.414f)
                verticalLineToRelative(4.586f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                lineToRelative(4.66f, 0.001f)
                arcToRelative(10f, 10f, 0f, false, true, -17.32f, 0f)
                lineToRelative(4.66f, -0.001f)
                lineToRelative(0.117f, -0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 0.883f, -0.993f)
                verticalLineToRelative(-4.585f)
                lineToRelative(2.293f, 2.292f)
                lineToRelative(0.094f, 0.083f)
                arcToRelative(1f, 1f, 0f, false, false, 1.32f, -0.083f)
                lineToRelative(2.293f, -2.293f)
                close()
                moveToRelative(2f, -8.074f)
                arcToRelative(10f, 10f, 0f, false, true, 4.54f, 11.66f)
                horizontalLineToRelative(-4.54f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.89f, -1.077f, -1.337f, -1.707f, -0.707f)
                lineToRelative(-3.293f, 3.292f)
                lineToRelative(-3.293f, -3.292f)
                lineToRelative(-0.084f, -0.076f)
                curveToRelative(-0.637f, -0.514f, -1.623f, -0.07f, -1.623f, 0.783f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-4.54f)
                arcToRelative(9.991f, 9.991f, 0f, false, true, -0.46f, -3f)
                lineToRelative(0.005f, -0.324f)
                arcToRelative(10f, 10f, 0f, false, true, 14.995f, -8.336f)
                close()
            }
        }.build()
        
        return _CoinMonero!!
    }

private var _CoinMonero: ImageVector? = null

