package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Sleigh: ImageVector
    get() {
        if (_Sleigh != null) return _Sleigh!!
        
        _Sleigh = ImageVector.Builder(
            name = "sleigh",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(612.7f, 350.7f)
                lineToRelative(-9.3f, -7.4f)
                curveToRelative(-6.9f, -5.5f, -17f, -4.4f, -22.5f, 2.5f)
                lineToRelative(-10f, 12.5f)
                curveToRelative(-5.5f, 6.9f, -4.4f, 17f, 2.5f, 22.5f)
                lineToRelative(9.3f, 7.4f)
                curveToRelative(5.9f, 4.7f, 9.2f, 11.7f, 9.2f, 19.2f)
                curveToRelative(0f, 13.6f, -11f, 24.6f, -24.6f, 24.6f)
                horizontalLineTo(48f)
                curveToRelative(-8.8f, 0f, -16f, 7.2f, -16f, 16f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 8.8f, 7.2f, 16f, 16f, 16f)
                horizontalLineToRelative(516f)
                curveToRelative(39f, 0f, 73.7f, -29.3f, 75.9f, -68.3f)
                curveToRelative(1.4f, -23.8f, -8.7f, -46.3f, -27.2f, -61f)
                close()
                moveTo(32f, 224f)
                curveToRelative(0f, 59.6f, 40.9f, 109.2f, 96f, 123.5f)
                verticalLineTo(400f)
                horizontalLineToRelative(64f)
                verticalLineToRelative(-48f)
                horizontalLineToRelative(192f)
                verticalLineToRelative(48f)
                horizontalLineToRelative(64f)
                verticalLineToRelative(-48f)
                curveToRelative(53f, 0f, 96f, -43f, 96f, -96f)
                verticalLineToRelative(-96f)
                curveToRelative(17.7f, 0f, 32f, -14.3f, 32f, -32f)
                reflectiveCurveToRelative(-14.3f, -32f, -32f, -32f)
                horizontalLineToRelative(-96f)
                verticalLineToRelative(64f)
                curveToRelative(0f, 35.3f, -28.7f, 64f, -64f, 64f)
                horizontalLineToRelative(-20.7f)
                curveToRelative(-65.8f, 0f, -125.9f, -37.2f, -155.3f, -96f)
                curveToRelative(-29.4f, -58.8f, -89.6f, -96f, -155.3f, -96f)
                horizontalLineTo(32f)
                curveTo(14.3f, 32f, 0f, 46.3f, 0f, 64f)
                reflectiveCurveToRelative(14.3f, 32f, 32f, 32f)
                verticalLineToRelative(128f)
                close()
            }
        }.build()
        
        return _Sleigh!!
    }

private var _Sleigh: ImageVector? = null

