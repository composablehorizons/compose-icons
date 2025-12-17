package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FileEarmarkImage: ImageVector
    get() {
        if (_FileEarmarkImage != null) return _FileEarmarkImage!!
        
        _FileEarmarkImage = ImageVector.Builder(
            name = "file-earmark-image",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.502f, 7f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, 0f, -3f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 0f, 3f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 14f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(5.5f)
                lineTo(14f, 4.5f)
                close()
                moveTo(4f, 1f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(10f)
                lineToRelative(2.224f, -2.224f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.61f, -0.075f)
                lineTo(8f, 11f)
                lineToRelative(2.157f, -3.02f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.76f, -0.063f)
                lineTo(13f, 10f)
                verticalLineTo(4.5f)
                horizontalLineToRelative(-2f)
                arcTo(1.5f, 1.5f, 0f, false, true, 9.5f, 3f)
                verticalLineTo(1f)
                close()
            }
        }.build()
        
        return _FileEarmarkImage!!
    }

private var _FileEarmarkImage: ImageVector? = null

