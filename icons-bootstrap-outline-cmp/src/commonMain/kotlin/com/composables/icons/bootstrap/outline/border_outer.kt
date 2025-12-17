package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.BorderOuter: ImageVector
    get() {
        if (_BorderOuter != null) return _BorderOuter!!
        
        _BorderOuter = ImageVector.Builder(
            name = "border-outer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.5f, 1.906f)
                verticalLineToRelative(0.938f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-0.938f)
                close()
                moveToRelative(0f, 1.875f)
                verticalLineToRelative(0.938f)
                horizontalLineToRelative(1f)
                verticalLineTo(3.78f)
                horizontalLineToRelative(-1f)
                close()
                moveToRelative(0f, 1.875f)
                verticalLineToRelative(0.938f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-0.938f)
                close()
                moveTo(1.906f, 8.5f)
                horizontalLineToRelative(0.938f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-0.938f)
                close()
                moveToRelative(1.875f, 0f)
                horizontalLineToRelative(0.938f)
                verticalLineToRelative(-1f)
                horizontalLineTo(3.78f)
                verticalLineToRelative(1f)
                close()
                moveToRelative(1.875f, 0f)
                horizontalLineToRelative(0.938f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-0.938f)
                close()
                moveToRelative(2.813f, 0f)
                verticalLineToRelative(-0.031f)
                horizontalLineTo(8.5f)
                verticalLineTo(7.53f)
                horizontalLineToRelative(-0.031f)
                verticalLineTo(7.5f)
                horizontalLineTo(7.53f)
                verticalLineToRelative(0.031f)
                horizontalLineTo(7.5f)
                verticalLineToRelative(0.938f)
                horizontalLineToRelative(0.031f)
                verticalLineTo(8.5f)
                close()
                moveToRelative(0.937f, 0f)
                horizontalLineToRelative(0.938f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-0.938f)
                close()
                moveToRelative(1.875f, 0f)
                horizontalLineToRelative(0.938f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-0.938f)
                close()
                moveToRelative(1.875f, 0f)
                horizontalLineToRelative(0.938f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-0.938f)
                close()
                moveTo(7.5f, 9.406f)
                verticalLineToRelative(0.938f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-0.938f)
                close()
                moveToRelative(0f, 1.875f)
                verticalLineToRelative(0.938f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-0.938f)
                close()
                moveToRelative(0f, 1.875f)
                verticalLineToRelative(0.938f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-0.938f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 0f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(16f)
                verticalLineTo(0f)
                close()
                moveToRelative(1f, 1f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(14f)
                horizontalLineTo(1f)
                close()
            }
        }.build()
        
        return _BorderOuter!!
    }

private var _BorderOuter: ImageVector? = null

