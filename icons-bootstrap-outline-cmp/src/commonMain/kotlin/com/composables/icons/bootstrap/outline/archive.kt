package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Archive: ImageVector
    get() {
        if (_Archive != null) return _Archive!!
        
        _Archive = ImageVector.Builder(
            name = "archive",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(14f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                verticalLineToRelative(7.5f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -2.5f, 2.5f)
                horizontalLineToRelative(-9f)
                arcTo(2.5f, 2.5f, 0f, false, true, 1f, 12.5f)
                verticalLineTo(5f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                close()
                moveToRelative(2f, 3f)
                verticalLineToRelative(7.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 3.5f, 14f)
                horizontalLineToRelative(9f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineTo(5f)
                close()
                moveToRelative(13f, -3f)
                horizontalLineTo(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(14f)
                close()
                moveTo(5f, 7.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
            }
        }.build()
        
        return _Archive!!
    }

private var _Archive: ImageVector? = null

