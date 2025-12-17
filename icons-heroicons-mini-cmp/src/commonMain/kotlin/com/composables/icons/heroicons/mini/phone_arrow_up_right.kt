package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.PhoneArrowUpRight: ImageVector
    get() {
        if (_PhoneArrowUpRight != null) return _PhoneArrowUpRight!!
        
        _PhoneArrowUpRight = ImageVector.Builder(
            name = "phone-arrow-up-right",
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
                moveTo(16.5f, 4.56f)
                lineToRelative(-3.22f, 3.22f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.06f, -1.06f)
                lineToRelative(3.22f, -3.22f)
                horizontalLineToRelative(-2.69f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.5f)
                horizontalLineToRelative(4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineTo(4.56f)
                close()
            }
        }.build()
        
        return _PhoneArrowUpRight!!
    }

private var _PhoneArrowUpRight: ImageVector? = null

