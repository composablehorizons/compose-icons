package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.NoSymbol: ImageVector
    get() {
        if (_NoSymbol != null) return _NoSymbol!!
        
        _NoSymbol = ImageVector.Builder(
            name = "no-symbol",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.05f, 3.05f)
                arcToRelative(7f, 7f, 0f, true, true, 9.9f, 9.9f)
                arcToRelative(7f, 7f, 0f, false, true, -9.9f, -9.9f)
                close()
                moveToRelative(1.627f, 0.566f)
                lineToRelative(7.707f, 7.707f)
                arcToRelative(5.501f, 5.501f, 0f, false, false, -7.707f, -7.707f)
                close()
                moveToRelative(6.646f, 8.768f)
                lineTo(3.616f, 4.677f)
                arcToRelative(5.501f, 5.501f, 0f, false, false, 7.707f, 7.707f)
                close()
            }
        }.build()
        
        return _NoSymbol!!
    }

private var _NoSymbol: ImageVector? = null

