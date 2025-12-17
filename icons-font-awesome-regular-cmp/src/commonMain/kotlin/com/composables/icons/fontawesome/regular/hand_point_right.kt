package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.HandPointRight: ImageVector
    get() {
        if (_HandPointRight != null) return _HandPointRight!!
        
        _HandPointRight = ImageVector.Builder(
            name = "hand-point-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(428.8f, 137.6f)
                horizontalLineToRelative(-86.177f)
                arcToRelative(115.52f, 115.52f, 0f, false, false, 2.176f, -22.4f)
                curveToRelative(0f, -47.914f, -35.072f, -83.2f, -92f, -83.2f)
                curveToRelative(-45.314f, 0f, -57.002f, 48.537f, -75.707f, 78.784f)
                curveToRelative(-7.735f, 12.413f, -16.994f, 23.317f, -25.851f, 33.253f)
                lineToRelative(-0.131f, 0.146f)
                lineToRelative(-0.129f, 0.148f)
                curveTo(135.662f, 161.807f, 127.764f, 168f, 120.8f, 168f)
                horizontalLineToRelative(-2.679f)
                curveToRelative(-5.747f, -4.952f, -13.536f, -8f, -22.12f, -8f)
                horizontalLineTo(32f)
                curveToRelative(-17.673f, 0f, -32f, 12.894f, -32f, 28.8f)
                verticalLineToRelative(230.4f)
                curveTo(0f, 435.106f, 14.327f, 448f, 32f, 448f)
                horizontalLineToRelative(64f)
                curveToRelative(8.584f, 0f, 16.373f, -3.048f, 22.12f, -8f)
                horizontalLineToRelative(2.679f)
                curveToRelative(28.688f, 0f, 67.137f, 40f, 127.2f, 40f)
                horizontalLineToRelative(21.299f)
                curveToRelative(62.542f, 0f, 98.8f, -38.658f, 99.94f, -91.145f)
                curveToRelative(12.482f, -17.813f, 18.491f, -40.785f, 15.985f, -62.791f)
                arcTo(93.148f, 93.148f, 0f, false, false, 393.152f, 304f)
                horizontalLineTo(428.8f)
                curveToRelative(45.435f, 0f, 83.2f, -37.584f, 83.2f, -83.2f)
                curveToRelative(0f, -45.099f, -38.101f, -83.2f, -83.2f, -83.2f)
                close()
                moveToRelative(0f, 118.4f)
                horizontalLineToRelative(-91.026f)
                curveToRelative(12.837f, 14.669f, 14.415f, 42.825f, -4.95f, 61.05f)
                curveToRelative(11.227f, 19.646f, 1.687f, 45.624f, -12.925f, 53.625f)
                curveToRelative(6.524f, 39.128f, -10.076f, 61.325f, -50.6f, 61.325f)
                horizontalLineTo(248f)
                curveToRelative(-45.491f, 0f, -77.21f, -35.913f, -120f, -39.676f)
                verticalLineTo(215.571f)
                curveToRelative(25.239f, -2.964f, 42.966f, -21.222f, 59.075f, -39.596f)
                curveToRelative(11.275f, -12.65f, 21.725f, -25.3f, 30.799f, -39.875f)
                curveTo(232.355f, 112.712f, 244.006f, 80f, 252.8f, 80f)
                curveToRelative(23.375f, 0f, 44f, 8.8f, 44f, 35.2f)
                curveToRelative(0f, 35.2f, -26.4f, 53.075f, -26.4f, 70.4f)
                horizontalLineToRelative(158.4f)
                curveToRelative(18.425f, 0f, 35.2f, 16.5f, 35.2f, 35.2f)
                curveToRelative(0f, 18.975f, -16.225f, 35.2f, -35.2f, 35.2f)
                close()
                moveTo(88f, 384f)
                curveToRelative(0f, 13.255f, -10.745f, 24f, -24f, 24f)
                reflectiveCurveToRelative(-24f, -10.745f, -24f, -24f)
                reflectiveCurveToRelative(10.745f, -24f, 24f, -24f)
                reflectiveCurveToRelative(24f, 10.745f, 24f, 24f)
                close()
            }
        }.build()
        
        return _HandPointRight!!
    }

private var _HandPointRight: ImageVector? = null

