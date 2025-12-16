package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Loading: ImageVector
    get() {
        if (_Loading != null) return _Loading!!
        
        _Loading = ImageVector.Builder(
            name = "loading",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.5f, 8.5f)
                curveTo(13.224f, 8.5f, 13f, 8.276f, 13f, 8f)
                curveTo(13f, 5.243f, 10.757f, 3f, 8f, 3f)
                curveTo(5.243f, 3f, 3f, 5.243f, 3f, 8f)
                curveTo(3f, 8.276f, 2.776f, 8.5f, 2.5f, 8.5f)
                curveTo(2.224f, 8.5f, 2f, 8.276f, 2f, 8f)
                curveTo(2f, 4.691f, 4.691f, 2f, 8f, 2f)
                curveTo(11.309f, 2f, 14f, 4.691f, 14f, 8f)
                curveTo(14f, 8.276f, 13.776f, 8.5f, 13.5f, 8.5f)
                close()
            }
        }.build()
        
        return _Loading!!
    }

private var _Loading: ImageVector? = null

