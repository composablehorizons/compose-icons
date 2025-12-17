package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Task_alt: ImageVector
    get() {
        if (_Task_alt != null) return _Task_alt!!
        
        _Task_alt = ImageVector.Builder(
            name = "task_alt",
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
                moveTo(22f, 5.18f)
                lineTo(10.59f, 16.6f)
                lineToRelative(-4.24f, -4.24f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.83f, 2.83f)
                lineToRelative(10f, -10f)
                lineTo(22f, 5.18f)
                close()
                moveTo(19.79f, 10.22f)
                curveTo(19.92f, 10.79f, 20f, 11.39f, 20f, 12f)
                curveToRelative(0f, 4.42f, -3.58f, 8f, -8f, 8f)
                reflectiveCurveToRelative(-8f, -3.58f, -8f, -8f)
                curveToRelative(0f, -4.42f, 3.58f, -8f, 8f, -8f)
                curveToRelative(1.58f, 0f, 3.04f, 0.46f, 4.28f, 1.25f)
                lineToRelative(1.44f, -1.44f)
                curveTo(16.1f, 2.67f, 14.13f, 2f, 12f, 2f)
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                curveToRelative(0f, 5.52f, 4.48f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                curveToRelative(0f, -1.19f, -0.22f, -2.33f, -0.6f, -3.39f)
                lineTo(19.79f, 10.22f)
                close()
            }
        }.build()
        
        return _Task_alt!!
    }

private var _Task_alt: ImageVector? = null

