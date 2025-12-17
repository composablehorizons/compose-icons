package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Skating: ImageVector
    get() {
        if (_Skating != null) return _Skating!!
        
        _Skating = ImageVector.Builder(
            name = "skating",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 0f)
                curveToRelative(-26.5f, 0f, -48f, 21.5f, -48f, 48f)
                reflectiveCurveToRelative(21.5f, 48f, 48f, 48f)
                reflectiveCurveToRelative(48f, -21.5f, 48f, -48f)
                reflectiveCurveToRelative(-21.5f, -48f, -48f, -48f)
                close()
                moveToRelative(0f, 448f)
                curveToRelative(-8.8f, 0f, -16f, 7.2f, -16f, 16f)
                reflectiveCurveToRelative(-7.2f, 16f, -16f, 16f)
                horizontalLineToRelative(-96f)
                curveToRelative(-8.8f, 0f, -16f, 7.2f, -16f, 16f)
                reflectiveCurveToRelative(7.2f, 16f, 16f, 16f)
                horizontalLineToRelative(96f)
                curveToRelative(26.5f, 0f, 48f, -21.5f, 48f, -48f)
                curveToRelative(0f, -8.8f, -7.2f, -16f, -16f, -16f)
                close()
                moveToRelative(-282.2f, 8.6f)
                curveToRelative(-6.2f, 6.2f, -16.4f, 6.3f, -22.6f, 0f)
                lineToRelative(-67.9f, -67.9f)
                curveToRelative(-6.2f, -6.2f, -16.4f, -6.2f, -22.6f, 0f)
                reflectiveCurveToRelative(-6.2f, 16.4f, 0f, 22.6f)
                lineToRelative(67.9f, 67.9f)
                curveToRelative(9.4f, 9.4f, 21.7f, 14f, 34f, 14f)
                reflectiveCurveToRelative(24.6f, -4.7f, 33.9f, -14f)
                curveToRelative(6.2f, -6.2f, 6.2f, -16.4f, 0f, -22.6f)
                reflectiveCurveToRelative(-16.4f, -6.3f, -22.7f, 0f)
                close()
                moveToRelative(56.1f, -179.8f)
                lineToRelative(-93.7f, 93.7f)
                curveToRelative(-12.5f, 12.5f, -12.5f, 32.8f, 0f, 45.2f)
                curveToRelative(6.2f, 6.2f, 14.4f, 9.4f, 22.6f, 9.4f)
                reflectiveCurveToRelative(16.4f, -3.1f, 22.6f, -9.4f)
                lineToRelative(91.9f, -91.9f)
                lineToRelative(-30.2f, -30.2f)
                curveToRelative(-5f, -5f, -9.4f, -10.7f, -13.2f, -16.8f)
                close()
                moveTo(128f, 160f)
                horizontalLineToRelative(105.5f)
                lineToRelative(-20.1f, 17.2f)
                curveToRelative(-13.5f, 11.5f, -21.6f, 28.4f, -22.3f, 46.1f)
                curveToRelative(-0.7f, 17.8f, 6.1f, 35.2f, 18.7f, 47.7f)
                lineToRelative(78.2f, 78.2f)
                verticalLineTo(432f)
                curveToRelative(0f, 17.7f, 14.3f, 32f, 32f, 32f)
                reflectiveCurveToRelative(32f, -14.3f, 32f, -32f)
                verticalLineToRelative(-89.4f)
                curveToRelative(0f, -12.6f, -5.1f, -25f, -14.1f, -33.9f)
                lineToRelative(-61f, -61f)
                curveToRelative(0.5f, -0.4f, 1.2f, -0.6f, 1.7f, -1.1f)
                lineToRelative(82.3f, -82.3f)
                curveToRelative(11.5f, -11.5f, 14.9f, -28.6f, 8.7f, -43.6f)
                curveToRelative(-6.2f, -15f, -20.7f, -24.7f, -37f, -24.7f)
                horizontalLineTo(128f)
                curveToRelative(-17.7f, 0f, -32f, 14.3f, -32f, 32f)
                reflectiveCurveToRelative(14.3f, 32f, 32f, 32f)
                close()
            }
        }.build()
        
        return _Skating!!
    }

private var _Skating: ImageVector? = null

