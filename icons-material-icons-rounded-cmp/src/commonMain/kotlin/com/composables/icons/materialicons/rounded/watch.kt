package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Watch: ImageVector
    get() {
        if (_Watch != null) return _Watch!!
        
        _Watch = ImageVector.Builder(
            name = "watch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20f, 12f)
                curveToRelative(0f, -2.54f, -1.19f, -4.81f, -3.04f, -6.27f)
                lineToRelative(-0.68f, -4.06f)
                curveTo(16.12f, 0.71f, 15.28f, 0f, 14.31f, 0f)
                horizontalLineTo(9.7f)
                curveToRelative(-0.98f, 0f, -1.82f, 0.71f, -1.98f, 1.67f)
                lineToRelative(-0.67f, 4.06f)
                curveTo(5.19f, 7.19f, 4f, 9.45f, 4f, 12f)
                reflectiveCurveToRelative(1.19f, 4.81f, 3.05f, 6.27f)
                lineToRelative(0.67f, 4.06f)
                curveToRelative(0.16f, 0.96f, 1f, 1.67f, 1.98f, 1.67f)
                horizontalLineToRelative(4.61f)
                curveToRelative(0.98f, 0f, 1.81f, -0.71f, 1.97f, -1.67f)
                lineToRelative(0.68f, -4.06f)
                curveTo(18.81f, 16.81f, 20f, 14.54f, 20f, 12f)
                close()
                moveTo(6f, 12f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                close()
            }
        }.build()
        
        return _Watch!!
    }

private var _Watch: ImageVector? = null

