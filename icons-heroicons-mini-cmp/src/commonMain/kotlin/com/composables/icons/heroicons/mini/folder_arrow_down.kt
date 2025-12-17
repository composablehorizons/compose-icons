package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.FolderArrowDown: ImageVector
    get() {
        if (_FolderArrowDown != null) return _FolderArrowDown!!
        
        _FolderArrowDown = ImageVector.Builder(
            name = "folder-arrow-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 4.75f)
                curveTo(2f, 3.784f, 2.784f, 3f, 3.75f, 3f)
                horizontalLineToRelative(4.836f)
                curveToRelative(0.464f, 0f, 0.909f, 0.184f, 1.237f, 0.513f)
                lineToRelative(1.414f, 1.414f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, 0.177f, 0.073f)
                horizontalLineToRelative(4.836f)
                curveToRelative(0.966f, 0f, 1.75f, 0.784f, 1.75f, 1.75f)
                verticalLineToRelative(8.5f)
                arcTo(1.75f, 1.75f, 0f, false, true, 16.25f, 17f)
                horizontalLineTo(3.75f)
                arcTo(1.75f, 1.75f, 0f, false, true, 2f, 15.25f)
                verticalLineTo(4.75f)
                close()
                moveToRelative(8.75f, 4f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(2.546f)
                lineToRelative(-0.943f, -1.048f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.114f, 1.004f)
                lineToRelative(2.25f, 2.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.114f, 0f)
                lineToRelative(2.25f, -2.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.114f, -1.004f)
                lineToRelative(-0.943f, 1.048f)
                verticalLineTo(8.75f)
                close()
            }
        }.build()
        
        return _FolderArrowDown!!
    }

private var _FolderArrowDown: ImageVector? = null

