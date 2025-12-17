package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.Flushed: ImageVector
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
                moveTo(248f, 8f)
                curveTo(111f, 8f, 0f, 119f, 0f, 256f)
                reflectiveCurveToRelative(111f, 248f, 248f, 248f)
                reflectiveCurveToRelative(248f, -111f, 248f, -248f)
                reflectiveCurveTo(385f, 8f, 248f, 8f)
                close()
                moveToRelative(0f, 448f)
                curveToRelative(-110.3f, 0f, -200f, -89.7f, -200f, -200f)
                reflectiveCurveTo(137.7f, 56f, 248f, 56f)
                reflectiveCurveToRelative(200f, 89.7f, 200f, 200f)
                reflectiveCurveToRelative(-89.7f, 200f, -200f, 200f)
                close()
                moveToRelative(96f, -312f)
                curveToRelative(-44.2f, 0f, -80f, 35.8f, -80f, 80f)
                reflectiveCurveToRelative(35.8f, 80f, 80f, 80f)
                reflectiveCurveToRelative(80f, -35.8f, 80f, -80f)
                reflectiveCurveToRelative(-35.8f, -80f, -80f, -80f)
                close()
                moveToRelative(0f, 128f)
                curveToRelative(-26.5f, 0f, -48f, -21.5f, -48f, -48f)
                reflectiveCurveToRelative(21.5f, -48f, 48f, -48f)
                reflectiveCurveToRelative(48f, 21.5f, 48f, 48f)
                reflectiveCurveToRelative(-21.5f, 48f, -48f, 48f)
                close()
                moveToRelative(0f, -72f)
                curveToRelative(-13.3f, 0f, -24f, 10.7f, -24f, 24f)
                reflectiveCurveToRelative(10.7f, 24f, 24f, 24f)
                reflectiveCurveToRelative(24f, -10.7f, 24f, -24f)
                reflectiveCurveToRelative(-10.7f, -24f, -24f, -24f)
                close()
                moveToRelative(-112f, 24f)
                curveToRelative(0f, -44.2f, -35.8f, -80f, -80f, -80f)
                reflectiveCurveToRelative(-80f, 35.8f, -80f, 80f)
                reflectiveCurveToRelative(35.8f, 80f, 80f, 80f)
                reflectiveCurveToRelative(80f, -35.8f, 80f, -80f)
                close()
                moveToRelative(-80f, 48f)
                curveToRelative(-26.5f, 0f, -48f, -21.5f, -48f, -48f)
                reflectiveCurveToRelative(21.5f, -48f, 48f, -48f)
                reflectiveCurveToRelative(48f, 21.5f, 48f, 48f)
                reflectiveCurveToRelative(-21.5f, 48f, -48f, 48f)
                close()
                moveToRelative(0f, -72f)
                curveToRelative(-13.3f, 0f, -24f, 10.7f, -24f, 24f)
                reflectiveCurveToRelative(10.7f, 24f, 24f, 24f)
                reflectiveCurveToRelative(24f, -10.7f, 24f, -24f)
                reflectiveCurveToRelative(-10.7f, -24f, -24f, -24f)
                close()
                moveToRelative(160f, 144f)
                horizontalLineTo(184f)
                curveToRelative(-13.2f, 0f, -24f, 10.8f, -24f, 24f)
                reflectiveCurveToRelative(10.8f, 24f, 24f, 24f)
                horizontalLineToRelative(128f)
                curveToRelative(13.2f, 0f, 24f, -10.8f, 24f, -24f)
                reflectiveCurveToRelative(-10.8f, -24f, -24f, -24f)
                close()
            }
        }.build()
        
        return _Flushed!!
    }

private var _Flushed: ImageVector? = null

