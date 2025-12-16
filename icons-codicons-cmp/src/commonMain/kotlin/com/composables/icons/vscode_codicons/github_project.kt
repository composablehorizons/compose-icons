package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.GithubProject: ImageVector
    get() {
        if (_GithubProject != null) return _GithubProject!!
        
        _GithubProject = ImageVector.Builder(
            name = "github-project",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.5f, 2f)
                horizontalLineTo(4.5f)
                curveTo(3.119f, 2f, 2f, 3.119f, 2f, 4.5f)
                verticalLineTo(11.5f)
                curveTo(2f, 12.881f, 3.119f, 14f, 4.5f, 14f)
                horizontalLineTo(11.5f)
                curveTo(12.881f, 14f, 14f, 12.881f, 14f, 11.5f)
                verticalLineTo(4.5f)
                curveTo(14f, 3.119f, 12.881f, 2f, 11.5f, 2f)
                close()
                moveTo(3f, 4.5f)
                curveTo(3f, 3.672f, 3.672f, 3f, 4.5f, 3f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                horizontalLineTo(3f)
                verticalLineTo(4.5f)
                close()
                moveTo(4.5f, 13f)
                curveTo(3.672f, 13f, 3f, 12.328f, 3f, 11.5f)
                verticalLineTo(7f)
                horizontalLineTo(6f)
                verticalLineTo(13f)
                horizontalLineTo(4.5f)
                close()
                moveTo(13f, 11.5f)
                curveTo(13f, 12.328f, 12.328f, 13f, 11.5f, 13f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                horizontalLineTo(13f)
                verticalLineTo(11.5f)
                close()
                moveTo(13f, 6f)
                horizontalLineTo(7f)
                verticalLineTo(3f)
                horizontalLineTo(11.5f)
                curveTo(12.328f, 3f, 13f, 3.672f, 13f, 4.5f)
                verticalLineTo(6f)
                close()
            }
        }.build()
        
        return _GithubProject!!
    }

private var _GithubProject: ImageVector? = null

