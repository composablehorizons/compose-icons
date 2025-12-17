package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.GitPullRequest: ImageVector
    get() {
        if (_GitPullRequest != null) return _GitPullRequest!!
        
        _GitPullRequest = ImageVector.Builder(
            name = "git-pull-request",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13f, 10.05f)
                verticalLineTo(5.5f)
                curveTo(13f, 4.12f, 11.88f, 3f, 10.5f, 3f)
                horizontalLineTo(8.71f)
                lineTo(9.85f, 1.85f)
                curveTo(10.05f, 1.66f, 10.05f, 1.34f, 9.85f, 1.15f)
                curveTo(9.66f, 0.95f, 9.34f, 0.95f, 9.15f, 1.15f)
                lineTo(7.15f, 3.15f)
                curveTo(6.95f, 3.34f, 6.95f, 3.66f, 7.15f, 3.85f)
                lineTo(9.15f, 5.85f)
                curveTo(9.34f, 6.05f, 9.66f, 6.05f, 9.85f, 5.85f)
                curveTo(10.05f, 5.66f, 10.05f, 5.34f, 9.85f, 5.15f)
                lineTo(8.71f, 4f)
                horizontalLineTo(10.5f)
                curveTo(11.33f, 4f, 12f, 4.67f, 12f, 5.5f)
                verticalLineTo(10.05f)
                curveTo(10.86f, 10.28f, 10f, 11.29f, 10f, 12.5f)
                curveTo(10f, 13.88f, 11.12f, 15f, 12.5f, 15f)
                curveTo(13.88f, 15f, 15f, 13.88f, 15f, 12.5f)
                curveTo(15f, 11.29f, 14.14f, 10.28f, 13f, 10.05f)
                close()
                moveTo(12.5f, 14f)
                curveTo(11.67f, 14f, 11f, 13.33f, 11f, 12.5f)
                curveTo(11f, 11.67f, 11.67f, 11f, 12.5f, 11f)
                curveTo(13.33f, 11f, 14f, 11.67f, 14f, 12.5f)
                curveTo(14f, 13.33f, 13.33f, 14f, 12.5f, 14f)
                close()
                moveTo(6f, 3.5f)
                curveTo(6f, 2.12f, 4.88f, 1f, 3.5f, 1f)
                curveTo(2.12f, 1f, 1f, 2.12f, 1f, 3.5f)
                curveTo(1f, 4.71f, 1.86f, 5.72f, 3f, 5.95f)
                verticalLineTo(10.051f)
                curveTo(1.86f, 10.283f, 1f, 11.293f, 1f, 12.5f)
                curveTo(1f, 13.879f, 2.122f, 15f, 3.5f, 15f)
                curveTo(4.878f, 15f, 6f, 13.879f, 6f, 12.5f)
                curveTo(6f, 11.292f, 5.14f, 10.283f, 4f, 10.051f)
                verticalLineTo(5.95f)
                curveTo(5.14f, 5.72f, 6f, 4.71f, 6f, 3.5f)
                close()
                moveTo(2f, 3.5f)
                curveTo(2f, 2.67f, 2.67f, 2f, 3.5f, 2f)
                curveTo(4.33f, 2f, 5f, 2.67f, 5f, 3.5f)
                curveTo(5f, 4.33f, 4.33f, 5f, 3.5f, 5f)
                curveTo(2.67f, 5f, 2f, 4.33f, 2f, 3.5f)
                close()
                moveTo(5f, 12.5f)
                curveTo(5f, 13.327f, 4.327f, 14f, 3.5f, 14f)
                curveTo(2.673f, 14f, 2f, 13.327f, 2f, 12.5f)
                curveTo(2f, 11.673f, 2.673f, 11f, 3.5f, 11f)
                curveTo(4.327f, 11f, 5f, 11.673f, 5f, 12.5f)
                close()
            }
        }.build()
        
        return _GitPullRequest!!
    }

private var _GitPullRequest: ImageVector? = null

