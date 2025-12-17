package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.FilePpt: ImageVector
    get() {
        if (_FilePpt != null) return _FilePpt!!
        
        _FilePpt = ImageVector.Builder(
            name = "file-ppt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.188f, 8.5f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                horizontalLineToRelative(1.188f)
                arcToRelative(1.75f, 1.75f, 0f, true, true, 0f, 3.5f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 0f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                moveToRelative(3f, 4f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(6.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1.188f)
                arcToRelative(2.75f, 2.75f, 0f, false, false, 0f, -5.5f)
                close()
            }
        }.build()
        
        return _FilePpt!!
    }

private var _FilePpt: ImageVector? = null

