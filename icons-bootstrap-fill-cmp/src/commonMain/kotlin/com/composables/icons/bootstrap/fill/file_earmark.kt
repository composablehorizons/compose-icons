package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.FileEarmark: ImageVector
    get() {
        if (_FileEarmark != null) return _FileEarmark!!
        
        _FileEarmark = ImageVector.Builder(
            name = "file-earmark",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 0f)
                horizontalLineToRelative(5.293f)
                arcTo(1f, 1f, 0f, false, true, 10f, 0.293f)
                lineTo(13.707f, 4f)
                arcToRelative(1f, 1f, 0f, false, true, 0.293f, 0.707f)
                verticalLineTo(14f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                moveToRelative(5.5f, 1.5f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(2f)
                close()
            }
        }.build()
        
        return _FileEarmark!!
    }

private var _FileEarmark: ImageVector? = null

