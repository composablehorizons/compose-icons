package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Expand_circle_down: ImageVector
    get() {
        if (_Expand_circle_down != null) return _Expand_circle_down!!
        
        _Expand_circle_down = ImageVector.Builder(
            name = "expand_circle_down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2f)
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                curveToRelative(0f, 5.52f, 4.48f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                curveTo(22f, 6.48f, 17.52f, 2f, 12f, 2f)
                close()
                moveTo(12f, 15.5f)
                lineTo(7.5f, 11f)
                lineToRelative(1.42f, -1.41f)
                lineTo(12f, 12.67f)
                lineToRelative(3.08f, -3.08f)
                lineTo(16.5f, 11f)
                lineTo(12f, 15.5f)
                close()
            }
        }.build()
        
        return _Expand_circle_down!!
    }

private var _Expand_circle_down: ImageVector? = null

