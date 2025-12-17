package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Briefcase: ImageVector
    get() {
        if (_Briefcase != null) return _Briefcase!!
        
        _Briefcase = ImageVector.Builder(
            name = "briefcase",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 4f)
                verticalLineTo(2.5f)
                curveTo(5f, 1.67157f, 5.67157f, 1f, 6.5f, 1f)
                horizontalLineTo(9.5f)
                curveTo(10.3284f, 1f, 11f, 1.67157f, 11f, 2.5f)
                verticalLineTo(4f)
                horizontalLineTo(13f)
                curveTo(14.1046f, 4f, 15f, 4.89543f, 15f, 6f)
                verticalLineTo(13f)
                curveTo(15f, 14.1046f, 14.1046f, 15f, 13f, 15f)
                horizontalLineTo(3f)
                curveTo(1.89543f, 15f, 1f, 14.1046f, 1f, 13f)
                verticalLineTo(6f)
                curveTo(1f, 4.89543f, 1.89543f, 4f, 3f, 4f)
                horizontalLineTo(5f)
                close()
                moveTo(6f, 2.5f)
                verticalLineTo(4f)
                horizontalLineTo(10f)
                verticalLineTo(2.5f)
                curveTo(10f, 2.22386f, 9.77614f, 2f, 9.5f, 2f)
                horizontalLineTo(6.5f)
                curveTo(6.22386f, 2f, 6f, 2.22386f, 6f, 2.5f)
                close()
                moveTo(2f, 9.50018f)
                verticalLineTo(13f)
                curveTo(2f, 13.5523f, 2.44772f, 14f, 3f, 14f)
                horizontalLineTo(13f)
                curveTo(13.5523f, 14f, 14f, 13.5523f, 14f, 13f)
                verticalLineTo(9.50018f)
                curveTo(13.5822f, 9.81403f, 13.0628f, 10f, 12.5f, 10f)
                horizontalLineTo(9f)
                verticalLineTo(10.5f)
                curveTo(9f, 10.7761f, 8.77614f, 11f, 8.5f, 11f)
                horizontalLineTo(7.5f)
                curveTo(7.22386f, 11f, 7f, 10.7761f, 7f, 10.5f)
                verticalLineTo(10f)
                horizontalLineTo(3.5f)
                curveTo(2.9372f, 10f, 2.41783f, 9.81403f, 2f, 9.50018f)
                close()
                moveTo(7f, 9f)
                verticalLineTo(8.5f)
                curveTo(7f, 8.22386f, 7.22386f, 8f, 7.5f, 8f)
                horizontalLineTo(8.5f)
                curveTo(8.77614f, 8f, 9f, 8.22386f, 9f, 8.5f)
                verticalLineTo(9f)
                horizontalLineTo(12.5f)
                curveTo(13.3284f, 9f, 14f, 8.32843f, 14f, 7.5f)
                verticalLineTo(6f)
                curveTo(14f, 5.44772f, 13.5523f, 5f, 13f, 5f)
                horizontalLineTo(3f)
                curveTo(2.44772f, 5f, 2f, 5.44772f, 2f, 6f)
                verticalLineTo(7.5f)
                curveTo(2f, 8.32843f, 2.67157f, 9f, 3.5f, 9f)
                horizontalLineTo(7f)
                close()
            }
        }.build()
        
        return _Briefcase!!
    }

private var _Briefcase: ImageVector? = null

