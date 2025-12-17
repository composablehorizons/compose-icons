package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Tag: ImageVector
    get() {
        if (_Tag != null) return _Tag!!
        
        _Tag = ImageVector.Builder(
            name = "tag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 1f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(4.586f)
                arcToRelative(1f, 1f, 0f, false, false, 0.293f, 0.707f)
                lineToRelative(7f, 7f)
                arcToRelative(1f, 1f, 0f, false, false, 1.414f, 0f)
                lineToRelative(4.586f, -4.586f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -1.414f)
                lineToRelative(-7f, -7f)
                arcTo(1f, 1f, 0f, false, false, 6.586f, 1f)
                close()
                moveToRelative(4f, 3.5f)
                arcToRelative(1.5f, 1.5f, 0f, true, true, -3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 3f, 0f)
            }
        }.build()
        
        return _Tag!!
    }

private var _Tag: ImageVector? = null

