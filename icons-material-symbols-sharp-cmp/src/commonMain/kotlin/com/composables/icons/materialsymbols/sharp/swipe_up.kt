package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Swipe_up: ImageVector
    get() {
        if (_Swipe_up != null) return _Swipe_up!!
        
        _Swipe_up = ImageVector.Builder(
            name = "swipe_up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(245f, 560f)
                quadToRelative(-51f, -64f, -78f, -141f)
                reflectiveQuadToRelative(-27f, -159f)
                quadToRelative(0f, -27f, 3f, -54f)
                reflectiveQuadToRelative(9f, -54f)
                lineToRelative(-70f, 70f)
                lineToRelative(-42f, -42f)
                lineToRelative(140f, -140f)
                lineToRelative(140f, 140f)
                lineToRelative(-42f, 42f)
                lineToRelative(-65f, -64f)
                quadToRelative(-7f, 25f, -10f, 50.5f)
                reflectiveQuadToRelative(-3f, 51.5f)
                quadToRelative(0f, 70f, 22.5f, 135.5f)
                reflectiveQuadTo(288f, 517f)
                lineToRelative(-43f, 43f)
                close()
                moveToRelative(59f, 147f)
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
        
        return _Swipe_up!!
    }

private var _Swipe_up: ImageVector? = null

