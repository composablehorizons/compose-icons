package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.GrinHearts: ImageVector
    get() {
        if (_GrinHearts != null) return _GrinHearts!!
        
        _GrinHearts = ImageVector.Builder(
            name = "grin-hearts",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 496f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(353.6f, 304.6f)
                curveToRelative(-25.9f, 8.3f, -64.4f, 13.1f, -105.6f, 13.1f)
                reflectiveCurveToRelative(-79.6f, -4.8f, -105.6f, -13.1f)
                curveToRelative(-9.8f, -3.1f, -19.4f, 5.3f, -17.7f, 15.3f)
                curveToRelative(7.9f, 47.2f, 71.3f, 80f, 123.3f, 80f)
                reflectiveCurveToRelative(115.3f, -32.9f, 123.3f, -80f)
                curveToRelative(1.6f, -9.8f, -7.7f, -18.4f, -17.7f, -15.3f)
                close()
                moveToRelative(-152.8f, -48.9f)
                curveToRelative(4.5f, 1.2f, 9.2f, -1.5f, 10.5f, -6f)
                lineToRelative(19.4f, -69.9f)
                curveToRelative(5.6f, -20.3f, -7.4f, -41.1f, -28.8f, -44.5f)
                curveToRelative(-18.6f, -3f, -36.4f, 9.8f, -41.5f, 27.9f)
                lineToRelative(-2f, 7.1f)
                lineToRelative(-7.1f, -1.9f)
                curveToRelative(-18.2f, -4.7f, -38.2f, 4.3f, -44.9f, 22f)
                curveToRelative(-7.7f, 20.2f, 3.8f, 41.9f, 24.2f, 47.2f)
                lineToRelative(70.2f, 18.1f)
                close()
                moveToRelative(188.8f, -65.3f)
                curveToRelative(-6.7f, -17.6f, -26.7f, -26.7f, -44.9f, -22f)
                lineToRelative(-7.1f, 1.9f)
                lineToRelative(-2f, -7.1f)
                curveToRelative(-5f, -18.1f, -22.8f, -30.9f, -41.5f, -27.9f)
                curveToRelative(-21.4f, 3.4f, -34.4f, 24.2f, -28.8f, 44.5f)
                lineToRelative(19.4f, 69.9f)
                curveToRelative(1.2f, 4.5f, 5.9f, 7.2f, 10.5f, 6f)
                lineToRelative(70.2f, -18.2f)
                curveToRelative(20.4f, -5.3f, 31.9f, -26.9f, 24.2f, -47.1f)
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
            }
        }.build()
        
        return _GrinHearts!!
    }

private var _GrinHearts: ImageVector? = null

