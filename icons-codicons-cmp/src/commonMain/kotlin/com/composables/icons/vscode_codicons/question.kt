package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Question: ImageVector
    get() {
        if (_Question != null) return _Question!!
        
        _Question = ImageVector.Builder(
            name = "question",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 11f)
                curveTo(8.41421f, 11f, 8.75f, 11.3358f, 8.75f, 11.75f)
                curveTo(8.75f, 12.1642f, 8.41421f, 12.5f, 8f, 12.5f)
                curveTo(7.58579f, 12.5f, 7.25f, 12.1642f, 7.25f, 11.75f)
                curveTo(7.25f, 11.3358f, 7.58579f, 11f, 8f, 11f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 4f)
                curveTo(9.262f, 4f, 10.25f, 4.988f, 10.25f, 6.25f)
                curveTo(10.25f, 7.333f, 9.68352f, 7.89852f, 9.22852f, 8.35352f)
                curveTo(8.82052f, 8.76052f, 8.5f, 9.082f, 8.5f, 9.75f)
                curveTo(8.5f, 10.026f, 8.276f, 10.25f, 8f, 10.25f)
                curveTo(7.724f, 10.25f, 7.5f, 10.026f, 7.5f, 9.75f)
                curveTo(7.5f, 8.667f, 8.06648f, 8.10148f, 8.52148f, 7.64648f)
                curveTo(8.92948f, 7.23948f, 9.25f, 6.918f, 9.25f, 6.25f)
                curveTo(9.25f, 5.538f, 8.712f, 5f, 8f, 5f)
                curveTo(7.288f, 5f, 6.75f, 5.538f, 6.75f, 6.25f)
                curveTo(6.75f, 6.526f, 6.526f, 6.75f, 6.25f, 6.75f)
                curveTo(5.974f, 6.75f, 5.75f, 6.526f, 5.75f, 6.25f)
                curveTo(5.75f, 4.988f, 6.738f, 4f, 8f, 4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 1f)
                curveTo(11.86f, 1f, 15f, 4.14f, 15f, 8f)
                curveTo(15f, 11.86f, 11.86f, 15f, 8f, 15f)
                curveTo(4.14f, 15f, 1f, 11.86f, 1f, 8f)
                curveTo(1f, 4.14f, 4.14f, 1f, 8f, 1f)
                close()
                moveTo(8f, 2f)
                curveTo(4.691f, 2f, 2f, 4.691f, 2f, 8f)
                curveTo(2f, 11.309f, 4.691f, 14f, 8f, 14f)
                curveTo(11.309f, 14f, 14f, 11.309f, 14f, 8f)
                curveTo(14f, 4.691f, 11.309f, 2f, 8f, 2f)
                close()
            }
        }.build()
        
        return _Question!!
    }

private var _Question: ImageVector? = null

