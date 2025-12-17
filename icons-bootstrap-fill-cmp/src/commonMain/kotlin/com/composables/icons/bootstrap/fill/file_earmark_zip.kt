package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.FileEarmarkZip: ImageVector
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
                moveTo(5.5f, 9.438f)
                verticalLineTo(8.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(0.938f)
                arcToRelative(1f, 1f, 0f, false, false, 0.03f, 0.243f)
                lineToRelative(0.4f, 1.598f)
                lineToRelative(-0.93f, 0.62f)
                lineToRelative(-0.93f, -0.62f)
                lineToRelative(0.4f, -1.598f)
                arcToRelative(1f, 1f, 0f, false, false, 0.03f, -0.243f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.293f, 0f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(4.707f)
                arcTo(1f, 1f, 0f, false, false, 13.707f, 4f)
                lineTo(10f, 0.293f)
                arcTo(1f, 1f, 0f, false, false, 9.293f, 0f)
                moveTo(9.5f, 3.5f)
                verticalLineToRelative(-2f)
                lineToRelative(3f, 3f)
                horizontalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                moveToRelative(-4f, -0.5f)
                verticalLineTo(2f)
                horizontalLineToRelative(-1f)
                verticalLineTo(1f)
                horizontalLineTo(6f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                horizontalLineTo(6f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                horizontalLineTo(6f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                horizontalLineTo(5.5f)
                verticalLineTo(6f)
                horizontalLineToRelative(-1f)
                verticalLineTo(5f)
                horizontalLineToRelative(1f)
                verticalLineTo(4f)
                horizontalLineToRelative(-1f)
                verticalLineTo(3f)
                close()
                moveToRelative(0f, 4.5f)
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
                verticalLineTo(8.5f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
            }
        }.build()
        
        return _FileEarmarkZip!!
    }

private var _FileEarmarkZip: ImageVector? = null

