package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Cog: ImageVector
    get() {
        if (_Cog != null) return _Cog!!
        
        _Cog = ImageVector.Builder(
            name = "cog",
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
                moveTo(4.5f, 12f)
                arcToRelative(7.5f, 7.5f, 0f, false, false, 15f, 0f)
                moveToRelative(-15f, 0f)
                arcToRelative(7.5f, 7.5f, 0f, true, true, 15f, 0f)
                moveToRelative(-15f, 0f)
                horizontalLineTo(3f)
                moveToRelative(16.5f, 0f)
                horizontalLineTo(21f)
                moveToRelative(-1.5f, 0f)
                horizontalLineTo(12f)
                moveToRelative(-8.457f, 3.077f)
                lineToRelative(1.41f, -0.513f)
                moveToRelative(14.095f, -5.13f)
                lineToRelative(1.41f, -0.513f)
                moveTo(5.106f, 17.785f)
                lineToRelative(1.15f, -0.964f)
                moveToRelative(11.49f, -9.642f)
                lineToRelative(1.149f, -0.964f)
                moveTo(7.501f, 19.795f)
                lineToRelative(0.75f, -1.3f)
                moveToRelative(7.5f, -12.99f)
                lineToRelative(0.75f, -1.3f)
                moveToRelative(-6.063f, 16.658f)
                lineToRelative(0.26f, -1.477f)
                moveToRelative(2.605f, -14.772f)
                lineToRelative(0.26f, -1.477f)
                moveToRelative(0f, 17.726f)
                lineToRelative(-0.26f, -1.477f)
                moveTo(10.698f, 4.614f)
                lineToRelative(-0.26f, -1.477f)
                moveTo(16.5f, 19.794f)
                lineToRelative(-0.75f, -1.299f)
                moveTo(7.5f, 4.205f)
                lineTo(12f, 12f)
                moveToRelative(6.894f, 5.785f)
                lineToRelative(-1.149f, -0.964f)
                moveTo(6.256f, 7.178f)
                lineToRelative(-1.15f, -0.964f)
                moveToRelative(15.352f, 8.864f)
                lineToRelative(-1.41f, -0.513f)
                moveTo(4.954f, 9.435f)
                lineToRelative(-1.41f, -0.514f)
                moveTo(12.002f, 12f)
                lineToRelative(-3.75f, 6.495f)
            }
        }.build()
        
        return _Cog!!
    }

private var _Cog: ImageVector? = null

