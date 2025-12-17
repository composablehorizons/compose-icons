package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Group_off: ImageVector
    get() {
        if (_Group_off != null) return _Group_off!!
        
        _Group_off = ImageVector.Builder(
            name = "group_off",
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
                moveTo(15f, 8f)
                curveToRelative(0f, -1.42f, -0.5f, -2.73f, -1.33f, -3.76f)
                curveTo(14.09f, 4.1f, 14.53f, 4f, 15f, 4f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                curveToRelative(-0.06f, 0f, -0.12f, 0f, -0.18f, 0f)
                lineToRelative(-0.77f, -0.77f)
                curveTo(14.65f, 10.29f, 15f, 9.18f, 15f, 8f)
                close()
                moveTo(7.24f, 4.41f)
                curveTo(7.77f, 4.15f, 8.37f, 4f, 9f, 4f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                curveToRelative(0f, 0.63f, -0.15f, 1.23f, -0.41f, 1.76f)
                lineTo(7.24f, 4.41f)
                close()
                moveTo(21.19f, 21.19f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                reflectiveCurveToRelative(-1.02f, 0.39f, -1.41f, 0f)
                lineToRelative(-2.99f, -2.99f)
                curveTo(16.6f, 19.85f, 16.32f, 20f, 16f, 20f)
                horizontalLineTo(2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -2.66f, 5.33f, -4f, 8f, -4f)
                curveToRelative(0.37f, 0f, 0.8f, 0.03f, 1.25f, 0.08f)
                lineTo(9.17f, 12f)
                curveTo(9.11f, 12f, 9.06f, 12f, 9f, 12f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                curveToRelative(0f, -0.06f, 0f, -0.11f, 0f, -0.17f)
                lineTo(1.39f, 4.22f)
                curveTo(1f, 3.83f, 1f, 3.2f, 1.39f, 2.81f)
                reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0f)
                lineTo(21.19f, 21.19f)
                close()
                moveTo(18.89f, 16.07f)
                curveToRelative(-0.29f, -1.22f, -1.13f, -2.19f, -2.23f, -2.94f)
                curveTo(19.42f, 13.53f, 23f, 14.82f, 23f, 17f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.32f, -0.15f, 0.6f, -0.38f, 0.79f)
                lineTo(18.89f, 16.07f)
                close()
            }
        }.build()
        
        return _Group_off!!
    }

private var _Group_off: ImageVector? = null

