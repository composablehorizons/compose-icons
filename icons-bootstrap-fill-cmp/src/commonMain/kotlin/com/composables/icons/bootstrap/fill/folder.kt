package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Folder: ImageVector
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
                moveTo(9.828f, 3f)
                horizontalLineToRelative(3.982f)
                arcToRelative(2f, 2f, 0f, false, true, 1.992f, 2.181f)
                lineToRelative(-0.637f, 7f)
                arcTo(2f, 2f, 0f, false, true, 13.174f, 14f)
                horizontalLineTo(2.825f)
                arcToRelative(2f, 2f, 0f, false, true, -1.991f, -1.819f)
                lineToRelative(-0.637f, -7f)
                arcToRelative(2f, 2f, 0f, false, true, 0.342f, -1.31f)
                lineTo(0.5f, 3f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(3.672f)
                arcToRelative(2f, 2f, 0f, false, true, 1.414f, 0.586f)
                lineToRelative(0.828f, 0.828f)
                arcTo(2f, 2f, 0f, false, false, 9.828f, 3f)
                moveToRelative(-8.322f, 0.12f)
                quadToRelative(0.322f, -0.119f, 0.684f, -0.12f)
                horizontalLineToRelative(5.396f)
                lineToRelative(-0.707f, -0.707f)
                arcTo(1f, 1f, 0f, false, false, 6.172f, 2f)
                horizontalLineTo(2.5f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 0.981f)
                close()
            }
        }.build()
        
        return _Folder!!
    }

private var _Folder: ImageVector? = null

