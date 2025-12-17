package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.BroadcastTower: ImageVector
    get() {
        if (_BroadcastTower != null) return _BroadcastTower!!
        
        _BroadcastTower = ImageVector.Builder(
            name = "broadcast-tower",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(150.94f, 192f)
                horizontalLineToRelative(33.73f)
                curveToRelative(11.01f, 0f, 18.61f, -10.83f, 14.86f, -21.18f)
                curveToRelative(-4.93f, -13.58f, -7.55f, -27.98f, -7.55f, -42.82f)
                reflectiveCurveToRelative(2.62f, -29.24f, 7.55f, -42.82f)
                curveTo(203.29f, 74.83f, 195.68f, 64f, 184.67f, 64f)
                horizontalLineToRelative(-33.73f)
                curveToRelative(-7.01f, 0f, -13.46f, 4.49f, -15.41f, 11.23f)
                curveTo(130.64f, 92.21f, 128f, 109.88f, 128f, 128f)
                curveToRelative(0f, 18.12f, 2.64f, 35.79f, 7.54f, 52.76f)
                curveToRelative(1.94f, 6.74f, 8.39f, 11.24f, 15.4f, 11.24f)
                close()
                moveTo(89.92f, 23.34f)
                curveTo(95.56f, 12.72f, 87.97f, 0f, 75.96f, 0f)
                horizontalLineTo(40.63f)
                curveToRelative(-6.27f, 0f, -12.14f, 3.59f, -14.74f, 9.31f)
                curveTo(9.4f, 45.54f, 0f, 85.65f, 0f, 128f)
                curveToRelative(0f, 24.75f, 3.12f, 68.33f, 26.69f, 118.86f)
                curveToRelative(2.62f, 5.63f, 8.42f, 9.14f, 14.61f, 9.14f)
                horizontalLineToRelative(34.84f)
                curveToRelative(12.02f, 0f, 19.61f, -12.74f, 13.95f, -23.37f)
                curveToRelative(-49.78f, -93.32f, -16.71f, -178.15f, -0.17f, -209.29f)
                close()
                moveTo(614.06f, 9.29f)
                curveTo(611.46f, 3.58f, 605.6f, 0f, 599.33f, 0f)
                horizontalLineToRelative(-35.42f)
                curveToRelative(-11.98f, 0f, -19.66f, 12.66f, -14.02f, 23.25f)
                curveToRelative(18.27f, 34.29f, 48.42f, 119.42f, 0.28f, 209.23f)
                curveToRelative(-5.72f, 10.68f, 1.8f, 23.52f, 13.91f, 23.52f)
                horizontalLineToRelative(35.23f)
                curveToRelative(6.27f, 0f, 12.13f, -3.58f, 14.73f, -9.29f)
                curveTo(630.57f, 210.48f, 640f, 170.36f, 640f, 128f)
                reflectiveCurveToRelative(-9.42f, -82.48f, -25.94f, -118.71f)
                close()
                moveTo(489.06f, 64f)
                horizontalLineToRelative(-33.73f)
                curveToRelative(-11.01f, 0f, -18.61f, 10.83f, -14.86f, 21.18f)
                curveToRelative(4.93f, 13.58f, 7.55f, 27.98f, 7.55f, 42.82f)
                reflectiveCurveToRelative(-2.62f, 29.24f, -7.55f, 42.82f)
                curveToRelative(-3.76f, 10.35f, 3.85f, 21.18f, 14.86f, 21.18f)
                horizontalLineToRelative(33.73f)
                curveToRelative(7.02f, 0f, 13.46f, -4.49f, 15.41f, -11.24f)
                curveToRelative(4.9f, -16.97f, 7.53f, -34.64f, 7.53f, -52.76f)
                curveToRelative(0f, -18.12f, -2.64f, -35.79f, -7.54f, -52.76f)
                curveToRelative(-1.94f, -6.75f, -8.39f, -11.24f, -15.4f, -11.24f)
                close()
                moveToRelative(-116.3f, 100.12f)
                curveToRelative(7.05f, -10.29f, 11.2f, -22.71f, 11.2f, -36.12f)
                curveToRelative(0f, -35.35f, -28.63f, -64f, -63.96f, -64f)
                curveToRelative(-35.32f, 0f, -63.96f, 28.65f, -63.96f, 64f)
                curveToRelative(0f, 13.41f, 4.15f, 25.83f, 11.2f, 36.12f)
                lineToRelative(-130.5f, 313.41f)
                curveToRelative(-3.4f, 8.15f, 0.46f, 17.52f, 8.61f, 20.92f)
                lineToRelative(29.51f, 12.31f)
                curveToRelative(8.15f, 3.4f, 17.52f, -0.46f, 20.91f, -8.61f)
                lineTo(244.96f, 384f)
                horizontalLineToRelative(150.07f)
                lineToRelative(49.2f, 118.15f)
                curveToRelative(3.4f, 8.16f, 12.76f, 12.01f, 20.91f, 8.61f)
                lineToRelative(29.51f, -12.31f)
                curveToRelative(8.15f, -3.4f, 12f, -12.77f, 8.61f, -20.92f)
                lineToRelative(-130.5f, -313.41f)
                close()
                moveTo(271.62f, 320f)
                lineTo(320f, 203.81f)
                lineTo(368.38f, 320f)
                horizontalLineToRelative(-96.76f)
                close()
            }
        }.build()
        
        return _BroadcastTower!!
    }

private var _BroadcastTower: ImageVector? = null

