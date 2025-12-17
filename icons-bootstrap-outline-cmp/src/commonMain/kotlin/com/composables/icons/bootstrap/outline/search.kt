package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Search: ImageVector
    get() {
        if (_Search != null) return _Search!!
        
        _Search = ImageVector.Builder(
            name = "search",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.742f, 10.344f)
                arcToRelative(6.5f, 6.5f, 0f, true, false, -1.397f, 1.398f)
                horizontalLineToRelative(-0.001f)
                quadToRelative(0.044f, 0.06f, 0.098f, 0.115f)
                lineToRelative(3.85f, 3.85f)
                arcToRelative(1f, 1f, 0f, false, false, 1.415f, -1.414f)
                lineToRelative(-3.85f, -3.85f)
                arcToRelative(1f, 1f, 0f, false, false, -0.115f, -0.1f)
                close()
                moveTo(12f, 6.5f)
                arcToRelative(5.5f, 5.5f, 0f, true, true, -11f, 0f)
                arcToRelative(5.5f, 5.5f, 0f, false, true, 11f, 0f)
            }
        }.build()
        
        return _Search!!
    }

private var _Search: ImageVector? = null

