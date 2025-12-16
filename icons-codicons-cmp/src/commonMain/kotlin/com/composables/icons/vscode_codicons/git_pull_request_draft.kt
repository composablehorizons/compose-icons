package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.GitPullRequestDraft: ImageVector
    get() {
        if (_GitPullRequestDraft != null) return _GitPullRequestDraft!!
        
        _GitPullRequestDraft = ImageVector.Builder(
            name = "git-pull-request-draft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
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
                moveTo(12.5f, 10f)
                curveTo(11.122f, 10f, 10f, 11.121f, 10f, 12.5f)
                curveTo(10f, 13.879f, 11.122f, 15f, 12.5f, 15f)
                curveTo(13.878f, 15f, 15f, 13.879f, 15f, 12.5f)
                curveTo(15f, 11.121f, 13.878f, 10f, 12.5f, 10f)
                close()
                moveTo(12.5f, 14f)
                curveTo(11.673f, 14f, 11f, 13.327f, 11f, 12.5f)
                curveTo(11f, 11.673f, 11.673f, 11f, 12.5f, 11f)
                curveTo(13.327f, 11f, 14f, 11.673f, 14f, 12.5f)
                curveTo(14f, 13.327f, 13.327f, 14f, 12.5f, 14f)
                close()
                moveTo(11.5f, 7.5f)
                curveTo(11.5f, 6.948f, 11.948f, 6.5f, 12.5f, 6.5f)
                curveTo(13.052f, 6.5f, 13.5f, 6.948f, 13.5f, 7.5f)
                curveTo(13.5f, 8.052f, 13.052f, 8.5f, 12.5f, 8.5f)
                curveTo(11.948f, 8.5f, 11.5f, 8.052f, 11.5f, 7.5f)
                close()
                moveTo(11.5f, 3.5f)
                curveTo(11.5f, 2.948f, 11.948f, 2.5f, 12.5f, 2.5f)
                curveTo(13.052f, 2.5f, 13.5f, 2.948f, 13.5f, 3.5f)
                curveTo(13.5f, 4.052f, 13.052f, 4.5f, 12.5f, 4.5f)
                curveTo(11.948f, 4.5f, 11.5f, 4.052f, 11.5f, 3.5f)
                close()
            }
        }.build()
        
        return _GitPullRequestDraft!!
    }

private var _GitPullRequestDraft: ImageVector? = null

