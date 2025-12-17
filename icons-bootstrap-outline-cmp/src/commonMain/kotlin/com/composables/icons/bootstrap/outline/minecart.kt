package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Minecart: ImageVector
    get() {
        if (_Minecart != null) return _Minecart!!
        
        _Minecart = ImageVector.Builder(
            name = "minecart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 15f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, -2f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
                moveToRelative(0f, 1f)
                arcToRelative(2f, 2f, 0f, true, false, 0f, -4f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, 4f)
                moveToRelative(8f, -1f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, -2f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
                moveToRelative(0f, 1f)
                arcToRelative(2f, 2f, 0f, true, false, 0f, -4f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, 4f)
                moveTo(0.115f, 3.18f)
                arcTo(0.5f, 0.5f, 0f, false, true, 0.5f, 3f)
                horizontalLineToRelative(15f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.491f, 0.592f)
                lineToRelative(-1.5f, 8f)
                arcTo(0.5f, 0.5f, 0f, false, true, 14f, 12f)
                horizontalLineTo(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.491f, -0.408f)
                lineToRelative(-1.5f, -8f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.106f, -0.411f)
                close()
                moveToRelative(0.987f, 0.82f)
                lineToRelative(1.313f, 7f)
                horizontalLineToRelative(11.17f)
                lineToRelative(1.313f, -7f)
                close()
            }
        }.build()
        
        return _Minecart!!
    }

private var _Minecart: ImageVector? = null

