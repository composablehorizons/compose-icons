package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Skip_previous: ImageVector
    get() {
        if (_Skip_previous != null) return _Skip_previous!!
        
        _Skip_previous = ImageVector.Builder(
            name = "skip_previous",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7f, 6f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineTo(7f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveToRelative(3.66f, 6.82f)
                lineToRelative(5.77f, 4.07f)
                curveToRelative(0.66f, 0.47f, 1.58f, -0.01f, 1.58f, -0.82f)
                verticalLineTo(7.93f)
                curveToRelative(0f, -0.81f, -0.91f, -1.28f, -1.58f, -0.82f)
                lineToRelative(-5.77f, 4.07f)
                curveToRelative(-0.57f, 0.4f, -0.57f, 1.24f, 0f, 1.64f)
                close()
            }
        }.build()
        
        return _Skip_previous!!
    }

private var _Skip_previous: ImageVector? = null

