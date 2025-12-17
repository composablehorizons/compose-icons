package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Alt: ImageVector
    get() {
        if (_Alt != null) return _Alt!!
        
        _Alt = ImageVector.Builder(
            name = "alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 13.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(3.797f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.439f, -0.26f)
                lineTo(11f, 3f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                horizontalLineToRelative(-3.797f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.439f, 0.26f)
                lineTo(5f, 13f)
                horizontalLineTo(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                moveToRelative(10f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                horizontalLineToRelative(-3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
            }
        }.build()
        
        return _Alt!!
    }

private var _Alt: ImageVector? = null

