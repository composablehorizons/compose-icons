package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FileEarmarkZip: ImageVector
    get() {
        if (_FileEarmarkZip != null) return _FileEarmarkZip!!
        
        _FileEarmarkZip = ImageVector.Builder(
            name = "file-earmark-zip",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 7.5f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(0.938f)
                lineToRelative(0.4f, 1.599f)
                arcToRelative(1f, 1f, 0f, false, true, -0.416f, 1.074f)
                lineToRelative(-0.93f, 0.62f)
                arcToRelative(1f, 1f, 0f, false, true, -1.11f, 0f)
                lineToRelative(-0.929f, -0.62f)
                arcToRelative(1f, 1f, 0f, false, true, -0.415f, -1.074f)
                lineTo(5f, 8.438f)
                close()
                moveToRelative(2f, 0f)
                horizontalLineTo(6f)
                verticalLineToRelative(0.938f)
                arcToRelative(1f, 1f, 0f, false, true, -0.03f, 0.243f)
                lineToRelative(-0.4f, 1.598f)
                lineToRelative(0.93f, 0.62f)
                lineToRelative(0.929f, -0.62f)
                lineToRelative(-0.4f, -1.598f)
                arcTo(1f, 1f, 0f, false, true, 7f, 8.438f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 4.5f)
                verticalLineTo(14f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(5.5f)
                close()
                moveToRelative(-3f, 0f)
                arcTo(1.5f, 1.5f, 0f, false, true, 9.5f, 3f)
                verticalLineTo(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                horizontalLineTo(6f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineTo(4f)
                horizontalLineToRelative(1f)
                verticalLineTo(3f)
                horizontalLineTo(5f)
                verticalLineTo(2f)
                horizontalLineToRelative(1f)
                verticalLineTo(1f)
                horizontalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineTo(4.5f)
                close()
            }
        }.build()
        
        return _FileEarmarkZip!!
    }

private var _FileEarmarkZip: ImageVector? = null

