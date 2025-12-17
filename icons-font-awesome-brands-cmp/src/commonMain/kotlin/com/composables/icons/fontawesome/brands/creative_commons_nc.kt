package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.CreativeCommonsNc: ImageVector
    get() {
        if (_CreativeCommonsNc != null) return _CreativeCommonsNc!!
        
        _CreativeCommonsNc = ImageVector.Builder(
            name = "creative-commons-nc",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 496f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(247.6f, 8f)
                curveTo(387.4f, 8f, 496f, 115.9f, 496f, 256f)
                curveToRelative(0f, 147.2f, -118.5f, 248f, -248.4f, 248f)
                curveTo(113.1f, 504f, 0f, 393.2f, 0f, 256f)
                curveTo(0f, 123.1f, 104.7f, 8f, 247.6f, 8f)
                close()
                moveTo(55.8f, 189.1f)
                curveToRelative(-7.4f, 20.4f, -11.1f, 42.7f, -11.1f, 66.9f)
                curveToRelative(0f, 110.9f, 92.1f, 202.4f, 203.7f, 202.4f)
                curveToRelative(122.4f, 0f, 177.2f, -101.8f, 178.5f, -104.1f)
                lineToRelative(-93.4f, -41.6f)
                curveToRelative(-7.7f, 37.1f, -41.2f, 53f, -68.2f, 55.4f)
                verticalLineToRelative(38.1f)
                horizontalLineToRelative(-28.8f)
                verticalLineTo(368f)
                curveToRelative(-27.5f, -0.3f, -52.6f, -10.2f, -75.3f, -29.7f)
                lineToRelative(34.1f, -34.5f)
                curveToRelative(31.7f, 29.4f, 86.4f, 31.8f, 86.4f, -2.2f)
                curveToRelative(0f, -6.2f, -2.2f, -11.2f, -6.6f, -15.1f)
                curveToRelative(-14.2f, -6f, -1.8f, -0.1f, -219.3f, -97.4f)
                close()
                moveTo(248.4f, 52.3f)
                curveToRelative(-38.4f, 0f, -112.4f, 8.7f, -170.5f, 93f)
                lineToRelative(94.8f, 42.5f)
                curveToRelative(10f, -31.3f, 40.4f, -42.9f, 63.8f, -44.3f)
                verticalLineToRelative(-38.1f)
                horizontalLineToRelative(28.8f)
                verticalLineToRelative(38.1f)
                curveToRelative(22.7f, 1.2f, 43.4f, 8.9f, 62f, 23f)
                lineTo(295f, 199.7f)
                curveToRelative(-42.7f, -29.9f, -83.5f, -8f, -70f, 11.1f)
                curveToRelative(53.4f, 24.1f, 43.8f, 19.8f, 93f, 41.6f)
                lineToRelative(127.1f, 56.7f)
                curveToRelative(4.1f, -17.4f, 6.2f, -35.1f, 6.2f, -53.1f)
                curveToRelative(0f, -57f, -19.8f, -105f, -59.3f, -143.9f)
                curveToRelative(-39.3f, -39.9f, -87.2f, -59.8f, -143.6f, -59.8f)
                close()
            }
        }.build()
        
        return _CreativeCommonsNc!!
    }

private var _CreativeCommonsNc: ImageVector? = null

