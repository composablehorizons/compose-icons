package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.GitCommit: ImageVector
    get() {
        if (_GitCommit != null) return _GitCommit!!
        
        _GitCommit = ImageVector.Builder(
            name = "git-commit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.5f, 8f)
                curveTo(11.5f, 6.24f, 10.194f, 4.779f, 8.5f, 4.536f)
                verticalLineTo(1.5f)
                curveTo(8.5f, 1.224f, 8.276f, 1f, 8f, 1f)
                curveTo(7.724f, 1f, 7.5f, 1.224f, 7.5f, 1.5f)
                verticalLineTo(4.536f)
                curveTo(5.806f, 4.779f, 4.5f, 6.24f, 4.5f, 8f)
                curveTo(4.5f, 9.76f, 5.806f, 11.221f, 7.5f, 11.464f)
                verticalLineTo(14.5f)
                curveTo(7.5f, 14.776f, 7.724f, 15f, 8f, 15f)
                curveTo(8.276f, 15f, 8.5f, 14.776f, 8.5f, 14.5f)
                verticalLineTo(11.464f)
                curveTo(10.194f, 11.221f, 11.5f, 9.76f, 11.5f, 8f)
                close()
                moveTo(8f, 10.5f)
                curveTo(6.621f, 10.5f, 5.5f, 9.378f, 5.5f, 8f)
                curveTo(5.5f, 6.622f, 6.621f, 5.5f, 8f, 5.5f)
                curveTo(9.379f, 5.5f, 10.5f, 6.622f, 10.5f, 8f)
                curveTo(10.5f, 9.378f, 9.379f, 10.5f, 8f, 10.5f)
                close()
            }
        }.build()
        
        return _GitCommit!!
    }

private var _GitCommit: ImageVector? = null

