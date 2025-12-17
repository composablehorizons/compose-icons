package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.UserEdit: ImageVector
    get() {
        if (_UserEdit != null) return _UserEdit!!
        
        _UserEdit = ImageVector.Builder(
            name = "user-edit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(224f, 256f)
                curveToRelative(70.7f, 0f, 128f, -57.3f, 128f, -128f)
                reflectiveCurveTo(294.7f, 0f, 224f, 0f)
                reflectiveCurveTo(96f, 57.3f, 96f, 128f)
                reflectiveCurveToRelative(57.3f, 128f, 128f, 128f)
                close()
                moveToRelative(89.6f, 32f)
                horizontalLineToRelative(-16.7f)
                curveToRelative(-22.2f, 10.2f, -46.9f, 16f, -72.9f, 16f)
                reflectiveCurveToRelative(-50.6f, -5.8f, -72.9f, -16f)
                horizontalLineToRelative(-16.7f)
                curveTo(60.2f, 288f, 0f, 348.2f, 0f, 422.4f)
                verticalLineTo(464f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48f, 48f)
                horizontalLineToRelative(274.9f)
                curveToRelative(-2.4f, -6.8f, -3.4f, -14f, -2.6f, -21.3f)
                lineToRelative(6.8f, -60.9f)
                lineToRelative(1.2f, -11.1f)
                lineToRelative(7.9f, -7.9f)
                lineToRelative(77.3f, -77.3f)
                curveToRelative(-24.5f, -27.7f, -60f, -45.5f, -99.9f, -45.5f)
                close()
                moveToRelative(45.3f, 145.3f)
                lineToRelative(-6.8f, 61f)
                curveToRelative(-1.1f, 10.2f, 7.5f, 18.8f, 17.6f, 17.6f)
                lineToRelative(60.9f, -6.8f)
                lineToRelative(137.9f, -137.9f)
                lineToRelative(-71.7f, -71.7f)
                lineToRelative(-137.9f, 137.8f)
                close()
                moveTo(633f, 268.9f)
                lineTo(595.1f, 231f)
                curveToRelative(-9.3f, -9.3f, -24.5f, -9.3f, -33.8f, 0f)
                lineToRelative(-37.8f, 37.8f)
                lineToRelative(-4.1f, 4.1f)
                lineToRelative(71.8f, 71.7f)
                lineToRelative(41.8f, -41.8f)
                curveToRelative(9.3f, -9.4f, 9.3f, -24.5f, 0f, -33.9f)
                close()
            }
        }.build()
        
        return _UserEdit!!
    }

private var _UserEdit: ImageVector? = null

