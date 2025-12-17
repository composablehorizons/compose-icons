package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Local_activity: ImageVector
    get() {
        if (_Local_activity != null) return _Local_activity!!
        
        _Local_activity = ImageVector.Builder(
            name = "local_activity",
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
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.01f, 8.54f)
                curveTo(5.2f, 9.23f, 6f, 10.52f, 6f, 12f)
                reflectiveCurveToRelative(-0.81f, 2.77f, -2f, 3.46f)
                verticalLineTo(18f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-2.54f)
                curveToRelative(-1.19f, -0.69f, -2f, -1.99f, -2f, -3.46f)
                reflectiveCurveToRelative(0.81f, -2.77f, 2f, -3.46f)
                verticalLineTo(6f)
                horizontalLineTo(4f)
                lineToRelative(0.01f, 2.54f)
                close()
                moveToRelative(6.72f, 1.68f)
                lineTo(12f, 7f)
                lineToRelative(1.26f, 3.23f)
                lineToRelative(3.47f, 0.2f)
                lineToRelative(-2.69f, 2.2f)
                lineToRelative(0.89f, 3.37f)
                lineTo(12f, 14.12f)
                lineTo(9.07f, 16f)
                lineToRelative(0.88f, -3.37f)
                lineToRelative(-2.69f, -2.2f)
                lineToRelative(3.47f, -0.21f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20f, 4f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -1.99f, 0.9f, -1.99f, 2f)
                verticalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 1.99f, 0.9f, 1.99f, 2f)
                reflectiveCurveToRelative(-0.89f, 2f, -2f, 2f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(16f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-4f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                verticalLineTo(6f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(0f, 4.54f)
                curveToRelative(-1.19f, 0.69f, -2f, 1.99f, -2f, 3.46f)
                reflectiveCurveToRelative(0.81f, 2.77f, 2f, 3.46f)
                verticalLineTo(18f)
                horizontalLineTo(4f)
                verticalLineToRelative(-2.54f)
                curveToRelative(1.19f, -0.69f, 2f, -1.99f, 2f, -3.46f)
                curveToRelative(0f, -1.48f, -0.8f, -2.77f, -1.99f, -3.46f)
                lineTo(4f, 6f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(2.54f)
                close()
                moveTo(9.07f, 16f)
                lineTo(12f, 14.12f)
                lineTo(14.93f, 16f)
                lineToRelative(-0.89f, -3.36f)
                lineToRelative(2.69f, -2.2f)
                lineToRelative(-3.47f, -0.21f)
                lineTo(12f, 7f)
                lineToRelative(-1.27f, 3.22f)
                lineToRelative(-3.47f, 0.21f)
                lineToRelative(2.69f, 2.2f)
                close()
            }
        }.build()
        
        return _Local_activity!!
    }

private var _Local_activity: ImageVector? = null

