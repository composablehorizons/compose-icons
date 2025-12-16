package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.RepoClone: ImageVector
    get() {
        if (_RepoClone != null) return _RepoClone!!
        
        _RepoClone = ImageVector.Builder(
            name = "repo-clone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13f, 11.5f)
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
                horizontalLineTo(9.513f)
                curveTo(9.292f, 1.292f, 9.127f, 1.628f, 9.051f, 2f)
                horizontalLineTo(5f)
                curveTo(4.448f, 2f, 4f, 2.448f, 4f, 3f)
                verticalLineTo(11f)
                horizontalLineTo(12f)
                verticalLineTo(9.91f)
                curveTo(12.157f, 9.966f, 12.324f, 10f, 12.5f, 10f)
                curveTo(12.676f, 10f, 12.843f, 9.965f, 13f, 9.909f)
                verticalLineTo(11.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 5.5f)
                curveTo(16f, 5.776f, 15.776f, 6f, 15.5f, 6f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                horizontalLineTo(15.5f)
                curveTo(15.776f, 7f, 16f, 7.224f, 16f, 7.5f)
                curveTo(16f, 7.776f, 15.776f, 8f, 15.5f, 8f)
                horizontalLineTo(13f)
                verticalLineTo(8.5f)
                curveTo(13f, 8.776f, 12.776f, 9f, 12.5f, 9f)
                curveTo(12.224f, 9f, 12f, 8.776f, 12f, 8.5f)
                verticalLineTo(8f)
                horizontalLineTo(11.5f)
                curveTo(10.673f, 8f, 10f, 7.327f, 10f, 6.5f)
                verticalLineTo(2.5f)
                curveTo(10f, 1.673f, 10.673f, 1f, 11.5f, 1f)
                horizontalLineTo(14.5f)
                curveTo(15.327f, 1f, 16f, 1.673f, 16f, 2.5f)
                verticalLineTo(5.5f)
                close()
                moveTo(11.5f, 2f)
                curveTo(11.225f, 2f, 11f, 2.224f, 11f, 2.5f)
                verticalLineTo(5.085f)
                curveTo(11.156f, 5.03f, 11.325f, 5f, 11.5f, 5f)
                horizontalLineTo(15f)
                verticalLineTo(2.5f)
                curveTo(15f, 2.224f, 14.775f, 2f, 14.5f, 2f)
                horizontalLineTo(11.5f)
                close()
                moveTo(11.5f, 7f)
                horizontalLineTo(12f)
                verticalLineTo(6f)
                horizontalLineTo(11.5f)
                curveTo(11.225f, 6f, 11f, 6.224f, 11f, 6.5f)
                curveTo(11f, 6.776f, 11.225f, 7f, 11.5f, 7f)
                close()
            }
        }.build()
        
        return _RepoClone!!
    }

private var _RepoClone: ImageVector? = null

