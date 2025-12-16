package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.GitBranch: ImageVector
    get() {
        if (_GitBranch != null) return _GitBranch!!
        
        _GitBranch = ImageVector.Builder(
            name = "git-branch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 5.5f)
                curveTo(14f, 4.121f, 12.879f, 3f, 11.5f, 3f)
                curveTo(10.121f, 3f, 9f, 4.121f, 9f, 5.5f)
                curveTo(9f, 6.682f, 9.826f, 7.669f, 10.93f, 7.928f)
                curveTo(10.744f, 8.546f, 10.177f, 9f, 9.5f, 9f)
                horizontalLineTo(6.5f)
                curveTo(5.935f, 9f, 5.419f, 9.195f, 5f, 9.512f)
                verticalLineTo(4.949f)
                curveTo(6.14f, 4.717f, 7f, 3.707f, 7f, 2.5f)
                curveTo(7f, 1.121f, 5.879f, 0f, 4.5f, 0f)
                curveTo(3.121f, 0f, 2f, 1.121f, 2f, 2.5f)
                curveTo(2f, 3.708f, 2.86f, 4.717f, 4f, 4.949f)
                verticalLineTo(11.05f)
                curveTo(2.86f, 11.282f, 2f, 12.292f, 2f, 13.499f)
                curveTo(2f, 14.878f, 3.121f, 15.999f, 4.5f, 15.999f)
                curveTo(5.879f, 15.999f, 7f, 14.878f, 7f, 13.499f)
                curveTo(7f, 12.317f, 6.174f, 11.33f, 5.07f, 11.071f)
                curveTo(5.256f, 10.453f, 5.823f, 9.999f, 6.5f, 9.999f)
                horizontalLineTo(9.5f)
                curveTo(10.723f, 9.999f, 11.74f, 9.115f, 11.954f, 7.953f)
                curveTo(13.116f, 7.738f, 14f, 6.723f, 14f, 5.5f)
                close()
                moveTo(3f, 2.5f)
                curveTo(3f, 1.673f, 3.673f, 1f, 4.5f, 1f)
                curveTo(5.327f, 1f, 6f, 1.673f, 6f, 2.5f)
                curveTo(6f, 3.327f, 5.327f, 4f, 4.5f, 4f)
                curveTo(3.673f, 4f, 3f, 3.327f, 3f, 2.5f)
                close()
                moveTo(6f, 13.5f)
                curveTo(6f, 14.327f, 5.327f, 15f, 4.5f, 15f)
                curveTo(3.673f, 15f, 3f, 14.327f, 3f, 13.5f)
                curveTo(3f, 12.673f, 3.673f, 12f, 4.5f, 12f)
                curveTo(5.327f, 12f, 6f, 12.673f, 6f, 13.5f)
                close()
                moveTo(11.5f, 7f)
                curveTo(10.673f, 7f, 10f, 6.327f, 10f, 5.5f)
                curveTo(10f, 4.673f, 10.673f, 4f, 11.5f, 4f)
                curveTo(12.327f, 4f, 13f, 4.673f, 13f, 5.5f)
                curveTo(13f, 6.327f, 12.327f, 7f, 11.5f, 7f)
                close()
            }
        }.build()
        
        return _GitBranch!!
    }

private var _GitBranch: ImageVector? = null

