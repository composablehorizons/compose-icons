package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Cart: ImageVector
    get() {
        if (_Cart != null) return _Cart!!
        
        _Cart = ImageVector.Builder(
            name = "cart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 1.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 0.5f, 1f)
                horizontalLineTo(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.485f, 0.379f)
                lineTo(2.89f, 3f)
                horizontalLineTo(14.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.491f, 0.592f)
                lineToRelative(-1.5f, 8f)
                arcTo(0.5f, 0.5f, 0f, false, true, 13f, 12f)
                horizontalLineTo(4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.491f, -0.408f)
                lineTo(2.01f, 3.607f)
                lineTo(1.61f, 2f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                moveTo(3.102f, 4f)
                lineToRelative(1.313f, 7f)
                horizontalLineToRelative(8.17f)
                lineToRelative(1.313f, -7f)
                close()
                moveTo(5f, 12f)
                arcToRelative(2f, 2f, 0f, true, false, 0f, 4f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, -4f)
                moveToRelative(7f, 0f)
                arcToRelative(2f, 2f, 0f, true, false, 0f, 4f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, -4f)
                moveToRelative(-7f, 1f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, 2f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -2f)
                moveToRelative(7f, 0f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, 2f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -2f)
            }
        }.build()
        
        return _Cart!!
    }

private var _Cart: ImageVector? = null

