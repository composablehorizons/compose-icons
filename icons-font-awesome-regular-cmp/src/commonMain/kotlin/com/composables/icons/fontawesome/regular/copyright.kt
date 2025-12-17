package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.Copyright: ImageVector
    get() {
        if (_Copyright != null) return _Copyright!!
        
        _Copyright = ImageVector.Builder(
            name = "copyright",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(256f, 8f)
                curveTo(119.033f, 8f, 8f, 119.033f, 8f, 256f)
                reflectiveCurveToRelative(111.033f, 248f, 248f, 248f)
                reflectiveCurveToRelative(248f, -111.033f, 248f, -248f)
                reflectiveCurveTo(392.967f, 8f, 256f, 8f)
                close()
                moveToRelative(0f, 448f)
                curveToRelative(-110.532f, 0f, -200f, -89.451f, -200f, -200f)
                curveToRelative(0f, -110.531f, 89.451f, -200f, 200f, -200f)
                curveToRelative(110.532f, 0f, 200f, 89.451f, 200f, 200f)
                curveToRelative(0f, 110.532f, -89.451f, 200f, -200f, 200f)
                close()
                moveToRelative(107.351f, -101.064f)
                curveToRelative(-9.614f, 9.712f, -45.53f, 41.396f, -104.065f, 41.396f)
                curveToRelative(-82.43f, 0f, -140.484f, -61.425f, -140.484f, -141.567f)
                curveToRelative(0f, -79.152f, 60.275f, -139.401f, 139.762f, -139.401f)
                curveToRelative(55.531f, 0f, 88.738f, 26.62f, 97.593f, 34.779f)
                arcToRelative(11.965f, 11.965f, 0f, false, true, 1.936f, 15.322f)
                lineToRelative(-18.155f, 28.113f)
                curveToRelative(-3.841f, 5.95f, -11.966f, 7.282f, -17.499f, 2.921f)
                curveToRelative(-8.595f, -6.776f, -31.814f, -22.538f, -61.708f, -22.538f)
                curveToRelative(-48.303f, 0f, -77.916f, 35.33f, -77.916f, 80.082f)
                curveToRelative(0f, 41.589f, 26.888f, 83.692f, 78.277f, 83.692f)
                curveToRelative(32.657f, 0f, 56.843f, -19.039f, 65.726f, -27.225f)
                curveToRelative(5.27f, -4.857f, 13.596f, -4.039f, 17.82f, 1.738f)
                lineToRelative(19.865f, 27.17f)
                arcToRelative(11.947f, 11.947f, 0f, false, true, -1.152f, 15.518f)
                close()
            }
        }.build()
        
        return _Copyright!!
    }

private var _Copyright: ImageVector? = null

