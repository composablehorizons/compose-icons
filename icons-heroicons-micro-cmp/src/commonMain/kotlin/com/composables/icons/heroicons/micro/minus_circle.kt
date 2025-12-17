package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.MinusCircle: ImageVector
    get() {
        if (_MinusCircle != null) return _MinusCircle!!
        
        _MinusCircle = ImageVector.Builder(
            name = "minus-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 15f)
                arcTo(7f, 7f, 0f, true, false, 8f, 1f)
                arcToRelative(7f, 7f, 0f, false, false, 0f, 14f)
                close()
                moveToRelative(4f, -7f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-6.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(6.5f)
                arcTo(0.75f, 0.75f, 0f, false, false, 12f, 8f)
                close()
            }
        }.build()
        
        return _MinusCircle!!
    }

private var _MinusCircle: ImageVector? = null

