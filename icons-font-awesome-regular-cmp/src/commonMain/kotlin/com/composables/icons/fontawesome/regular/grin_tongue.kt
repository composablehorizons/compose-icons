package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.GrinTongue: ImageVector
    get() {
        if (_GrinTongue != null) return _GrinTongue!!
        
        _GrinTongue = ImageVector.Builder(
            name = "grin-tongue",
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
                moveToRelative(64f, 400f)
                curveToRelative(0f, 35.6f, -29.1f, 64.5f, -64.9f, 64f)
                curveToRelative(-35.1f, -0.5f, -63.1f, -29.8f, -63.1f, -65f)
                verticalLineToRelative(-42.8f)
                lineToRelative(17.7f, -8.8f)
                curveToRelative(15f, -7.5f, 31.5f, 1.7f, 34.9f, 16.5f)
                lineToRelative(2.8f, 12.1f)
                curveToRelative(2.1f, 9.2f, 15.2f, 9.2f, 17.3f, 0f)
                lineToRelative(2.8f, -12.1f)
                curveToRelative(3.4f, -14.8f, 19.8f, -24.1f, 34.9f, -16.5f)
                lineToRelative(17.7f, 8.8f)
                verticalLineTo(408f)
                close()
                moveToRelative(28.2f, 25.3f)
                curveToRelative(2.2f, -8.1f, 3.8f, -16.5f, 3.8f, -25.3f)
                verticalLineToRelative(-43.5f)
                curveToRelative(14.2f, -12.4f, 24.4f, -27.5f, 27.3f, -44.5f)
                curveToRelative(1.7f, -9.9f, -7.7f, -18.5f, -17.7f, -15.3f)
                curveToRelative(-25.9f, 8.3f, -64.4f, 13.1f, -105.6f, 13.1f)
                reflectiveCurveToRelative(-79.6f, -4.8f, -105.6f, -13.1f)
                curveToRelative(-9.9f, -3.1f, -19.4f, 5.3f, -17.7f, 15.3f)
                curveToRelative(2.9f, 17f, 13.1f, 32.1f, 27.3f, 44.5f)
                verticalLineTo(408f)
                curveToRelative(0f, 8.8f, 1.6f, 17.2f, 3.8f, 25.3f)
                curveTo(91.8f, 399.9f, 48f, 333f, 48f, 256f)
                curveToRelative(0f, -110.3f, 89.7f, -200f, 200f, -200f)
                reflectiveCurveToRelative(200f, 89.7f, 200f, 200f)
                curveToRelative(0f, 77f, -43.8f, 143.9f, -107.8f, 177.3f)
                close()
                moveTo(168f, 176f)
                curveToRelative(-17.7f, 0f, -32f, 14.3f, -32f, 32f)
                reflectiveCurveToRelative(14.3f, 32f, 32f, 32f)
                reflectiveCurveToRelative(32f, -14.3f, 32f, -32f)
                reflectiveCurveToRelative(-14.3f, -32f, -32f, -32f)
                close()
                moveToRelative(160f, 0f)
                curveToRelative(-17.7f, 0f, -32f, 14.3f, -32f, 32f)
                reflectiveCurveToRelative(14.3f, 32f, 32f, 32f)
                reflectiveCurveToRelative(32f, -14.3f, 32f, -32f)
                reflectiveCurveToRelative(-14.3f, -32f, -32f, -32f)
                close()
            }
        }.build()
        
        return _GrinTongue!!
    }

private var _GrinTongue: ImageVector? = null

