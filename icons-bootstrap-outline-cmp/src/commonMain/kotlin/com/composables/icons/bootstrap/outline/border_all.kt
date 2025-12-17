package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.BorderAll: ImageVector
    get() {
        if (_BorderAll != null) return _BorderAll!!
        
        _BorderAll = ImageVector.Builder(
            name = "border-all",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(16f)
                horizontalLineTo(0f)
                close()
                moveToRelative(1f, 1f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(6.5f)
                verticalLineTo(1f)
                close()
                moveToRelative(7.5f, 0f)
                verticalLineToRelative(6.5f)
                horizontalLineTo(15f)
                verticalLineTo(1f)
                close()
                moveTo(15f, 8.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(15f)
                horizontalLineTo(15f)
                close()
                moveTo(7.5f, 15f)
                verticalLineTo(8.5f)
                horizontalLineTo(1f)
                verticalLineTo(15f)
                close()
            }
        }.build()
        
        return _BorderAll!!
    }

private var _BorderAll: ImageVector? = null

