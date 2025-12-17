package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.AtSymbol: ImageVector
    get() {
        if (_AtSymbol != null) return _AtSymbol!!
        
        _AtSymbol = ImageVector.Builder(
            name = "at-symbol",
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
                moveTo(16.5f, 12f)
                arcToRelative(4.5f, 4.5f, 0f, true, true, -9f, 0f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, 9f, 0f)
                close()
                moveToRelative(0f, 0f)
                curveToRelative(0f, 1.657f, 1.007f, 3f, 2.25f, 3f)
                reflectiveCurveTo(21f, 13.657f, 21f, 12f)
                arcToRelative(9f, 9f, 0f, true, false, -2.636f, 6.364f)
                moveTo(16.5f, 12f)
                verticalLineTo(8.25f)
            }
        }.build()
        
        return _AtSymbol!!
    }

private var _AtSymbol: ImageVector? = null

