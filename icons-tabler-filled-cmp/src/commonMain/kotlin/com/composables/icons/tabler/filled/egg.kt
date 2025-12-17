package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Egg: ImageVector
    get() {
        if (_Egg != null) return _Egg!!
        
        _Egg = ImageVector.Builder(
            name = "egg",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.002f, 2f)
                curveToRelative(-4.173f, -0.008f, -8.002f, 6.058f, -8.002f, 12.083f)
                curveToRelative(0f, 4.708f, 3.25f, 7.917f, 8f, 7.917f)
                curveToRelative(4.727f, -0.206f, 8f, -3.328f, 8f, -7.917f)
                curveToRelative(0f, -6.02f, -3.825f, -12.075f, -7.998f, -12.083f)
                close()
            }
        }.build()
        
        return _Egg!!
    }

private var _Egg: ImageVector? = null

