package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Shutter_speed: ImageVector
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
                moveTo(12f, 6f)
                curveToRelative(-3.87f, 0f, -7f, 3.13f, -7f, 7f)
                reflectiveCurveToRelative(3.13f, 7f, 7f, 7f)
                reflectiveCurveToRelative(7f, -3.13f, 7f, -7f)
                reflectiveCurveToRelative(-3.13f, -7f, -7f, -7f)
                close()
                moveToRelative(0f, 1f)
                curveToRelative(0.46f, 0f, 0.9f, 0.06f, 1.33f, 0.15f)
                lineToRelative(-2.72f, 4.7f)
                lineToRelative(-2.32f, -3.56f)
                curveTo(9.31f, 7.49f, 10.6f, 7f, 12f, 7f)
                close()
                moveToRelative(-6f, 6f)
                curveToRelative(0f, -1.54f, 0.59f, -2.95f, 1.55f, -4.01f)
                lineTo(10.81f, 14f)
                horizontalLineTo(6.09f)
                curveToRelative(-0.05f, -0.33f, -0.09f, -0.66f, -0.09f, -1f)
                close()
                moveToRelative(0.35f, 2f)
                horizontalLineToRelative(5.33f)
                lineToRelative(-2.03f, 3.5f)
                lineToRelative(0.11f, 0.06f)
                curveToRelative(-1.59f, -0.64f, -2.84f, -1.94f, -3.41f, -3.56f)
                close()
                moveTo(12f, 19f)
                curveToRelative(-0.48f, 0f, -0.94f, -0.06f, -1.39f, -0.17f)
                lineToRelative(2.85f, -4.92f)
                lineToRelative(2.11f, 3.9f)
                curveToRelative(-1f, 0.74f, -2.23f, 1.19f, -3.57f, 1.19f)
                close()
                moveToRelative(6f, -6f)
                curveToRelative(0f, 1.6f, -0.63f, 3.06f, -1.66f, 4.13f)
                lineTo(13.57f, 12f)
                horizontalLineToRelative(4.34f)
                curveToRelative(0.05f, 0.33f, 0.09f, 0.66f, 0.09f, 1f)
                close()
                moveToRelative(-5.74f, -2f)
                lineToRelative(2.05f, -3.54f)
                curveToRelative(1.56f, 0.65f, 2.77f, 1.94f, 3.34f, 3.54f)
                horizontalLineToRelative(-5.39f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.55f, 8.99f)
                curveTo(6.59f, 10.05f, 6f, 11.46f, 6f, 13f)
                curveToRelative(0f, 0.34f, 0.04f, 0.67f, 0.09f, 1f)
                horizontalLineToRelative(4.72f)
                lineTo(7.55f, 8.99f)
                close()
                moveToRelative(6.76f, -1.53f)
                lineTo(12.26f, 11f)
                horizontalLineToRelative(5.39f)
                curveToRelative(-0.57f, -1.6f, -1.78f, -2.89f, -3.34f, -3.54f)
                close()
                moveToRelative(-0.98f, -0.31f)
                curveTo(12.9f, 7.06f, 12.46f, 7f, 12f, 7f)
                curveToRelative(-1.4f, 0f, -2.69f, 0.49f, -3.71f, 1.29f)
                lineToRelative(2.32f, 3.56f)
                lineToRelative(2.72f, -4.7f)
                close()
                moveTo(11.68f, 15f)
                horizontalLineTo(6.35f)
                curveToRelative(0.57f, 1.62f, 1.82f, 2.92f, 3.41f, 3.56f)
                lineToRelative(-0.11f, -0.06f)
                lineToRelative(2.03f, -3.5f)
                close()
                moveToRelative(7.35f, -7.61f)
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
                moveTo(9f, 1f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineTo(9f)
                close()
                moveToRelative(7.34f, 16.13f)
                curveTo(17.37f, 16.06f, 18f, 14.6f, 18f, 13f)
                curveToRelative(0f, -0.34f, -0.04f, -0.67f, -0.09f, -1f)
                horizontalLineToRelative(-4.34f)
                lineToRelative(2.77f, 5.13f)
                close()
                moveToRelative(-5.73f, 1.7f)
                curveToRelative(0.45f, 0.11f, 0.91f, 0.17f, 1.39f, 0.17f)
                curveToRelative(1.34f, 0f, 2.57f, -0.45f, 3.57f, -1.19f)
                lineToRelative(-2.11f, -3.9f)
                lineToRelative(-2.85f, 4.92f)
                close()
            }
        }.build()
        
        return _Shutter_speed!!
    }

private var _Shutter_speed: ImageVector? = null

