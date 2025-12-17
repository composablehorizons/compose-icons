package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Peace: ImageVector
    get() {
        if (_Peace != null) return _Peace!!
        
        _Peace = ImageVector.Builder(
            name = "peace",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.5f, 1.018f)
                arcToRelative(7f, 7f, 0f, false, false, -4.79f, 11.566f)
                lineTo(7.5f, 7.793f)
                close()
                moveToRelative(1f, 0f)
                verticalLineToRelative(6.775f)
                lineToRelative(4.79f, 4.79f)
                arcTo(7f, 7f, 0f, false, false, 8.5f, 1.018f)
                moveToRelative(4.084f, 12.273f)
                lineTo(8.5f, 9.207f)
                verticalLineToRelative(5.775f)
                arcToRelative(6.97f, 6.97f, 0f, false, false, 4.084f, -1.691f)
                moveTo(7.5f, 14.982f)
                verticalLineTo(9.207f)
                lineToRelative(-4.084f, 4.084f)
                arcTo(6.97f, 6.97f, 0f, false, false, 7.5f, 14.982f)
                moveTo(0f, 8f)
                arcToRelative(8f, 8f, 0f, true, true, 16f, 0f)
                arcTo(8f, 8f, 0f, false, true, 0f, 8f)
            }
        }.build()
        
        return _Peace!!
    }

private var _Peace: ImageVector? = null

