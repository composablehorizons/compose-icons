package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Toggle2On: ImageVector
    get() {
        if (_Toggle2On != null) return _Toggle2On!!
        
        _Toggle2On = ImageVector.Builder(
            name = "toggle2-on",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7f, 5f)
                horizontalLineTo(3f)
                arcToRelative(3f, 3f, 0f, false, false, 0f, 6f)
                horizontalLineToRelative(4f)
                arcToRelative(5f, 5f, 0f, false, true, -0.584f, -1f)
                horizontalLineTo(3f)
                arcToRelative(2f, 2f, 0f, true, true, 0f, -4f)
                horizontalLineToRelative(3.416f)
                quadToRelative(0.235f, -0.537f, 0.584f, -1f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 8f)
                arcTo(5f, 5f, 0f, true, true, 6f, 8f)
                arcToRelative(5f, 5f, 0f, false, true, 10f, 0f)
            }
        }.build()
        
        return _Toggle2On!!
    }

private var _Toggle2On: ImageVector? = null

