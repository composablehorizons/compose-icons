package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.RootFolder: ImageVector
    get() {
        if (_RootFolder != null) return _RootFolder!!
        
        _RootFolder = ImageVector.Builder(
            name = "root-folder",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 7f)
                curveTo(2.019f, 7f, 0f, 9.019f, 0f, 11.5f)
                curveTo(0f, 13.981f, 2.019f, 16f, 4.5f, 16f)
                curveTo(6.981f, 16f, 9f, 13.981f, 9f, 11.5f)
                curveTo(9f, 9.019f, 6.981f, 7f, 4.5f, 7f)
                close()
                moveTo(4.5f, 15f)
                curveTo(2.57f, 15f, 1f, 13.43f, 1f, 11.5f)
                curveTo(1f, 9.57f, 2.57f, 8f, 4.5f, 8f)
                curveTo(6.43f, 8f, 8f, 9.57f, 8f, 11.5f)
                curveTo(8f, 13.43f, 6.43f, 15f, 4.5f, 15f)
                close()
                moveTo(7f, 11.5f)
                curveTo(7f, 12.881f, 5.881f, 14f, 4.5f, 14f)
                curveTo(3.119f, 14f, 2f, 12.881f, 2f, 11.5f)
                curveTo(2f, 10.119f, 3.119f, 9f, 4.5f, 9f)
                curveTo(5.881f, 9f, 7f, 10.119f, 7f, 11.5f)
                close()
                moveTo(15f, 6.5f)
                verticalLineTo(11.5f)
                curveTo(15f, 12.881f, 13.881f, 14f, 12.5f, 14f)
                horizontalLineTo(10f)
                verticalLineTo(13f)
                horizontalLineTo(12.5f)
                curveTo(13.328f, 13f, 14f, 12.328f, 14f, 11.5f)
                verticalLineTo(6.5f)
                curveTo(14f, 5.672f, 13.328f, 5f, 12.5f, 5f)
                horizontalLineTo(8.207f)
                lineTo(7.207f, 6f)
                horizontalLineTo(5.586f)
                curveTo(5.719f, 6f, 5.846f, 5.947f, 5.94f, 5.854f)
                lineTo(7.294f, 4.5f)
                lineTo(5.94f, 3.146f)
                curveTo(5.846f, 3.052f, 5.719f, 3f, 5.586f, 3f)
                horizontalLineTo(3.5f)
                curveTo(2.672f, 3f, 2f, 3.672f, 2f, 4.5f)
                verticalLineTo(6f)
                horizontalLineTo(1f)
                verticalLineTo(4.5f)
                curveTo(1f, 3.119f, 2.119f, 2f, 3.5f, 2f)
                horizontalLineTo(5.586f)
                curveTo(5.984f, 2f, 6.365f, 2.158f, 6.647f, 2.439f)
                lineTo(8.208f, 4f)
                horizontalLineTo(12.501f)
                curveTo(13.882f, 4f, 15.001f, 5.119f, 15.001f, 6.5f)
                horizontalLineTo(15f)
                close()
            }
        }.build()
        
        return _RootFolder!!
    }

private var _RootFolder: ImageVector? = null

