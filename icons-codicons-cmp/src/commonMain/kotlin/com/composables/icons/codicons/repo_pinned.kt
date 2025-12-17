package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.RepoPinned: ImageVector
    get() {
        if (_RepoPinned != null) return _RepoPinned!!
        
        _RepoPinned = ImageVector.Builder(
            name = "repo-pinned",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 8.895f)
                curveTo(12.38f, 8.829f, 12.721f, 8.661f, 13f, 8.407f)
                verticalLineTo(11.5f)
                curveTo(13f, 11.776f, 12.776f, 12f, 12.5f, 12f)
                horizontalLineTo(4f)
                verticalLineTo(13f)
                curveTo(4f, 13.552f, 4.448f, 14f, 5f, 14f)
                verticalLineTo(13.5f)
                curveTo(5f, 13.224f, 5.224f, 13f, 5.5f, 13f)
                horizontalLineTo(7.5f)
                curveTo(7.776f, 13f, 8f, 13.224f, 8f, 13.5f)
                verticalLineTo(14f)
                horizontalLineTo(12.5f)
                curveTo(12.776f, 14f, 13f, 14.224f, 13f, 14.5f)
                curveTo(13f, 14.776f, 12.776f, 15f, 12.5f, 15f)
                horizontalLineTo(8f)
                verticalLineTo(15.5f)
                curveTo(8f, 15.702f, 7.878f, 15.885f, 7.691f, 15.962f)
                curveTo(7.63f, 15.987f, 7.564f, 16f, 7.5f, 16f)
                curveTo(7.37f, 16f, 7.242f, 15.95f, 7.146f, 15.854f)
                lineTo(6.5f, 15.208f)
                lineTo(5.854f, 15.854f)
                curveTo(5.711f, 15.997f, 5.495f, 16.039f, 5.309f, 15.962f)
                curveTo(5.122f, 15.885f, 5f, 15.702f, 5f, 15.5f)
                verticalLineTo(15f)
                curveTo(3.895f, 15f, 3f, 14.105f, 3f, 13f)
                verticalLineTo(3f)
                curveTo(3f, 1.895f, 3.895f, 1f, 5f, 1f)
                horizontalLineTo(10.023f)
                lineTo(9.535f, 2f)
                horizontalLineTo(5f)
                curveTo(4.448f, 2f, 4f, 2.448f, 4f, 3f)
                verticalLineTo(11f)
                horizontalLineTo(12f)
                verticalLineTo(8.895f)
                close()
                moveTo(15.559f, 2.373f)
                lineTo(13.627f, 0.441f)
                curveTo(13.328f, 0.142f, 12.945f, 0f, 12.566f, 0f)
                curveTo(12.018f, 0f, 11.478f, 0.297f, 11.211f, 0.846f)
                lineTo(10.406f, 2.498f)
                curveTo(10.29f, 2.737f, 10.083f, 2.92f, 9.832f, 3.007f)
                lineTo(8.727f, 3.389f)
                curveTo(8.295f, 3.538f, 8.051f, 3.935f, 8.051f, 4.34f)
                curveTo(8.051f, 4.591f, 8.145f, 4.845f, 8.345f, 5.046f)
                lineTo(9.295f, 5.996f)
                lineTo(7.999f, 7.292f)
                verticalLineTo(8.001f)
                horizontalLineTo(8.708f)
                lineTo(10.004f, 6.705f)
                lineTo(10.954f, 7.655f)
                curveTo(11.154f, 7.855f, 11.409f, 7.949f, 11.66f, 7.949f)
                curveTo(12.065f, 7.949f, 12.462f, 7.705f, 12.611f, 7.273f)
                lineTo(12.993f, 6.168f)
                curveTo(13.08f, 5.917f, 13.263f, 5.71f, 13.502f, 5.594f)
                lineTo(15.154f, 4.79f)
                curveTo(15.703f, 4.523f, 16f, 3.983f, 16f, 3.435f)
                curveTo(16f, 3.056f, 15.858f, 2.673f, 15.559f, 2.374f)
                verticalLineTo(2.373f)
                close()
            }
        }.build()
        
        return _RepoPinned!!
    }

private var _RepoPinned: ImageVector? = null

