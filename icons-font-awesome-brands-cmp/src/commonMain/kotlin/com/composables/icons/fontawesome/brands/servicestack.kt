package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Servicestack: ImageVector
    get() {
        if (_Servicestack != null) return _Servicestack!!
        
        _Servicestack = ImageVector.Builder(
            name = "servicestack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 496f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(88f, 216f)
                curveToRelative(81.7f, 10.2f, 273.7f, 102.3f, 304f, 232f)
                horizontalLineTo(0f)
                curveToRelative(99.5f, -8.1f, 184.5f, -137f, 88f, -232f)
                close()
                moveToRelative(32f, -152f)
                curveToRelative(32.3f, 35.6f, 47.7f, 83.9f, 46.4f, 133.6f)
                curveTo(249.3f, 231.3f, 373.7f, 321.3f, 400f, 448f)
                horizontalLineToRelative(96f)
                curveTo(455.3f, 231.9f, 222.8f, 79.5f, 120f, 64f)
                close()
            }
        }.build()
        
        return _Servicestack!!
    }

private var _Servicestack: ImageVector? = null

