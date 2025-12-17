package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.MugHot: ImageVector
    get() {
        if (_MugHot != null) return _MugHot!!
        
        _MugHot = ImageVector.Builder(
            name = "mug-hot",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(127.1f, 146.5f)
                curveToRelative(1.3f, 7.7f, 8f, 13.5f, 16f, 13.5f)
                horizontalLineToRelative(16.5f)
                curveToRelative(9.8f, 0f, 17.6f, -8.5f, 16.3f, -18f)
                curveToRelative(-3.8f, -28.2f, -16.4f, -54.2f, -36.6f, -74.7f)
                curveToRelative(-14.4f, -14.7f, -23.6f, -33.3f, -26.4f, -53.5f)
                curveTo(111.8f, 5.9f, 105f, 0f, 96.8f, 0f)
                horizontalLineTo(80.4f)
                curveTo(70.6f, 0f, 63f, 8.5f, 64.1f, 18f)
                curveToRelative(3.9f, 31.9f, 18f, 61.3f, 40.6f, 84.4f)
                curveToRelative(12f, 12.2f, 19.7f, 27.5f, 22.4f, 44.1f)
                close()
                moveToRelative(112f, 0f)
                curveToRelative(1.3f, 7.7f, 8f, 13.5f, 16f, 13.5f)
                horizontalLineToRelative(16.5f)
                curveToRelative(9.8f, 0f, 17.6f, -8.5f, 16.3f, -18f)
                curveToRelative(-3.8f, -28.2f, -16.4f, -54.2f, -36.6f, -74.7f)
                curveToRelative(-14.4f, -14.7f, -23.6f, -33.3f, -26.4f, -53.5f)
                curveTo(223.8f, 5.9f, 217f, 0f, 208.8f, 0f)
                horizontalLineToRelative(-16.4f)
                curveToRelative(-9.8f, 0f, -17.5f, 8.5f, -16.3f, 18f)
                curveToRelative(3.9f, 31.9f, 18f, 61.3f, 40.6f, 84.4f)
                curveToRelative(12f, 12.2f, 19.7f, 27.5f, 22.4f, 44.1f)
                close()
                moveTo(400f, 192f)
                horizontalLineTo(32f)
                curveToRelative(-17.7f, 0f, -32f, 14.3f, -32f, 32f)
                verticalLineToRelative(192f)
                curveToRelative(0f, 53f, 43f, 96f, 96f, 96f)
                horizontalLineToRelative(192f)
                curveToRelative(53f, 0f, 96f, -43f, 96f, -96f)
                horizontalLineToRelative(16f)
                curveToRelative(61.8f, 0f, 112f, -50.2f, 112f, -112f)
                reflectiveCurveToRelative(-50.2f, -112f, -112f, -112f)
                close()
                moveToRelative(0f, 160f)
                horizontalLineToRelative(-16f)
                verticalLineToRelative(-96f)
                horizontalLineToRelative(16f)
                curveToRelative(26.5f, 0f, 48f, 21.5f, 48f, 48f)
                reflectiveCurveToRelative(-21.5f, 48f, -48f, 48f)
                close()
            }
        }.build()
        
        return _MugHot!!
    }

private var _MugHot: ImageVector? = null

