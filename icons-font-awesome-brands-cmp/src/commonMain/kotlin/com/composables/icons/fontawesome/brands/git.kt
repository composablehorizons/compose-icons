package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Git: ImageVector
    get() {
        if (_Git != null) return _Git!!
        
        _Git = ImageVector.Builder(
            name = "git",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(216.29f, 158.39f)
                horizontalLineTo(137f)
                curveTo(97f, 147.9f, 6.51f, 150.63f, 6.51f, 233.18f)
                curveToRelative(0f, 30.09f, 15f, 51.23f, 35f, 61f)
                curveToRelative(-25.1f, 23f, -37f, 33.85f, -37f, 49.21f)
                curveToRelative(0f, 11f, 4.47f, 21.14f, 17.89f, 26.81f)
                curveTo(8.13f, 383.61f, 0f, 393.35f, 0f, 411.65f)
                curveToRelative(0f, 32.11f, 28.05f, 50.82f, 101.63f, 50.82f)
                curveToRelative(70.75f, 0f, 111.79f, -26.42f, 111.79f, -73.18f)
                curveToRelative(0f, -58.66f, -45.16f, -56.5f, -151.63f, -63f)
                lineToRelative(13.43f, -21.55f)
                curveToRelative(27.27f, 7.58f, 118.7f, 10f, 118.7f, -67.89f)
                curveToRelative(0f, -18.7f, -7.73f, -31.71f, -15f, -41.07f)
                lineToRelative(37.41f, -2.84f)
                close()
                moveToRelative(-63.42f, 241.9f)
                curveToRelative(0f, 32.06f, -104.89f, 32.1f, -104.89f, 2.43f)
                curveToRelative(0f, -8.14f, 5.27f, -15f, 10.57f, -21.54f)
                curveToRelative(77.71f, 5.3f, 94.32f, 3.37f, 94.32f, 19.11f)
                close()
                moveToRelative(-50.81f, -134.58f)
                curveToRelative(-52.8f, 0f, -50.46f, -71.16f, 1.2f, -71.16f)
                curveToRelative(49.54f, 0f, 50.82f, 71.16f, -1.2f, 71.16f)
                close()
                moveToRelative(133.3f, 100.51f)
                verticalLineToRelative(-32.1f)
                curveToRelative(26.75f, -3.66f, 27.24f, -2f, 27.24f, -11f)
                verticalLineTo(203.61f)
                curveToRelative(0f, -8.5f, -2.05f, -7.38f, -27.24f, -16.26f)
                lineToRelative(4.47f, -32.92f)
                horizontalLineTo(324f)
                verticalLineToRelative(168.71f)
                curveToRelative(0f, 6.51f, 0.4f, 7.32f, 6.51f, 8.14f)
                lineToRelative(20.73f, 2.84f)
                verticalLineToRelative(32.1f)
                close()
                moveToRelative(52.45f, -244.31f)
                curveToRelative(-23.17f, 0f, -36.59f, -13.43f, -36.59f, -36.61f)
                reflectiveCurveToRelative(13.42f, -35.77f, 36.59f, -35.77f)
                curveToRelative(23.58f, 0f, 37f, 12.62f, 37f, 35.77f)
                reflectiveCurveToRelative(-13.42f, 36.61f, -37f, 36.61f)
                close()
                moveTo(512f, 350.46f)
                curveToRelative(-17.49f, 8.53f, -43.1f, 16.26f, -66.28f, 16.26f)
                curveToRelative(-48.38f, 0f, -66.67f, -19.5f, -66.67f, -65.46f)
                verticalLineTo(194.75f)
                curveToRelative(0f, -5.42f, 1.05f, -4.06f, -31.71f, -4.06f)
                verticalLineTo(154.5f)
                curveToRelative(35.78f, -4.07f, 50f, -22f, 54.47f, -66.27f)
                horizontalLineToRelative(38.63f)
                curveToRelative(0f, 65.83f, -1.34f, 61.81f, 3.26f, 61.81f)
                horizontalLineTo(501f)
                verticalLineToRelative(40.65f)
                horizontalLineToRelative(-60.56f)
                verticalLineToRelative(97.15f)
                curveToRelative(0f, 6.92f, -4.92f, 51.41f, 60.57f, 26.84f)
                close()
            }
        }.build()
        
        return _Git!!
    }

private var _Git: ImageVector? = null

