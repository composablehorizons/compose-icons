package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.PuzzlePiece: ImageVector
    get() {
        if (_PuzzlePiece != null) return _PuzzlePiece!!
        
        _PuzzlePiece = ImageVector.Builder(
            name = "puzzle-piece",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 4.467f)
                curveToRelative(0f, -0.405f, 0.262f, -0.75f, 0.559f, -1.027f)
                curveToRelative(0.276f, -0.257f, 0.441f, -0.584f, 0.441f, -0.94f)
                curveToRelative(0f, -0.828f, -0.895f, -1.5f, -2f, -1.5f)
                reflectiveCurveToRelative(-2f, 0.672f, -2f, 1.5f)
                curveToRelative(0f, 0.362f, 0.171f, 0.694f, 0.456f, 0.953f)
                curveToRelative(0.29f, 0.265f, 0.544f, 0.6f, 0.544f, 0.994f)
                arcToRelative(0.968f, 0.968f, 0f, false, true, -1.024f, 0.974f)
                arcToRelative(39.655f, 39.655f, 0f, false, true, -3.014f, -0.306f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.847f, 0.847f)
                curveToRelative(0.14f, 0.993f, 0.242f, 1.999f, 0.306f, 3.014f)
                arcTo(0.968f, 0.968f, 0f, false, true, 4.447f, 10f)
                curveToRelative(-0.393f, 0f, -0.729f, -0.253f, -0.994f, -0.544f)
                curveTo(3.194f, 9.17f, 2.862f, 9f, 2.5f, 9f)
                curveTo(1.672f, 9f, 1f, 9.895f, 1f, 11f)
                reflectiveCurveToRelative(0.672f, 2f, 1.5f, 2f)
                curveToRelative(0.356f, 0f, 0.683f, -0.165f, 0.94f, -0.441f)
                curveToRelative(0.276f, -0.297f, 0.622f, -0.559f, 1.027f, -0.559f)
                arcToRelative(0.997f, 0.997f, 0f, false, true, 1.004f, 1.03f)
                arcToRelative(39.747f, 39.747f, 0f, false, true, -0.319f, 3.734f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.64f, 0.842f)
                curveToRelative(1.05f, 0.146f, 2.111f, 0.252f, 3.184f, 0.318f)
                arcTo(0.97f, 0.97f, 0f, false, false, 10f, 16.948f)
                curveToRelative(0f, -0.394f, -0.254f, -0.73f, -0.545f, -0.995f)
                curveTo(9.171f, 15.693f, 9f, 15.362f, 9f, 15f)
                curveToRelative(0f, -0.828f, 0.895f, -1.5f, 2f, -1.5f)
                reflectiveCurveToRelative(2f, 0.672f, 2f, 1.5f)
                curveToRelative(0f, 0.356f, -0.165f, 0.683f, -0.441f, 0.94f)
                curveToRelative(-0.297f, 0.276f, -0.559f, 0.622f, -0.559f, 1.027f)
                arcToRelative(0.998f, 0.998f, 0f, false, false, 1.03f, 1.005f)
                curveToRelative(1.337f, -0.05f, 2.659f, -0.162f, 3.961f, -0.337f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.644f, -0.644f)
                curveToRelative(0.175f, -1.302f, 0.288f, -2.624f, 0.337f, -3.961f)
                arcTo(0.998f, 0.998f, 0f, false, false, 16.967f, 12f)
                curveToRelative(-0.405f, 0f, -0.75f, 0.262f, -1.027f, 0.559f)
                curveToRelative(-0.257f, 0.276f, -0.584f, 0.441f, -0.94f, 0.441f)
                curveToRelative(-0.828f, 0f, -1.5f, -0.895f, -1.5f, -2f)
                reflectiveCurveToRelative(0.672f, -2f, 1.5f, -2f)
                curveToRelative(0.362f, 0f, 0.694f, 0.17f, 0.953f, 0.455f)
                curveToRelative(0.265f, 0.291f, 0.601f, 0.545f, 0.995f, 0.545f)
                arcToRelative(0.97f, 0.97f, 0f, false, false, 0.976f, -1.024f)
                arcToRelative(41.159f, 41.159f, 0f, false, false, -0.318f, -3.184f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.842f, -0.64f)
                curveToRelative(-1.228f, 0.164f, -2.473f, 0.271f, -3.734f, 0.319f)
                arcTo(0.997f, 0.997f, 0f, false, true, 12f, 4.467f)
                close()
            }
        }.build()
        
        return _PuzzlePiece!!
    }

private var _PuzzlePiece: ImageVector? = null

