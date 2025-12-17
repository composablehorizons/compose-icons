package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.TachometerAlt: ImageVector
    get() {
        if (_TachometerAlt != null) return _TachometerAlt!!
        
        _TachometerAlt = ImageVector.Builder(
            name = "tachometer-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(288f, 32f)
                curveTo(128.94f, 32f, 0f, 160.94f, 0f, 320f)
                curveToRelative(0f, 52.8f, 14.25f, 102.26f, 39.06f, 144.8f)
                curveToRelative(5.61f, 9.62f, 16.3f, 15.2f, 27.44f, 15.2f)
                horizontalLineToRelative(443f)
                curveToRelative(11.14f, 0f, 21.83f, -5.58f, 27.44f, -15.2f)
                curveTo(561.75f, 422.26f, 576f, 372.8f, 576f, 320f)
                curveToRelative(0f, -159.06f, -128.94f, -288f, -288f, -288f)
                close()
                moveToRelative(0f, 64f)
                curveToRelative(14.71f, 0f, 26.58f, 10.13f, 30.32f, 23.65f)
                curveToRelative(-1.11f, 2.26f, -2.64f, 4.23f, -3.45f, 6.67f)
                lineToRelative(-9.22f, 27.67f)
                curveToRelative(-5.13f, 3.49f, -10.97f, 6.01f, -17.64f, 6.01f)
                curveToRelative(-17.67f, 0f, -32f, -14.33f, -32f, -32f)
                reflectiveCurveTo(270.33f, 96f, 288f, 96f)
                close()
                moveTo(96f, 384f)
                curveToRelative(-17.67f, 0f, -32f, -14.33f, -32f, -32f)
                reflectiveCurveToRelative(14.33f, -32f, 32f, -32f)
                reflectiveCurveToRelative(32f, 14.33f, 32f, 32f)
                reflectiveCurveToRelative(-14.33f, 32f, -32f, 32f)
                close()
                moveToRelative(48f, -160f)
                curveToRelative(-17.67f, 0f, -32f, -14.33f, -32f, -32f)
                reflectiveCurveToRelative(14.33f, -32f, 32f, -32f)
                reflectiveCurveToRelative(32f, 14.33f, 32f, 32f)
                reflectiveCurveToRelative(-14.33f, 32f, -32f, 32f)
                close()
                moveToRelative(246.77f, -72.41f)
                lineToRelative(-61.33f, 184f)
                curveTo(343.13f, 347.33f, 352f, 364.54f, 352f, 384f)
                curveToRelative(0f, 11.72f, -3.38f, 22.55f, -8.88f, 32f)
                horizontalLineTo(232.88f)
                curveToRelative(-5.5f, -9.45f, -8.88f, -20.28f, -8.88f, -32f)
                curveToRelative(0f, -33.94f, 26.5f, -61.43f, 59.9f, -63.59f)
                lineToRelative(61.34f, -184.01f)
                curveToRelative(4.17f, -12.56f, 17.73f, -19.45f, 30.36f, -15.17f)
                curveToRelative(12.57f, 4.19f, 19.35f, 17.79f, 15.17f, 30.36f)
                close()
                moveToRelative(14.66f, 57.2f)
                lineToRelative(15.52f, -46.55f)
                curveToRelative(3.47f, -1.29f, 7.13f, -2.23f, 11.05f, -2.23f)
                curveToRelative(17.67f, 0f, 32f, 14.33f, 32f, 32f)
                reflectiveCurveToRelative(-14.33f, 32f, -32f, 32f)
                curveToRelative(-11.38f, -0.01f, -20.89f, -6.28f, -26.57f, -15.22f)
                close()
                moveTo(480f, 384f)
                curveToRelative(-17.67f, 0f, -32f, -14.33f, -32f, -32f)
                reflectiveCurveToRelative(14.33f, -32f, 32f, -32f)
                reflectiveCurveToRelative(32f, 14.33f, 32f, 32f)
                reflectiveCurveToRelative(-14.33f, 32f, -32f, 32f)
                close()
            }
        }.build()
        
        return _TachometerAlt!!
    }

private var _TachometerAlt: ImageVector? = null

