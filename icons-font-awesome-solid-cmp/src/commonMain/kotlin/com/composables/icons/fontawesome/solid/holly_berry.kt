package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.HollyBerry: ImageVector
    get() {
        if (_HollyBerry != null) return _HollyBerry!!
        
        _HollyBerry = ImageVector.Builder(
            name = "holly-berry",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(144f, 192f)
                curveToRelative(26.5f, 0f, 48f, -21.5f, 48f, -48f)
                reflectiveCurveToRelative(-21.5f, -48f, -48f, -48f)
                reflectiveCurveToRelative(-48f, 21.5f, -48f, 48f)
                reflectiveCurveToRelative(21.5f, 48f, 48f, 48f)
                close()
                moveToRelative(112f, -48f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48f, 48f)
                reflectiveCurveToRelative(48f, -21.5f, 48f, -48f)
                reflectiveCurveToRelative(-21.5f, -48f, -48f, -48f)
                reflectiveCurveToRelative(-48f, 21.5f, -48f, 48f)
                close()
                moveToRelative(-32f, -48f)
                curveToRelative(26.5f, 0f, 48f, -21.5f, 48f, -48f)
                reflectiveCurveTo(250.5f, 0f, 224f, 0f)
                reflectiveCurveToRelative(-48f, 21.5f, -48f, 48f)
                reflectiveCurveToRelative(21.5f, 48f, 48f, 48f)
                close()
                moveToRelative(-16.2f, 139.1f)
                curveToRelative(0.1f, -12.4f, -13.1f, -20.1f, -23.8f, -13.7f)
                curveToRelative(-34.3f, 20.3f, -71.4f, 32.7f, -108.7f, 36.2f)
                curveToRelative(-9.7f, 0.9f, -15.6f, 11.3f, -11.6f, 20.2f)
                curveToRelative(6.2f, 13.9f, 11.1f, 28.6f, 14.7f, 43.8f)
                curveToRelative(3.6f, 15.2f, -5.3f, 30.6f, -20.2f, 35.1f)
                curveToRelative(-14.9f, 4.5f, -30.1f, 7.6f, -45.3f, 9.1f)
                curveToRelative(-9.7f, 1f, -15.7f, 11.3f, -11.7f, 20.2f)
                curveToRelative(15f, 32.8f, 22.9f, 69.5f, 23f, 107.7f)
                curveToRelative(0.1f, 14.4f, 15.2f, 23.1f, 27.6f, 16f)
                curveToRelative(33.2f, -19f, 68.9f, -30.5f, 104.8f, -33.9f)
                curveToRelative(9.7f, -0.9f, 15.6f, -11.3f, 11.6f, -20.2f)
                curveToRelative(-6.2f, -13.9f, -11.1f, -28.6f, -14.7f, -43.8f)
                curveToRelative(-3.6f, -15.2f, 5.3f, -30.6f, 20.2f, -35.1f)
                curveToRelative(14.9f, -4.5f, 30.1f, -7.6f, 45.3f, -9.1f)
                curveToRelative(9.7f, -1f, 15.7f, -11.3f, 11.7f, -20.2f)
                curveToRelative(-15.5f, -34.2f, -23.3f, -72.5f, -22.9f, -112.3f)
                close()
                moveTo(435f, 365.6f)
                curveToRelative(-15.2f, -1.6f, -30.3f, -4.7f, -45.3f, -9.1f)
                curveToRelative(-14.9f, -4.5f, -23.8f, -19.9f, -20.2f, -35.1f)
                curveToRelative(3.6f, -15.2f, 8.5f, -29.8f, 14.7f, -43.8f)
                curveToRelative(4f, -8.9f, -1.9f, -19.3f, -11.6f, -20.2f)
                curveToRelative(-37.3f, -3.5f, -74.4f, -15.9f, -108.7f, -36.2f)
                curveToRelative(-10.7f, -6.3f, -23.9f, 1.4f, -23.8f, 13.7f)
                curveToRelative(0f, 1.6f, -0.2f, 3.2f, -0.2f, 4.9f)
                curveToRelative(0.2f, 33.3f, 7f, 65.7f, 19.9f, 94f)
                curveToRelative(5.7f, 12.4f, 5.2f, 26.6f, -0.6f, 38.9f)
                curveToRelative(4.9f, 1.2f, 9.9f, 2.2f, 14.8f, 3.7f)
                curveToRelative(14.9f, 4.5f, 23.8f, 19.9f, 20.2f, 35.1f)
                curveToRelative(-3.6f, 15.2f, -8.5f, 29.8f, -14.7f, 43.8f)
                curveToRelative(-4f, 8.9f, 1.9f, 19.3f, 11.6f, 20.2f)
                curveToRelative(35.9f, 3.4f, 71.6f, 14.9f, 104.8f, 33.9f)
                curveToRelative(12.5f, 7.1f, 27.6f, -1.6f, 27.6f, -16f)
                curveToRelative(0.2f, -38.2f, 8f, -75f, 23f, -107.7f)
                curveToRelative(4.3f, -8.7f, -1.8f, -19.1f, -11.5f, -20.1f)
                close()
            }
        }.build()
        
        return _HollyBerry!!
    }

private var _HollyBerry: ImageVector? = null

