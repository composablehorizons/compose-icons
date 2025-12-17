package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Motorcycle: ImageVector
    get() {
        if (_Motorcycle != null) return _Motorcycle!!
        
        _Motorcycle = ImageVector.Builder(
            name = "motorcycle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(512.9f, 192f)
                curveToRelative(-14.9f, -0.1f, -29.1f, 2.3f, -42.4f, 6.9f)
                lineTo(437.6f, 144f)
                horizontalLineTo(520f)
                curveToRelative(13.3f, 0f, 24f, -10.7f, 24f, -24f)
                verticalLineTo(88f)
                curveToRelative(0f, -13.3f, -10.7f, -24f, -24f, -24f)
                horizontalLineToRelative(-45.3f)
                curveToRelative(-6.8f, 0f, -13.3f, 2.9f, -17.8f, 7.9f)
                lineToRelative(-37.5f, 41.7f)
                lineToRelative(-22.8f, -38f)
                curveTo(392.2f, 68.4f, 384.4f, 64f, 376f, 64f)
                horizontalLineToRelative(-80f)
                curveToRelative(-8.8f, 0f, -16f, 7.2f, -16f, 16f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 8.8f, 7.2f, 16f, 16f, 16f)
                horizontalLineToRelative(66.4f)
                lineToRelative(19.2f, 32f)
                horizontalLineTo(227.9f)
                curveToRelative(-17.7f, -23.1f, -44.9f, -40f, -99.9f, -40f)
                horizontalLineTo(72.5f)
                curveTo(59f, 104f, 47.7f, 115f, 48f, 128.5f)
                curveToRelative(0.2f, 13f, 10.9f, 23.5f, 24f, 23.5f)
                horizontalLineToRelative(56f)
                curveToRelative(24.5f, 0f, 38.7f, 10.9f, 47.8f, 24.8f)
                lineToRelative(-11.3f, 20.5f)
                curveToRelative(-13f, -3.9f, -26.9f, -5.7f, -41.3f, -5.2f)
                curveTo(55.9f, 194.5f, 1.6f, 249.6f, 0f, 317f)
                curveToRelative(-1.6f, 72.1f, 56.3f, 131f, 128f, 131f)
                curveToRelative(59.6f, 0f, 109.7f, -40.8f, 124f, -96f)
                horizontalLineToRelative(84.2f)
                curveToRelative(13.7f, 0f, 24.6f, -11.4f, 24f, -25.1f)
                curveToRelative(-2.1f, -47.1f, 17.5f, -93.7f, 56.2f, -125f)
                lineToRelative(12.5f, 20.8f)
                curveToRelative(-27.6f, 23.7f, -45.1f, 58.9f, -44.8f, 98.2f)
                curveToRelative(0.5f, 69.6f, 57.2f, 126.5f, 126.8f, 127.1f)
                curveToRelative(71.6f, 0.7f, 129.8f, -57.5f, 129.2f, -129.1f)
                curveToRelative(-0.7f, -69.6f, -57.6f, -126.4f, -127.2f, -126.9f)
                close()
                moveTo(128f, 400f)
                curveToRelative(-44.1f, 0f, -80f, -35.9f, -80f, -80f)
                reflectiveCurveToRelative(35.9f, -80f, 80f, -80f)
                curveToRelative(4.2f, 0f, 8.4f, 0.3f, 12.5f, 1f)
                lineTo(99f, 316.4f)
                curveToRelative(-8.8f, 16f, 2.8f, 35.6f, 21f, 35.6f)
                horizontalLineToRelative(81.3f)
                curveToRelative(-12.4f, 28.2f, -40.6f, 48f, -73.3f, 48f)
                close()
                moveToRelative(463.9f, -75.6f)
                curveToRelative(-2.2f, 40.6f, -35f, 73.4f, -75.5f, 75.5f)
                curveToRelative(-46.1f, 2.5f, -84.4f, -34.3f, -84.4f, -79.9f)
                curveToRelative(0f, -21.4f, 8.4f, -40.8f, 22.1f, -55.1f)
                lineToRelative(49.4f, 82.4f)
                curveToRelative(4.5f, 7.6f, 14.4f, 10f, 22f, 5.5f)
                lineToRelative(13.7f, -8.2f)
                curveToRelative(7.6f, -4.5f, 10f, -14.4f, 5.5f, -22f)
                lineToRelative(-48.6f, -80.9f)
                curveToRelative(5.2f, -1.1f, 10.5f, -1.6f, 15.9f, -1.6f)
                curveToRelative(45.6f, -0.1f, 82.3f, 38.2f, 79.9f, 84.3f)
                close()
            }
        }.build()
        
        return _Motorcycle!!
    }

private var _Motorcycle: ImageVector? = null

