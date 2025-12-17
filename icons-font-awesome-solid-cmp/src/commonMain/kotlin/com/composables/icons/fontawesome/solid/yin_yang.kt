package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.YinYang: ImageVector
    get() {
        if (_YinYang != null) return _YinYang!!
        
        _YinYang = ImageVector.Builder(
            name = "yin-yang",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 496f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(248f, 8f)
                curveTo(111.03f, 8f, 0f, 119.03f, 0f, 256f)
                reflectiveCurveToRelative(111.03f, 248f, 248f, 248f)
                reflectiveCurveToRelative(248f, -111.03f, 248f, -248f)
                reflectiveCurveTo(384.97f, 8f, 248f, 8f)
                close()
                moveToRelative(0f, 376f)
                curveToRelative(-17.67f, 0f, -32f, -14.33f, -32f, -32f)
                reflectiveCurveToRelative(14.33f, -32f, 32f, -32f)
                reflectiveCurveToRelative(32f, 14.33f, 32f, 32f)
                reflectiveCurveToRelative(-14.33f, 32f, -32f, 32f)
                close()
                moveToRelative(0f, -128f)
                curveToRelative(-53.02f, 0f, -96f, 42.98f, -96f, 96f)
                reflectiveCurveToRelative(42.98f, 96f, 96f, 96f)
                curveToRelative(-106.04f, 0f, -192f, -85.96f, -192f, -192f)
                reflectiveCurveTo(141.96f, 64f, 248f, 64f)
                curveToRelative(53.02f, 0f, 96f, 42.98f, 96f, 96f)
                reflectiveCurveToRelative(-42.98f, 96f, -96f, 96f)
                close()
                moveToRelative(0f, -128f)
                curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
                reflectiveCurveToRelative(14.33f, 32f, 32f, 32f)
                reflectiveCurveToRelative(32f, -14.33f, 32f, -32f)
                reflectiveCurveToRelative(-14.33f, -32f, -32f, -32f)
                close()
            }
        }.build()
        
        return _YinYang!!
    }

private var _YinYang: ImageVector? = null

