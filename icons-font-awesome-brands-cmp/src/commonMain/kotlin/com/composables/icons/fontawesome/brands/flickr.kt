package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Flickr: ImageVector
    get() {
        if (_Flickr != null) return _Flickr!!
        
        _Flickr = ImageVector.Builder(
            name = "flickr",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 32f)
                horizontalLineTo(48f)
                curveTo(21.5f, 32f, 0f, 53.5f, 0f, 80f)
                verticalLineToRelative(352f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48f, 48f)
                horizontalLineToRelative(352f)
                curveToRelative(26.5f, 0f, 48f, -21.5f, 48f, -48f)
                verticalLineTo(80f)
                curveToRelative(0f, -26.5f, -21.5f, -48f, -48f, -48f)
                close()
                moveTo(144.5f, 319f)
                curveToRelative(-35.1f, 0f, -63.5f, -28.4f, -63.5f, -63.5f)
                reflectiveCurveToRelative(28.4f, -63.5f, 63.5f, -63.5f)
                reflectiveCurveToRelative(63.5f, 28.4f, 63.5f, 63.5f)
                reflectiveCurveToRelative(-28.4f, 63.5f, -63.5f, 63.5f)
                close()
                moveToRelative(159f, 0f)
                curveToRelative(-35.1f, 0f, -63.5f, -28.4f, -63.5f, -63.5f)
                reflectiveCurveToRelative(28.4f, -63.5f, 63.5f, -63.5f)
                reflectiveCurveToRelative(63.5f, 28.4f, 63.5f, 63.5f)
                reflectiveCurveToRelative(-28.4f, 63.5f, -63.5f, 63.5f)
                close()
            }
        }.build()
        
        return _Flickr!!
    }

private var _Flickr: ImageVector? = null

