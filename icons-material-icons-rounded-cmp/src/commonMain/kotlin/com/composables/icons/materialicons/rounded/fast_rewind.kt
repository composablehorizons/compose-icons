package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Fast_rewind: ImageVector
    get() {
        if (_Fast_rewind != null) return _Fast_rewind!!
        
        _Fast_rewind = ImageVector.Builder(
            name = "fast_rewind",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11f, 16.07f)
                verticalLineTo(7.93f)
                curveToRelative(0f, -0.81f, -0.91f, -1.28f, -1.58f, -0.82f)
                lineToRelative(-5.77f, 4.07f)
                curveToRelative(-0.56f, 0.4f, -0.56f, 1.24f, 0f, 1.63f)
                lineToRelative(5.77f, 4.07f)
                curveToRelative(0.67f, 0.47f, 1.58f, 0f, 1.58f, -0.81f)
                close()
                moveToRelative(1.66f, -3.25f)
                lineToRelative(5.77f, 4.07f)
                curveToRelative(0.66f, 0.47f, 1.58f, -0.01f, 1.58f, -0.82f)
                verticalLineTo(7.93f)
                curveToRelative(0f, -0.81f, -0.91f, -1.28f, -1.58f, -0.82f)
                lineToRelative(-5.77f, 4.07f)
                curveToRelative(-0.57f, 0.4f, -0.57f, 1.24f, 0f, 1.64f)
                close()
            }
        }.build()
        
        return _Fast_rewind!!
    }

private var _Fast_rewind: ImageVector? = null

