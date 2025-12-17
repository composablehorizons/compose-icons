package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ArchiveBoxArrowDown: ImageVector
    get() {
        if (_ArchiveBoxArrowDown != null) return _ArchiveBoxArrowDown!!
        
        _ArchiveBoxArrowDown = ImageVector.Builder(
            name = "archive-box-arrow-down",
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
                moveToRelative(0f, 4.5f)
                horizontalLineToRelative(16f)
                lineToRelative(-0.811f, 7.71f)
                arcToRelative(2f, 2f, 0f, false, true, -1.99f, 1.79f)
                horizontalLineTo(4.802f)
                arcToRelative(2f, 2f, 0f, false, true, -1.99f, -1.79f)
                lineTo(2f, 7.5f)
                close()
                moveTo(10f, 9f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(2.546f)
                lineToRelative(0.943f, -1.048f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.114f, 1.004f)
                lineToRelative(-2.25f, 2.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.114f, 0f)
                lineToRelative(-2.25f, -2.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.114f, -1.004f)
                lineToRelative(0.943f, 1.048f)
                verticalLineTo(9.75f)
                arcTo(0.75f, 0.75f, 0f, false, true, 10f, 9f)
                close()
            }
        }.build()
        
        return _ArchiveBoxArrowDown!!
    }

private var _ArchiveBoxArrowDown: ImageVector? = null

