package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.PhoneArrowUpRight: ImageVector
    get() {
        if (_PhoneArrowUpRight != null) return _PhoneArrowUpRight!!
        
        _PhoneArrowUpRight = ImageVector.Builder(
            name = "phone-arrow-up-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.922f, 6.752f)
                lineToRelative(-1.067f, 0.534f)
                arcToRelative(7.52f, 7.52f, 0f, false, false, 4.859f, 4.86f)
                lineToRelative(0.534f, -1.068f)
                arcToRelative(1f, 1f, 0f, false, true, 1.046f, -0.542f)
                lineToRelative(2.858f, 0.44f)
                arcToRelative(1f, 1f, 0f, false, true, 0.848f, 0.988f)
                verticalLineTo(13f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.709f, 0f, -1.4f, -0.082f, -2.062f, -0.238f)
                arcToRelative(9.012f, 9.012f, 0f, false, true, -6.7f, -6.7f)
                arcTo(9.024f, 9.024f, 0f, false, true, 2f, 5f)
                verticalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(1.036f)
                arcToRelative(1f, 1f, 0f, false, true, 0.988f, 0.848f)
                lineToRelative(0.44f, 2.858f)
                arcToRelative(1f, 1f, 0f, false, true, -0.542f, 1.046f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.22f, 5.72f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.06f, 1.06f)
                lineToRelative(2.22f, -2.22f)
                verticalLineToRelative(1.69f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineToRelative(-3.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-3.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(1.69f)
                lineTo(9.22f, 5.72f)
                close()
            }
        }.build()
        
        return _PhoneArrowUpRight!!
    }

private var _PhoneArrowUpRight: ImageVector? = null

