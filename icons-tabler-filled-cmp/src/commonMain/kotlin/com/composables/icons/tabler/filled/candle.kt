package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Candle: ImageVector
    get() {
        if (_Candle != null) return _Candle!!
        
        _Candle = ImageVector.Builder(
            name = "candle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 9f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(10f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineToRelative(-6f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineToRelative(-10f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.254f, 1.334f)
                arcToRelative(1f, 1f, 0f, false, true, 1.491f, 0f)
                lineToRelative(1.452f, 1.623f)
                arcToRelative(3f, 3f, 0f, false, true, -4.196f, 4.28f)
                curveToRelative(-1.195f, -1.07f, -1.339f, -2.889f, -0.297f, -4.166f)
                close()
            }
        }.build()
        
        return _Candle!!
    }

private var _Candle: ImageVector? = null

