package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.Newspaper: ImageVector
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
                horizontalLineTo(112f)
                curveToRelative(-20.858f, 0f, -38.643f, 13.377f, -45.248f, 32f)
                horizontalLineTo(24f)
                curveToRelative(-13.255f, 0f, -24f, 10.745f, -24f, 24f)
                verticalLineToRelative(272f)
                curveToRelative(0f, 30.928f, 25.072f, 56f, 56f, 56f)
                horizontalLineToRelative(496f)
                curveToRelative(13.255f, 0f, 24f, -10.745f, 24f, -24f)
                verticalLineTo(88f)
                curveToRelative(0f, -13.255f, -10.745f, -24f, -24f, -24f)
                close()
                moveTo(48f, 392f)
                verticalLineTo(144f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(248f)
                curveToRelative(0f, 4.411f, -3.589f, 8f, -8f, 8f)
                reflectiveCurveToRelative(-8f, -3.589f, -8f, -8f)
                close()
                moveToRelative(480f, 8f)
                horizontalLineTo(111.422f)
                curveToRelative(0.374f, -2.614f, 0.578f, -5.283f, 0.578f, -8f)
                verticalLineTo(112f)
                horizontalLineToRelative(416f)
                verticalLineToRelative(288f)
                close()
                moveTo(172f, 280f)
                horizontalLineToRelative(136f)
                curveToRelative(6.627f, 0f, 12f, -5.373f, 12f, -12f)
                verticalLineToRelative(-96f)
                curveToRelative(0f, -6.627f, -5.373f, -12f, -12f, -12f)
                horizontalLineTo(172f)
                curveToRelative(-6.627f, 0f, -12f, 5.373f, -12f, 12f)
                verticalLineToRelative(96f)
                curveToRelative(0f, 6.627f, 5.373f, 12f, 12f, 12f)
                close()
                moveToRelative(28f, -80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-40f)
                close()
                moveToRelative(-40f, 140f)
                verticalLineToRelative(-24f)
                curveToRelative(0f, -6.627f, 5.373f, -12f, 12f, -12f)
                horizontalLineToRelative(136f)
                curveToRelative(6.627f, 0f, 12f, 5.373f, 12f, 12f)
                verticalLineToRelative(24f)
                curveToRelative(0f, 6.627f, -5.373f, 12f, -12f, 12f)
                horizontalLineTo(172f)
                curveToRelative(-6.627f, 0f, -12f, -5.373f, -12f, -12f)
                close()
                moveToRelative(192f, 0f)
                verticalLineToRelative(-24f)
                curveToRelative(0f, -6.627f, 5.373f, -12f, 12f, -12f)
                horizontalLineToRelative(104f)
                curveToRelative(6.627f, 0f, 12f, 5.373f, 12f, 12f)
                verticalLineToRelative(24f)
                curveToRelative(0f, 6.627f, -5.373f, 12f, -12f, 12f)
                horizontalLineTo(364f)
                curveToRelative(-6.627f, 0f, -12f, -5.373f, -12f, -12f)
                close()
                moveToRelative(0f, -144f)
                verticalLineToRelative(-24f)
                curveToRelative(0f, -6.627f, 5.373f, -12f, 12f, -12f)
                horizontalLineToRelative(104f)
                curveToRelative(6.627f, 0f, 12f, 5.373f, 12f, 12f)
                verticalLineToRelative(24f)
                curveToRelative(0f, 6.627f, -5.373f, 12f, -12f, 12f)
                horizontalLineTo(364f)
                curveToRelative(-6.627f, 0f, -12f, -5.373f, -12f, -12f)
                close()
                moveToRelative(0f, 72f)
                verticalLineToRelative(-24f)
                curveToRelative(0f, -6.627f, 5.373f, -12f, 12f, -12f)
                horizontalLineToRelative(104f)
                curveToRelative(6.627f, 0f, 12f, 5.373f, 12f, 12f)
                verticalLineToRelative(24f)
                curveToRelative(0f, 6.627f, -5.373f, 12f, -12f, 12f)
                horizontalLineTo(364f)
                curveToRelative(-6.627f, 0f, -12f, -5.373f, -12f, -12f)
                close()
            }
        }.build()
        
        return _Newspaper!!
    }

private var _Newspaper: ImageVector? = null

