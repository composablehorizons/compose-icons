package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.CircuitBoard: ImageVector
    get() {
        if (_CircuitBoard != null) return _CircuitBoard!!
        
        _CircuitBoard = ImageVector.Builder(
            name = "circuit-board",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.5f, 1f)
                horizontalLineTo(3.5f)
                curveTo(2.121f, 1f, 1f, 2.121f, 1f, 3.5f)
                verticalLineTo(12.5f)
                curveTo(1f, 13.879f, 2.121f, 15f, 3.5f, 15f)
                horizontalLineTo(12.5f)
                curveTo(13.879f, 15f, 15f, 13.879f, 15f, 12.5f)
                verticalLineTo(3.5f)
                curveTo(15f, 2.121f, 13.879f, 1f, 12.5f, 1f)
                close()
                moveTo(6f, 6.5f)
                curveTo(6f, 6.775f, 5.775f, 7f, 5.5f, 7f)
                curveTo(5.225f, 7f, 5f, 6.775f, 5f, 6.5f)
                curveTo(5f, 6.225f, 5.225f, 6f, 5.5f, 6f)
                curveTo(5.775f, 6f, 6f, 6.225f, 6f, 6.5f)
                close()
                moveTo(12.5f, 14f)
                horizontalLineTo(6f)
                verticalLineTo(11.5f)
                curveTo(6f, 11.225f, 6.225f, 11f, 6.5f, 11f)
                horizontalLineTo(9.092f)
                curveTo(9.299f, 11.581f, 9.849f, 12f, 10.5f, 12f)
                curveTo(11.327f, 12f, 12f, 11.327f, 12f, 10.5f)
                curveTo(12f, 9.673f, 11.327f, 9f, 10.5f, 9f)
                curveTo(9.849f, 9f, 9.299f, 9.419f, 9.092f, 10f)
                horizontalLineTo(6.5f)
                curveTo(5.673f, 10f, 5f, 10.673f, 5f, 11.5f)
                verticalLineTo(14f)
                horizontalLineTo(3.5f)
                curveTo(2.673f, 14f, 2f, 13.327f, 2f, 12.5f)
                verticalLineTo(3.5f)
                curveTo(2f, 2.673f, 2.673f, 2f, 3.5f, 2f)
                horizontalLineTo(5f)
                verticalLineTo(5.092f)
                curveTo(4.419f, 5.299f, 4f, 5.849f, 4f, 6.5f)
                curveTo(4f, 7.327f, 4.673f, 8f, 5.5f, 8f)
                curveTo(6.327f, 8f, 7f, 7.327f, 7f, 6.5f)
                curveTo(7f, 5.849f, 6.581f, 5.299f, 6f, 5.092f)
                verticalLineTo(2f)
                horizontalLineTo(12.5f)
                curveTo(13.327f, 2f, 14f, 2.673f, 14f, 3.5f)
                verticalLineTo(6f)
                horizontalLineTo(10.908f)
                curveTo(10.701f, 5.419f, 10.151f, 5f, 9.5f, 5f)
                curveTo(8.673f, 5f, 8f, 5.673f, 8f, 6.5f)
                curveTo(8f, 7.327f, 8.673f, 8f, 9.5f, 8f)
                curveTo(10.151f, 8f, 10.701f, 7.581f, 10.908f, 7f)
                horizontalLineTo(14f)
                verticalLineTo(12.5f)
                curveTo(14f, 13.327f, 13.327f, 14f, 12.5f, 14f)
                close()
                moveTo(10f, 10.5f)
                curveTo(10f, 10.225f, 10.225f, 10f, 10.5f, 10f)
                curveTo(10.775f, 10f, 11f, 10.225f, 11f, 10.5f)
                curveTo(11f, 10.775f, 10.775f, 11f, 10.5f, 11f)
                curveTo(10.225f, 11f, 10f, 10.775f, 10f, 10.5f)
                close()
                moveTo(10f, 6.5f)
                curveTo(10f, 6.775f, 9.775f, 7f, 9.5f, 7f)
                curveTo(9.225f, 7f, 9f, 6.775f, 9f, 6.5f)
                curveTo(9f, 6.225f, 9.225f, 6f, 9.5f, 6f)
                curveTo(9.775f, 6f, 10f, 6.225f, 10f, 6.5f)
                close()
            }
        }.build()
        
        return _CircuitBoard!!
    }

private var _CircuitBoard: ImageVector? = null

