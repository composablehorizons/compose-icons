package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Radar: ImageVector
    get() {
        if (_Radar != null) return _Radar!!
        
        _Radar = ImageVector.Builder(
            name = "radar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 10f)
                arcToRelative(2f, 2f, 0f, false, true, 1.678f, 0.911f)
                lineToRelative(0.053f, 0.089f)
                horizontalLineToRelative(7.269f)
                lineToRelative(0.117f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, true, 0.883f, 0.993f)
                curveToRelative(0f, 5.523f, -4.477f, 10f, -10f, 10f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineToRelative(-7.269f)
                lineToRelative(-0.089f, -0.053f)
                arcToRelative(2f, 2f, 0f, false, true, -0.906f, -1.529f)
                lineToRelative(-0.005f, -0.149f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                moveToRelative(9.428f, -1.334f)
                arcToRelative(1f, 1f, 0f, false, true, -1.884f, 0.668f)
                arcToRelative(8f, 8f, 0f, true, false, -10.207f, 10.218f)
                arcToRelative(1f, 1f, 0f, false, true, -0.666f, 1.886f)
                arcToRelative(10f, 10f, 0f, true, true, 12.757f, -12.772f)
                moveToRelative(-4.628f, -0.266f)
                arcToRelative(1f, 1f, 0f, false, true, -1.6f, 1.2f)
                arcToRelative(4f, 4f, 0f, true, false, -5.6f, 5.6f)
                arcToRelative(1f, 1f, 0f, false, true, -1.2f, 1.6f)
                arcToRelative(6f, 6f, 0f, true, true, 8.4f, -8.4f)
            }
        }.build()
        
        return _Radar!!
    }

private var _Radar: ImageVector? = null

