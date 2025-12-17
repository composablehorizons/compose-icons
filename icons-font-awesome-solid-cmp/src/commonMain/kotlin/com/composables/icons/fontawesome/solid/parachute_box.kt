package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ParachuteBox: ImageVector
    get() {
        if (_ParachuteBox != null) return _ParachuteBox!!
        
        _ParachuteBox = ImageVector.Builder(
            name = "parachute-box",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(511.9f, 175f)
                curveToRelative(-9.1f, -75.6f, -78.4f, -132.4f, -158.3f, -158.7f)
                curveTo(390f, 55.7f, 416f, 116.9f, 416f, 192f)
                horizontalLineToRelative(28.1f)
                lineTo(327.5f, 321.5f)
                curveToRelative(-2.5f, -0.6f, -4.8f, -1.5f, -7.5f, -1.5f)
                horizontalLineToRelative(-48f)
                verticalLineTo(192f)
                horizontalLineToRelative(112f)
                curveTo(384f, 76.8f, 315.1f, 0f, 256f, 0f)
                reflectiveCurveTo(128f, 76.8f, 128f, 192f)
                horizontalLineToRelative(112f)
                verticalLineToRelative(128f)
                horizontalLineToRelative(-48f)
                curveToRelative(-2.7f, 0f, -5f, 0.9f, -7.5f, 1.5f)
                lineTo(67.9f, 192f)
                horizontalLineTo(96f)
                curveToRelative(0f, -75.1f, 26f, -136.3f, 62.4f, -175.7f)
                curveTo(78.5f, 42.7f, 9.2f, 99.5f, 0.1f, 175f)
                curveToRelative(-1.1f, 9.1f, 6.8f, 17f, 16f, 17f)
                horizontalLineToRelative(8.7f)
                lineToRelative(136.7f, 151.9f)
                curveToRelative(-0.7f, 2.6f, -1.6f, 5.2f, -1.6f, 8.1f)
                verticalLineToRelative(128f)
                curveToRelative(0f, 17.7f, 14.3f, 32f, 32f, 32f)
                horizontalLineToRelative(128f)
                curveToRelative(17.7f, 0f, 32f, -14.3f, 32f, -32f)
                verticalLineTo(352f)
                curveToRelative(0f, -2.9f, -0.9f, -5.4f, -1.6f, -8.1f)
                lineTo(487.1f, 192f)
                horizontalLineToRelative(8.7f)
                curveToRelative(9.3f, 0f, 17.2f, -7.8f, 16.1f, -17f)
                close()
            }
        }.build()
        
        return _ParachuteBox!!
    }

private var _ParachuteBox: ImageVector? = null

