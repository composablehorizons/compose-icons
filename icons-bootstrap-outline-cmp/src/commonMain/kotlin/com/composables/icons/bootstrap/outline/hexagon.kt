package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Hexagon: ImageVector
    get() {
        if (_Hexagon != null) return _Hexagon!!
        
        _Hexagon = ImageVector.Builder(
            name = "hexagon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 4.577f)
                verticalLineToRelative(6.846f)
                lineTo(8f, 15f)
                lineToRelative(-6f, -3.577f)
                verticalLineTo(4.577f)
                lineTo(8f, 1f)
                close()
                moveTo(8.5f, 0.134f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 0f)
                lineToRelative(-6f, 3.577f)
                arcToRelative(1f, 1f, 0f, false, false, -0.5f, 0.866f)
                verticalLineToRelative(6.846f)
                arcToRelative(1f, 1f, 0f, false, false, 0.5f, 0.866f)
                lineToRelative(6f, 3.577f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 0f)
                lineToRelative(6f, -3.577f)
                arcToRelative(1f, 1f, 0f, false, false, 0.5f, -0.866f)
                verticalLineTo(4.577f)
                arcToRelative(1f, 1f, 0f, false, false, -0.5f, -0.866f)
                close()
            }
        }.build()
        
        return _Hexagon!!
    }

private var _Hexagon: ImageVector? = null

