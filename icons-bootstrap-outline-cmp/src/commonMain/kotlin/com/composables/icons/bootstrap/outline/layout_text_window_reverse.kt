package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.LayoutTextWindowReverse: ImageVector
    get() {
        if (_LayoutTextWindowReverse != null) return _LayoutTextWindowReverse!!
        
        _LayoutTextWindowReverse = ImageVector.Builder(
            name = "layout-text-window-reverse",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13f, 6.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                moveToRelative(0f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                moveToRelative(-0.5f, 2.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 0f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                close()
                moveTo(2f, 1f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(14f)
                verticalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                close()
                moveTo(1f, 4f)
                verticalLineToRelative(10f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(2f)
                verticalLineTo(4f)
                close()
                moveToRelative(4f, 0f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(9f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineTo(4f)
                close()
            }
        }.build()
        
        return _LayoutTextWindowReverse!!
    }

private var _LayoutTextWindowReverse: ImageVector? = null

