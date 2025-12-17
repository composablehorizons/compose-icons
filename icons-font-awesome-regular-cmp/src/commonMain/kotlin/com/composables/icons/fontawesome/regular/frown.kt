package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.Frown: ImageVector
    get() {
        if (_Frown != null) return _Frown!!
        
        _Frown = ImageVector.Builder(
            name = "frown",
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
                moveToRelative(-80f, 128f)
                curveToRelative(-40.2f, 0f, -78f, 17.7f, -103.8f, 48.6f)
                curveToRelative(-8.5f, 10.2f, -7.1f, 25.3f, 3.1f, 33.8f)
                curveToRelative(10.2f, 8.4f, 25.3f, 7.1f, 33.8f, -3.1f)
                curveToRelative(16.6f, -19.9f, 41f, -31.4f, 66.9f, -31.4f)
                reflectiveCurveToRelative(50.3f, 11.4f, 66.9f, 31.4f)
                curveToRelative(8.1f, 9.7f, 23.1f, 11.9f, 33.8f, 3.1f)
                curveToRelative(10.2f, -8.5f, 11.5f, -23.6f, 3.1f, -33.8f)
                curveTo(326f, 321.7f, 288.2f, 304f, 248f, 304f)
                close()
            }
        }.build()
        
        return _Frown!!
    }

private var _Frown: ImageVector? = null

