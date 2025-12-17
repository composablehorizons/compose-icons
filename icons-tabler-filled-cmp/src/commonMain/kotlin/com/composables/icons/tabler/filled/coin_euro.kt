package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.CoinEuro: ImageVector
    get() {
        if (_CoinEuro != null) return _CoinEuro!!
        
        _CoinEuro = ImageVector.Builder(
            name = "coin-euro",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 3.34f)
                arcToRelative(10f, 10f, 0f, true, true, -15f, 8.66f)
                lineToRelative(0.005f, -0.324f)
                arcToRelative(10f, 10f, 0f, false, true, 14.995f, -8.336f)
                close()
                moveToRelative(-5f, 2.66f)
                curveToRelative(-2.052f, 0f, -3.768f, 1.449f, -4.549f, 3.5f)
                horizontalLineToRelative(-0.451f)
                arcToRelative(1f, 1f, 0f, false, false, -0.117f, 1.993f)
                lineToRelative(0.134f, 0.007f)
                arcToRelative(7.298f, 7.298f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(-0.017f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
                horizontalLineToRelative(0.452f)
                curveToRelative(0.78f, 2.053f, 2.496f, 3.5f, 4.548f, 3.5f)
                curveToRelative(1.141f, 0f, 2.217f, -0.457f, 3.084f, -1.27f)
                arcToRelative(1f, 1f, 0f, false, false, -1.368f, -1.46f)
                curveToRelative(-0.509f, 0.478f, -1.102f, 0.73f, -1.716f, 0.73f)
                curveToRelative(-0.922f, 0f, -1.776f, -0.578f, -2.335f, -1.499f)
                lineToRelative(1.335f, -0.001f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
                horizontalLineToRelative(-1.977f)
                arcToRelative(5.342f, 5.342f, 0f, false, true, 0f, -1f)
                horizontalLineToRelative(1.977f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
                horizontalLineToRelative(-1.336f)
                curveToRelative(0.56f, -0.921f, 1.414f, -1.5f, 2.336f, -1.5f)
                curveToRelative(0.615f, 0f, 1.208f, 0.252f, 1.717f, 0.73f)
                arcToRelative(1f, 1f, 0f, false, false, 1.368f, -1.46f)
                curveToRelative(-0.867f, -0.812f, -1.943f, -1.27f, -3.085f, -1.27f)
                close()
            }
        }.build()
        
        return _CoinEuro!!
    }

private var _CoinEuro: ImageVector? = null

