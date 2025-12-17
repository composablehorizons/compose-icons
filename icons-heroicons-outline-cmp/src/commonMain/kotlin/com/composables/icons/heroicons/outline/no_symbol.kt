package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.NoSymbol: ImageVector
    get() {
        if (_NoSymbol != null) return _NoSymbol!!
        
        _NoSymbol = ImageVector.Builder(
            name = "no-symbol",
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
                moveTo(18.364f, 18.364f)
                arcTo(9f, 9f, 0f, false, false, 5.636f, 5.636f)
                moveToRelative(12.728f, 12.728f)
                arcTo(9f, 9f, 0f, false, true, 5.636f, 5.636f)
                moveToRelative(12.728f, 12.728f)
                lineTo(5.636f, 5.636f)
            }
        }.build()
        
        return _NoSymbol!!
    }

private var _NoSymbol: ImageVector? = null

