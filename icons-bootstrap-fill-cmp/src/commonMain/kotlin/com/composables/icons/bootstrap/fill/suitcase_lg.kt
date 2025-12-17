package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.SuitcaseLg: ImageVector
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
                moveTo(7f, 0f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                horizontalLineTo(1.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 0f, 3.5f)
                verticalLineToRelative(9f)
                arcTo(1.5f, 1.5f, 0f, false, false, 1.5f, 14f)
                horizontalLineTo(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                horizontalLineToRelative(10f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-9f)
                arcTo(1.5f, 1.5f, 0f, false, false, 14.5f, 2f)
                horizontalLineTo(11f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                close()
                moveTo(6f, 2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                close()
                moveTo(3f, 13f)
                verticalLineTo(3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(10f)
                close()
                moveToRelative(9f, 0f)
                verticalLineTo(3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(10f)
                close()
            }
        }.build()
        
        return _SuitcaseLg!!
    }

private var _SuitcaseLg: ImageVector? = null

