package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FileImage: ImageVector
    get() {
        if (_FileImage != null) return _FileImage!!
        
        _FileImage = ImageVector.Builder(
            name = "file-image",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.002f, 5.5f)
                arcToRelative(1.5f, 1.5f, 0f, true, true, -3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 3f, 0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 0f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                moveTo(3f, 2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(8f)
                lineToRelative(-2.083f, -2.083f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.76f, 0.063f)
                lineTo(8f, 11f)
                lineTo(5.835f, 9.7f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.611f, 0.076f)
                lineTo(3f, 12f)
                close()
            }
        }.build()
        
        return _FileImage!!
    }

private var _FileImage: ImageVector? = null

