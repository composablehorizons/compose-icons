package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.CreativeCommonsZero: ImageVector
    get() {
        if (_CreativeCommonsZero != null) return _CreativeCommonsZero!!
        
        _CreativeCommonsZero = ImageVector.Builder(
            name = "creative-commons-zero",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 496f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(247.6f, 8f)
                curveTo(389.4f, 8f, 496f, 118.1f, 496f, 256f)
                curveToRelative(0f, 147.1f, -118.5f, 248f, -248.4f, 248f)
                curveTo(113.6f, 504f, 0f, 394.5f, 0f, 256f)
                curveTo(0f, 123.1f, 104.7f, 8f, 247.6f, 8f)
                close()
                moveToRelative(0.8f, 44.7f)
                curveTo(130.2f, 52.7f, 44.7f, 150.6f, 44.7f, 256f)
                curveToRelative(0f, 109.8f, 91.2f, 202.8f, 203.7f, 202.8f)
                curveToRelative(103.2f, 0f, 202.8f, -81.1f, 202.8f, -202.8f)
                curveToRelative(0.1f, -113.8f, -90.2f, -203.3f, -202.8f, -203.3f)
                close()
                moveToRelative(-0.4f, 60.5f)
                curveToRelative(-81.9f, 0f, -102.5f, 77.3f, -102.5f, 142.8f)
                curveToRelative(0f, 65.5f, 20.6f, 142.8f, 102.5f, 142.8f)
                reflectiveCurveTo(350.5f, 321.5f, 350.5f, 256f)
                curveToRelative(0f, -65.5f, -20.6f, -142.8f, -102.5f, -142.8f)
                close()
                moveToRelative(0f, 53.9f)
                curveToRelative(3.3f, 0f, 6.4f, 0.5f, 9.2f, 1.2f)
                curveToRelative(5.9f, 5.1f, 8.8f, 12.1f, 3.1f, 21.9f)
                lineToRelative(-54.5f, 100.2f)
                curveToRelative(-1.7f, -12.7f, -1.9f, -25.1f, -1.9f, -34.4f)
                curveToRelative(0f, -28.8f, 2f, -88.9f, 44.1f, -88.9f)
                close()
                moveToRelative(40.8f, 46.2f)
                curveToRelative(2.9f, 15.4f, 3.3f, 31.4f, 3.3f, 42.7f)
                curveToRelative(0f, 28.9f, -2f, 88.9f, -44.1f, 88.9f)
                curveToRelative(-13.5f, 0f, -32.6f, -7.7f, -20.1f, -26.4f)
                lineToRelative(60.9f, -105.2f)
                close()
            }
        }.build()
        
        return _CreativeCommonsZero!!
    }

private var _CreativeCommonsZero: ImageVector? = null

