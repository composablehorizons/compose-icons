package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Change_circle: ImageVector
    get() {
        if (_Change_circle != null) return _Change_circle!!
        
        _Change_circle = ImageVector.Builder(
            name = "change_circle",
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
                moveTo(12.06f, 19f)
                verticalLineToRelative(-2.01f)
                curveToRelative(-0.02f, 0f, -0.04f, 0f, -0.06f, 0f)
                curveToRelative(-1.28f, 0f, -2.56f, -0.49f, -3.54f, -1.46f)
                curveToRelative(-1.71f, -1.71f, -1.92f, -4.35f, -0.64f, -6.29f)
                lineToRelative(1.1f, 1.1f)
                curveToRelative(-0.71f, 1.33f, -0.53f, 3.01f, 0.59f, 4.13f)
                curveToRelative(0.7f, 0.7f, 1.62f, 1.03f, 2.54f, 1.01f)
                verticalLineToRelative(-2.14f)
                lineToRelative(2.83f, 2.83f)
                lineTo(12.06f, 19f)
                close()
                moveTo(16.17f, 14.76f)
                lineToRelative(-1.1f, -1.1f)
                curveToRelative(0.71f, -1.33f, 0.53f, -3.01f, -0.59f, -4.13f)
                curveTo(13.79f, 8.84f, 12.9f, 8.5f, 12f, 8.5f)
                curveToRelative(-0.02f, 0f, -0.04f, 0f, -0.06f, 0f)
                verticalLineToRelative(2.15f)
                lineTo(9.11f, 7.83f)
                lineTo(11.94f, 5f)
                verticalLineToRelative(2.02f)
                curveToRelative(1.3f, -0.02f, 2.61f, 0.45f, 3.6f, 1.45f)
                curveTo(17.24f, 10.17f, 17.45f, 12.82f, 16.17f, 14.76f)
                close()
            }
        }.build()
        
        return _Change_circle!!
    }

private var _Change_circle: ImageVector? = null

