package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.TemperatureHigh: ImageVector
    get() {
        if (_TemperatureHigh != null) return _TemperatureHigh!!
        
        _TemperatureHigh = ImageVector.Builder(
            name = "temperature-high",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(416f, 0f)
                curveToRelative(-52.9f, 0f, -96f, 43.1f, -96f, 96f)
                reflectiveCurveToRelative(43.1f, 96f, 96f, 96f)
                reflectiveCurveToRelative(96f, -43.1f, 96f, -96f)
                reflectiveCurveToRelative(-43.1f, -96f, -96f, -96f)
                close()
                moveToRelative(0f, 128f)
                curveToRelative(-17.7f, 0f, -32f, -14.3f, -32f, -32f)
                reflectiveCurveToRelative(14.3f, -32f, 32f, -32f)
                reflectiveCurveToRelative(32f, 14.3f, 32f, 32f)
                reflectiveCurveToRelative(-14.3f, 32f, -32f, 32f)
                close()
                moveToRelative(-160f, -16f)
                curveTo(256f, 50.1f, 205.9f, 0f, 144f, 0f)
                reflectiveCurveTo(32f, 50.1f, 32f, 112f)
                verticalLineToRelative(166.5f)
                curveTo(12.3f, 303.2f, 0f, 334f, 0f, 368f)
                curveToRelative(0f, 79.5f, 64.5f, 144f, 144f, 144f)
                reflectiveCurveToRelative(144f, -64.5f, 144f, -144f)
                curveToRelative(0f, -34f, -12.3f, -64.9f, -32f, -89.5f)
                verticalLineTo(112f)
                close()
                moveTo(144f, 448f)
                curveToRelative(-44.1f, 0f, -80f, -35.9f, -80f, -80f)
                curveToRelative(0f, -25.5f, 12.2f, -48.9f, 32f, -63.8f)
                verticalLineTo(112f)
                curveToRelative(0f, -26.5f, 21.5f, -48f, 48f, -48f)
                reflectiveCurveToRelative(48f, 21.5f, 48f, 48f)
                verticalLineToRelative(192.2f)
                curveToRelative(19.8f, 14.8f, 32f, 38.3f, 32f, 63.8f)
                curveToRelative(0f, 44.1f, -35.9f, 80f, -80f, 80f)
                close()
                moveToRelative(16f, -125.1f)
                verticalLineTo(112f)
                curveToRelative(0f, -8.8f, -7.2f, -16f, -16f, -16f)
                reflectiveCurveToRelative(-16f, 7.2f, -16f, 16f)
                verticalLineToRelative(210.9f)
                curveToRelative(-18.6f, 6.6f, -32f, 24.2f, -32f, 45.1f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48f, 48f)
                reflectiveCurveToRelative(48f, -21.5f, 48f, -48f)
                curveToRelative(0f, -20.9f, -13.4f, -38.5f, -32f, -45.1f)
                close()
            }
        }.build()
        
        return _TemperatureHigh!!
    }

private var _TemperatureHigh: ImageVector? = null

