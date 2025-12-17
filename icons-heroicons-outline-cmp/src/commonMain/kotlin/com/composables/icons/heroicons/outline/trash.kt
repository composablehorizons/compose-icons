package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Trash: ImageVector
    get() {
        if (_Trash != null) return _Trash!!
        
        _Trash = ImageVector.Builder(
            name = "trash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(14.74f, 9f)
                lineToRelative(-0.346f, 9f)
                moveToRelative(-4.788f, 0f)
                lineTo(9.26f, 9f)
                moveToRelative(9.968f, -3.21f)
                curveToRelative(0.342f, 0.052f, 0.682f, 0.107f, 1.022f, 0.166f)
                moveToRelative(-1.022f, -0.165f)
                lineTo(18.16f, 19.673f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, -2.244f, 2.077f)
                horizontalLineTo(8.084f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, -2.244f, -2.077f)
                lineTo(4.772f, 5.79f)
                moveToRelative(14.456f, 0f)
                arcToRelative(48.108f, 48.108f, 0f, false, false, -3.478f, -0.397f)
                moveToRelative(-12f, 0.562f)
                curveToRelative(0.34f, -0.059f, 0.68f, -0.114f, 1.022f, -0.165f)
                moveToRelative(0f, 0f)
                arcToRelative(48.11f, 48.11f, 0f, false, true, 3.478f, -0.397f)
                moveToRelative(7.5f, 0f)
                verticalLineToRelative(-0.916f)
                curveToRelative(0f, -1.18f, -0.91f, -2.164f, -2.09f, -2.201f)
                arcToRelative(51.964f, 51.964f, 0f, false, false, -3.32f, 0f)
                curveToRelative(-1.18f, 0.037f, -2.09f, 1.022f, -2.09f, 2.201f)
                verticalLineToRelative(0.916f)
                moveToRelative(7.5f, 0f)
                arcToRelative(48.667f, 48.667f, 0f, false, false, -7.5f, 0f)
            }
        }.build()
        
        return _Trash!!
    }

private var _Trash: ImageVector? = null

