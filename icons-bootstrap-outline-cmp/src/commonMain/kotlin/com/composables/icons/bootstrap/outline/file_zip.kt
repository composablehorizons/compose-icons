package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FileZip: ImageVector
    get() {
        if (_FileZip != null) return _FileZip!!
        
        _FileZip = ImageVector.Builder(
            name = "file-zip",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.5f, 7.5f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(0.938f)
                lineToRelative(0.4f, 1.599f)
                arcToRelative(1f, 1f, 0f, false, true, -0.416f, 1.074f)
                lineToRelative(-0.93f, 0.62f)
                arcToRelative(1f, 1f, 0f, false, true, -1.109f, 0f)
                lineToRelative(-0.93f, -0.62f)
                arcToRelative(1f, 1f, 0f, false, true, -0.415f, -1.074f)
                lineToRelative(0.4f, -1.599f)
                close()
                moveToRelative(2f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(0.938f)
                arcToRelative(1f, 1f, 0f, false, true, -0.03f, 0.243f)
                lineToRelative(-0.4f, 1.598f)
                lineToRelative(0.93f, 0.62f)
                lineToRelative(0.93f, -0.62f)
                lineToRelative(-0.4f, -1.598f)
                arcToRelative(1f, 1f, 0f, false, true, -0.03f, -0.243f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                close()
                moveToRelative(5.5f, -1f)
                horizontalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineTo(9f)
                verticalLineToRelative(1f)
                horizontalLineTo(8f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                horizontalLineTo(8f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                horizontalLineTo(7.5f)
                verticalLineTo(5f)
                horizontalLineToRelative(-1f)
                verticalLineTo(4f)
                horizontalLineToRelative(1f)
                verticalLineTo(3f)
                horizontalLineToRelative(-1f)
                verticalLineTo(2f)
                horizontalLineToRelative(1f)
                close()
            }
        }.build()
        
        return _FileZip!!
    }

private var _FileZip: ImageVector? = null

