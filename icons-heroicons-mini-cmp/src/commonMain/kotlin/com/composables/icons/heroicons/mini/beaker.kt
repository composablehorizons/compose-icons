package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Beaker: ImageVector
    get() {
        if (_Beaker != null) return _Beaker!!
        
        _Beaker = ImageVector.Builder(
            name = "beaker",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.5f, 3.528f)
                verticalLineToRelative(4.644f)
                curveToRelative(0f, 0.729f, -0.29f, 1.428f, -0.805f, 1.944f)
                lineToRelative(-1.217f, 1.216f)
                arcToRelative(8.75f, 8.75f, 0f, false, true, 3.55f, 0.621f)
                lineToRelative(0.502f, 0.201f)
                arcToRelative(7.25f, 7.25f, 0f, false, false, 4.178f, 0.365f)
                lineToRelative(-2.403f, -2.403f)
                arcToRelative(2.75f, 2.75f, 0f, false, true, -0.805f, -1.944f)
                verticalLineTo(3.528f)
                arcToRelative(40.205f, 40.205f, 0f, false, false, -3f, 0f)
                close()
                moveToRelative(4.5f, 0.084f)
                lineToRelative(0.19f, 0.015f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 0.12f, -1.495f)
                arcToRelative(41.364f, 41.364f, 0f, false, false, -6.62f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.12f, 1.495f)
                lineTo(7f, 3.612f)
                verticalLineToRelative(4.56f)
                curveToRelative(0f, 0.331f, -0.132f, 0.649f, -0.366f, 0.883f)
                lineTo(2.6f, 13.09f)
                curveToRelative(-1.496f, 1.496f, -0.817f, 4.15f, 1.403f, 4.475f)
                curveTo(5.961f, 17.852f, 7.963f, 18f, 10f, 18f)
                reflectiveCurveToRelative(4.039f, -0.148f, 5.997f, -0.436f)
                curveToRelative(2.22f, -0.325f, 2.9f, -2.979f, 1.403f, -4.475f)
                lineToRelative(-4.034f, -4.034f)
                arcTo(1.25f, 1.25f, 0f, false, true, 13f, 8.172f)
                verticalLineToRelative(-4.56f)
                close()
            }
        }.build()
        
        return _Beaker!!
    }

private var _Beaker: ImageVector? = null

