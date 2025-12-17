package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.DotCircle: ImageVector
    get() {
        if (_DotCircle != null) return _DotCircle!!
        
        _DotCircle = ImageVector.Builder(
            name = "dot-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(256f, 56f)
                curveToRelative(110.532f, 0f, 200f, 89.451f, 200f, 200f)
                curveToRelative(0f, 110.532f, -89.451f, 200f, -200f, 200f)
                curveToRelative(-110.532f, 0f, -200f, -89.451f, -200f, -200f)
                curveToRelative(0f, -110.532f, 89.451f, -200f, 200f, -200f)
                moveToRelative(0f, -48f)
                curveTo(119.033f, 8f, 8f, 119.033f, 8f, 256f)
                reflectiveCurveToRelative(111.033f, 248f, 248f, 248f)
                reflectiveCurveToRelative(248f, -111.033f, 248f, -248f)
                reflectiveCurveTo(392.967f, 8f, 256f, 8f)
                close()
                moveToRelative(0f, 168f)
                curveToRelative(-44.183f, 0f, -80f, 35.817f, -80f, 80f)
                reflectiveCurveToRelative(35.817f, 80f, 80f, 80f)
                reflectiveCurveToRelative(80f, -35.817f, 80f, -80f)
                reflectiveCurveToRelative(-35.817f, -80f, -80f, -80f)
                close()
            }
        }.build()
        
        return _DotCircle!!
    }

private var _DotCircle: ImageVector? = null

