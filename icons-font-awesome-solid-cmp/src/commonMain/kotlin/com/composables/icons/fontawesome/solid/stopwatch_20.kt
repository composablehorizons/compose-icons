package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Stopwatch20: ImageVector
    get() {
        if (_Stopwatch20 != null) return _Stopwatch20!!
        
        _Stopwatch20 = ImageVector.Builder(
            name = "stopwatch-20",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(398.5f, 190.91f)
                lineToRelative(0.59f, -0.61f)
                lineToRelative(26.59f, -26.58f)
                arcToRelative(16f, 16f, 0f, false, false, 0f, -22.63f)
                lineTo(403f, 118.41f)
                arcToRelative(16f, 16f, 0f, false, false, -22.63f, 0f)
                lineToRelative(-24.68f, 24.68f)
                arcTo(206.68f, 206.68f, 0f, false, false, 256f, 98.5f)
                verticalLineTo(64f)
                horizontalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, -16f)
                verticalLineTo(16f)
                arcTo(16f, 16f, 0f, false, false, 288f, 0f)
                horizontalLineTo(160f)
                arcToRelative(16.05f, 16.05f, 0f, false, false, -16f, 16f)
                verticalLineTo(48f)
                arcToRelative(16.05f, 16.05f, 0f, false, false, 16f, 16f)
                horizontalLineToRelative(32f)
                verticalLineTo(98.5f)
                arcTo(207.92f, 207.92f, 0f, false, false, 16.09f, 297.57f)
                curveTo(12.64f, 411.5f, 106.76f, 510.22f, 220.72f, 512f)
                curveTo(337.13f, 513.77f, 432f, 420f, 432f, 304f)
                arcTo(206f, 206f, 0f, false, false, 398.5f, 190.91f)
                close()
                moveTo(204.37f, 377.55f)
                arcToRelative(8.2f, 8.2f, 0f, false, true, 8.32f, 8.07f)
                verticalLineToRelative(22.31f)
                arcToRelative(8.2f, 8.2f, 0f, false, true, -8.32f, 8.07f)
                horizontalLineTo(121.52f)
                arcToRelative(16.46f, 16.46f, 0f, false, true, -16.61f, -17.62f)
                curveToRelative(2.78f, -35.22f, 14.67f, -57.41f, 38.45f, -91.37f)
                curveToRelative(20.42f, -29.19f, 27.1f, -37.32f, 27.1f, -62.34f)
                curveToRelative(0f, -16.92f, -1.79f, -24.27f, -12.21f, -24.27f)
                curveToRelative(-9.39f, 0f, -12.69f, 7.4f, -12.69f, 22.68f)
                verticalLineToRelative(5.23f)
                arcToRelative(8.2f, 8.2f, 0f, false, true, -8.33f, 8.07f)
                horizontalLineToRelative(-24.9f)
                arcToRelative(8.2f, 8.2f, 0f, false, true, -8.33f, -8.07f)
                verticalLineToRelative(-4.07f)
                curveToRelative(0f, -27.3f, 8.48f, -60.24f, 56.43f, -60.24f)
                curveToRelative(43f, 0f, 55.57f, 25.85f, 55.57f, 61f)
                curveToRelative(0f, 35.58f, -12.44f, 51.21f, -34.35f, 81.31f)
                curveToRelative(-11.56f, 15f, -24.61f, 35.57f, -26.41f, 51.2f)
                close()
                moveTo(344f, 352.32f)
                curveToRelative(0f, 35.16f, -12.3f, 63.68f, -57.23f, 63.68f)
                curveTo(243.19f, 416f, 232f, 386.48f, 232f, 352.55f)
                verticalLineTo(247.22f)
                curveToRelative(0f, -40.73f, 19.58f, -63.22f, 56.2f, -63.22f)
                curveTo(325f, 184f, 344f, 206.64f, 344f, 245.3f)
                close()
                moveTo(287.87f, 221.73f)
                curveToRelative(-9.41f, 0f, -13.23f, 7.5f, -13.23f, 20f)
                verticalLineTo(357.68f)
                curveToRelative(0f, 13.11f, 3.59f, 20.59f, 13.23f, 20.59f)
                reflectiveCurveToRelative(13f, -8f, 13f, -21.27f)
                verticalLineTo(241.06f)
                curveTo(300.89f, 229.79f, 297.88f, 221.73f, 287.87f, 221.73f)
                close()
            }
        }.build()
        
        return _Stopwatch20!!
    }

private var _Stopwatch20: ImageVector? = null

