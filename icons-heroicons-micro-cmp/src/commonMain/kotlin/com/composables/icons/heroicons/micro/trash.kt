package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Trash: ImageVector
    get() {
        if (_Trash != null) return _Trash!!
        
        _Trash = ImageVector.Builder(
            name = "trash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 3.25f)
                verticalLineTo(4f)
                horizontalLineTo(2.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(0.3f)
                lineToRelative(0.815f, 8.15f)
                arcTo(1.5f, 1.5f, 0f, false, false, 5.357f, 15f)
                horizontalLineToRelative(5.285f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.493f, -1.35f)
                lineToRelative(0.815f, -8.15f)
                horizontalLineToRelative(0.3f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineTo(11f)
                verticalLineToRelative(-0.75f)
                arcTo(2.25f, 2.25f, 0f, false, false, 8.75f, 1f)
                horizontalLineToRelative(-1.5f)
                arcTo(2.25f, 2.25f, 0f, false, false, 5f, 3.25f)
                close()
                moveToRelative(2.25f, -0.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, 0.75f)
                verticalLineTo(4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-0.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-1.5f)
                close()
                moveTo(6.05f, 6f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.787f, 0.713f)
                lineToRelative(0.275f, 5.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.498f, 0.075f)
                lineToRelative(-0.275f, -5.5f)
                arcTo(0.75f, 0.75f, 0f, false, true, 6.05f, 6f)
                close()
                moveToRelative(3.9f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.712f, 0.787f)
                lineToRelative(-0.275f, 5.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.498f, -0.075f)
                lineToRelative(0.275f, -5.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.786f, -0.711f)
                close()
            }
        }.build()
        
        return _Trash!!
    }

private var _Trash: ImageVector? = null

