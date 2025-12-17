package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Fast_forward: ImageVector
    get() {
        if (_Fast_forward != null) return _Fast_forward!!
        
        _Fast_forward = ImageVector.Builder(
            name = "fast_forward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.58f, 16.89f)
                lineToRelative(5.77f, -4.07f)
                curveToRelative(0.56f, -0.4f, 0.56f, -1.24f, 0f, -1.63f)
                lineTo(5.58f, 7.11f)
                curveTo(4.91f, 6.65f, 4f, 7.12f, 4f, 7.93f)
                verticalLineToRelative(8.14f)
                curveToRelative(0f, 0.81f, 0.91f, 1.28f, 1.58f, 0.82f)
                close()
                moveTo(13f, 7.93f)
                verticalLineToRelative(8.14f)
                curveToRelative(0f, 0.81f, 0.91f, 1.28f, 1.58f, 0.82f)
                lineToRelative(5.77f, -4.07f)
                curveToRelative(0.56f, -0.4f, 0.56f, -1.24f, 0f, -1.63f)
                lineToRelative(-5.77f, -4.07f)
                curveToRelative(-0.67f, -0.47f, -1.58f, 0f, -1.58f, 0.81f)
                close()
            }
        }.build()
        
        return _Fast_forward!!
    }

private var _Fast_forward: ImageVector? = null

