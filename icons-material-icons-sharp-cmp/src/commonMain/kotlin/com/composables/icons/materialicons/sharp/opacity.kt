package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Opacity: ImageVector
    get() {
        if (_Opacity != null) return _Opacity!!
        
        _Opacity = ImageVector.Builder(
            name = "opacity",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(24f, 0f)
                horizontalLineTo(0f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(24f)
                verticalLineTo(0f)
                close()
                moveToRelative(0f, 0f)
                horizontalLineTo(0f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(24f)
                verticalLineTo(0f)
                close()
                moveTo(0f, 24f)
                horizontalLineToRelative(24f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                verticalLineToRelative(24f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17.66f, 8f)
                lineTo(12f, 2.35f)
                lineTo(6.34f, 8f)
                curveTo(4.78f, 9.56f, 4f, 11.64f, 4f, 13.64f)
                reflectiveCurveToRelative(0.78f, 4.11f, 2.34f, 5.67f)
                reflectiveCurveToRelative(3.61f, 2.35f, 5.66f, 2.35f)
                reflectiveCurveToRelative(4.1f, -0.79f, 5.66f, -2.35f)
                reflectiveCurveTo(20f, 15.64f, 20f, 13.64f)
                reflectiveCurveTo(19.22f, 9.56f, 17.66f, 8f)
                close()
                moveTo(6f, 14f)
                curveToRelative(0.01f, -2f, 0.62f, -3.27f, 1.76f, -4.4f)
                lineTo(12f, 5.27f)
                lineToRelative(4.24f, 4.38f)
                curveTo(17.38f, 10.77f, 17.99f, 12f, 18f, 14f)
                horizontalLineTo(6f)
                close()
            }
        }.build()
        
        return _Opacity!!
    }

private var _Opacity: ImageVector? = null

