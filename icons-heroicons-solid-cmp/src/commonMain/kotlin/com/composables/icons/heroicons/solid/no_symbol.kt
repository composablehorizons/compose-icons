package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.NoSymbol: ImageVector
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
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.72f, 5.66f)
                lineToRelative(11.62f, 11.62f)
                arcTo(8.25f, 8.25f, 0f, false, false, 6.72f, 5.66f)
                close()
                moveToRelative(10.56f, 12.68f)
                lineTo(5.66f, 6.72f)
                arcToRelative(8.25f, 8.25f, 0f, false, false, 11.62f, 11.62f)
                close()
                moveTo(5.105f, 5.106f)
                curveToRelative(3.807f, -3.808f, 9.98f, -3.808f, 13.788f, 0f)
                curveToRelative(3.808f, 3.807f, 3.808f, 9.98f, 0f, 13.788f)
                curveToRelative(-3.807f, 3.808f, -9.98f, 3.808f, -13.788f, 0f)
                curveToRelative(-3.808f, -3.807f, -3.808f, -9.98f, 0f, -13.788f)
                close()
            }
        }.build()
        
        return _NoSymbol!!
    }

private var _NoSymbol: ImageVector? = null

