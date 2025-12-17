package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.FolderArrowDown: ImageVector
    get() {
        if (_FolderArrowDown != null) return _FolderArrowDown!!
        
        _FolderArrowDown = ImageVector.Builder(
            name = "folder-arrow-down",
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
                moveToRelative(-6.75f, -10.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(4.19f)
                lineToRelative(-1.72f, -1.72f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, 1.06f)
                lineToRelative(3f, 3f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.06f, 0f)
                lineToRelative(3f, -3f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.06f, -1.06f)
                lineToRelative(-1.72f, 1.72f)
                verticalLineTo(10.5f)
                close()
            }
        }.build()
        
        return _FolderArrowDown!!
    }

private var _FolderArrowDown: ImageVector? = null

