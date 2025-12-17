package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.WindowDesktop: ImageVector
    get() {
        if (_WindowDesktop != null) return _WindowDesktop!!
        
        _WindowDesktop = ImageVector.Builder(
            name = "window-desktop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.5f, 11f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(9f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.375f, 1f)
                arcTo(2.366f, 2.366f, 0f, false, false, 0f, 3.357f)
                verticalLineToRelative(9.286f)
                arcTo(2.366f, 2.366f, 0f, false, false, 2.375f, 15f)
                horizontalLineToRelative(11.25f)
                arcTo(2.366f, 2.366f, 0f, false, false, 16f, 12.643f)
                verticalLineTo(3.357f)
                arcTo(2.366f, 2.366f, 0f, false, false, 13.625f, 1f)
                close()
                moveTo(1f, 3.357f)
                curveTo(1f, 2.612f, 1.611f, 2f, 2.375f, 2f)
                horizontalLineToRelative(11.25f)
                curveTo(14.389f, 2f, 15f, 2.612f, 15f, 3.357f)
                verticalLineTo(4f)
                horizontalLineTo(1f)
                close()
                moveTo(1f, 5f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(7.643f)
                curveToRelative(0f, 0.745f, -0.611f, 1.357f, -1.375f, 1.357f)
                horizontalLineTo(2.375f)
                arcTo(1.366f, 1.366f, 0f, false, true, 1f, 12.643f)
                close()
            }
        }.build()
        
        return _WindowDesktop!!
    }

private var _WindowDesktop: ImageVector? = null

