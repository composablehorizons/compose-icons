package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Pause: ImageVector
    get() {
        if (_Pause != null) return _Pause!!
        
        _Pause = ImageVector.Builder(
            name = "pause",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.49982f, 2.19999f)
                curveTo(5.80351f, 2.19999f, 6.04952f, 2.44613f, 6.04962f, 2.74979f)
                verticalLineTo(12.2498f)
                curveTo(6.04962f, 12.5536f, 5.80357f, 12.7996f, 5.49982f, 12.7996f)
                curveTo(5.19615f, 12.7995f, 4.95001f, 12.5535f, 4.95001f, 12.2498f)
                verticalLineTo(2.74979f)
                curveTo(4.95012f, 2.44619f, 5.19622f, 2.20009f, 5.49982f, 2.19999f)
                close()
                moveTo(9.49982f, 2.19999f)
                curveTo(9.80351f, 2.19999f, 10.0495f, 2.44613f, 10.0496f, 2.74979f)
                verticalLineTo(12.2498f)
                curveTo(10.0496f, 12.5536f, 9.80357f, 12.7996f, 9.49982f, 12.7996f)
                curveTo(9.19615f, 12.7995f, 8.95001f, 12.5535f, 8.95001f, 12.2498f)
                verticalLineTo(2.74979f)
                curveTo(8.95012f, 2.44619f, 9.19622f, 2.20009f, 9.49982f, 2.19999f)
                close()
            }
        }.build()
        
        return _Pause!!
    }

private var _Pause: ImageVector? = null

