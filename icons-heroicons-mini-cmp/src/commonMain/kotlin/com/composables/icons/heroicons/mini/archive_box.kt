package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ArchiveBox: ImageVector
    get() {
        if (_ArchiveBox != null) return _ArchiveBox!!
        
        _ArchiveBox = ImageVector.Builder(
            name = "archive-box",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 3f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(16f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineTo(2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 7.5f)
                horizontalLineToRelative(16f)
                lineToRelative(-0.811f, 7.71f)
                arcToRelative(2f, 2f, 0f, false, true, -1.99f, 1.79f)
                horizontalLineTo(4.802f)
                arcToRelative(2f, 2f, 0f, false, true, -1.99f, -1.79f)
                lineTo(2f, 7.5f)
                close()
                moveTo(7f, 11f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, 2f)
                horizontalLineTo(8f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                close()
            }
        }.build()
        
        return _ArchiveBox!!
    }

private var _ArchiveBox: ImageVector? = null

