package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.SadTear: ImageVector
    get() {
        if (_SadTear != null) return _SadTear!!
        
        _SadTear = ImageVector.Builder(
            name = "sad-tear",
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
                moveToRelative(8f, -152f)
                curveToRelative(-13.2f, 0f, -24f, 10.8f, -24f, 24f)
                reflectiveCurveToRelative(10.8f, 24f, 24f, 24f)
                curveToRelative(23.8f, 0f, 46.3f, 10.5f, 61.6f, 28.8f)
                curveToRelative(8.1f, 9.8f, 23.2f, 11.9f, 33.8f, 3.1f)
                curveToRelative(10.2f, -8.5f, 11.6f, -23.6f, 3.1f, -33.8f)
                curveTo(330f, 320.8f, 294.1f, 304f, 256f, 304f)
                close()
                moveToRelative(-88f, -64f)
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
                moveToRelative(-165.6f, 98.8f)
                curveTo(151f, 290.1f, 126f, 325.4f, 126f, 342.9f)
                curveToRelative(0f, 22.7f, 18.8f, 41.1f, 42f, 41.1f)
                reflectiveCurveToRelative(42f, -18.4f, 42f, -41.1f)
                curveToRelative(0f, -17.5f, -25f, -52.8f, -36.4f, -68.1f)
                curveToRelative(-2.8f, -3.7f, -8.4f, -3.7f, -11.2f, 0f)
                close()
            }
        }.build()
        
        return _SadTear!!
    }

private var _SadTear: ImageVector? = null

