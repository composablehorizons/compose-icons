package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Crosshairs: ImageVector
    get() {
        if (_Crosshairs != null) return _Crosshairs!!
        
        _Crosshairs = ImageVector.Builder(
            name = "crosshairs",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(500f, 224f)
                horizontalLineToRelative(-30.364f)
                curveTo(455.724f, 130.325f, 381.675f, 56.276f, 288f, 42.364f)
                verticalLineTo(12f)
                curveToRelative(0f, -6.627f, -5.373f, -12f, -12f, -12f)
                horizontalLineToRelative(-40f)
                curveToRelative(-6.627f, 0f, -12f, 5.373f, -12f, 12f)
                verticalLineToRelative(30.364f)
                curveTo(130.325f, 56.276f, 56.276f, 130.325f, 42.364f, 224f)
                horizontalLineTo(12f)
                curveToRelative(-6.627f, 0f, -12f, 5.373f, -12f, 12f)
                verticalLineToRelative(40f)
                curveToRelative(0f, 6.627f, 5.373f, 12f, 12f, 12f)
                horizontalLineToRelative(30.364f)
                curveTo(56.276f, 381.675f, 130.325f, 455.724f, 224f, 469.636f)
                verticalLineTo(500f)
                curveToRelative(0f, 6.627f, 5.373f, 12f, 12f, 12f)
                horizontalLineToRelative(40f)
                curveToRelative(6.627f, 0f, 12f, -5.373f, 12f, -12f)
                verticalLineToRelative(-30.364f)
                curveTo(381.675f, 455.724f, 455.724f, 381.675f, 469.636f, 288f)
                horizontalLineTo(500f)
                curveToRelative(6.627f, 0f, 12f, -5.373f, 12f, -12f)
                verticalLineToRelative(-40f)
                curveToRelative(0f, -6.627f, -5.373f, -12f, -12f, -12f)
                close()
                moveTo(288f, 404.634f)
                verticalLineTo(364f)
                curveToRelative(0f, -6.627f, -5.373f, -12f, -12f, -12f)
                horizontalLineToRelative(-40f)
                curveToRelative(-6.627f, 0f, -12f, 5.373f, -12f, 12f)
                verticalLineToRelative(40.634f)
                curveTo(165.826f, 392.232f, 119.783f, 346.243f, 107.366f, 288f)
                horizontalLineTo(148f)
                curveToRelative(6.627f, 0f, 12f, -5.373f, 12f, -12f)
                verticalLineToRelative(-40f)
                curveToRelative(0f, -6.627f, -5.373f, -12f, -12f, -12f)
                horizontalLineToRelative(-40.634f)
                curveTo(119.768f, 165.826f, 165.757f, 119.783f, 224f, 107.366f)
                verticalLineTo(148f)
                curveToRelative(0f, 6.627f, 5.373f, 12f, 12f, 12f)
                horizontalLineToRelative(40f)
                curveToRelative(6.627f, 0f, 12f, -5.373f, 12f, -12f)
                verticalLineToRelative(-40.634f)
                curveTo(346.174f, 119.768f, 392.217f, 165.757f, 404.634f, 224f)
                horizontalLineTo(364f)
                curveToRelative(-6.627f, 0f, -12f, 5.373f, -12f, 12f)
                verticalLineToRelative(40f)
                curveToRelative(0f, 6.627f, 5.373f, 12f, 12f, 12f)
                horizontalLineToRelative(40.634f)
                curveTo(392.232f, 346.174f, 346.243f, 392.217f, 288f, 404.634f)
                close()
                moveTo(288f, 256f)
                curveToRelative(0f, 17.673f, -14.327f, 32f, -32f, 32f)
                reflectiveCurveToRelative(-32f, -14.327f, -32f, -32f)
                curveToRelative(0f, -17.673f, 14.327f, -32f, 32f, -32f)
                reflectiveCurveToRelative(32f, 14.327f, 32f, 32f)
                close()
            }
        }.build()
        
        return _Crosshairs!!
    }

private var _Crosshairs: ImageVector? = null

