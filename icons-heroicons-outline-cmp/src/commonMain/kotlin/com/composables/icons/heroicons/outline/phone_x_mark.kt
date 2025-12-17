package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.PhoneXMark: ImageVector
    get() {
        if (_PhoneXMark != null) return _PhoneXMark!!
        
        _PhoneXMark = ImageVector.Builder(
            name = "phone-x-mark",
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
                moveTo(15.75f, 3.75f)
                lineTo(18f, 6f)
                moveToRelative(0f, 0f)
                lineToRelative(2.25f, 2.25f)
                moveTo(18f, 6f)
                lineToRelative(2.25f, -2.25f)
                moveTo(18f, 6f)
                lineToRelative(-2.25f, 2.25f)
                moveToRelative(1.5f, 13.5f)
                curveToRelative(-8.284f, 0f, -15f, -6.716f, -15f, -15f)
                verticalLineTo(4.5f)
                arcTo(2.25f, 2.25f, 0f, false, true, 4.5f, 2.25f)
                horizontalLineToRelative(1.372f)
                curveToRelative(0.516f, 0f, 0.966f, 0.351f, 1.091f, 0.852f)
                lineToRelative(1.106f, 4.423f)
                curveToRelative(0.11f, 0.44f, -0.054f, 0.902f, -0.417f, 1.173f)
                lineToRelative(-1.293f, 0.97f)
                arcToRelative(1.062f, 1.062f, 0f, false, false, -0.38f, 1.21f)
                arcToRelative(12.035f, 12.035f, 0f, false, false, 7.143f, 7.143f)
                curveToRelative(0.441f, 0.162f, 0.928f, -0.004f, 1.21f, -0.38f)
                lineToRelative(0.97f, -1.293f)
                arcToRelative(1.125f, 1.125f, 0f, false, true, 1.173f, -0.417f)
                lineToRelative(4.423f, 1.106f)
                curveToRelative(0.5f, 0.125f, 0.852f, 0.575f, 0.852f, 1.091f)
                verticalLineTo(19.5f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, -2.25f, 2.25f)
                horizontalLineToRelative(-2.25f)
                close()
            }
        }.build()
        
        return _PhoneXMark!!
    }

private var _PhoneXMark: ImageVector? = null

