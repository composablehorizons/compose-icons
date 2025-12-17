package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FolderX: ImageVector
    get() {
        if (_FolderX != null) return _FolderX!!
        
        _FolderX = ImageVector.Builder(
            name = "folder-x",
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
                lineTo(15.546f, 8f)
                horizontalLineTo(14.54f)
                lineToRelative(0.265f, -2.91f)
                arcTo(1f, 1f, 0f, false, false, 13.81f, 4f)
                horizontalLineTo(2.19f)
                arcToRelative(1f, 1f, 0f, false, false, -0.996f, 1.09f)
                lineToRelative(0.637f, 7f)
                arcToRelative(1f, 1f, 0f, false, false, 0.995f, 0.91f)
                horizontalLineTo(9f)
                verticalLineToRelative(1f)
                horizontalLineTo(2.826f)
                arcToRelative(2f, 2f, 0f, false, true, -1.991f, -1.819f)
                lineToRelative(-0.637f, -7f)
                arcToRelative(2f, 2f, 0f, false, true, 0.342f, -1.31f)
                close()
                moveToRelative(6.339f, -1.577f)
                arcTo(1f, 1f, 0f, false, false, 6.172f, 2f)
                horizontalLineTo(2.5f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 0.981f)
                lineToRelative(0.006f, 0.139f)
                quadToRelative(0.323f, -0.119f, 0.684f, -0.12f)
                horizontalLineToRelative(5.396f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.854f, 10.146f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.707f, 0.708f)
                lineTo(12.293f, 12f)
                lineToRelative(-1.146f, 1.146f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.707f, 0.708f)
                lineTo(13f, 12.707f)
                lineToRelative(1.146f, 1.147f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, -0.708f)
                lineTo(13.707f, 12f)
                lineToRelative(1.147f, -1.146f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.707f, -0.708f)
                lineTo(13f, 11.293f)
                close()
            }
        }.build()
        
        return _FolderX!!
    }

private var _FolderX: ImageVector? = null

