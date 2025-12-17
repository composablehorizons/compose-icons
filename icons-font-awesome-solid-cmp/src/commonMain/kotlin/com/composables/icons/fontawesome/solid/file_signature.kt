package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.FileSignature: ImageVector
    get() {
        if (_FileSignature != null) return _FileSignature!!
        
        _FileSignature = ImageVector.Builder(
            name = "file-signature",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(218.17f, 424.14f)
                curveToRelative(-2.95f, -5.92f, -8.09f, -6.52f, -10.17f, -6.52f)
                reflectiveCurveToRelative(-7.22f, 0.59f, -10.02f, 6.19f)
                lineToRelative(-7.67f, 15.34f)
                curveToRelative(-6.37f, 12.78f, -25.03f, 11.37f, -29.48f, -2.09f)
                lineTo(144f, 386.59f)
                lineToRelative(-10.61f, 31.88f)
                curveToRelative(-5.89f, 17.66f, -22.38f, 29.53f, -41f, 29.53f)
                horizontalLineTo(80f)
                curveToRelative(-8.84f, 0f, -16f, -7.16f, -16f, -16f)
                reflectiveCurveToRelative(7.16f, -16f, 16f, -16f)
                horizontalLineToRelative(12.39f)
                curveToRelative(4.83f, 0f, 9.11f, -3.08f, 10.64f, -7.66f)
                lineToRelative(18.19f, -54.64f)
                curveToRelative(3.3f, -9.81f, 12.44f, -16.41f, 22.78f, -16.41f)
                reflectiveCurveToRelative(19.48f, 6.59f, 22.77f, 16.41f)
                lineToRelative(13.88f, 41.64f)
                curveToRelative(19.75f, -16.19f, 54.06f, -9.7f, 66f, 14.16f)
                curveToRelative(1.89f, 3.78f, 5.49f, 5.95f, 9.36f, 6.26f)
                verticalLineToRelative(-82.12f)
                lineToRelative(128f, -127.09f)
                verticalLineTo(160f)
                horizontalLineTo(248f)
                curveToRelative(-13.2f, 0f, -24f, -10.8f, -24f, -24f)
                verticalLineTo(0f)
                horizontalLineTo(24f)
                curveTo(10.7f, 0f, 0f, 10.7f, 0f, 24f)
                verticalLineToRelative(464f)
                curveToRelative(0f, 13.3f, 10.7f, 24f, 24f, 24f)
                horizontalLineToRelative(336f)
                curveToRelative(13.3f, 0f, 24f, -10.7f, 24f, -24f)
                verticalLineToRelative(-40f)
                lineToRelative(-128f, -0.11f)
                curveToRelative(-16.12f, -0.31f, -30.58f, -9.28f, -37.83f, -23.75f)
                close()
                moveTo(384f, 121.9f)
                curveToRelative(0f, -6.3f, -2.5f, -12.4f, -7f, -16.9f)
                lineTo(279.1f, 7f)
                curveToRelative(-4.5f, -4.5f, -10.6f, -7f, -17f, -7f)
                horizontalLineTo(256f)
                verticalLineToRelative(128f)
                horizontalLineToRelative(128f)
                verticalLineToRelative(-6.1f)
                close()
                moveToRelative(-96f, 225.06f)
                verticalLineTo(416f)
                horizontalLineToRelative(68.99f)
                lineToRelative(161.68f, -162.78f)
                lineToRelative(-67.88f, -67.88f)
                lineTo(288f, 346.96f)
                close()
                moveToRelative(280.54f, -179.63f)
                lineToRelative(-31.87f, -31.87f)
                curveToRelative(-9.94f, -9.94f, -26.07f, -9.94f, -36.01f, 0f)
                lineToRelative(-27.25f, 27.25f)
                lineToRelative(67.88f, 67.88f)
                lineToRelative(27.25f, -27.25f)
                curveToRelative(9.95f, -9.94f, 9.95f, -26.07f, 0f, -36.01f)
                close()
            }
        }.build()
        
        return _FileSignature!!
    }

private var _FileSignature: ImageVector? = null

