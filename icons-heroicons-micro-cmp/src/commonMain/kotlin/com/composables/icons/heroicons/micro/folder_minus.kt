package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.FolderMinus: ImageVector
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
                moveTo(3.5f, 2f)
                arcTo(1.5f, 1.5f, 0f, false, false, 2f, 3.5f)
                verticalLineToRelative(9f)
                arcTo(1.5f, 1.5f, 0f, false, false, 3.5f, 14f)
                horizontalLineToRelative(9f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-7f)
                arcTo(1.5f, 1.5f, 0f, false, false, 12.5f, 4f)
                horizontalLineTo(9.621f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.06f, -0.44f)
                lineTo(7.439f, 2.44f)
                arcTo(1.5f, 1.5f, 0f, false, false, 6.38f, 2f)
                horizontalLineTo(3.5f)
                close()
                moveToRelative(6.75f, 7.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineToRelative(-4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(4.5f)
                close()
            }
        }.build()
        
        return _FolderMinus!!
    }

private var _FolderMinus: ImageVector? = null

