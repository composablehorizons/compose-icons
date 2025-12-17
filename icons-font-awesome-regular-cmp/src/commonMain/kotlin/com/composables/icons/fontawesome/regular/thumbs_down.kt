package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.ThumbsDown: ImageVector
    get() {
        if (_ThumbsDown != null) return _ThumbsDown!!
        
        _ThumbsDown = ImageVector.Builder(
            name = "thumbs-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(466.27f, 225.31f)
                curveToRelative(4.674f, -22.647f, 0.864f, -44.538f, -8.99f, -62.99f)
                curveToRelative(2.958f, -23.868f, -4.021f, -48.565f, -17.34f, -66.99f)
                curveTo(438.986f, 39.423f, 404.117f, 0f, 327f, 0f)
                curveToRelative(-7f, 0f, -15f, 0.01f, -22.22f, 0.01f)
                curveTo(201.195f, 0.01f, 168.997f, 40f, 128f, 40f)
                horizontalLineToRelative(-10.845f)
                curveToRelative(-5.64f, -4.975f, -13.042f, -8f, -21.155f, -8f)
                horizontalLineTo(32f)
                curveTo(14.327f, 32f, 0f, 46.327f, 0f, 64f)
                verticalLineToRelative(240f)
                curveToRelative(0f, 17.673f, 14.327f, 32f, 32f, 32f)
                horizontalLineToRelative(64f)
                curveToRelative(11.842f, 0f, 22.175f, -6.438f, 27.708f, -16f)
                horizontalLineToRelative(7.052f)
                curveToRelative(19.146f, 16.953f, 46.013f, 60.653f, 68.76f, 83.4f)
                curveToRelative(13.667f, 13.667f, 10.153f, 108.6f, 71.76f, 108.6f)
                curveToRelative(57.58f, 0f, 95.27f, -31.936f, 95.27f, -104.73f)
                curveToRelative(0f, -18.41f, -3.93f, -33.73f, -8.85f, -46.54f)
                horizontalLineToRelative(36.48f)
                curveToRelative(48.602f, 0f, 85.82f, -41.565f, 85.82f, -85.58f)
                curveToRelative(0f, -19.15f, -4.96f, -34.99f, -13.73f, -49.84f)
                close()
                moveTo(64f, 296f)
                curveToRelative(-13.255f, 0f, -24f, -10.745f, -24f, -24f)
                reflectiveCurveToRelative(10.745f, -24f, 24f, -24f)
                reflectiveCurveToRelative(24f, 10.745f, 24f, 24f)
                reflectiveCurveToRelative(-10.745f, 24f, -24f, 24f)
                close()
                moveToRelative(330.18f, 16.73f)
                horizontalLineTo(290.19f)
                curveToRelative(0f, 37.82f, 28.36f, 55.37f, 28.36f, 94.54f)
                curveToRelative(0f, 23.75f, 0f, 56.73f, -47.27f, 56.73f)
                curveToRelative(-18.91f, -18.91f, -9.46f, -66.18f, -37.82f, -94.54f)
                curveTo(206.9f, 342.89f, 167.28f, 272f, 138.92f, 272f)
                horizontalLineTo(128f)
                verticalLineTo(85.83f)
                curveToRelative(53.611f, 0f, 100.001f, -37.82f, 171.64f, -37.82f)
                horizontalLineToRelative(37.82f)
                curveToRelative(35.512f, 0f, 60.82f, 17.12f, 53.12f, 65.9f)
                curveToRelative(15.2f, 8.16f, 26.5f, 36.44f, 13.94f, 57.57f)
                curveToRelative(21.581f, 20.384f, 18.699f, 51.065f, 5.21f, 65.62f)
                curveToRelative(9.45f, 0f, 22.36f, 18.91f, 22.27f, 37.81f)
                curveToRelative(-0.09f, 18.91f, -16.71f, 37.82f, -37.82f, 37.82f)
                close()
            }
        }.build()
        
        return _ThumbsDown!!
    }

private var _ThumbsDown: ImageVector? = null

