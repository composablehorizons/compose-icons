package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Pencil: ImageVector
    get() {
        if (_Pencil != null) return _Pencil!!
        
        _Pencil = ImageVector.Builder(
            name = "pencil",
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
                moveTo(16.862f, 4.487f)
                lineToRelative(1.687f, -1.688f)
                arcToRelative(1.875f, 1.875f, 0f, true, true, 2.652f, 2.652f)
                lineTo(6.832f, 19.82f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, -1.897f, 1.13f)
                lineToRelative(-2.685f, 0.8f)
                lineToRelative(0.8f, -2.685f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, 1.13f, -1.897f)
                lineTo(16.863f, 4.487f)
                close()
                moveToRelative(0f, 0f)
                lineTo(19.5f, 7.125f)
            }
        }.build()
        
        return _Pencil!!
    }

private var _Pencil: ImageVector? = null

