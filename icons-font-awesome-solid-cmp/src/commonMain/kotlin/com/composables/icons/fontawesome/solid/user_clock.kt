package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.UserClock: ImageVector
    get() {
        if (_UserClock != null) return _UserClock!!
        
        _UserClock = ImageVector.Builder(
            name = "user-clock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(496f, 224f)
                curveToRelative(-79.6f, 0f, -144f, 64.4f, -144f, 144f)
                reflectiveCurveToRelative(64.4f, 144f, 144f, 144f)
                reflectiveCurveToRelative(144f, -64.4f, 144f, -144f)
                reflectiveCurveToRelative(-64.4f, -144f, -144f, -144f)
                close()
                moveToRelative(64f, 150.3f)
                curveToRelative(0f, 5.3f, -4.4f, 9.7f, -9.7f, 9.7f)
                horizontalLineToRelative(-60.6f)
                curveToRelative(-5.3f, 0f, -9.7f, -4.4f, -9.7f, -9.7f)
                verticalLineToRelative(-76.6f)
                curveToRelative(0f, -5.3f, 4.4f, -9.7f, 9.7f, -9.7f)
                horizontalLineToRelative(12.6f)
                curveToRelative(5.3f, 0f, 9.7f, 4.4f, 9.7f, 9.7f)
                verticalLineTo(352f)
                horizontalLineToRelative(38.3f)
                curveToRelative(5.3f, 0f, 9.7f, 4.4f, 9.7f, 9.7f)
                verticalLineToRelative(12.6f)
                close()
                moveTo(320f, 368f)
                curveToRelative(0f, -27.8f, 6.7f, -54.1f, 18.2f, -77.5f)
                curveToRelative(-8f, -1.5f, -16.2f, -2.5f, -24.6f, -2.5f)
                horizontalLineToRelative(-16.7f)
                curveToRelative(-22.2f, 10.2f, -46.9f, 16f, -72.9f, 16f)
                reflectiveCurveToRelative(-50.6f, -5.8f, -72.9f, -16f)
                horizontalLineToRelative(-16.7f)
                curveTo(60.2f, 288f, 0f, 348.2f, 0f, 422.4f)
                verticalLineTo(464f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48f, 48f)
                horizontalLineToRelative(347.1f)
                curveToRelative(-45.3f, -31.9f, -75.1f, -84.5f, -75.1f, -144f)
                close()
                moveToRelative(-96f, -112f)
                curveToRelative(70.7f, 0f, 128f, -57.3f, 128f, -128f)
                reflectiveCurveTo(294.7f, 0f, 224f, 0f)
                reflectiveCurveTo(96f, 57.3f, 96f, 128f)
                reflectiveCurveToRelative(57.3f, 128f, 128f, 128f)
                close()
            }
        }.build()
        
        return _UserClock!!
    }

private var _UserClock: ImageVector? = null

