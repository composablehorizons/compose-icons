package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Codiepie: ImageVector
    get() {
        if (_Codiepie != null) return _Codiepie!!
        
        _Codiepie = ImageVector.Builder(
            name = "codiepie",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 472f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(422.5f, 202.9f)
                curveToRelative(30.7f, 0f, 33.5f, 53.1f, -0.3f, 53.1f)
                horizontalLineToRelative(-10.8f)
                verticalLineToRelative(44.3f)
                horizontalLineToRelative(-26.6f)
                verticalLineToRelative(-97.4f)
                horizontalLineToRelative(37.7f)
                close()
                moveTo(472f, 352.6f)
                curveTo(429.9f, 444.5f, 350.4f, 504f, 248f, 504f)
                curveTo(111f, 504f, 0f, 393f, 0f, 256f)
                reflectiveCurveTo(111f, 8f, 248f, 8f)
                curveToRelative(97.4f, 0f, 172.8f, 53.7f, 218.2f, 138.4f)
                lineToRelative(-186f, 108.8f)
                lineTo(472f, 352.6f)
                close()
                moveToRelative(-38.5f, 12.5f)
                lineToRelative(-60.3f, -30.7f)
                curveToRelative(-27.1f, 44.3f, -70.4f, 71.4f, -122.4f, 71.4f)
                curveToRelative(-82.5f, 0f, -149.2f, -66.7f, -149.2f, -148.9f)
                curveToRelative(0f, -82.5f, 66.7f, -149.2f, 149.2f, -149.2f)
                curveToRelative(48.4f, 0f, 88.9f, 23.5f, 116.9f, 63.4f)
                lineToRelative(59.5f, -34.6f)
                curveToRelative(-40.7f, -62.6f, -104.7f, -100f, -179.2f, -100f)
                curveToRelative(-121.2f, 0f, -219.5f, 98.3f, -219.5f, 219.5f)
                reflectiveCurveTo(126.8f, 475.5f, 248f, 475.5f)
                curveToRelative(78.6f, 0f, 146.5f, -42.1f, 185.5f, -110.4f)
                close()
            }
        }.build()
        
        return _Codiepie!!
    }

private var _Codiepie: ImageVector? = null

