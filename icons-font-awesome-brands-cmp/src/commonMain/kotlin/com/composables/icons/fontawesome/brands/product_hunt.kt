package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.ProductHunt: ImageVector
    get() {
        if (_ProductHunt != null) return _ProductHunt!!
        
        _ProductHunt = ImageVector.Builder(
            name = "product-hunt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(326.3f, 218.8f)
                curveToRelative(0f, 20.5f, -16.7f, 37.2f, -37.2f, 37.2f)
                horizontalLineToRelative(-70.3f)
                verticalLineToRelative(-74.4f)
                horizontalLineToRelative(70.3f)
                curveToRelative(20.5f, 0f, 37.2f, 16.7f, 37.2f, 37.2f)
                close()
                moveTo(504f, 256f)
                curveToRelative(0f, 137f, -111f, 248f, -248f, 248f)
                reflectiveCurveTo(8f, 393f, 8f, 256f)
                reflectiveCurveTo(119f, 8f, 256f, 8f)
                reflectiveCurveToRelative(248f, 111f, 248f, 248f)
                close()
                moveToRelative(-128.1f, -37.2f)
                curveToRelative(0f, -47.9f, -38.9f, -86.8f, -86.8f, -86.8f)
                horizontalLineTo(169.2f)
                verticalLineToRelative(248f)
                horizontalLineToRelative(49.6f)
                verticalLineToRelative(-74.4f)
                horizontalLineToRelative(70.3f)
                curveToRelative(47.9f, 0f, 86.8f, -38.9f, 86.8f, -86.8f)
                close()
            }
        }.build()
        
        return _ProductHunt!!
    }

private var _ProductHunt: ImageVector? = null

