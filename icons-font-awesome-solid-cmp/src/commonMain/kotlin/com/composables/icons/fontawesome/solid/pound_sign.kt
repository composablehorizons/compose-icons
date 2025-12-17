package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.PoundSign: ImageVector
    get() {
        if (_PoundSign != null) return _PoundSign!!
        
        _PoundSign = ImageVector.Builder(
            name = "pound-sign",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 320f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(308f, 352f)
                horizontalLineToRelative(-45.495f)
                curveToRelative(-6.627f, 0f, -12f, 5.373f, -12f, 12f)
                verticalLineToRelative(50.848f)
                horizontalLineTo(128f)
                verticalLineTo(288f)
                horizontalLineToRelative(84f)
                curveToRelative(6.627f, 0f, 12f, -5.373f, 12f, -12f)
                verticalLineToRelative(-40f)
                curveToRelative(0f, -6.627f, -5.373f, -12f, -12f, -12f)
                horizontalLineToRelative(-84f)
                verticalLineToRelative(-63.556f)
                curveToRelative(0f, -32.266f, 24.562f, -57.086f, 61.792f, -57.086f)
                curveToRelative(23.658f, 0f, 45.878f, 11.505f, 57.652f, 18.849f)
                curveToRelative(5.151f, 3.213f, 11.888f, 2.051f, 15.688f, -2.685f)
                lineToRelative(28.493f, -35.513f)
                curveToRelative(4.233f, -5.276f, 3.279f, -13.005f, -2.119f, -17.081f)
                curveTo(273.124f, 54.56f, 236.576f, 32f, 187.931f, 32f)
                curveTo(106.026f, 32f, 48f, 84.742f, 48f, 157.961f)
                verticalLineTo(224f)
                horizontalLineTo(20f)
                curveToRelative(-6.627f, 0f, -12f, 5.373f, -12f, 12f)
                verticalLineToRelative(40f)
                curveToRelative(0f, 6.627f, 5.373f, 12f, 12f, 12f)
                horizontalLineToRelative(28f)
                verticalLineToRelative(128f)
                horizontalLineTo(12f)
                curveToRelative(-6.627f, 0f, -12f, 5.373f, -12f, 12f)
                verticalLineToRelative(40f)
                curveToRelative(0f, 6.627f, 5.373f, 12f, 12f, 12f)
                horizontalLineToRelative(296f)
                curveToRelative(6.627f, 0f, 12f, -5.373f, 12f, -12f)
                verticalLineTo(364f)
                curveToRelative(0f, -6.627f, -5.373f, -12f, -12f, -12f)
                close()
            }
        }.build()
        
        return _PoundSign!!
    }

private var _PoundSign: ImageVector? = null

