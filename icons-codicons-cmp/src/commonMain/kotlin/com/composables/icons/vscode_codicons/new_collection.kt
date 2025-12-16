package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.NewCollection: ImageVector
    get() {
        if (_NewCollection != null) return _NewCollection!!
        
        _NewCollection = ImageVector.Builder(
            name = "new-collection",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.5f, 7f)
                curveTo(13.9853f, 7f, 16f, 9.01472f, 16f, 11.5f)
                curveTo(16f, 13.9853f, 13.9853f, 16f, 11.5f, 16f)
                curveTo(9.01472f, 16f, 7f, 13.9853f, 7f, 11.5f)
                curveTo(7f, 9.01472f, 9.01472f, 7f, 11.5f, 7f)
                close()
                moveTo(11.5f, 8.5f)
                curveTo(11.2239f, 8.5f, 11f, 8.72386f, 11f, 9f)
                verticalLineTo(11f)
                horizontalLineTo(9f)
                curveTo(8.72386f, 11f, 8.5f, 11.2239f, 8.5f, 11.5f)
                curveTo(8.5f, 11.7761f, 8.72386f, 12f, 9f, 12f)
                horizontalLineTo(11f)
                verticalLineTo(14f)
                curveTo(11f, 14.2761f, 11.2239f, 14.5f, 11.5f, 14.5f)
                curveTo(11.7761f, 14.5f, 12f, 14.2761f, 12f, 14f)
                verticalLineTo(12f)
                horizontalLineTo(14f)
                curveTo(14.2761f, 12f, 14.5f, 11.7761f, 14.5f, 11.5f)
                curveTo(14.5f, 11.2239f, 14.2761f, 11f, 14f, 11f)
                horizontalLineTo(12f)
                verticalLineTo(9f)
                curveTo(12f, 8.72386f, 11.7761f, 8.5f, 11.5f, 8.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.5f, 1f)
                curveTo(13.8978f, 1f, 14.2792f, 1.15815f, 14.5605f, 1.43945f)
                curveTo(14.8419f, 1.72076f, 15f, 2.10218f, 15f, 2.5f)
                verticalLineTo(7.25684f)
                curveTo(14.693f, 7.00335f, 14.3576f, 6.78341f, 14f, 6.60059f)
                verticalLineTo(2.5f)
                curveTo(14f, 2.36739f, 13.9473f, 2.24025f, 13.8535f, 2.14648f)
                curveTo(13.7597f, 2.05272f, 13.6326f, 2f, 13.5f, 2f)
                horizontalLineTo(8.5f)
                curveTo(8.36739f, 2f, 8.24025f, 2.05272f, 8.14648f, 2.14648f)
                curveTo(8.05272f, 2.24025f, 8f, 2.36739f, 8f, 2.5f)
                verticalLineTo(5f)
                horizontalLineTo(10.5f)
                curveTo(10.8978f, 5f, 11.2792f, 5.15815f, 11.5605f, 5.43945f)
                curveTo(11.7243f, 5.60322f, 11.8446f, 5.80146f, 11.918f, 6.0166f)
                curveTo(11.78f, 6.00623f, 11.6406f, 6f, 11.5f, 6f)
                curveTo(11.2365f, 6f, 10.9773f, 6.01885f, 10.7236f, 6.05469f)
                curveTo(10.6546f, 6.02004f, 10.5787f, 6f, 10.5f, 6f)
                horizontalLineTo(5.5f)
                curveTo(5.36739f, 6f, 5.24025f, 6.05272f, 5.14648f, 6.14648f)
                curveTo(5.05272f, 6.24025f, 5f, 6.36739f, 5f, 6.5f)
                verticalLineTo(13.5f)
                curveTo(5f, 13.6326f, 5.05272f, 13.7597f, 5.14648f, 13.8535f)
                curveTo(5.24025f, 13.9473f, 5.36739f, 14f, 5.5f, 14f)
                horizontalLineTo(6.60156f)
                curveTo(6.78445f, 14.3576f, 7.00425f, 14.693f, 7.25781f, 15f)
                horizontalLineTo(5.5f)
                curveTo(5.10218f, 15f, 4.72076f, 14.8419f, 4.43945f, 14.5605f)
                curveTo(4.15815f, 14.2792f, 4f, 13.8978f, 4f, 13.5f)
                verticalLineTo(13f)
                horizontalLineTo(2.5f)
                curveTo(2.10218f, 13f, 1.72076f, 12.8419f, 1.43945f, 12.5605f)
                curveTo(1.15815f, 12.2792f, 1f, 11.8978f, 1f, 11.5f)
                verticalLineTo(4.5f)
                curveTo(1f, 4.10218f, 1.15815f, 3.72076f, 1.43945f, 3.43945f)
                curveTo(1.72076f, 3.15815f, 2.10218f, 3f, 2.5f, 3f)
                horizontalLineTo(7f)
                verticalLineTo(2.5f)
                curveTo(7f, 2.10218f, 7.15815f, 1.72076f, 7.43945f, 1.43945f)
                curveTo(7.72076f, 1.15815f, 8.10218f, 1f, 8.5f, 1f)
                horizontalLineTo(13.5f)
                close()
                moveTo(2.5f, 4f)
                curveTo(2.36739f, 4f, 2.24025f, 4.05272f, 2.14648f, 4.14648f)
                curveTo(2.05272f, 4.24025f, 2f, 4.36739f, 2f, 4.5f)
                verticalLineTo(11.5f)
                curveTo(2f, 11.6326f, 2.05272f, 11.7597f, 2.14648f, 11.8535f)
                curveTo(2.24025f, 11.9473f, 2.36739f, 12f, 2.5f, 12f)
                horizontalLineTo(4f)
                verticalLineTo(6.5f)
                curveTo(4f, 6.10218f, 4.15815f, 5.72076f, 4.43945f, 5.43945f)
                curveTo(4.72076f, 5.15815f, 5.10218f, 5f, 5.5f, 5f)
                horizontalLineTo(7f)
                verticalLineTo(4f)
                horizontalLineTo(2.5f)
                close()
            }
        }.build()
        
        return _NewCollection!!
    }

private var _NewCollection: ImageVector? = null

