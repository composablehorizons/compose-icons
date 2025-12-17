package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.ArchiveBoxArrowDown: ImageVector
    get() {
        if (_ArchiveBoxArrowDown != null) return _ArchiveBoxArrowDown!!
        
        _ArchiveBoxArrowDown = ImageVector.Builder(
            name = "archive-box-arrow-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 3f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(10f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13f, 6f)
                horizontalLineTo(3f)
                verticalLineToRelative(6f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(6f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(6f)
                close()
                moveTo(8.75f, 7.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(2.69f)
                lineTo(6.03f, 9.22f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, 1.06f)
                lineToRelative(2.5f, 2.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.06f, 0f)
                lineToRelative(2.5f, -2.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.06f, -1.06f)
                lineToRelative(-1.22f, 1.22f)
                verticalLineTo(7.75f)
                close()
            }
        }.build()
        
        return _ArchiveBoxArrowDown!!
    }

private var _ArchiveBoxArrowDown: ImageVector? = null

