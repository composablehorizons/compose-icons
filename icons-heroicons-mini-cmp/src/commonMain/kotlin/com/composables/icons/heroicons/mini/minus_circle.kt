package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.MinusCircle: ImageVector
    get() {
        if (_MinusCircle != null) return _MinusCircle!!
        
        _MinusCircle = ImageVector.Builder(
            name = "minus-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 18f)
                arcToRelative(8f, 8f, 0f, true, false, 0f, -16f)
                arcToRelative(8f, 8f, 0f, false, false, 0f, 16f)
                close()
                moveTo(6.75f, 9.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(6.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineToRelative(-6.5f)
                close()
            }
        }.build()
        
        return _MinusCircle!!
    }

private var _MinusCircle: ImageVector? = null

