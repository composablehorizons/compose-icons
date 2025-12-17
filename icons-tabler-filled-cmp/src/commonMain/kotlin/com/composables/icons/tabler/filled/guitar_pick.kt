package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.GuitarPick: ImageVector
    get() {
        if (_GuitarPick != null) return _GuitarPick!!
        
        _GuitarPick = ImageVector.Builder(
            name = "guitar-pick",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2f)
                curveToRelative(-1.613f, 0f, -2.882f, 0.104f, -3.825f, 0.323f)
                lineToRelative(-0.23f, 0.057f)
                curveToRelative(-3.019f, 0.708f, -4.945f, 2.503f, -4.945f, 5.62f)
                curveToRelative(0f, 3.367f, 1.939f, 8.274f, 4.22f, 11.125f)
                curveToRelative(0.32f, 0.4f, 0.664f, 0.786f, 1.03f, 1.158f)
                lineToRelative(0.367f, 0.36f)
                arcToRelative(4.904f, 4.904f, 0f, false, false, 6.752f, 0.011f)
                arcToRelative(15.04f, 15.04f, 0f, false, false, 1.41f, -1.528f)
                curveToRelative(2.491f, -3.113f, 4.221f, -7.294f, 4.221f, -11.126f)
                curveToRelative(0f, -3.025f, -1.813f, -4.806f, -4.71f, -5.562f)
                lineToRelative(-0.266f, -0.066f)
                curveToRelative(-0.936f, -0.25f, -2.281f, -0.372f, -4.024f, -0.372f)
                close()
            }
        }.build()
        
        return _GuitarPick!!
    }

private var _GuitarPick: ImageVector? = null

