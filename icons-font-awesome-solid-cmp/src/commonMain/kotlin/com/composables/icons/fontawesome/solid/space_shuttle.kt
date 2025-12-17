package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.SpaceShuttle: ImageVector
    get() {
        if (_SpaceShuttle != null) return _SpaceShuttle!!
        
        _SpaceShuttle = ImageVector.Builder(
            name = "space-shuttle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(592.604f, 208.244f)
                curveTo(559.735f, 192.836f, 515.777f, 184f, 472f, 184f)
                horizontalLineTo(186.327f)
                curveToRelative(-4.952f, -6.555f, -10.585f, -11.978f, -16.72f, -16f)
                horizontalLineTo(376f)
                curveTo(229.157f, 137.747f, 219.403f, 32f, 96.003f, 32f)
                horizontalLineTo(96f)
                verticalLineToRelative(128f)
                horizontalLineTo(80f)
                verticalLineTo(32f)
                curveToRelative(-26.51f, 0f, -48f, 28.654f, -48f, 64f)
                verticalLineToRelative(64f)
                curveToRelative(-23.197f, 0f, -32f, 10.032f, -32f, 24f)
                verticalLineToRelative(40f)
                curveToRelative(0f, 13.983f, 8.819f, 24f, 32f, 24f)
                verticalLineToRelative(16f)
                curveToRelative(-23.197f, 0f, -32f, 10.032f, -32f, 24f)
                verticalLineToRelative(40f)
                curveToRelative(0f, 13.983f, 8.819f, 24f, 32f, 24f)
                verticalLineToRelative(64f)
                curveToRelative(0f, 35.346f, 21.49f, 64f, 48f, 64f)
                verticalLineTo(352f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(128f)
                horizontalLineToRelative(0.003f)
                curveToRelative(123.4f, 0f, 133.154f, -105.747f, 279.997f, -136f)
                horizontalLineTo(169.606f)
                curveToRelative(6.135f, -4.022f, 11.768f, -9.445f, 16.72f, -16f)
                horizontalLineTo(472f)
                curveToRelative(43.777f, 0f, 87.735f, -8.836f, 120.604f, -24.244f)
                curveTo(622.282f, 289.845f, 640f, 271.992f, 640f, 256f)
                reflectiveCurveToRelative(-17.718f, -33.845f, -47.396f, -47.756f)
                close()
                moveTo(488f, 296f)
                arcToRelative(8f, 8f, 0f, false, true, -8f, -8f)
                verticalLineToRelative(-64f)
                arcToRelative(8f, 8f, 0f, false, true, 8f, -8f)
                curveToRelative(31.909f, 0f, 31.942f, 80f, 0f, 80f)
                close()
            }
        }.build()
        
        return _SpaceShuttle!!
    }

private var _SpaceShuttle: ImageVector? = null

