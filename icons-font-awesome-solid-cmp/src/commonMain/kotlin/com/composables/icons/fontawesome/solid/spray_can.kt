package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.SprayCan: ImageVector
    get() {
        if (_SprayCan != null) return _SprayCan!!
        
        _SprayCan = ImageVector.Builder(
            name = "spray-can",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(224f, 32f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                horizontalLineToRelative(-64f)
                curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
                verticalLineToRelative(96f)
                horizontalLineToRelative(128f)
                verticalLineTo(32f)
                close()
                moveToRelative(256f, 96f)
                curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
                reflectiveCurveToRelative(14.33f, 32f, 32f, 32f)
                reflectiveCurveToRelative(32f, -14.33f, 32f, -32f)
                reflectiveCurveToRelative(-14.33f, -32f, -32f, -32f)
                close()
                moveToRelative(-256f, 32f)
                horizontalLineTo(96f)
                curveToRelative(-53.02f, 0f, -96f, 42.98f, -96f, 96f)
                verticalLineToRelative(224f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(256f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineTo(256f)
                curveToRelative(0f, -53.02f, -42.98f, -96f, -96f, -96f)
                close()
                moveToRelative(-64f, 256f)
                curveToRelative(-44.18f, 0f, -80f, -35.82f, -80f, -80f)
                reflectiveCurveToRelative(35.82f, -80f, 80f, -80f)
                reflectiveCurveToRelative(80f, 35.82f, 80f, 80f)
                reflectiveCurveToRelative(-35.82f, 80f, -80f, 80f)
                close()
                moveTo(480f, 96f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                reflectiveCurveToRelative(-14.33f, -32f, -32f, -32f)
                reflectiveCurveToRelative(-32f, 14.33f, -32f, 32f)
                reflectiveCurveToRelative(14.33f, 32f, 32f, 32f)
                close()
                moveToRelative(-96f, 32f)
                curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
                reflectiveCurveToRelative(14.33f, 32f, 32f, 32f)
                reflectiveCurveToRelative(32f, -14.33f, 32f, -32f)
                reflectiveCurveToRelative(-14.33f, -32f, -32f, -32f)
                close()
                moveToRelative(-96f, -96f)
                curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
                reflectiveCurveToRelative(14.33f, 32f, 32f, 32f)
                reflectiveCurveToRelative(32f, -14.33f, 32f, -32f)
                reflectiveCurveToRelative(-14.33f, -32f, -32f, -32f)
                close()
                moveToRelative(96f, 0f)
                curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
                reflectiveCurveToRelative(14.33f, 32f, 32f, 32f)
                reflectiveCurveToRelative(32f, -14.33f, 32f, -32f)
                reflectiveCurveToRelative(-14.33f, -32f, -32f, -32f)
                close()
                moveToRelative(96f, 192f)
                curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
                reflectiveCurveToRelative(14.33f, 32f, 32f, 32f)
                reflectiveCurveToRelative(32f, -14.33f, 32f, -32f)
                reflectiveCurveToRelative(-14.33f, -32f, -32f, -32f)
                close()
            }
        }.build()
        
        return _SprayCan!!
    }

private var _SprayCan: ImageVector? = null

