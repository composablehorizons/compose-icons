package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.FolderArrowDown: ImageVector
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
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(9f, 13.5f)
                lineToRelative(3f, 3f)
                moveToRelative(0f, 0f)
                lineToRelative(3f, -3f)
                moveToRelative(-3f, 3f)
                verticalLineToRelative(-6f)
                moveToRelative(1.06f, -4.19f)
                lineToRelative(-2.12f, -2.12f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -1.061f, -0.44f)
                horizontalLineTo(4.5f)
                arcTo(2.25f, 2.25f, 0f, false, false, 2.25f, 6f)
                verticalLineToRelative(12f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, 2.25f, 2.25f)
                horizontalLineToRelative(15f)
                arcTo(2.25f, 2.25f, 0f, false, false, 21.75f, 18f)
                verticalLineTo(9f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, -2.25f, -2.25f)
                horizontalLineToRelative(-5.379f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.06f, -0.44f)
                close()
            }
        }.build()
        
        return _FolderArrowDown!!
    }

private var _FolderArrowDown: ImageVector? = null

