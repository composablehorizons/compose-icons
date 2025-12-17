package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.PhoneXMark: ImageVector
    get() {
        if (_PhoneXMark != null) return _PhoneXMark!!
        
        _PhoneXMark = ImageVector.Builder(
            name = "phone-x-mark",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.855f, 7.286f)
                lineToRelative(1.067f, -0.534f)
                arcToRelative(1f, 1f, 0f, false, false, 0.542f, -1.046f)
                lineToRelative(-0.44f, -2.858f)
                arcTo(1f, 1f, 0f, false, false, 4.036f, 2f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.709f, 0.082f, 1.4f, 0.238f, 2.062f)
                arcToRelative(9.012f, 9.012f, 0f, false, false, 6.7f, 6.7f)
                arcTo(9.024f, 9.024f, 0f, false, false, 11f, 14f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-1.036f)
                arcToRelative(1f, 1f, 0f, false, false, -0.848f, -0.988f)
                lineToRelative(-2.858f, -0.44f)
                arcToRelative(1f, 1f, 0f, false, false, -1.046f, 0.542f)
                lineToRelative(-0.534f, 1.067f)
                arcToRelative(7.52f, 7.52f, 0f, false, true, -4.86f, -4.859f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.78f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.06f)
                lineTo(12.56f, 4.5f)
                lineToRelative(1.22f, 1.22f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, 1.06f)
                lineTo(11.5f, 5.56f)
                lineToRelative(-1.22f, 1.22f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.06f, -1.06f)
                lineToRelative(1.22f, -1.22f)
                lineToRelative(-1.22f, -1.22f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, -1.06f)
                lineToRelative(1.22f, 1.22f)
                lineToRelative(1.22f, -1.22f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                close()
            }
        }.build()
        
        return _PhoneXMark!!
    }

private var _PhoneXMark: ImageVector? = null

