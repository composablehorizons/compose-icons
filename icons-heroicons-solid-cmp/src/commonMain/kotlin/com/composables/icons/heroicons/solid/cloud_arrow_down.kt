package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.CloudArrowDown: ImageVector
    get() {
        if (_CloudArrowDown != null) return _CloudArrowDown!!
        
        _CloudArrowDown = ImageVector.Builder(
            name = "cloud-arrow-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.5f, 3.75f)
                arcToRelative(6f, 6f, 0f, false, false, -5.98f, 6.496f)
                arcTo(5.25f, 5.25f, 0f, false, false, 6.75f, 20.25f)
                horizontalLineTo(18f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, 2.206f, -8.423f)
                arcToRelative(3.75f, 3.75f, 0f, false, false, -4.133f, -4.303f)
                arcTo(6.001f, 6.001f, 0f, false, false, 10.5f, 3.75f)
                close()
                moveToRelative(2.25f, 6f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(4.94f)
                lineToRelative(-1.72f, -1.72f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, 1.06f)
                lineToRelative(3f, 3f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.06f, 0f)
                lineToRelative(3f, -3f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.06f, -1.06f)
                lineToRelative(-1.72f, 1.72f)
                verticalLineTo(9.75f)
                close()
            }
        }.build()
        
        return _CloudArrowDown!!
    }

private var _CloudArrowDown: ImageVector? = null

