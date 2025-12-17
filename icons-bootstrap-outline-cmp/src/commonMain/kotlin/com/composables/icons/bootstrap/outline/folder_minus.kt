package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FolderMinus: ImageVector
    get() {
        if (_FolderMinus != null) return _FolderMinus!!
        
        _FolderMinus = ImageVector.Builder(
            name = "folder-minus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0.5f, 3f)
                lineToRelative(0.04f, 0.87f)
                arcToRelative(2f, 2f, 0f, false, false, -0.342f, 1.311f)
                lineToRelative(0.637f, 7f)
                arcTo(2f, 2f, 0f, false, false, 2.826f, 14f)
                horizontalLineTo(9f)
                verticalLineToRelative(-1f)
                horizontalLineTo(2.826f)
                arcToRelative(1f, 1f, 0f, false, true, -0.995f, -0.91f)
                lineToRelative(-0.637f, -7f)
                arcTo(1f, 1f, 0f, false, true, 2.19f, 4f)
                horizontalLineToRelative(11.62f)
                arcToRelative(1f, 1f, 0f, false, true, 0.996f, 1.09f)
                lineTo(14.54f, 8f)
                horizontalLineToRelative(1.005f)
                lineToRelative(0.256f, -2.819f)
                arcTo(2f, 2f, 0f, false, false, 13.81f, 3f)
                horizontalLineTo(9.828f)
                arcToRelative(2f, 2f, 0f, false, true, -1.414f, -0.586f)
                lineToRelative(-0.828f, -0.828f)
                arcTo(2f, 2f, 0f, false, false, 6.172f, 1f)
                horizontalLineTo(2.5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                moveToRelative(5.672f, -1f)
                arcToRelative(1f, 1f, 0f, false, true, 0.707f, 0.293f)
                lineTo(7.586f, 3f)
                horizontalLineTo(2.19f)
                quadToRelative(-0.362f, 0.002f, -0.683f, 0.12f)
                lineTo(1.5f, 2.98f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -0.98f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11f, 11.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(4f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0f, 1f)
                horizontalLineToRelative(-4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
            }
        }.build()
        
        return _FolderMinus!!
    }

private var _FolderMinus: ImageVector? = null

