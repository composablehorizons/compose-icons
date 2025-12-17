package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Folder: ImageVector
    get() {
        if (_Folder != null) return _Folder!!
        
        _Folder = ImageVector.Builder(
            name = "folder",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0.54f, 3.87f)
                lineTo(0.5f, 3f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(3.672f)
                arcToRelative(2f, 2f, 0f, false, true, 1.414f, 0.586f)
                lineToRelative(0.828f, 0.828f)
                arcTo(2f, 2f, 0f, false, false, 9.828f, 3f)
                horizontalLineToRelative(3.982f)
                arcToRelative(2f, 2f, 0f, false, true, 1.992f, 2.181f)
                lineToRelative(-0.637f, 7f)
                arcTo(2f, 2f, 0f, false, true, 13.174f, 14f)
                horizontalLineTo(2.826f)
                arcToRelative(2f, 2f, 0f, false, true, -1.991f, -1.819f)
                lineToRelative(-0.637f, -7f)
                arcToRelative(2f, 2f, 0f, false, true, 0.342f, -1.31f)
                close()
                moveTo(2.19f, 4f)
                arcToRelative(1f, 1f, 0f, false, false, -0.996f, 1.09f)
                lineToRelative(0.637f, 7f)
                arcToRelative(1f, 1f, 0f, false, false, 0.995f, 0.91f)
                horizontalLineToRelative(10.348f)
                arcToRelative(1f, 1f, 0f, false, false, 0.995f, -0.91f)
                lineToRelative(0.637f, -7f)
                arcTo(1f, 1f, 0f, false, false, 13.81f, 4f)
                close()
                moveToRelative(4.69f, -1.707f)
                arcTo(1f, 1f, 0f, false, false, 6.172f, 2f)
                horizontalLineTo(2.5f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 0.981f)
                lineToRelative(0.006f, 0.139f)
                quadToRelative(0.323f, -0.119f, 0.684f, -0.12f)
                horizontalLineToRelative(5.396f)
                close()
            }
        }.build()
        
        return _Folder!!
    }

private var _Folder: ImageVector? = null

