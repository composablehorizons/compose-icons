package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.PauseBtn: ImageVector
    get() {
        if (_PauseBtn != null) return _PauseBtn!!
        
        _PauseBtn = ImageVector.Builder(
            name = "pause-btn",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.25f, 5f)
                curveTo(5.56f, 5f, 5f, 5.56f, 5f, 6.25f)
                verticalLineToRelative(3.5f)
                arcToRelative(1.25f, 1.25f, 0f, true, false, 2.5f, 0f)
                verticalLineToRelative(-3.5f)
                curveTo(7.5f, 5.56f, 6.94f, 5f, 6.25f, 5f)
                moveToRelative(3.5f, 0f)
                curveToRelative(-0.69f, 0f, -1.25f, 0.56f, -1.25f, 1.25f)
                verticalLineToRelative(3.5f)
                arcToRelative(1.25f, 1.25f, 0f, true, false, 2.5f, 0f)
                verticalLineToRelative(-3.5f)
                curveTo(11f, 5.56f, 10.44f, 5f, 9.75f, 5f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                close()
                moveToRelative(15f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                close()
            }
        }.build()
        
        return _PauseBtn!!
    }

private var _PauseBtn: ImageVector? = null

