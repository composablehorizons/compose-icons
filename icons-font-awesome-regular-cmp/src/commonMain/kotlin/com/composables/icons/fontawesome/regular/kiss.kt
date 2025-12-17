package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.Kiss: ImageVector
    get() {
        if (_Kiss != null) return _Kiss!!
        
        _Kiss = ImageVector.Builder(
            name = "kiss",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 496f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(168f, 176f)
                curveToRelative(-17.7f, 0f, -32f, 14.3f, -32f, 32f)
                reflectiveCurveToRelative(14.3f, 32f, 32f, 32f)
                reflectiveCurveToRelative(32f, -14.3f, 32f, -32f)
                reflectiveCurveToRelative(-14.3f, -32f, -32f, -32f)
                close()
                moveToRelative(136f, 132f)
                curveToRelative(0f, -19.2f, -28.8f, -41.5f, -71.5f, -44f)
                curveToRelative(-3.8f, -0.4f, -7.4f, 2.4f, -8.2f, 6.2f)
                curveToRelative(-0.9f, 3.8f, 1.1f, 7.7f, 4.7f, 9.2f)
                lineToRelative(16.9f, 7.2f)
                curveToRelative(13f, 5.5f, 20.8f, 13.5f, 20.8f, 21.5f)
                reflectiveCurveToRelative(-7.8f, 16f, -20.7f, 21.5f)
                lineToRelative(-17f, 7.2f)
                curveToRelative(-5.7f, 2.4f, -6f, 12.2f, 0f, 14.8f)
                lineToRelative(16.9f, 7.2f)
                curveToRelative(13f, 5.5f, 20.8f, 13.5f, 20.8f, 21.5f)
                reflectiveCurveToRelative(-7.8f, 16f, -20.7f, 21.5f)
                lineToRelative(-17f, 7.2f)
                curveToRelative(-3.6f, 1.5f, -5.6f, 5.4f, -4.7f, 9.2f)
                curveToRelative(0.8f, 3.6f, 4.1f, 6.2f, 7.8f, 6.2f)
                horizontalLineToRelative(0.5f)
                curveToRelative(42.8f, -2.5f, 71.5f, -24.8f, 71.5f, -44f)
                curveToRelative(0f, -13f, -13.4f, -27.3f, -35.2f, -36f)
                curveTo(290.6f, 335.3f, 304f, 321f, 304f, 308f)
                close()
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
                moveToRelative(80f, -280f)
                curveToRelative(-17.7f, 0f, -32f, 14.3f, -32f, 32f)
                reflectiveCurveToRelative(14.3f, 32f, 32f, 32f)
                reflectiveCurveToRelative(32f, -14.3f, 32f, -32f)
                reflectiveCurveToRelative(-14.3f, -32f, -32f, -32f)
                close()
            }
        }.build()
        
        return _Kiss!!
    }

private var _Kiss: ImageVector? = null

