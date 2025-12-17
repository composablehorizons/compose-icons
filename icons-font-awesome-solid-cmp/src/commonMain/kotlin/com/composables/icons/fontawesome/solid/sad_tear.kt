package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.SadTear: ImageVector
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
                moveToRelative(80f, 168f)
                curveToRelative(17.7f, 0f, 32f, 14.3f, 32f, 32f)
                reflectiveCurveToRelative(-14.3f, 32f, -32f, 32f)
                reflectiveCurveToRelative(-32f, -14.3f, -32f, -32f)
                reflectiveCurveToRelative(14.3f, -32f, 32f, -32f)
                close()
                moveTo(152f, 416f)
                curveToRelative(-26.5f, 0f, -48f, -21f, -48f, -47f)
                curveToRelative(0f, -20f, 28.5f, -60.4f, 41.6f, -77.8f)
                curveToRelative(3.2f, -4.3f, 9.6f, -4.3f, 12.8f, 0f)
                curveTo(171.5f, 308.6f, 200f, 349f, 200f, 369f)
                curveToRelative(0f, 26f, -21.5f, 47f, -48f, 47f)
                close()
                moveToRelative(16f, -176f)
                curveToRelative(-17.7f, 0f, -32f, -14.3f, -32f, -32f)
                reflectiveCurveToRelative(14.3f, -32f, 32f, -32f)
                reflectiveCurveToRelative(32f, 14.3f, 32f, 32f)
                reflectiveCurveToRelative(-14.3f, 32f, -32f, 32f)
                close()
                moveToRelative(170.2f, 154.2f)
                curveTo(315.8f, 367.4f, 282.9f, 352f, 248f, 352f)
                curveToRelative(-21.2f, 0f, -21.2f, -32f, 0f, -32f)
                curveToRelative(44.4f, 0f, 86.3f, 19.6f, 114.7f, 53.8f)
                curveToRelative(13.8f, 16.4f, -11.2f, 36.5f, -24.5f, 20.4f)
                close()
            }
        }.build()
        
        return _SadTear!!
    }

private var _SadTear: ImageVector? = null

