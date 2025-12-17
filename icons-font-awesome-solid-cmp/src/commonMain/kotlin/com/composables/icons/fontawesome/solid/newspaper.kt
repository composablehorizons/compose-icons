package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Newspaper: ImageVector
    get() {
        if (_Newspaper != null) return _Newspaper!!
        
        _Newspaper = ImageVector.Builder(
            name = "newspaper",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(552f, 64f)
                horizontalLineTo(88f)
                curveToRelative(-13.255f, 0f, -24f, 10.745f, -24f, 24f)
                verticalLineToRelative(8f)
                horizontalLineTo(24f)
                curveToRelative(-13.255f, 0f, -24f, 10.745f, -24f, 24f)
                verticalLineToRelative(272f)
                curveToRelative(0f, 30.928f, 25.072f, 56f, 56f, 56f)
                horizontalLineToRelative(472f)
                curveToRelative(26.51f, 0f, 48f, -21.49f, 48f, -48f)
                verticalLineTo(88f)
                curveToRelative(0f, -13.255f, -10.745f, -24f, -24f, -24f)
                close()
                moveTo(56f, 400f)
                arcToRelative(8f, 8f, 0f, false, true, -8f, -8f)
                verticalLineTo(144f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(248f)
                arcToRelative(8f, 8f, 0f, false, true, -8f, 8f)
                close()
                moveToRelative(236f, -16f)
                horizontalLineTo(140f)
                curveToRelative(-6.627f, 0f, -12f, -5.373f, -12f, -12f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -6.627f, 5.373f, -12f, 12f, -12f)
                horizontalLineToRelative(152f)
                curveToRelative(6.627f, 0f, 12f, 5.373f, 12f, 12f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 6.627f, -5.373f, 12f, -12f, 12f)
                close()
                moveToRelative(208f, 0f)
                horizontalLineTo(348f)
                curveToRelative(-6.627f, 0f, -12f, -5.373f, -12f, -12f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -6.627f, 5.373f, -12f, 12f, -12f)
                horizontalLineToRelative(152f)
                curveToRelative(6.627f, 0f, 12f, 5.373f, 12f, 12f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 6.627f, -5.373f, 12f, -12f, 12f)
                close()
                moveToRelative(-208f, -96f)
                horizontalLineTo(140f)
                curveToRelative(-6.627f, 0f, -12f, -5.373f, -12f, -12f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -6.627f, 5.373f, -12f, 12f, -12f)
                horizontalLineToRelative(152f)
                curveToRelative(6.627f, 0f, 12f, 5.373f, 12f, 12f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 6.627f, -5.373f, 12f, -12f, 12f)
                close()
                moveToRelative(208f, 0f)
                horizontalLineTo(348f)
                curveToRelative(-6.627f, 0f, -12f, -5.373f, -12f, -12f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -6.627f, 5.373f, -12f, 12f, -12f)
                horizontalLineToRelative(152f)
                curveToRelative(6.627f, 0f, 12f, 5.373f, 12f, 12f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 6.627f, -5.373f, 12f, -12f, 12f)
                close()
                moveToRelative(0f, -96f)
                horizontalLineTo(140f)
                curveToRelative(-6.627f, 0f, -12f, -5.373f, -12f, -12f)
                verticalLineToRelative(-40f)
                curveToRelative(0f, -6.627f, 5.373f, -12f, 12f, -12f)
                horizontalLineToRelative(360f)
                curveToRelative(6.627f, 0f, 12f, 5.373f, 12f, 12f)
                verticalLineToRelative(40f)
                curveToRelative(0f, 6.627f, -5.373f, 12f, -12f, 12f)
                close()
            }
        }.build()
        
        return _Newspaper!!
    }

private var _Newspaper: ImageVector? = null

