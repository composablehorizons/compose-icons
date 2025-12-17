package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.PaintBrush: ImageVector
    get() {
        if (_PaintBrush != null) return _PaintBrush!!
        
        _PaintBrush = ImageVector.Builder(
            name = "paint-brush",
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
                moveTo(9.53f, 16.122f)
                arcToRelative(3f, 3f, 0f, false, false, -5.78f, 1.128f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, -2.4f, 2.245f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, 8.4f, -2.245f)
                curveToRelative(0f, -0.399f, -0.078f, -0.78f, -0.22f, -1.128f)
                close()
                moveToRelative(0f, 0f)
                arcToRelative(15.998f, 15.998f, 0f, false, false, 3.388f, -1.62f)
                moveToRelative(-5.043f, -0.025f)
                arcToRelative(15.994f, 15.994f, 0f, false, true, 1.622f, -3.395f)
                moveToRelative(3.42f, 3.42f)
                arcToRelative(15.995f, 15.995f, 0f, false, false, 4.764f, -4.648f)
                lineToRelative(3.876f, -5.814f)
                arcToRelative(1.151f, 1.151f, 0f, false, false, -1.597f, -1.597f)
                lineTo(14.146f, 6.32f)
                arcToRelative(15.996f, 15.996f, 0f, false, false, -4.649f, 4.763f)
                moveToRelative(3.42f, 3.42f)
                arcToRelative(6.776f, 6.776f, 0f, false, false, -3.42f, -3.42f)
            }
        }.build()
        
        return _PaintBrush!!
    }

private var _PaintBrush: ImageVector? = null

