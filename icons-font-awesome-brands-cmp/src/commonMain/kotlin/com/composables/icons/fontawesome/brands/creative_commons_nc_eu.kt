package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.CreativeCommonsNcEu: ImageVector
    get() {
        if (_CreativeCommonsNcEu != null) return _CreativeCommonsNcEu!!
        
        _CreativeCommonsNcEu = ImageVector.Builder(
            name = "creative-commons-nc-eu",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 496f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(247.7f, 8f)
                curveTo(103.6f, 8f, 0f, 124.8f, 0f, 256f)
                curveToRelative(0f, 136.3f, 111.7f, 248f, 247.7f, 248f)
                curveTo(377.9f, 504f, 496f, 403.1f, 496f, 256f)
                curveTo(496f, 117f, 388.4f, 8f, 247.7f, 8f)
                close()
                moveToRelative(0.6f, 450.7f)
                curveToRelative(-112f, 0f, -203.6f, -92.5f, -203.6f, -202.7f)
                curveToRelative(0f, -23.2f, 3.7f, -45.2f, 10.9f, -66f)
                lineToRelative(65.7f, 29.1f)
                horizontalLineToRelative(-4.7f)
                verticalLineToRelative(29.5f)
                horizontalLineToRelative(23.3f)
                curveToRelative(0f, 6.2f, -0.4f, 3.2f, -0.4f, 19.5f)
                horizontalLineToRelative(-22.8f)
                verticalLineToRelative(29.5f)
                horizontalLineToRelative(27f)
                curveToRelative(11.4f, 67f, 67.2f, 101.3f, 124.6f, 101.3f)
                curveToRelative(26.6f, 0f, 50.6f, -7.9f, 64.8f, -15.8f)
                lineToRelative(-10f, -46.1f)
                curveToRelative(-8.7f, 4.6f, -28.2f, 10.8f, -47.3f, 10.8f)
                curveToRelative(-28.2f, 0f, -58.1f, -10.9f, -67.3f, -50.2f)
                horizontalLineToRelative(90.3f)
                lineToRelative(128.3f, 56.8f)
                curveToRelative(-1.5f, 2.1f, -56.2f, 104.3f, -178.8f, 104.3f)
                close()
                moveToRelative(-16.7f, -190.6f)
                lineToRelative(-0.5f, -0.4f)
                lineToRelative(0.9f, 0.4f)
                horizontalLineToRelative(-0.4f)
                close()
                moveToRelative(77.2f, -19.5f)
                horizontalLineToRelative(3.7f)
                verticalLineToRelative(-29.5f)
                horizontalLineToRelative(-70.3f)
                lineToRelative(-28.6f, -12.6f)
                curveToRelative(2.5f, -5.5f, 5.4f, -10.5f, 8.8f, -14.3f)
                curveToRelative(12.9f, -15.8f, 31.1f, -22.4f, 51.1f, -22.4f)
                curveToRelative(18.3f, 0f, 35.3f, 5.4f, 46.1f, 10f)
                lineToRelative(11.6f, -47.3f)
                curveToRelative(-15f, -6.6f, -37f, -12.4f, -62.3f, -12.4f)
                curveToRelative(-39f, 0f, -72.2f, 15.8f, -95.9f, 42.3f)
                curveToRelative(-5.3f, 6.1f, -9.8f, 12.9f, -13.9f, 20.1f)
                lineToRelative(-81.6f, -36.1f)
                curveToRelative(64.6f, -96.8f, 157.7f, -93.6f, 170.7f, -93.6f)
                curveToRelative(113f, 0f, 203f, 90.2f, 203f, 203.4f)
                curveToRelative(0f, 18.7f, -2.1f, 36.3f, -6.3f, 52.9f)
                lineToRelative(-136.1f, -60.5f)
                close()
            }
        }.build()
        
        return _CreativeCommonsNcEu!!
    }

private var _CreativeCommonsNcEu: ImageVector? = null

