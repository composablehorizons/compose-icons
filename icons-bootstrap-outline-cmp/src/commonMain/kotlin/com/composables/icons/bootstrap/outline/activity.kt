package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Activity: ImageVector
    get() {
        if (_Activity != null) return _Activity!!
        
        _Activity = ImageVector.Builder(
            name = "activity",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.47f, 0.33f)
                lineTo(10f, 12.036f)
                lineToRelative(1.53f, -4.208f)
                arcTo(0.5f, 0.5f, 0f, false, true, 12f, 7.5f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-3.15f)
                lineToRelative(-1.88f, 5.17f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.94f, 0f)
                lineTo(6f, 3.964f)
                lineTo(4.47f, 8.171f)
                arcTo(0.5f, 0.5f, 0f, false, true, 4f, 8.5f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineToRelative(3.15f)
                lineToRelative(1.88f, -5.17f)
                arcTo(0.5f, 0.5f, 0f, false, true, 6f, 2f)
            }
        }.build()
        
        return _Activity!!
    }

private var _Activity: ImageVector? = null

