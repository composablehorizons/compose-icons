package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Italic: ImageVector
    get() {
        if (_Italic != null) return _Italic!!
        
        _Italic = ImageVector.Builder(
            name = "italic",
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
                moveTo(5.248f, 20.246f)
                horizontalLineTo(9.05f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(3.696f)
                moveToRelative(-3.696f, 0f)
                lineToRelative(5.893f, -16.502f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(-3.697f)
                moveToRelative(3.697f, 0f)
                horizontalLineToRelative(3.803f)
            }
        }.build()
        
        return _Italic!!
    }

private var _Italic: ImageVector? = null

