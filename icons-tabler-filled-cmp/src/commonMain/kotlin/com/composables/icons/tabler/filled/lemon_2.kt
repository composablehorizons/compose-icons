package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Lemon2: ImageVector
    get() {
        if (_Lemon2 != null) return _Lemon2!!
        
        _Lemon2 = ImageVector.Builder(
            name = "lemon-2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18f, 3f)
                arcToRelative(3f, 3f, 0f, false, true, 2.443f, 4.742f)
                lineToRelative(-0.06f, 0.076f)
                lineToRelative(0.037f, 0.087f)
                curveToRelative(1.269f, 3.187f, 0.428f, 7.084f, -2.203f, 9.872f)
                lineToRelative(-0.217f, 0.223f)
                curveToRelative(-2.8f, 2.8f, -6.823f, 3.723f, -10.095f, 2.42f)
                lineToRelative(-0.087f, -0.036f)
                lineToRelative(-0.133f, 0.098f)
                arcToRelative(3f, 3f, 0f, false, true, -2.11f, 0.488f)
                lineToRelative(-0.205f, -0.036f)
                arcToRelative(3f, 3f, 0f, false, true, -1.852f, -4.62f)
                lineToRelative(0.098f, -0.134f)
                lineToRelative(-0.036f, -0.085f)
                curveToRelative(-1.269f, -3.187f, -0.428f, -7.084f, 2.203f, -9.872f)
                lineToRelative(0.217f, -0.223f)
                curveToRelative(2.8f, -2.8f, 6.823f, -3.723f, 10.095f, -2.42f)
                lineToRelative(0.085f, 0.037f)
                lineToRelative(0.124f, -0.091f)
                arcToRelative(3f, 3f, 0f, false, true, 1.493f, -0.52f)
                close()
            }
        }.build()
        
        return _Lemon2!!
    }

private var _Lemon2: ImageVector? = null

