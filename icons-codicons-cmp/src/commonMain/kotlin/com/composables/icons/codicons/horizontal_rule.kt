package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.HorizontalRule: ImageVector
    get() {
        if (_HorizontalRule != null) return _HorizontalRule!!
        
        _HorizontalRule = ImageVector.Builder(
            name = "horizontal-rule",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.5f, 13.5f)
                curveTo(14.5f, 13.776f, 14.276f, 14f, 14f, 14f)
                horizontalLineTo(2f)
                curveTo(1.724f, 14f, 1.5f, 13.776f, 1.5f, 13.5f)
                curveTo(1.5f, 13.224f, 1.724f, 13f, 2f, 13f)
                horizontalLineTo(14f)
                curveTo(14.276f, 13f, 14.5f, 13.224f, 14.5f, 13.5f)
                close()
                moveTo(2.5f, 11f)
                curveTo(2.776f, 11f, 3f, 10.776f, 3f, 10.5f)
                verticalLineTo(7.5f)
                horizontalLineTo(6f)
                verticalLineTo(10.5f)
                curveTo(6f, 10.776f, 6.224f, 11f, 6.5f, 11f)
                curveTo(6.776f, 11f, 7f, 10.776f, 7f, 10.5f)
                verticalLineTo(3.5f)
                curveTo(7f, 3.224f, 6.776f, 3f, 6.5f, 3f)
                curveTo(6.224f, 3f, 6f, 3.224f, 6f, 3.5f)
                verticalLineTo(6.5f)
                horizontalLineTo(3f)
                verticalLineTo(3.5f)
                curveTo(3f, 3.224f, 2.776f, 3f, 2.5f, 3f)
                curveTo(2.224f, 3f, 2f, 3.224f, 2f, 3.5f)
                verticalLineTo(10.5f)
                curveTo(2f, 10.776f, 2.224f, 11f, 2.5f, 11f)
                close()
                moveTo(9f, 10.5f)
                verticalLineTo(3.5f)
                curveTo(9f, 3.224f, 9.224f, 3f, 9.5f, 3f)
                horizontalLineTo(11.75f)
                curveTo(12.99f, 3f, 14f, 4.009f, 14f, 5.25f)
                curveTo(14f, 6.142f, 13.474f, 6.907f, 12.72f, 7.271f)
                curveTo(13.326f, 7.935f, 13.621f, 8.88f, 13.811f, 9.507f)
                curveTo(13.869f, 9.696f, 13.943f, 9.944f, 13.997f, 10.065f)
                curveTo(14.148f, 10.151f, 14.25f, 10.313f, 14.25f, 10.5f)
                curveTo(14.25f, 10.776f, 14.026f, 11f, 13.75f, 11f)
                curveTo(13.219f, 11f, 13.058f, 10.469f, 12.854f, 9.797f)
                curveTo(12.487f, 8.587f, 12.069f, 7.5f, 11f, 7.5f)
                horizontalLineTo(10f)
                verticalLineTo(10.5f)
                curveTo(10f, 10.776f, 9.776f, 11f, 9.5f, 11f)
                curveTo(9.224f, 11f, 9f, 10.776f, 9f, 10.5f)
                close()
                moveTo(10f, 6.5f)
                horizontalLineTo(11.75f)
                curveTo(12.439f, 6.5f, 13f, 5.939f, 13f, 5.25f)
                curveTo(13f, 4.561f, 12.439f, 4f, 11.75f, 4f)
                horizontalLineTo(10f)
                verticalLineTo(6.5f)
                close()
            }
        }.build()
        
        return _HorizontalRule!!
    }

private var _HorizontalRule: ImageVector? = null

