package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.BoundingBox: ImageVector
    get() {
        if (_BoundingBox != null) return _BoundingBox!!
        
        _BoundingBox = ImageVector.Builder(
            name = "bounding-box",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 2f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                horizontalLineTo(0f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-2f)
                verticalLineTo(5f)
                horizontalLineToRelative(2f)
                verticalLineTo(0f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(6f, 1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineTo(5f)
                verticalLineToRelative(-2f)
                horizontalLineTo(3f)
                verticalLineTo(5f)
                horizontalLineToRelative(2f)
                verticalLineTo(3f)
                close()
                moveToRelative(1f, -2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                close()
                moveToRelative(3f, 11f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                close()
                moveTo(4f, 15f)
                horizontalLineTo(1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                close()
                moveTo(1f, 4f)
                verticalLineTo(1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                close()
            }
        }.build()
        
        return _BoundingBox!!
    }

private var _BoundingBox: ImageVector? = null

