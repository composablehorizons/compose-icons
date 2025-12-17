package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FileEarmarkRuled: ImageVector
    get() {
        if (_FileEarmarkRuled != null) return _FileEarmarkRuled!!
        
        _FileEarmarkRuled = ImageVector.Builder(
            name = "file-earmark-ruled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 14f)
                verticalLineTo(4.5f)
                lineTo(9.5f, 0f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                moveTo(9.5f, 3f)
                arcTo(1.5f, 1.5f, 0f, false, false, 11f, 4.5f)
                horizontalLineToRelative(2f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                verticalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(5.5f)
                close()
                moveTo(3f, 12f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(0f, 1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                close()
                moveToRelative(3f, 2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                close()
                moveToRelative(7f, -3f)
                horizontalLineTo(6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(7f)
                close()
            }
        }.build()
        
        return _FileEarmarkRuled!!
    }

private var _FileEarmarkRuled: ImageVector? = null

