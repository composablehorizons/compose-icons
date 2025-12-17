package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.FolderArrowDown: ImageVector
    get() {
        if (_FolderArrowDown != null) return _FolderArrowDown!!
        
        _FolderArrowDown = ImageVector.Builder(
            name = "folder-arrow-down",
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
                moveToRelative(5.25f, 4.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(2.69f)
                lineToRelative(-0.72f, -0.72f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, 1.06f)
                lineToRelative(2f, 2f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.06f, 0f)
                lineToRelative(2f, -2f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.06f, -1.06f)
                lineToRelative(-0.72f, 0.72f)
                verticalLineTo(6.75f)
                close()
            }
        }.build()
        
        return _FolderArrowDown!!
    }

private var _FolderArrowDown: ImageVector? = null

