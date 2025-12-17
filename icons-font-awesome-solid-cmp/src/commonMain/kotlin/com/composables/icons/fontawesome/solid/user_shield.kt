package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.UserShield: ImageVector
    get() {
        if (_UserShield != null) return _UserShield!!
        
        _UserShield = ImageVector.Builder(
            name = "user-shield",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(622.3f, 271.1f)
                lineToRelative(-115.2f, -45f)
                curveToRelative(-4.1f, -1.6f, -12.6f, -3.7f, -22.2f, 0f)
                lineToRelative(-115.2f, 45f)
                curveToRelative(-10.7f, 4.2f, -17.7f, 14f, -17.7f, 24.9f)
                curveToRelative(0f, 111.6f, 68.7f, 188.8f, 132.9f, 213.9f)
                curveToRelative(9.6f, 3.7f, 18f, 1.6f, 22.2f, 0f)
                curveTo(558.4f, 489.9f, 640f, 420.5f, 640f, 296f)
                curveToRelative(0f, -10.9f, -7f, -20.7f, -17.7f, -24.9f)
                close()
                moveTo(496f, 462.4f)
                verticalLineTo(273.3f)
                lineToRelative(95.5f, 37.3f)
                curveToRelative(-5.6f, 87.1f, -60.9f, 135.4f, -95.5f, 151.8f)
                close()
                moveTo(224f, 256f)
                curveToRelative(70.7f, 0f, 128f, -57.3f, 128f, -128f)
                reflectiveCurveTo(294.7f, 0f, 224f, 0f)
                reflectiveCurveTo(96f, 57.3f, 96f, 128f)
                reflectiveCurveToRelative(57.3f, 128f, 128f, 128f)
                close()
                moveToRelative(96f, 40f)
                curveToRelative(0f, -2.5f, 0.8f, -4.8f, 1.1f, -7.2f)
                curveToRelative(-2.5f, -0.1f, -4.9f, -0.8f, -7.5f, -0.8f)
                horizontalLineToRelative(-16.7f)
                curveToRelative(-22.2f, 10.2f, -46.9f, 16f, -72.9f, 16f)
                reflectiveCurveToRelative(-50.6f, -5.8f, -72.9f, -16f)
                horizontalLineToRelative(-16.7f)
                curveTo(60.2f, 288f, 0f, 348.2f, 0f, 422.4f)
                verticalLineTo(464f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48f, 48f)
                horizontalLineToRelative(352f)
                curveToRelative(6.8f, 0f, 13.3f, -1.5f, 19.2f, -4f)
                curveToRelative(-54f, -42.9f, -99.2f, -116.7f, -99.2f, -212f)
                close()
            }
        }.build()
        
        return _UserShield!!
    }

private var _UserShield: ImageVector? = null

