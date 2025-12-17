package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Donate: ImageVector
    get() {
        if (_Donate != null) return _Donate!!
        
        _Donate = ImageVector.Builder(
            name = "donate",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(256f, 416f)
                curveToRelative(114.9f, 0f, 208f, -93.1f, 208f, -208f)
                reflectiveCurveTo(370.9f, 0f, 256f, 0f)
                reflectiveCurveTo(48f, 93.1f, 48f, 208f)
                reflectiveCurveToRelative(93.1f, 208f, 208f, 208f)
                close()
                moveTo(233.8f, 97.4f)
                verticalLineTo(80.6f)
                curveToRelative(0f, -9.2f, 7.4f, -16.6f, 16.6f, -16.6f)
                horizontalLineToRelative(11.1f)
                curveToRelative(9.2f, 0f, 16.6f, 7.4f, 16.6f, 16.6f)
                verticalLineToRelative(17f)
                curveToRelative(15.5f, 0.8f, 30.5f, 6.1f, 43f, 15.4f)
                curveToRelative(5.6f, 4.1f, 6.2f, 12.3f, 1.2f, 17.1f)
                lineTo(306f, 145.6f)
                curveToRelative(-3.8f, 3.7f, -9.5f, 3.8f, -14f, 1f)
                curveToRelative(-5.4f, -3.4f, -11.4f, -5.1f, -17.8f, -5.1f)
                horizontalLineToRelative(-38.9f)
                curveToRelative(-9f, 0f, -16.3f, 8.2f, -16.3f, 18.3f)
                curveToRelative(0f, 8.2f, 5f, 15.5f, 12.1f, 17.6f)
                lineToRelative(62.3f, 18.7f)
                curveToRelative(25.7f, 7.7f, 43.7f, 32.4f, 43.7f, 60.1f)
                curveToRelative(0f, 34f, -26.4f, 61.5f, -59.1f, 62.4f)
                verticalLineToRelative(16.8f)
                curveToRelative(0f, 9.2f, -7.4f, 16.6f, -16.6f, 16.6f)
                horizontalLineToRelative(-11.1f)
                curveToRelative(-9.2f, 0f, -16.6f, -7.4f, -16.6f, -16.6f)
                verticalLineToRelative(-17f)
                curveToRelative(-15.5f, -0.8f, -30.5f, -6.1f, -43f, -15.4f)
                curveToRelative(-5.6f, -4.1f, -6.2f, -12.3f, -1.2f, -17.1f)
                lineToRelative(16.3f, -15.5f)
                curveToRelative(3.8f, -3.7f, 9.5f, -3.8f, 14f, -1f)
                curveToRelative(5.4f, 3.4f, 11.4f, 5.1f, 17.8f, 5.1f)
                horizontalLineToRelative(38.9f)
                curveToRelative(9f, 0f, 16.3f, -8.2f, 16.3f, -18.3f)
                curveToRelative(0f, -8.2f, -5f, -15.5f, -12.1f, -17.6f)
                lineToRelative(-62.3f, -18.7f)
                curveToRelative(-25.7f, -7.7f, -43.7f, -32.4f, -43.7f, -60.1f)
                curveToRelative(0.1f, -34f, 26.4f, -61.5f, 59.1f, -62.4f)
                close()
                moveTo(480f, 352f)
                horizontalLineToRelative(-32.5f)
                curveToRelative(-19.6f, 26f, -44.6f, 47.7f, -73f, 64f)
                horizontalLineToRelative(63.8f)
                curveToRelative(5.3f, 0f, 9.6f, 3.6f, 9.6f, 8f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 4.4f, -4.3f, 8f, -9.6f, 8f)
                horizontalLineTo(73.6f)
                curveToRelative(-5.3f, 0f, -9.6f, -3.6f, -9.6f, -8f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -4.4f, 4.3f, -8f, 9.6f, -8f)
                horizontalLineToRelative(63.8f)
                curveToRelative(-28.4f, -16.3f, -53.3f, -38f, -73f, -64f)
                horizontalLineTo(32f)
                curveToRelative(-17.7f, 0f, -32f, 14.3f, -32f, 32f)
                verticalLineToRelative(96f)
                curveToRelative(0f, 17.7f, 14.3f, 32f, 32f, 32f)
                horizontalLineToRelative(448f)
                curveToRelative(17.7f, 0f, 32f, -14.3f, 32f, -32f)
                verticalLineToRelative(-96f)
                curveToRelative(0f, -17.7f, -14.3f, -32f, -32f, -32f)
                close()
            }
        }.build()
        
        return _Donate!!
    }

private var _Donate: ImageVector? = null

