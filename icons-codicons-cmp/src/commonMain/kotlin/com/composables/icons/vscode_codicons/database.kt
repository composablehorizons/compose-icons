package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Database: ImageVector
    get() {
        if (_Database != null) return _Database!!
        
        _Database = ImageVector.Builder(
            name = "database",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 1f)
                curveTo(5.149f, 1f, 3f, 2.075f, 3f, 3.5f)
                verticalLineTo(12.5f)
                curveTo(3f, 13.925f, 5.149f, 15f, 8f, 15f)
                curveTo(10.851f, 15f, 13f, 13.925f, 13f, 12.5f)
                verticalLineTo(3.5f)
                curveTo(13f, 2.075f, 10.851f, 1f, 8f, 1f)
                close()
                moveTo(8f, 2f)
                curveTo(10.441f, 2f, 12f, 2.888f, 12f, 3.5f)
                curveTo(12f, 4.112f, 10.441f, 5f, 8f, 5f)
                curveTo(5.559f, 5f, 4f, 4.112f, 4f, 3.5f)
                curveTo(4f, 2.888f, 5.558f, 2f, 8f, 2f)
                close()
                moveTo(8f, 14f)
                curveTo(5.558f, 14f, 4f, 13.111f, 4f, 12.5f)
                verticalLineTo(5.021f)
                curveTo(5.21405f, 5.71872f, 6.60095f, 6.05816f, 8f, 6f)
                curveTo(9.39905f, 6.05816f, 10.7859f, 5.71872f, 12f, 5.021f)
                verticalLineTo(12.5f)
                curveTo(12f, 13.111f, 10.441f, 14f, 8f, 14f)
                close()
            }
        }.build()
        
        return _Database!!
    }

private var _Database: ImageVector? = null

