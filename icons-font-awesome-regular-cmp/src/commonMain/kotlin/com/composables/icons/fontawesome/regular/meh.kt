package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.Meh: ImageVector
    get() {
        if (_Meh != null) return _Meh!!
        
        _Meh = ImageVector.Builder(
            name = "meh",
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
                moveToRelative(-80f, -216f)
                curveToRelative(17.7f, 0f, 32f, -14.3f, 32f, -32f)
                reflectiveCurveToRelative(-14.3f, -32f, -32f, -32f)
                reflectiveCurveToRelative(-32f, 14.3f, -32f, 32f)
                reflectiveCurveToRelative(14.3f, 32f, 32f, 32f)
                close()
                moveToRelative(160f, -64f)
                curveToRelative(-17.7f, 0f, -32f, 14.3f, -32f, 32f)
                reflectiveCurveToRelative(14.3f, 32f, 32f, 32f)
                reflectiveCurveToRelative(32f, -14.3f, 32f, -32f)
                reflectiveCurveToRelative(-14.3f, -32f, -32f, -32f)
                close()
                moveToRelative(8f, 144f)
                horizontalLineTo(160f)
                curveToRelative(-13.2f, 0f, -24f, 10.8f, -24f, 24f)
                reflectiveCurveToRelative(10.8f, 24f, 24f, 24f)
                horizontalLineToRelative(176f)
                curveToRelative(13.2f, 0f, 24f, -10.8f, 24f, -24f)
                reflectiveCurveToRelative(-10.8f, -24f, -24f, -24f)
                close()
            }
        }.build()
        
        return _Meh!!
    }

private var _Meh: ImageVector? = null

