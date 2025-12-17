package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Palette: ImageVector
    get() {
        if (_Palette != null) return _Palette!!
        
        _Palette = ImageVector.Builder(
            name = "palette",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(204.3f, 5f)
                curveTo(104.9f, 24.4f, 24.8f, 104.3f, 5.2f, 203.4f)
                curveToRelative(-37f, 187f, 131.7f, 326.4f, 258.8f, 306.7f)
                curveToRelative(41.2f, -6.4f, 61.4f, -54.6f, 42.5f, -91.7f)
                curveToRelative(-23.1f, -45.4f, 9.9f, -98.4f, 60.9f, -98.4f)
                horizontalLineToRelative(79.7f)
                curveToRelative(35.8f, 0f, 64.8f, -29.6f, 64.9f, -65.3f)
                curveTo(511.5f, 97.1f, 368.1f, -26.9f, 204.3f, 5f)
                close()
                moveTo(96f, 320f)
                curveToRelative(-17.7f, 0f, -32f, -14.3f, -32f, -32f)
                reflectiveCurveToRelative(14.3f, -32f, 32f, -32f)
                reflectiveCurveToRelative(32f, 14.3f, 32f, 32f)
                reflectiveCurveToRelative(-14.3f, 32f, -32f, 32f)
                close()
                moveToRelative(32f, -128f)
                curveToRelative(-17.7f, 0f, -32f, -14.3f, -32f, -32f)
                reflectiveCurveToRelative(14.3f, -32f, 32f, -32f)
                reflectiveCurveToRelative(32f, 14.3f, 32f, 32f)
                reflectiveCurveToRelative(-14.3f, 32f, -32f, 32f)
                close()
                moveToRelative(128f, -64f)
                curveToRelative(-17.7f, 0f, -32f, -14.3f, -32f, -32f)
                reflectiveCurveToRelative(14.3f, -32f, 32f, -32f)
                reflectiveCurveToRelative(32f, 14.3f, 32f, 32f)
                reflectiveCurveToRelative(-14.3f, 32f, -32f, 32f)
                close()
                moveToRelative(128f, 64f)
                curveToRelative(-17.7f, 0f, -32f, -14.3f, -32f, -32f)
                reflectiveCurveToRelative(14.3f, -32f, 32f, -32f)
                reflectiveCurveToRelative(32f, 14.3f, 32f, 32f)
                reflectiveCurveToRelative(-14.3f, 32f, -32f, 32f)
                close()
            }
        }.build()
        
        return _Palette!!
    }

private var _Palette: ImageVector? = null

