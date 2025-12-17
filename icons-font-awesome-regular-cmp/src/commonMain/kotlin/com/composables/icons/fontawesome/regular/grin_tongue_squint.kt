package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.GrinTongueSquint: ImageVector
    get() {
        if (_GrinTongueSquint != null) return _GrinTongueSquint!!
        
        _GrinTongueSquint = ImageVector.Builder(
            name = "grin-tongue-squint",
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
                moveToRelative(36.9f, -281.1f)
                curveToRelative(-3.8f, -4.4f, -10.3f, -5.5f, -15.3f, -2.5f)
                lineToRelative(-80f, 48f)
                curveToRelative(-3.6f, 2.2f, -5.8f, 6.1f, -5.8f, 10.3f)
                reflectiveCurveToRelative(2.2f, 8.1f, 5.8f, 10.3f)
                lineToRelative(80f, 48f)
                curveToRelative(5.4f, 3.2f, 11.7f, 1.7f, 15.3f, -2.5f)
                curveToRelative(3.8f, -4.5f, 3.8f, -11f, 0.1f, -15.5f)
                lineTo(343.6f, 208f)
                lineToRelative(33.6f, -40.3f)
                curveToRelative(3.8f, -4.5f, 3.7f, -11.1f, -0.1f, -15.5f)
                close()
                moveToRelative(-162.9f, 45.5f)
                lineToRelative(-80f, -48f)
                curveToRelative(-5f, -3f, -11.4f, -2f, -15.3f, 2.5f)
                curveToRelative(-3.8f, 4.5f, -3.8f, 11f, -0.1f, 15.5f)
                lineToRelative(33.6f, 40.3f)
                lineToRelative(-33.6f, 40.3f)
                curveToRelative(-3.8f, 4.5f, -3.7f, 11f, 0.1f, 15.5f)
                curveToRelative(3.6f, 4.2f, 9.9f, 5.7f, 15.3f, 2.5f)
                lineToRelative(80f, -48f)
                curveToRelative(3.6f, -2.2f, 5.8f, -6.1f, 5.8f, -10.3f)
                reflectiveCurveToRelative(-2.2f, -8.1f, -5.8f, -10.3f)
                close()
            }
        }.build()
        
        return _GrinTongueSquint!!
    }

private var _GrinTongueSquint: ImageVector? = null

