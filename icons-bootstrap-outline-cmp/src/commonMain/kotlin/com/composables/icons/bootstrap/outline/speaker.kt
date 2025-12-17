package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Speaker: ImageVector
    get() {
        if (_Speaker != null) return _Speaker!!
        
        _Speaker = ImageVector.Builder(
            name = "speaker",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 1f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                close()
                moveTo(4f, 0f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 4.75f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 0f, -1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                moveTo(8f, 6f)
                arcToRelative(2f, 2f, 0f, true, false, 0f, -4f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, 4f)
                moveToRelative(0f, 3f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, 0f, 3f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 0f, -3f)
                moveToRelative(-3.5f, 1.5f)
                arcToRelative(3.5f, 3.5f, 0f, true, true, 7f, 0f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, -7f, 0f)
            }
        }.build()
        
        return _Speaker!!
    }

private var _Speaker: ImageVector? = null

