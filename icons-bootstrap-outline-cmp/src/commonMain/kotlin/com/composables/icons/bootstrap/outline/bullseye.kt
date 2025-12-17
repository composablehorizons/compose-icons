package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Bullseye: ImageVector
    get() {
        if (_Bullseye != null) return _Bullseye!!
        
        _Bullseye = ImageVector.Builder(
            name = "bullseye",
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
                moveTo(8f, 13f)
                arcTo(5f, 5f, 0f, true, true, 8f, 3f)
                arcToRelative(5f, 5f, 0f, false, true, 0f, 10f)
                moveToRelative(0f, 1f)
                arcTo(6f, 6f, 0f, true, false, 8f, 2f)
                arcToRelative(6f, 6f, 0f, false, false, 0f, 12f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 11f)
                arcToRelative(3f, 3f, 0f, true, true, 0f, -6f)
                arcToRelative(3f, 3f, 0f, false, true, 0f, 6f)
                moveToRelative(0f, 1f)
                arcToRelative(4f, 4f, 0f, true, false, 0f, -8f)
                arcToRelative(4f, 4f, 0f, false, false, 0f, 8f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.5f, 8f)
                arcToRelative(1.5f, 1.5f, 0f, true, true, -3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 3f, 0f)
            }
        }.build()
        
        return _Bullseye!!
    }

private var _Bullseye: ImageVector? = null

