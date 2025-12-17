package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.AtSymbol: ImageVector
    get() {
        if (_AtSymbol != null) return _AtSymbol!!
        
        _AtSymbol = ImageVector.Builder(
            name = "at-symbol",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.89f, 4.111f)
                arcToRelative(5.5f, 5.5f, 0f, true, false, 0f, 7.778f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.06f, 1.061f)
                arcTo(7f, 7f, 0f, true, true, 15f, 8f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -4.083f, 1.935f)
                arcTo(3.5f, 3.5f, 0f, true, true, 11.5f, 8f)
                arcToRelative(1f, 1f, 0f, false, false, 2f, 0f)
                arcToRelative(5.48f, 5.48f, 0f, false, false, -1.61f, -3.889f)
                close()
                moveTo(10f, 8f)
                arcToRelative(2f, 2f, 0f, true, false, -4f, 0f)
                arcToRelative(2f, 2f, 0f, false, false, 4f, 0f)
                close()
            }
        }.build()
        
        return _AtSymbol!!
    }

private var _AtSymbol: ImageVector? = null

