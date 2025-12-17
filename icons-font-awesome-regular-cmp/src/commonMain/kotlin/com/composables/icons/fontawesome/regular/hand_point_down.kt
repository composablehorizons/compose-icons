package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.HandPointDown: ImageVector
    get() {
        if (_HandPointDown != null) return _HandPointDown!!
        
        _HandPointDown = ImageVector.Builder(
            name = "hand-point-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(188.8f, 512f)
                curveToRelative(45.616f, 0f, 83.2f, -37.765f, 83.2f, -83.2f)
                verticalLineToRelative(-35.647f)
                arcToRelative(93.148f, 93.148f, 0f, false, false, 22.064f, -7.929f)
                curveToRelative(22.006f, 2.507f, 44.978f, -3.503f, 62.791f, -15.985f)
                curveTo(409.342f, 368.1f, 448f, 331.841f, 448f, 269.299f)
                verticalLineTo(248f)
                curveToRelative(0f, -60.063f, -40f, -98.512f, -40f, -127.2f)
                verticalLineToRelative(-2.679f)
                curveToRelative(4.952f, -5.747f, 8f, -13.536f, 8f, -22.12f)
                verticalLineTo(32f)
                curveToRelative(0f, -17.673f, -12.894f, -32f, -28.8f, -32f)
                horizontalLineTo(156.8f)
                curveTo(140.894f, 0f, 128f, 14.327f, 128f, 32f)
                verticalLineToRelative(64f)
                curveToRelative(0f, 8.584f, 3.048f, 16.373f, 8f, 22.12f)
                verticalLineToRelative(2.679f)
                curveToRelative(0f, 6.964f, -6.193f, 14.862f, -23.668f, 30.183f)
                lineToRelative(-0.148f, 0.129f)
                lineToRelative(-0.146f, 0.131f)
                curveToRelative(-9.937f, 8.856f, -20.841f, 18.116f, -33.253f, 25.851f)
                curveTo(48.537f, 195.798f, 0f, 207.486f, 0f, 252.8f)
                curveToRelative(0f, 56.928f, 35.286f, 92f, 83.2f, 92f)
                curveToRelative(8.026f, 0f, 15.489f, -0.814f, 22.4f, -2.176f)
                verticalLineTo(428.8f)
                curveToRelative(0f, 45.099f, 38.101f, 83.2f, 83.2f, 83.2f)
                close()
                moveToRelative(0f, -48f)
                curveToRelative(-18.7f, 0f, -35.2f, -16.775f, -35.2f, -35.2f)
                verticalLineTo(270.4f)
                curveToRelative(-17.325f, 0f, -35.2f, 26.4f, -70.4f, 26.4f)
                curveToRelative(-26.4f, 0f, -35.2f, -20.625f, -35.2f, -44f)
                curveToRelative(0f, -8.794f, 32.712f, -20.445f, 56.1f, -34.926f)
                curveToRelative(14.575f, -9.074f, 27.225f, -19.524f, 39.875f, -30.799f)
                curveToRelative(18.374f, -16.109f, 36.633f, -33.836f, 39.596f, -59.075f)
                horizontalLineToRelative(176.752f)
                curveTo(364.087f, 170.79f, 400f, 202.509f, 400f, 248f)
                verticalLineToRelative(21.299f)
                curveToRelative(0f, 40.524f, -22.197f, 57.124f, -61.325f, 50.601f)
                curveToRelative(-8.001f, 14.612f, -33.979f, 24.151f, -53.625f, 12.925f)
                curveToRelative(-18.225f, 19.365f, -46.381f, 17.787f, -61.05f, 4.95f)
                verticalLineTo(428.8f)
                curveToRelative(0f, 18.975f, -16.225f, 35.2f, -35.2f, 35.2f)
                close()
                moveTo(328f, 64f)
                curveToRelative(0f, -13.255f, 10.745f, -24f, 24f, -24f)
                reflectiveCurveToRelative(24f, 10.745f, 24f, 24f)
                reflectiveCurveToRelative(-10.745f, 24f, -24f, 24f)
                reflectiveCurveToRelative(-24f, -10.745f, -24f, -24f)
                close()
            }
        }.build()
        
        return _HandPointDown!!
    }

private var _HandPointDown: ImageVector? = null

