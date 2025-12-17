package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ICursor: ImageVector
    get() {
        if (_ICursor != null) return _ICursor!!
        
        _ICursor = ImageVector.Builder(
            name = "i-cursor",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(256f, 52.048f)
                verticalLineTo(12.065f)
                curveTo(256f, 5.496f, 250.726f, 0.148f, 244.158f, 0.066f)
                curveTo(211.621f, -0.344f, 166.469f, 0.011f, 128f, 37.959f)
                curveTo(90.266f, 0.736f, 46.979f, -0.114f, 11.913f, 0.114f)
                curveTo(5.318f, 0.157f, 0f, 5.519f, 0f, 12.114f)
                verticalLineToRelative(39.645f)
                curveToRelative(0f, 6.687f, 5.458f, 12.078f, 12.145f, 11.998f)
                curveTo(38.111f, 63.447f, 96f, 67.243f, 96f, 112.182f)
                verticalLineTo(224f)
                horizontalLineTo(60f)
                curveToRelative(-6.627f, 0f, -12f, 5.373f, -12f, 12f)
                verticalLineToRelative(40f)
                curveToRelative(0f, 6.627f, 5.373f, 12f, 12f, 12f)
                horizontalLineToRelative(36f)
                verticalLineToRelative(112f)
                curveToRelative(0f, 44.932f, -56.075f, 48.031f, -83.95f, 47.959f)
                curveTo(5.404f, 447.942f, 0f, 453.306f, 0f, 459.952f)
                verticalLineToRelative(39.983f)
                curveToRelative(0f, 6.569f, 5.274f, 11.917f, 11.842f, 11.999f)
                curveToRelative(32.537f, 0.409f, 77.689f, 0.054f, 116.158f, -37.894f)
                curveToRelative(37.734f, 37.223f, 81.021f, 38.073f, 116.087f, 37.845f)
                curveToRelative(6.595f, -0.043f, 11.913f, -5.405f, 11.913f, -12f)
                verticalLineTo(460.24f)
                curveToRelative(0f, -6.687f, -5.458f, -12.078f, -12.145f, -11.998f)
                curveTo(217.889f, 448.553f, 160f, 444.939f, 160f, 400f)
                verticalLineTo(288f)
                horizontalLineToRelative(36f)
                curveToRelative(6.627f, 0f, 12f, -5.373f, 12f, -12f)
                verticalLineToRelative(-40f)
                curveToRelative(0f, -6.627f, -5.373f, -12f, -12f, -12f)
                horizontalLineToRelative(-36f)
                verticalLineTo(112.182f)
                curveToRelative(0f, -44.932f, 56.075f, -48.213f, 83.95f, -48.142f)
                curveToRelative(6.646f, 0.018f, 12.05f, -5.346f, 12.05f, -11.992f)
                close()
            }
        }.build()
        
        return _ICursor!!
    }

private var _ICursor: ImageVector? = null

