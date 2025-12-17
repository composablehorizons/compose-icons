package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Skip_next: ImageVector
    get() {
        if (_Skip_next != null) return _Skip_next!!
        
        _Skip_next = ImageVector.Builder(
            name = "skip_next",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.58f, 16.89f)
                lineToRelative(5.77f, -4.07f)
                curveToRelative(0.56f, -0.4f, 0.56f, -1.24f, 0f, -1.63f)
                lineTo(7.58f, 7.11f)
                curveTo(6.91f, 6.65f, 6f, 7.12f, 6f, 7.93f)
                verticalLineToRelative(8.14f)
                curveToRelative(0f, 0.81f, 0.91f, 1.28f, 1.58f, 0.82f)
                close()
                moveTo(16f, 7f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineTo(7f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                close()
            }
        }.build()
        
        return _Skip_next!!
    }

private var _Skip_next: ImageVector? = null

