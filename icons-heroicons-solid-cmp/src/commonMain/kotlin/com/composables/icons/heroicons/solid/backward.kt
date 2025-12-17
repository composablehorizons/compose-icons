package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Backward: ImageVector
    get() {
        if (_Backward != null) return _Backward!!
        
        _Backward = ImageVector.Builder(
            name = "backward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.195f, 18.44f)
                curveToRelative(1.25f, 0.714f, 2.805f, -0.189f, 2.805f, -1.629f)
                verticalLineToRelative(-2.34f)
                lineToRelative(6.945f, 3.968f)
                curveToRelative(1.25f, 0.715f, 2.805f, -0.188f, 2.805f, -1.628f)
                verticalLineTo(8.69f)
                curveToRelative(0f, -1.44f, -1.555f, -2.343f, -2.805f, -1.628f)
                lineTo(12f, 11.029f)
                verticalLineToRelative(-2.34f)
                curveToRelative(0f, -1.44f, -1.555f, -2.343f, -2.805f, -1.628f)
                lineToRelative(-7.108f, 4.061f)
                curveToRelative(-1.26f, 0.72f, -1.26f, 2.536f, 0f, 3.256f)
                lineToRelative(7.108f, 4.061f)
                close()
            }
        }.build()
        
        return _Backward!!
    }

private var _Backward: ImageVector? = null

