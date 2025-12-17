package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Disc: ImageVector
    get() {
        if (_Disc != null) return _Disc!!
        
        _Disc = ImageVector.Builder(
            name = "disc",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 15f)
                arcTo(7f, 7f, 0f, true, true, 8f, 1f)
                arcToRelative(7f, 7f, 0f, false, true, 0f, 14f)
                moveToRelative(0f, 1f)
                arcTo(8f, 8f, 0f, true, false, 8f, 0f)
                arcToRelative(8f, 8f, 0f, false, false, 0f, 16f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 8f)
                arcToRelative(2f, 2f, 0f, true, true, -4f, 0f)
                arcToRelative(2f, 2f, 0f, false, true, 4f, 0f)
                moveTo(8f, 4f)
                arcToRelative(4f, 4f, 0f, false, false, -4f, 4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                arcToRelative(5f, 5f, 0f, false, true, 5f, -5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                moveToRelative(4.5f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                arcToRelative(5f, 5f, 0f, false, true, -5f, 5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                arcToRelative(4f, 4f, 0f, false, false, 4f, -4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
            }
        }.build()
        
        return _Disc!!
    }

private var _Disc: ImageVector? = null

