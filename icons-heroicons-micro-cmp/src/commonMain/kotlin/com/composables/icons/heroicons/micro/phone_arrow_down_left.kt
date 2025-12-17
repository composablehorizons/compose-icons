package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.PhoneArrowDownLeft: ImageVector
    get() {
        if (_PhoneArrowDownLeft != null) return _PhoneArrowDownLeft!!
        
        _PhoneArrowDownLeft = ImageVector.Builder(
            name = "phone-arrow-down-left",
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
                moveTo(11.56f, 5.5f)
                lineToRelative(2.22f, -2.22f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, -1.06f)
                lineTo(10.5f, 4.44f)
                verticalLineTo(2.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineToRelative(-1.69f)
                close()
            }
        }.build()
        
        return _PhoneArrowDownLeft!!
    }

private var _PhoneArrowDownLeft: ImageVector? = null

