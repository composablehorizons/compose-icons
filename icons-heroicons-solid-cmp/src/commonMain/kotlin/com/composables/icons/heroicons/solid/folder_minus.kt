package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.FolderMinus: ImageVector
    get() {
        if (_FolderMinus != null) return _FolderMinus!!
        
        _FolderMinus = ImageVector.Builder(
            name = "folder-minus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19.5f, 21f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, -3f)
                verticalLineTo(9f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, -3f)
                horizontalLineToRelative(-5.379f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.53f, -0.22f)
                lineTo(11.47f, 3.66f)
                arcTo(2.25f, 2.25f, 0f, false, false, 9.879f, 3f)
                horizontalLineTo(4.5f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, 3f)
                verticalLineToRelative(12f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, 3f)
                horizontalLineToRelative(15f)
                close()
                moveTo(9f, 12.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(6f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineTo(9f)
                close()
            }
        }.build()
        
        return _FolderMinus!!
    }

private var _FolderMinus: ImageVector? = null

