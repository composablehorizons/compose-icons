package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Key: ImageVector
    get() {
        if (_Key != null) return _Key!!
        
        _Key = ImageVector.Builder(
            name = "key",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 5f)
                curveTo(12f, 5.552f, 11.552f, 6f, 11f, 6f)
                curveTo(10.448f, 6f, 10f, 5.552f, 10f, 5f)
                curveTo(10f, 4.448f, 10.448f, 4f, 11f, 4f)
                curveTo(11.552f, 4f, 12f, 4.448f, 12f, 5f)
                close()
                moveTo(15f, 5.5f)
                curveTo(15f, 7.981f, 12.981f, 10f, 10.5f, 10f)
                horizontalLineTo(9.186f)
                lineTo(8.389f, 10.775f)
                curveTo(8.349f, 10.814f, 8.302f, 10.846f, 8.251f, 10.87f)
                lineTo(8.072f, 10.953f)
                curveTo(8.006f, 10.983f, 7.934f, 10.999f, 7.861f, 10.999f)
                horizontalLineTo(7f)
                verticalLineTo(12.292f)
                curveTo(7f, 12.425f, 6.947f, 12.552f, 6.854f, 12.646f)
                lineTo(6.647f, 12.853f)
                curveTo(6.553f, 12.947f, 6.426f, 12.999f, 6.293f, 12.999f)
                horizontalLineTo(5f)
                verticalLineTo(14.292f)
                curveTo(5f, 14.424f, 4.947f, 14.551f, 4.854f, 14.645f)
                lineTo(4.648f, 14.852f)
                curveTo(4.554f, 14.946f, 4.426f, 14.999f, 4.294f, 14.999f)
                horizontalLineTo(2f)
                curveTo(1.448f, 14.997f, 1f, 14.548f, 1f, 13.998f)
                verticalLineTo(12.405f)
                curveTo(1f, 12.142f, 1.106f, 11.884f, 1.293f, 11.698f)
                lineTo(6.19f, 6.801f)
                curveTo(6.064f, 6.381f, 6f, 5.945f, 6f, 5.5f)
                curveTo(6f, 3.019f, 8.019f, 1f, 10.5f, 1f)
                curveTo(12.981f, 1f, 15f, 3.019f, 15f, 5.5f)
                close()
                moveTo(14f, 5.5f)
                curveTo(14f, 3.57f, 12.43f, 2f, 10.5f, 2f)
                curveTo(8.57f, 2f, 7f, 3.57f, 7f, 5.5f)
                curveTo(7f, 5.933f, 7.078f, 6.355f, 7.231f, 6.755f)
                curveTo(7.301f, 6.94f, 7.257f, 7.148f, 7.118f, 7.288f)
                lineTo(2f, 12.406f)
                verticalLineTo(13.999f)
                horizontalLineTo(4f)
                verticalLineTo(12.5f)
                curveTo(4f, 12.224f, 4.224f, 12f, 4.5f, 12f)
                horizontalLineTo(6f)
                verticalLineTo(10.5f)
                curveTo(6f, 10.224f, 6.224f, 10f, 6.5f, 10f)
                horizontalLineTo(7.752f)
                lineTo(8.634f, 9.142f)
                curveTo(8.728f, 9.051f, 8.853f, 9f, 8.983f, 9f)
                horizontalLineTo(10.501f)
                curveTo(12.431f, 9f, 14.001f, 7.43f, 14.001f, 5.5f)
                horizontalLineTo(14f)
                close()
            }
        }.build()
        
        return _Key!!
    }

private var _Key: ImageVector? = null

