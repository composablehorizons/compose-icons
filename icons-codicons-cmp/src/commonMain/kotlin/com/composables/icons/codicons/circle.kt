package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Circle: ImageVector
    get() {
        if (_Circle != null) return _Circle!!
        
        _Circle = ImageVector.Builder(
            name = "circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 12f)
                curveTo(10.2091f, 12f, 12f, 10.2091f, 12f, 8f)
                curveTo(12f, 5.79086f, 10.2091f, 4f, 8f, 4f)
                curveTo(5.79086f, 4f, 4f, 5.79086f, 4f, 8f)
                curveTo(4f, 10.2091f, 5.79086f, 12f, 8f, 12f)
                close()
                moveTo(10.6093f, 8f)
                curveTo(10.6093f, 9.44108f, 9.44107f, 10.6093f, 8f, 10.6093f)
                curveTo(6.55893f, 10.6093f, 5.39071f, 9.44108f, 5.39071f, 8f)
                curveTo(5.39071f, 6.55893f, 6.55893f, 5.39071f, 8f, 5.39071f)
                curveTo(9.44107f, 5.39071f, 10.6093f, 6.55893f, 10.6093f, 8f)
                close()
            }
        }.build()
        
        return _Circle!!
    }

private var _Circle: ImageVector? = null

