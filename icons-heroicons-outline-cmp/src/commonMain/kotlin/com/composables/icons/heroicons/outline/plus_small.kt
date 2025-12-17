package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.PlusSmall: ImageVector
    get() {
        if (_PlusSmall != null) return _PlusSmall!!
        
        _PlusSmall = ImageVector.Builder(
            name = "plus-small",
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
                moveTo(12f, 6f)
                verticalLineToRelative(12f)
                moveToRelative(6f, -6f)
                horizontalLineTo(6f)
            }
        }.build()
        
        return _PlusSmall!!
    }

private var _PlusSmall: ImageVector? = null

