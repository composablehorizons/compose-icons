package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Rainbow: ImageVector
    get() {
        if (_Rainbow != null) return _Rainbow!!
        
        _Rainbow = ImageVector.Builder(
            name = "rainbow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 4.5f)
                arcToRelative(7f, 7f, 0f, false, false, -7f, 7f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                arcToRelative(8f, 8f, 0f, true, true, 16f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                arcToRelative(7f, 7f, 0f, false, false, -7f, -7f)
                moveToRelative(0f, 2f)
                arcToRelative(5f, 5f, 0f, false, false, -5f, 5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                arcToRelative(6f, 6f, 0f, true, true, 12f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                arcToRelative(5f, 5f, 0f, false, false, -5f, -5f)
                moveToRelative(0f, 2f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                arcToRelative(4f, 4f, 0f, true, true, 8f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, -3f)
                moveToRelative(0f, 2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                arcToRelative(2f, 2f, 0f, true, true, 4f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
            }
        }.build()
        
        return _Rainbow!!
    }

private var _Rainbow: ImageVector? = null

