package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.OpenPreview: ImageVector
    get() {
        if (_OpenPreview != null) return _OpenPreview!!
        
        _OpenPreview = ImageVector.Builder(
            name = "open-preview",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.5f, 1f)
                horizontalLineTo(4.5f)
                curveTo(3.122f, 1f, 2f, 2.122f, 2f, 3.5f)
                verticalLineTo(6.276f)
                curveTo(2.319f, 6.162f, 2.653f, 6.089f, 3f, 6.05f)
                verticalLineTo(3.499f)
                curveTo(3f, 2.672f, 3.673f, 1.999f, 4.5f, 1.999f)
                horizontalLineTo(8.5f)
                verticalLineTo(13.385f)
                lineTo(9.557f, 14.442f)
                curveTo(9.714f, 14.591f, 9.831f, 14.786f, 9.907f, 14.999f)
                horizontalLineTo(13.5f)
                curveTo(14.878f, 14.999f, 16f, 13.877f, 16f, 12.499f)
                verticalLineTo(3.5f)
                curveTo(16f, 2.122f, 14.878f, 1f, 13.5f, 1f)
                close()
                moveTo(15f, 12.5f)
                curveTo(15f, 13.327f, 14.327f, 14f, 13.5f, 14f)
                horizontalLineTo(9.5f)
                verticalLineTo(2f)
                horizontalLineTo(13.5f)
                curveTo(14.327f, 2f, 15f, 2.673f, 15f, 3.5f)
                verticalLineTo(12.5f)
                close()
                moveTo(6.29f, 12.59f)
                curveTo(6.74f, 12.01f, 7f, 11.28f, 7f, 10.5f)
                curveTo(7f, 8.57f, 5.43f, 7f, 3.5f, 7f)
                curveTo(1.57f, 7f, 0f, 8.57f, 0f, 10.5f)
                curveTo(0f, 12.43f, 1.57f, 14f, 3.5f, 14f)
                curveTo(4.28f, 14f, 5.01f, 13.74f, 5.59f, 13.29f)
                lineTo(8.15f, 15.85f)
                curveTo(8.24f, 15.95f, 8.37f, 16f, 8.5f, 16f)
                curveTo(8.63f, 16f, 8.76f, 15.95f, 8.85f, 15.85f)
                curveTo(9.05f, 15.66f, 9.05f, 15.34f, 8.85f, 15.15f)
                lineTo(6.29f, 12.59f)
                close()
                moveTo(5.5f, 12f)
                curveTo(5.36f, 12.19f, 5.19f, 12.36f, 5f, 12.5f)
                curveTo(4.59f, 12.81f, 4.06f, 13f, 3.5f, 13f)
                curveTo(2.12f, 13f, 1f, 11.88f, 1f, 10.5f)
                curveTo(1f, 9.12f, 2.12f, 8f, 3.5f, 8f)
                curveTo(4.88f, 8f, 6f, 9.12f, 6f, 10.5f)
                curveTo(6f, 11.06f, 5.81f, 11.59f, 5.5f, 12f)
                close()
            }
        }.build()
        
        return _OpenPreview!!
    }

private var _OpenPreview: ImageVector? = null

