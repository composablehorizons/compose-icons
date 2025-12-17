package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Shutter_speed: ImageVector
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
                moveTo(10f, 3f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
                moveToRelative(9.03f, 4.39f)
                lineToRelative(0.75f, -0.75f)
                curveToRelative(0.38f, -0.38f, 0.39f, -1.01f, 0f, -1.4f)
                lineToRelative(-0.01f, -0.01f)
                curveToRelative(-0.39f, -0.39f, -1.01f, -0.38f, -1.4f, 0f)
                lineToRelative(-0.75f, 0.75f)
                curveTo(16.07f, 4.74f, 14.12f, 4f, 12f, 4f)
                curveToRelative(-4.8f, 0f, -8.88f, 3.96f, -9f, 8.76f)
                curveTo(2.87f, 17.84f, 6.94f, 22f, 12f, 22f)
                curveToRelative(4.98f, 0f, 9f, -4.03f, 9f, -9f)
                curveToRelative(0f, -2.12f, -0.74f, -4.07f, -1.97f, -5.61f)
                close()
                moveTo(12f, 20f)
                curveToRelative(-3.87f, 0f, -7f, -3.13f, -7f, -7f)
                reflectiveCurveToRelative(3.13f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.13f, 7f, 7f)
                reflectiveCurveToRelative(-3.13f, 7f, -7f, 7f)
                close()
                moveToRelative(-1.19f, -5f)
                horizontalLineToRelative(-3.7f)
                curveToRelative(-0.38f, 0f, -0.62f, 0.4f, -0.45f, 0.74f)
                curveToRelative(0.56f, 1.12f, 1.44f, 2.01f, 2.57f, 2.57f)
                curveToRelative(0.23f, 0.11f, 0.52f, 0.02f, 0.65f, -0.21f)
                lineToRelative(1.37f, -2.35f)
                curveToRelative(0.19f, -0.33f, -0.05f, -0.75f, -0.44f, -0.75f)
                close()
                moveToRelative(3.92f, -7.35f)
                curveToRelative(-0.23f, -0.12f, -0.52f, -0.02f, -0.65f, 0.2f)
                lineToRelative(-1.38f, 2.39f)
                curveToRelative(-0.2f, 0.34f, 0.04f, 0.76f, 0.43f, 0.76f)
                horizontalLineToRelative(3.76f)
                curveToRelative(0.38f, 0f, 0.62f, -0.4f, 0.45f, -0.73f)
                curveToRelative(-0.58f, -1.13f, -1.49f, -2.04f, -2.61f, -2.62f)
                close()
                moveToRelative(-0.85f, 7.05f)
                curveToRelative(-0.19f, -0.34f, -0.68f, -0.35f, -0.87f, -0.01f)
                lineToRelative(-2.04f, 3.52f)
                curveToRelative(-0.18f, 0.32f, 0.02f, 0.72f, 0.39f, 0.75f)
                curveToRelative(1.34f, 0.14f, 2.69f, -0.18f, 3.83f, -0.89f)
                curveToRelative(0.22f, -0.14f, 0.28f, -0.43f, 0.16f, -0.66f)
                lineToRelative(-1.47f, -2.71f)
                close()
                moveToRelative(-3.57f, -1.47f)
                lineTo(7.93f, 9.57f)
                curveToRelative(-0.2f, -0.3f, -0.64f, -0.3f, -0.84f, 0f)
                curveToRelative(-0.81f, 1.16f, -1.17f, 2.57f, -1.05f, 3.98f)
                curveToRelative(0.02f, 0.26f, 0.24f, 0.45f, 0.5f, 0.45f)
                horizontalLineToRelative(3.35f)
                curveToRelative(0.39f, 0f, 0.63f, -0.44f, 0.42f, -0.77f)
                close()
                moveToRelative(3.66f, -0.49f)
                lineToRelative(2.02f, 3.74f)
                curveToRelative(0.18f, 0.33f, 0.64f, 0.35f, 0.86f, 0.05f)
                curveToRelative(0.86f, -1.18f, 1.24f, -2.62f, 1.12f, -4.08f)
                curveToRelative(-0.02f, -0.26f, -0.25f, -0.45f, -0.5f, -0.45f)
                horizontalLineToRelative(-3.05f)
                curveToRelative(-0.39f, 0f, -0.63f, 0.4f, -0.45f, 0.74f)
                close()
                moveToRelative(-3.8f, -1.57f)
                curveToRelative(0.2f, 0.31f, 0.66f, 0.3f, 0.85f, -0.02f)
                lineToRelative(1.94f, -3.35f)
                curveToRelative(0.19f, -0.32f, -0.03f, -0.72f, -0.4f, -0.76f)
                curveToRelative(-1.36f, -0.12f, -2.73f, 0.21f, -3.88f, 0.97f)
                curveToRelative(-0.22f, 0.15f, -0.27f, 0.46f, -0.13f, 0.68f)
                lineToRelative(1.62f, 2.48f)
                close()
            }
        }.build()
        
        return _Shutter_speed!!
    }

private var _Shutter_speed: ImageVector? = null

