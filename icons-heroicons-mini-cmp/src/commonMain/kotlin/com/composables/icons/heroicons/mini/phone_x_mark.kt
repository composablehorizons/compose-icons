package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.PhoneXMark: ImageVector
    get() {
        if (_PhoneXMark != null) return _PhoneXMark!!
        
        _PhoneXMark = ImageVector.Builder(
            name = "phone-x-mark",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.5f, 2f)
                arcTo(1.5f, 1.5f, 0f, false, false, 2f, 3.5f)
                verticalLineTo(5f)
                curveToRelative(0f, 1.149f, 0.15f, 2.263f, 0.43f, 3.326f)
                arcToRelative(13.022f, 13.022f, 0f, false, false, 9.244f, 9.244f)
                curveToRelative(1.063f, 0.28f, 2.177f, 0.43f, 3.326f, 0.43f)
                horizontalLineToRelative(1.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-1.148f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -1.175f, -1.465f)
                lineToRelative(-3.223f, -0.716f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -1.767f, 1.052f)
                lineToRelative(-0.267f, 0.933f)
                curveToRelative(-0.117f, 0.41f, -0.555f, 0.643f, -0.95f, 0.48f)
                arcToRelative(11.542f, 11.542f, 0f, false, true, -6.254f, -6.254f)
                curveToRelative(-0.163f, -0.395f, 0.07f, -0.833f, 0.48f, -0.95f)
                lineToRelative(0.933f, -0.267f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.052f, -1.767f)
                lineToRelative(-0.716f, -3.223f)
                arcTo(1.5f, 1.5f, 0f, false, false, 4.648f, 2f)
                horizontalLineTo(3.5f)
                close()
                moveToRelative(9.78f, 0.22f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.06f, 1.06f)
                lineTo(13.94f, 5f)
                lineToRelative(-1.72f, 1.72f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.06f, 1.06f)
                lineTo(15f, 6.06f)
                lineToRelative(1.72f, 1.72f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, -1.06f)
                lineTo(16.06f, 5f)
                lineToRelative(1.72f, -1.72f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, -1.06f)
                lineTo(15f, 3.94f)
                lineToRelative(-1.72f, -1.72f)
                close()
            }
        }.build()
        
        return _PhoneXMark!!
    }

private var _PhoneXMark: ImageVector? = null

