package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.SuitcaseLg: ImageVector
    get() {
        if (_SuitcaseLg != null) return _SuitcaseLg!!
        
        _SuitcaseLg = ImageVector.Builder(
            name = "suitcase-lg",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                horizontalLineToRelative(3.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 16f, 3.5f)
                verticalLineToRelative(9f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 1.5f)
                horizontalLineTo(14f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                horizontalLineTo(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                horizontalLineToRelative(-0.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 0f, 12.5f)
                verticalLineToRelative(-9f)
                arcTo(1.5f, 1.5f, 0f, false, true, 1.5f, 2f)
                close()
                moveToRelative(1f, 0f)
                horizontalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineTo(7f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                moveTo(1.5f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(9f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                close()
                moveTo(15f, 12.5f)
                verticalLineToRelative(-9f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                horizontalLineTo(13f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                moveToRelative(-3f, 0.5f)
                verticalLineTo(3f)
                horizontalLineTo(4f)
                verticalLineToRelative(10f)
                close()
            }
        }.build()
        
        return _SuitcaseLg!!
    }

private var _SuitcaseLg: ImageVector? = null

