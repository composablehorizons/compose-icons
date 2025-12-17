package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Grid: ImageVector
    get() {
        if (_Grid != null) return _Grid!!
        
        _Grid = ImageVector.Builder(
            name = "grid",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 2.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 2.5f, 1f)
                horizontalLineToRelative(3f)
                arcTo(1.5f, 1.5f, 0f, false, true, 7f, 2.5f)
                verticalLineToRelative(3f)
                arcTo(1.5f, 1.5f, 0f, false, true, 5.5f, 7f)
                horizontalLineToRelative(-3f)
                arcTo(1.5f, 1.5f, 0f, false, true, 1f, 5.5f)
                close()
                moveToRelative(8f, 0f)
                arcTo(1.5f, 1.5f, 0f, false, true, 10.5f, 1f)
                horizontalLineToRelative(3f)
                arcTo(1.5f, 1.5f, 0f, false, true, 15f, 2.5f)
                verticalLineToRelative(3f)
                arcTo(1.5f, 1.5f, 0f, false, true, 13.5f, 7f)
                horizontalLineToRelative(-3f)
                arcTo(1.5f, 1.5f, 0f, false, true, 9f, 5.5f)
                close()
                moveToRelative(-8f, 8f)
                arcTo(1.5f, 1.5f, 0f, false, true, 2.5f, 9f)
                horizontalLineToRelative(3f)
                arcTo(1.5f, 1.5f, 0f, false, true, 7f, 10.5f)
                verticalLineToRelative(3f)
                arcTo(1.5f, 1.5f, 0f, false, true, 5.5f, 15f)
                horizontalLineToRelative(-3f)
                arcTo(1.5f, 1.5f, 0f, false, true, 1f, 13.5f)
                close()
                moveToRelative(8f, 0f)
                arcTo(1.5f, 1.5f, 0f, false, true, 10.5f, 9f)
                horizontalLineToRelative(3f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.5f, 1.5f)
                verticalLineToRelative(3f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-3f)
                arcTo(1.5f, 1.5f, 0f, false, true, 9f, 13.5f)
                close()
            }
        }.build()
        
        return _Grid!!
    }

private var _Grid: ImageVector? = null

