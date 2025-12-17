package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.PersonAdd: ImageVector
    get() {
        if (_PersonAdd != null) return _PersonAdd!!
        
        _PersonAdd = ImageVector.Builder(
            name = "person-add",
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
                moveTo(7.5f, 1f)
                curveTo(8.74f, 1f, 9.75f, 2.009f, 9.75f, 3.25f)
                curveTo(9.75f, 3.728f, 9.5968f, 4.17016f, 9.3418f, 4.53516f)
                curveTo(10.1263f, 4.6712f, 10.7545f, 5.26239f, 10.9414f, 6.02734f)
                curveTo(10.6039f, 6.06138f, 10.2757f, 6.12745f, 9.95898f, 6.21973f)
                curveTo(9.8375f, 5.80465f, 9.45448f, 5.5f, 9f, 5.5f)
                horizontalLineTo(6f)
                curveTo(5.448f, 5.5f, 5f, 5.949f, 5f, 6.5f)
                verticalLineTo(9.5f)
                horizontalLineTo(6f)
                verticalLineTo(13.5f)
                curveTo(6f, 13.776f, 6.225f, 14f, 6.5f, 14f)
                horizontalLineTo(6.60156f)
                curveTo(6.78445f, 14.3576f, 7.00425f, 14.693f, 7.25781f, 15f)
                horizontalLineTo(6.5f)
                curveTo(5.673f, 15f, 5f, 14.327f, 5f, 13.5f)
                verticalLineTo(10.5f)
                curveTo(4.448f, 10.5f, 4f, 10.051f, 4f, 9.5f)
                verticalLineTo(6.5f)
                curveTo(4f, 5.515f, 4.7192f, 4.69916f, 5.6582f, 4.53516f)
                curveTo(5.4022f, 4.17016f, 5.25f, 3.728f, 5.25f, 3.25f)
                curveTo(5.25f, 2.009f, 6.26f, 1f, 7.5f, 1f)
                close()
                moveTo(7.5f, 2f)
                curveTo(6.811f, 2f, 6.25f, 2.561f, 6.25f, 3.25f)
                curveTo(6.25f, 3.939f, 6.811f, 4.5f, 7.5f, 4.5f)
                curveTo(8.189f, 4.5f, 8.75f, 3.939f, 8.75f, 3.25f)
                curveTo(8.75f, 2.561f, 8.189f, 2f, 7.5f, 2f)
                close()
            }
        }.build()
        
        return _PersonAdd!!
    }

private var _PersonAdd: ImageVector? = null

