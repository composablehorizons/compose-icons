package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FolderSymlink: ImageVector
    get() {
        if (_FolderSymlink != null) return _FolderSymlink!!
        
        _FolderSymlink = ImageVector.Builder(
            name = "folder-symlink",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.798f, 8.271f)
                lineToRelative(-3.182f, 1.97f)
                curveToRelative(-0.27f, 0.166f, -0.616f, -0.036f, -0.616f, -0.372f)
                verticalLineTo(9.1f)
                reflectiveCurveToRelative(-2.571f, -0.3f, -4f, 2.4f)
                curveToRelative(0.571f, -4.8f, 3.143f, -4.8f, 4f, -4.8f)
                verticalLineToRelative(-0.769f)
                curveToRelative(0f, -0.336f, 0.346f, -0.538f, 0.616f, -0.371f)
                lineToRelative(3.182f, 1.969f)
                curveToRelative(0.27f, 0.166f, 0.27f, 0.576f, 0f, 0.742f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0.5f, 3f)
                lineToRelative(0.04f, 0.87f)
                arcToRelative(2f, 2f, 0f, false, false, -0.342f, 1.311f)
                lineToRelative(0.637f, 7f)
                arcTo(2f, 2f, 0f, false, false, 2.826f, 14f)
                horizontalLineToRelative(10.348f)
                arcToRelative(2f, 2f, 0f, false, false, 1.991f, -1.819f)
                lineToRelative(0.637f, -7f)
                arcTo(2f, 2f, 0f, false, false, 13.81f, 3f)
                horizontalLineTo(9.828f)
                arcToRelative(2f, 2f, 0f, false, true, -1.414f, -0.586f)
                lineToRelative(-0.828f, -0.828f)
                arcTo(2f, 2f, 0f, false, false, 6.172f, 1f)
                horizontalLineTo(2.5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                moveToRelative(0.694f, 2.09f)
                arcTo(1f, 1f, 0f, false, true, 2.19f, 4f)
                horizontalLineToRelative(11.62f)
                arcToRelative(1f, 1f, 0f, false, true, 0.996f, 1.09f)
                lineToRelative(-0.636f, 7f)
                arcToRelative(1f, 1f, 0f, false, true, -0.996f, 0.91f)
                horizontalLineTo(2.826f)
                arcToRelative(1f, 1f, 0f, false, true, -0.995f, -0.91f)
                close()
                moveTo(6.172f, 2f)
                arcToRelative(1f, 1f, 0f, false, true, 0.707f, 0.293f)
                lineTo(7.586f, 3f)
                horizontalLineTo(2.19f)
                quadToRelative(-0.362f, 0.002f, -0.683f, 0.12f)
                lineTo(1.5f, 2.98f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -0.98f)
                close()
            }
        }.build()
        
        return _FolderSymlink!!
    }

private var _FolderSymlink: ImageVector? = null

