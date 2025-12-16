package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.GitPullRequestNewChanges: ImageVector
    get() {
        if (_GitPullRequestNewChanges != null) return _GitPullRequestNewChanges!!
        
        _GitPullRequestNewChanges = ImageVector.Builder(
            name = "git-pull-request-new-changes",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.561f, 4.353f)
                lineTo(9.647f, 1.439f)
                curveTo(9.368f, 1.16f, 8.981f, 1f, 8.586f, 1f)
                horizontalLineTo(4f)
                curveTo(2.897f, 1f, 2f, 1.897f, 2f, 3f)
                verticalLineTo(13f)
                curveTo(2f, 14.103f, 2.897f, 15f, 4f, 15f)
                horizontalLineTo(9.382f)
                curveTo(9.054f, 14.713f, 8.776f, 14.378f, 8.556f, 13.999f)
                horizontalLineTo(4f)
                curveTo(3.448f, 13.999f, 3f, 13.551f, 3f, 12.999f)
                verticalLineTo(2.999f)
                curveTo(3f, 2.447f, 3.448f, 1.999f, 4f, 1.999f)
                horizontalLineTo(8.586f)
                curveTo(8.718f, 1.999f, 8.847f, 2.053f, 8.94f, 2.145f)
                lineTo(11.854f, 5.059f)
                curveTo(11.947f, 5.152f, 12f, 5.281f, 12f, 5.413f)
                verticalLineTo(8f)
                curveTo(12.347f, 8f, 12.678f, 8.058f, 13f, 8.142f)
                verticalLineTo(5.414f)
                curveTo(13f, 5.019f, 12.84f, 4.633f, 12.561f, 4.353f)
                close()
                moveTo(9.5f, 5.999f)
                horizontalLineTo(8f)
                verticalLineTo(4.499f)
                curveTo(8f, 4.223f, 7.776f, 3.999f, 7.5f, 3.999f)
                curveTo(7.224f, 3.999f, 7f, 4.223f, 7f, 4.499f)
                verticalLineTo(5.999f)
                horizontalLineTo(5.5f)
                curveTo(5.224f, 5.999f, 5f, 6.223f, 5f, 6.499f)
                curveTo(5f, 6.775f, 5.224f, 6.999f, 5.5f, 6.999f)
                horizontalLineTo(7f)
                verticalLineTo(8.499f)
                curveTo(7f, 8.775f, 7.224f, 8.999f, 7.5f, 8.999f)
                curveTo(7.776f, 8.999f, 8f, 8.775f, 8f, 8.499f)
                verticalLineTo(6.999f)
                horizontalLineTo(9.5f)
                curveTo(9.776f, 6.999f, 10f, 6.775f, 10f, 6.499f)
                curveTo(10f, 6.223f, 9.776f, 5.999f, 9.5f, 5.999f)
                close()
                moveTo(5f, 11.499f)
                curveTo(5f, 11.775f, 5.224f, 11.999f, 5.5f, 11.999f)
                horizontalLineTo(8f)
                curveTo(8f, 11.652f, 8.059f, 11.32f, 8.142f, 10.999f)
                horizontalLineTo(5.5f)
                curveTo(5.224f, 10.999f, 5f, 11.223f, 5f, 11.499f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 15f)
                curveTo(13.6569f, 15f, 15f, 13.6569f, 15f, 12f)
                curveTo(15f, 10.3431f, 13.6569f, 9f, 12f, 9f)
                curveTo(10.3431f, 9f, 9f, 10.3431f, 9f, 12f)
                curveTo(9f, 13.6569f, 10.3431f, 15f, 12f, 15f)
                close()
            }
        }.build()
        
        return _GitPullRequestNewChanges!!
    }

private var _GitPullRequestNewChanges: ImageVector? = null

