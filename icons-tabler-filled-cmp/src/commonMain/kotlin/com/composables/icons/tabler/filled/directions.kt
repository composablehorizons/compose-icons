package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Directions: ImageVector
    get() {
        if (_Directions != null) return _Directions!!
        
        _Directions = ImageVector.Builder(
            name = "directions",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 22f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2.001f)
                lineToRelative(-5f, 0.001f)
                arcToRelative(1f, 1f, 0f, false, true, -0.707f, -0.293f)
                lineToRelative(-2f, -2f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -1.414f)
                lineToRelative(2f, -2f)
                arcToRelative(1f, 1f, 0f, false, true, 0.707f, -0.293f)
                lineToRelative(5f, -0.001f)
                verticalLineToRelative(-1.999f)
                horizontalLineToRelative(-3f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, false, true, 2f, 0f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, false, true, 0.707f, 0.293f)
                lineToRelative(2f, 2f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 1.414f)
                lineToRelative(-2f, 2f)
                arcToRelative(1f, 1f, 0f, false, true, -0.707f, 0.293f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(1.999f)
                lineToRelative(1f, 0.001f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                lineToRelative(-1f, -0.001f)
                verticalLineToRelative(2.001f)
                horizontalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
                close()
            }
        }.build()
        
        return _Directions!!
    }

private var _Directions: ImageVector? = null

