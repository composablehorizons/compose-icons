package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Flushed: ImageVector
    get() {
        if (_Flushed != null) return _Flushed!!
        
        _Flushed = ImageVector.Builder(
            name = "flushed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 496f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(344f, 200f)
                curveToRelative(-13.3f, 0f, -24f, 10.7f, -24f, 24f)
                reflectiveCurveToRelative(10.7f, 24f, 24f, 24f)
                reflectiveCurveToRelative(24f, -10.7f, 24f, -24f)
                reflectiveCurveToRelative(-10.7f, -24f, -24f, -24f)
                close()
                moveToRelative(-192f, 0f)
                curveToRelative(-13.3f, 0f, -24f, 10.7f, -24f, 24f)
                reflectiveCurveToRelative(10.7f, 24f, 24f, 24f)
                reflectiveCurveToRelative(24f, -10.7f, 24f, -24f)
                reflectiveCurveToRelative(-10.7f, -24f, -24f, -24f)
                close()
                moveTo(248f, 8f)
                curveTo(111f, 8f, 0f, 119f, 0f, 256f)
                reflectiveCurveToRelative(111f, 248f, 248f, 248f)
                reflectiveCurveToRelative(248f, -111f, 248f, -248f)
                reflectiveCurveTo(385f, 8f, 248f, 8f)
                close()
                moveTo(80f, 224f)
                curveToRelative(0f, -39.8f, 32.2f, -72f, 72f, -72f)
                reflectiveCurveToRelative(72f, 32.2f, 72f, 72f)
                reflectiveCurveToRelative(-32.2f, 72f, -72f, 72f)
                reflectiveCurveToRelative(-72f, -32.2f, -72f, -72f)
                close()
                moveToRelative(232f, 176f)
                horizontalLineTo(184f)
                curveToRelative(-21.2f, 0f, -21.2f, -32f, 0f, -32f)
                horizontalLineToRelative(128f)
                curveToRelative(21.2f, 0f, 21.2f, 32f, 0f, 32f)
                close()
                moveToRelative(32f, -104f)
                curveToRelative(-39.8f, 0f, -72f, -32.2f, -72f, -72f)
                reflectiveCurveToRelative(32.2f, -72f, 72f, -72f)
                reflectiveCurveToRelative(72f, 32.2f, 72f, 72f)
                reflectiveCurveToRelative(-32.2f, 72f, -72f, 72f)
                close()
            }
        }.build()
        
        return _Flushed!!
    }

private var _Flushed: ImageVector? = null

