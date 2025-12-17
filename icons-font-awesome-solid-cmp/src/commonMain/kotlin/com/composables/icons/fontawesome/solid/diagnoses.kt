package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Diagnoses: ImageVector
    get() {
        if (_Diagnoses != null) return _Diagnoses!!
        
        _Diagnoses = ImageVector.Builder(
            name = "diagnoses",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(496f, 256f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                reflectiveCurveToRelative(-7.2f, -16f, -16f, -16f)
                reflectiveCurveToRelative(-16f, 7.2f, -16f, 16f)
                reflectiveCurveToRelative(7.2f, 16f, 16f, 16f)
                close()
                moveToRelative(-176f, -80f)
                curveToRelative(48.5f, 0f, 88f, -39.5f, 88f, -88f)
                reflectiveCurveTo(368.5f, 0f, 320f, 0f)
                reflectiveCurveToRelative(-88f, 39.5f, -88f, 88f)
                reflectiveCurveToRelative(39.5f, 88f, 88f, 88f)
                close()
                moveTo(59.8f, 364f)
                curveToRelative(10.2f, 15.3f, 29.3f, 17.8f, 42.9f, 9.8f)
                curveToRelative(16.2f, -9.6f, 56.2f, -31.7f, 105.3f, -48.6f)
                verticalLineTo(416f)
                horizontalLineToRelative(224f)
                verticalLineToRelative(-90.7f)
                curveToRelative(49.1f, 16.8f, 89.1f, 39f, 105.3f, 48.6f)
                curveToRelative(13.6f, 8f, 32.7f, 5.3f, 42.9f, -9.8f)
                lineToRelative(17.8f, -26.7f)
                curveToRelative(8.8f, -13.2f, 7.6f, -34.6f, -10f, -45.1f)
                curveToRelative(-11.9f, -7.1f, -29.7f, -17f, -51.1f, -27.4f)
                curveToRelative(-28.1f, 46.1f, -99.4f, 17.8f, -87.7f, -35.1f)
                curveTo(409.3f, 217.2f, 365.1f, 208f, 320f, 208f)
                curveToRelative(-57f, 0f, -112.9f, 14.5f, -160f, 32.2f)
                curveToRelative(-0.2f, 40.2f, -47.6f, 63.3f, -79.2f, 36f)
                curveToRelative(-11.2f, 6f, -21.3f, 11.6f, -28.7f, 16f)
                curveToRelative(-17.6f, 10.5f, -18.8f, 31.8f, -10f, 45.1f)
                lineTo(59.8f, 364f)
                close()
                moveTo(368f, 344f)
                curveToRelative(13.3f, 0f, 24f, 10.7f, 24f, 24f)
                reflectiveCurveToRelative(-10.7f, 24f, -24f, 24f)
                reflectiveCurveToRelative(-24f, -10.7f, -24f, -24f)
                reflectiveCurveToRelative(10.7f, -24f, 24f, -24f)
                close()
                moveToRelative(-96f, -96f)
                curveToRelative(13.3f, 0f, 24f, 10.7f, 24f, 24f)
                reflectiveCurveToRelative(-10.7f, 24f, -24f, 24f)
                reflectiveCurveToRelative(-24f, -10.7f, -24f, -24f)
                reflectiveCurveToRelative(10.7f, -24f, 24f, -24f)
                close()
                moveToRelative(-160f, 8f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                reflectiveCurveToRelative(-7.2f, -16f, -16f, -16f)
                reflectiveCurveToRelative(-16f, 7.2f, -16f, 16f)
                reflectiveCurveToRelative(7.2f, 16f, 16f, 16f)
                close()
                moveToRelative(512f, 192f)
                horizontalLineTo(16f)
                curveToRelative(-8.8f, 0f, -16f, 7.2f, -16f, 16f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 8.8f, 7.2f, 16f, 16f, 16f)
                horizontalLineToRelative(608f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -8.8f, -7.2f, -16f, -16f, -16f)
                close()
            }
        }.build()
        
        return _Diagnoses!!
    }

private var _Diagnoses: ImageVector? = null

