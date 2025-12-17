package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Megaphone: ImageVector
    get() {
        if (_Megaphone != null) return _Megaphone!!
        
        _Megaphone = ImageVector.Builder(
            name = "megaphone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(10.34f, 15.84f)
                curveToRelative(-0.688f, -0.06f, -1.386f, -0.09f, -2.09f, -0.09f)
                horizontalLineTo(7.5f)
                arcToRelative(4.5f, 4.5f, 0f, true, true, 0f, -9f)
                horizontalLineToRelative(0.75f)
                curveToRelative(0.704f, 0f, 1.402f, -0.03f, 2.09f, -0.09f)
                moveToRelative(0f, 9.18f)
                curveToRelative(0.253f, 0.962f, 0.584f, 1.892f, 0.985f, 2.783f)
                curveToRelative(0.247f, 0.55f, 0.06f, 1.21f, -0.463f, 1.511f)
                lineToRelative(-0.657f, 0.38f)
                curveToRelative(-0.551f, 0.318f, -1.26f, 0.117f, -1.527f, -0.461f)
                arcToRelative(20.845f, 20.845f, 0f, false, true, -1.44f, -4.282f)
                moveToRelative(3.102f, 0.069f)
                arcToRelative(18.03f, 18.03f, 0f, false, true, -0.59f, -4.59f)
                curveToRelative(0f, -1.586f, 0.205f, -3.124f, 0.59f, -4.59f)
                moveToRelative(0f, 9.18f)
                arcToRelative(23.848f, 23.848f, 0f, false, true, 8.835f, 2.535f)
                moveTo(10.34f, 6.66f)
                arcToRelative(23.847f, 23.847f, 0f, false, false, 8.835f, -2.535f)
                moveToRelative(0f, 0f)
                arcTo(23.74f, 23.74f, 0f, false, false, 18.795f, 3f)
                moveToRelative(0.38f, 1.125f)
                arcToRelative(23.91f, 23.91f, 0f, false, true, 1.014f, 5.395f)
                moveToRelative(-1.014f, 8.855f)
                curveToRelative(-0.118f, 0.38f, -0.245f, 0.754f, -0.38f, 1.125f)
                moveToRelative(0.38f, -1.125f)
                arcToRelative(23.91f, 23.91f, 0f, false, false, 1.014f, -5.395f)
                moveToRelative(0f, -3.46f)
                curveToRelative(0.495f, 0.413f, 0.811f, 1.035f, 0.811f, 1.73f)
                curveToRelative(0f, 0.695f, -0.316f, 1.317f, -0.811f, 1.73f)
                moveToRelative(0f, -3.46f)
                arcToRelative(24.347f, 24.347f, 0f, false, true, 0f, 3.46f)
            }
        }.build()
        
        return _Megaphone!!
    }

private var _Megaphone: ImageVector? = null

