package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.DocumentDuplicate: ImageVector
    get() {
        if (_DocumentDuplicate != null) return _DocumentDuplicate!!
        
        _DocumentDuplicate = ImageVector.Builder(
            name = "document-duplicate",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7f, 3.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 8.5f, 2f)
                horizontalLineToRelative(3.879f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.06f, 0.44f)
                lineToRelative(3.122f, 3.12f)
                arcTo(1.5f, 1.5f, 0f, false, true, 17f, 6.622f)
                verticalLineTo(12.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-3.379f)
                arcToRelative(3f, 3f, 0f, false, false, -0.879f, -2.121f)
                lineTo(10.5f, 5.379f)
                arcTo(3f, 3f, 0f, false, false, 8.379f, 4.5f)
                horizontalLineTo(7f)
                verticalLineToRelative(-1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 6f)
                arcTo(1.5f, 1.5f, 0f, false, false, 3f, 7.5f)
                verticalLineToRelative(9f)
                arcTo(1.5f, 1.5f, 0f, false, false, 4.5f, 18f)
                horizontalLineToRelative(7f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-5.879f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -0.44f, -1.06f)
                lineTo(9.44f, 6.439f)
                arcTo(1.5f, 1.5f, 0f, false, false, 8.378f, 6f)
                horizontalLineTo(4.5f)
                close()
            }
        }.build()
        
        return _DocumentDuplicate!!
    }

private var _DocumentDuplicate: ImageVector? = null

