package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.PcDisplay: ImageVector
    get() {
        if (_PcDisplay != null) return _PcDisplay!!
        
        _PcDisplay = ImageVector.Builder(
            name = "pc-display",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 1f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(14f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(9f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                close()
                moveToRelative(1f, 13.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 1f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -1f, 0f)
                moveToRelative(2f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 1f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -1f, 0f)
                moveTo(9.5f, 1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                close()
                moveTo(9f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                horizontalLineToRelative(-5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                moveTo(1.5f, 2f)
                arcTo(1.5f, 1.5f, 0f, false, false, 0f, 3.5f)
                verticalLineToRelative(7f)
                arcTo(1.5f, 1.5f, 0f, false, false, 1.5f, 12f)
                horizontalLineTo(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineTo(7f)
                verticalLineToRelative(-4f)
                horizontalLineTo(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-7f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineTo(7f)
                verticalLineTo(2f)
                close()
            }
        }.build()
        
        return _PcDisplay!!
    }

private var _PcDisplay: ImageVector? = null

