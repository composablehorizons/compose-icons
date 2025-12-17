package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Swipe_down: ImageVector
    get() {
        if (_Swipe_down != null) return _Swipe_down!!
        
        _Swipe_down = ImageVector.Builder(
            name = "swipe_down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(180f, 600f)
                lineTo(40f, 460f)
                lineToRelative(42f, -42f)
                lineToRelative(70f, 70f)
                quadToRelative(-6f, -27f, -9f, -54f)
                reflectiveQuadToRelative(-3f, -54f)
                quadToRelative(0f, -82f, 27f, -159f)
                reflectiveQuadToRelative(78f, -141f)
                lineToRelative(43f, 43f)
                quadToRelative(-43f, 56f, -65.5f, 121.5f)
                reflectiveQuadTo(200f, 380f)
                quadToRelative(0f, 26f, 3f, 51.5f)
                reflectiveQuadToRelative(10f, 50.5f)
                lineToRelative(65f, -64f)
                lineToRelative(42f, 42f)
                lineToRelative(-140f, 140f)
                close()
                moveToRelative(124f, 107f)
                lineToRelative(38f, -83f)
                lineToRelative(116f, -9f)
                lineToRelative(-126f, -344f)
                lineToRelative(75f, -28f)
                lineToRelative(162f, 445f)
                lineToRelative(-100f, 7f)
                lineToRelative(147f, 68f)
                lineToRelative(247f, -90f)
                lineToRelative(-97f, -262f)
                lineToRelative(75f, -28f)
                lineToRelative(125f, 338f)
                lineToRelative(-355f, 129f)
                lineToRelative(-307f, -143f)
                close()
                moveToRelative(264f, -139f)
                lineToRelative(-68f, -188f)
                lineToRelative(75f, -28f)
                lineToRelative(69f, 188f)
                lineToRelative(-76f, 28f)
                close()
                moveToRelative(113f, -41f)
                lineToRelative(-55f, -150f)
                lineToRelative(75f, -28f)
                lineToRelative(55f, 150f)
                lineToRelative(-75f, 28f)
                close()
                moveToRelative(5f, 79f)
                close()
            }
        }.build()
        
        return _Swipe_down!!
    }

private var _Swipe_down: ImageVector? = null

