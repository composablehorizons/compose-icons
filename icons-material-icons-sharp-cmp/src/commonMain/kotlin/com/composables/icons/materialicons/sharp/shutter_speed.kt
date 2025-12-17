package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Shutter_speed: ImageVector
    get() {
        if (_Shutter_speed != null) return _Shutter_speed!!
        
        _Shutter_speed = ImageVector.Builder(
            name = "shutter_speed",
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
                moveTo(15f, 1f)
                horizontalLineTo(9f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                verticalLineTo(1f)
                close()
                moveToRelative(4.03f, 6.39f)
                lineToRelative(1.42f, -1.42f)
                curveToRelative(-0.43f, -0.51f, -0.9f, -0.99f, -1.41f, -1.41f)
                lineToRelative(-1.42f, 1.42f)
                curveTo(16.07f, 4.74f, 14.12f, 4f, 12f, 4f)
                curveToRelative(-4.97f, 0f, -9f, 4.03f, -9f, 9f)
                reflectiveCurveToRelative(4.02f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.03f, 9f, -9f)
                curveToRelative(0f, -2.12f, -0.74f, -4.07f, -1.97f, -5.61f)
                close()
                moveTo(12f, 20f)
                curveToRelative(-3.87f, 0f, -7f, -3.13f, -7f, -7f)
                reflectiveCurveToRelative(3.13f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.13f, 7f, 7f)
                reflectiveCurveToRelative(-3.13f, 7f, -7f, 7f)
                close()
                moveToRelative(-0.32f, -5f)
                horizontalLineTo(6.35f)
                curveToRelative(0.57f, 1.62f, 1.82f, 2.92f, 3.41f, 3.56f)
                lineToRelative(-0.11f, -0.06f)
                lineToRelative(2.03f, -3.5f)
                close()
                moveToRelative(5.97f, -4f)
                curveToRelative(-0.57f, -1.6f, -1.78f, -2.89f, -3.34f, -3.54f)
                lineTo(12.26f, 11f)
                horizontalLineToRelative(5.39f)
                close()
                moveToRelative(-7.04f, 7.83f)
                curveToRelative(0.45f, 0.11f, 0.91f, 0.17f, 1.39f, 0.17f)
                curveToRelative(1.34f, 0f, 2.57f, -0.45f, 3.57f, -1.19f)
                lineToRelative(-2.11f, -3.9f)
                lineToRelative(-2.85f, 4.92f)
                close()
                moveTo(7.55f, 8.99f)
                curveTo(6.59f, 10.05f, 6f, 11.46f, 6f, 13f)
                curveToRelative(0f, 0.34f, 0.04f, 0.67f, 0.09f, 1f)
                horizontalLineToRelative(4.72f)
                lineTo(7.55f, 8.99f)
                close()
                moveToRelative(8.79f, 8.14f)
                curveTo(17.37f, 16.06f, 18f, 14.6f, 18f, 13f)
                curveToRelative(0f, -0.34f, -0.04f, -0.67f, -0.09f, -1f)
                horizontalLineToRelative(-4.34f)
                lineToRelative(2.77f, 5.13f)
                close()
                moveToRelative(-3.01f, -9.98f)
                curveTo(12.9f, 7.06f, 12.46f, 7f, 12f, 7f)
                curveToRelative(-1.4f, 0f, -2.69f, 0.49f, -3.71f, 1.29f)
                lineToRelative(2.32f, 3.56f)
                lineToRelative(2.72f, -4.7f)
                close()
            }
        }.build()
        
        return _Shutter_speed!!
    }

private var _Shutter_speed: ImageVector? = null

