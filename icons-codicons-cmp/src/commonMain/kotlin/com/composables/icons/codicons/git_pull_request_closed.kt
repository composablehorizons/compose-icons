package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.GitPullRequestClosed: ImageVector
    get() {
        if (_GitPullRequestClosed != null) return _GitPullRequestClosed!!
        
        _GitPullRequestClosed = ImageVector.Builder(
            name = "git-pull-request-closed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13f, 10.05f)
                verticalLineTo(7.5f)
                curveTo(13f, 7.224f, 12.776f, 7f, 12.5f, 7f)
                curveTo(12.224f, 7f, 12f, 7.224f, 12f, 7.5f)
                verticalLineTo(10.05f)
                curveTo(10.86f, 10.282f, 10f, 11.292f, 10f, 12.5f)
                curveTo(10f, 13.879f, 11.122f, 15f, 12.5f, 15f)
                curveTo(13.878f, 15f, 15f, 13.879f, 15f, 12.5f)
                curveTo(15f, 11.292f, 14.14f, 10.283f, 13f, 10.05f)
                close()
                moveTo(12.5f, 14f)
                curveTo(11.673f, 14f, 11f, 13.327f, 11f, 12.5f)
                curveTo(11f, 11.673f, 11.673f, 11f, 12.5f, 11f)
                curveTo(13.327f, 11f, 14f, 11.673f, 14f, 12.5f)
                curveTo(14f, 13.327f, 13.327f, 14f, 12.5f, 14f)
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
                moveTo(5f, 12.5f)
                curveTo(5f, 13.327f, 4.327f, 14f, 3.5f, 14f)
                curveTo(2.673f, 14f, 2f, 13.327f, 2f, 12.5f)
                curveTo(2f, 11.673f, 2.673f, 11f, 3.5f, 11f)
                curveTo(4.327f, 11f, 5f, 11.673f, 5f, 12.5f)
                close()
                moveTo(3.5f, 5f)
                curveTo(2.67f, 5f, 2f, 4.33f, 2f, 3.5f)
                curveTo(2f, 2.67f, 2.67f, 2f, 3.5f, 2f)
                curveTo(4.33f, 2f, 5f, 2.67f, 5f, 3.5f)
                curveTo(5f, 4.33f, 4.33f, 5f, 3.5f, 5f)
                close()
                moveTo(10.646f, 4.646f)
                lineTo(11.792f, 3.5f)
                lineTo(10.646f, 2.354f)
                curveTo(10.451f, 2.159f, 10.451f, 1.842f, 10.646f, 1.647f)
                curveTo(10.841f, 1.452f, 11.158f, 1.452f, 11.353f, 1.647f)
                lineTo(12.499f, 2.793f)
                lineTo(13.645f, 1.647f)
                curveTo(13.84f, 1.452f, 14.157f, 1.452f, 14.352f, 1.647f)
                curveTo(14.547f, 1.842f, 14.547f, 2.159f, 14.352f, 2.354f)
                lineTo(13.206f, 3.5f)
                lineTo(14.352f, 4.646f)
                curveTo(14.547f, 4.841f, 14.547f, 5.158f, 14.352f, 5.353f)
                curveTo(14.254f, 5.451f, 14.126f, 5.499f, 13.998f, 5.499f)
                curveTo(13.87f, 5.499f, 13.742f, 5.45f, 13.644f, 5.353f)
                lineTo(12.498f, 4.207f)
                lineTo(11.352f, 5.353f)
                curveTo(11.254f, 5.451f, 11.126f, 5.499f, 10.998f, 5.499f)
                curveTo(10.87f, 5.499f, 10.742f, 5.45f, 10.644f, 5.353f)
                curveTo(10.449f, 5.158f, 10.449f, 4.841f, 10.644f, 4.646f)
                horizontalLineTo(10.646f)
                close()
            }
        }.build()
        
        return _GitPullRequestClosed!!
    }

private var _GitPullRequestClosed: ImageVector? = null

