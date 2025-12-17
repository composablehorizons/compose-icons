package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Signpost: ImageVector
    get() {
        if (_Signpost != null) return _Signpost!!
        
        _Signpost = ImageVector.Builder(
            name = "signpost",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7f, 1.414f)
                verticalLineTo(4f)
                horizontalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(3.532f)
                arcToRelative(1f, 1f, 0f, false, false, 0.768f, -0.36f)
                lineToRelative(1.933f, -2.32f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -0.64f)
                lineTo(13.3f, 4.36f)
                arcToRelative(1f, 1f, 0f, false, false, -0.768f, -0.36f)
                horizontalLineTo(9f)
                verticalLineTo(1.414f)
                arcToRelative(1f, 1f, 0f, false, false, -2f, 0f)
                moveTo(12.532f, 5f)
                lineToRelative(1.666f, 2f)
                lineToRelative(-1.666f, 2f)
                horizontalLineTo(2f)
                verticalLineTo(5f)
                close()
            }
        }.build()
        
        return _Signpost!!
    }

private var _Signpost: ImageVector? = null

