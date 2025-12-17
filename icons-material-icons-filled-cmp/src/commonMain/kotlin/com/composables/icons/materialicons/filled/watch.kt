package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Watch: ImageVector
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
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20f, 12f)
                curveToRelative(0f, -2.54f, -1.19f, -4.81f, -3.04f, -6.27f)
                lineTo(16f, 0f)
                horizontalLineTo(8f)
                lineToRelative(-0.95f, 5.73f)
                curveTo(5.19f, 7.19f, 4f, 9.45f, 4f, 12f)
                reflectiveCurveToRelative(1.19f, 4.81f, 3.05f, 6.27f)
                lineTo(8f, 24f)
                horizontalLineToRelative(8f)
                lineToRelative(0.96f, -5.73f)
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

