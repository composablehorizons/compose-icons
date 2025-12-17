package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.HandPointLeft: ImageVector
    get() {
        if (_HandPointLeft != null) return _HandPointLeft!!
        
        _HandPointLeft = ImageVector.Builder(
            name = "hand-point-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 220.8f)
                curveTo(0f, 266.416f, 37.765f, 304f, 83.2f, 304f)
                horizontalLineToRelative(35.647f)
                arcToRelative(93.148f, 93.148f, 0f, false, false, 7.929f, 22.064f)
                curveToRelative(-2.507f, 22.006f, 3.503f, 44.978f, 15.985f, 62.791f)
                curveTo(143.9f, 441.342f, 180.159f, 480f, 242.701f, 480f)
                horizontalLineTo(264f)
                curveToRelative(60.063f, 0f, 98.512f, -40f, 127.2f, -40f)
                horizontalLineToRelative(2.679f)
                curveToRelative(5.747f, 4.952f, 13.536f, 8f, 22.12f, 8f)
                horizontalLineToRelative(64f)
                curveToRelative(17.673f, 0f, 32f, -12.894f, 32f, -28.8f)
                verticalLineTo(188.8f)
                curveToRelative(0f, -15.906f, -14.327f, -28.8f, -32f, -28.8f)
                horizontalLineToRelative(-64f)
                curveToRelative(-8.584f, 0f, -16.373f, 3.048f, -22.12f, 8f)
                horizontalLineTo(391.2f)
                curveToRelative(-6.964f, 0f, -14.862f, -6.193f, -30.183f, -23.668f)
                lineToRelative(-0.129f, -0.148f)
                lineToRelative(-0.131f, -0.146f)
                curveToRelative(-8.856f, -9.937f, -18.116f, -20.841f, -25.851f, -33.253f)
                curveTo(316.202f, 80.537f, 304.514f, 32f, 259.2f, 32f)
                curveToRelative(-56.928f, 0f, -92f, 35.286f, -92f, 83.2f)
                curveToRelative(0f, 8.026f, 0.814f, 15.489f, 2.176f, 22.4f)
                horizontalLineTo(83.2f)
                curveTo(38.101f, 137.6f, 0f, 175.701f, 0f, 220.8f)
                close()
                moveToRelative(48f, 0f)
                curveToRelative(0f, -18.7f, 16.775f, -35.2f, 35.2f, -35.2f)
                horizontalLineToRelative(158.4f)
                curveToRelative(0f, -17.325f, -26.4f, -35.2f, -26.4f, -70.4f)
                curveToRelative(0f, -26.4f, 20.625f, -35.2f, 44f, -35.2f)
                curveToRelative(8.794f, 0f, 20.445f, 32.712f, 34.926f, 56.1f)
                curveToRelative(9.074f, 14.575f, 19.524f, 27.225f, 30.799f, 39.875f)
                curveToRelative(16.109f, 18.374f, 33.836f, 36.633f, 59.075f, 39.596f)
                verticalLineToRelative(176.752f)
                curveTo(341.21f, 396.087f, 309.491f, 432f, 264f, 432f)
                horizontalLineToRelative(-21.299f)
                curveToRelative(-40.524f, 0f, -57.124f, -22.197f, -50.601f, -61.325f)
                curveToRelative(-14.612f, -8.001f, -24.151f, -33.979f, -12.925f, -53.625f)
                curveToRelative(-19.365f, -18.225f, -17.787f, -46.381f, -4.95f, -61.05f)
                horizontalLineTo(83.2f)
                curveTo(64.225f, 256f, 48f, 239.775f, 48f, 220.8f)
                close()
                moveTo(448f, 360f)
                curveToRelative(13.255f, 0f, 24f, 10.745f, 24f, 24f)
                reflectiveCurveToRelative(-10.745f, 24f, -24f, 24f)
                reflectiveCurveToRelative(-24f, -10.745f, -24f, -24f)
                reflectiveCurveToRelative(10.745f, -24f, 24f, -24f)
                close()
            }
        }.build()
        
        return _HandPointLeft!!
    }

private var _HandPointLeft: ImageVector? = null

