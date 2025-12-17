package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.DocumentDuplicate: ImageVector
    get() {
        if (_DocumentDuplicate != null) return _DocumentDuplicate!!
        
        _DocumentDuplicate = ImageVector.Builder(
            name = "document-duplicate",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.5f, 3.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 7f, 2f)
                horizontalLineToRelative(2.879f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.06f, 0.44f)
                lineToRelative(2.122f, 2.12f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 0.439f, 1.061f)
                verticalLineTo(9.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 12f, 11f)
                verticalLineTo(8.621f)
                arcToRelative(3f, 3f, 0f, false, false, -0.879f, -2.121f)
                lineTo(9f, 4.379f)
                arcTo(3f, 3f, 0f, false, false, 6.879f, 3.5f)
                horizontalLineTo(5.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 5f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -1.5f, 1.5f)
                verticalLineToRelative(6f)
                arcTo(1.5f, 1.5f, 0f, false, false, 4f, 14f)
                horizontalLineToRelative(5f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineTo(8.621f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -0.44f, -1.06f)
                lineTo(7.94f, 5.439f)
                arcTo(1.5f, 1.5f, 0f, false, false, 6.878f, 5f)
                horizontalLineTo(4f)
                close()
            }
        }.build()
        
        return _DocumentDuplicate!!
    }

private var _DocumentDuplicate: ImageVector? = null

