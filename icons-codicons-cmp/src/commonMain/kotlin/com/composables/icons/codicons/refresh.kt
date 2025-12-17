package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Refresh: ImageVector
    get() {
        if (_Refresh != null) return _Refresh!!
        
        _Refresh = ImageVector.Builder(
            name = "refresh",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 8f)
                curveTo(3f, 5.23858f, 5.23858f, 3f, 8f, 3f)
                curveTo(9.63527f, 3f, 11.0878f, 3.78495f, 12.0005f, 5f)
                horizontalLineTo(10f)
                curveTo(9.72386f, 5f, 9.5f, 5.22386f, 9.5f, 5.5f)
                curveTo(9.5f, 5.77614f, 9.72386f, 6f, 10f, 6f)
                horizontalLineTo(12.8904f)
                curveTo(12.8973f, 6.00014f, 12.9041f, 6.00014f, 12.911f, 6f)
                horizontalLineTo(13f)
                curveTo(13.2761f, 6f, 13.5f, 5.77614f, 13.5f, 5.5f)
                verticalLineTo(2.5f)
                curveTo(13.5f, 2.22386f, 13.2761f, 2f, 13f, 2f)
                curveTo(12.7239f, 2f, 12.5f, 2.22386f, 12.5f, 2.5f)
                verticalLineTo(4.03138f)
                curveTo(11.4009f, 2.78613f, 9.79253f, 2f, 8f, 2f)
                curveTo(4.68629f, 2f, 2f, 4.68629f, 2f, 8f)
                curveTo(2f, 11.3137f, 4.68629f, 14f, 8f, 14f)
                curveTo(11.1301f, 14f, 13.6999f, 11.6035f, 13.9756f, 8.54488f)
                curveTo(14.0003f, 8.26985f, 13.7975f, 8.0268f, 13.5225f, 8.00202f)
                curveTo(13.2474f, 7.97723f, 13.0044f, 8.1801f, 12.9796f, 8.45512f)
                curveTo(12.75f, 11.003f, 10.6079f, 13f, 8f, 13f)
                curveTo(5.23858f, 13f, 3f, 10.7614f, 3f, 8f)
                close()
            }
        }.build()
        
        return _Refresh!!
    }

private var _Refresh: ImageVector? = null

