package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Animation: ImageVector
    get() {
        if (_Animation != null) return _Animation!!
        
        _Animation = ImageVector.Builder(
            name = "animation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 880f)
                quadToRelative(-58f, 0f, -109f, -22f)
                reflectiveQuadToRelative(-89f, -60f)
                quadToRelative(-38f, -38f, -60f, -89f)
                reflectiveQuadTo(80f, 600f)
                quadToRelative(0f, -81f, 42f, -148f)
                reflectiveQuadToRelative(110f, -102f)
                quadToRelative(20f, -39f, 49.5f, -68.5f)
                reflectiveQuadTo(350f, 232f)
                quadToRelative(33f, -68f, 101f, -110f)
                reflectiveQuadToRelative(149f, -42f)
                quadToRelative(58f, 0f, 109f, 22f)
                reflectiveQuadToRelative(89f, 60f)
                quadToRelative(38f, 38f, 60f, 89f)
                reflectiveQuadToRelative(22f, 109f)
                quadToRelative(0f, 85f, -42f, 150f)
                reflectiveQuadTo(728f, 610f)
                quadToRelative(-20f, 39f, -49.5f, 68.5f)
                reflectiveQuadTo(610f, 728f)
                quadToRelative(-35f, 68f, -102f, 110f)
                reflectiveQuadTo(360f, 880f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(33f, 0f, 63.5f, -10f)
                reflectiveQuadToRelative(56.5f, -30f)
                quadToRelative(-58f, 0f, -109f, -22f)
                reflectiveQuadToRelative(-89f, -60f)
                quadToRelative(-38f, -38f, -60f, -89f)
                reflectiveQuadToRelative(-22f, -109f)
                quadToRelative(-20f, 26f, -30f, 56.5f)
                reflectiveQuadTo(160f, 600f)
                quadToRelative(0f, 42f, 16f, 78f)
                reflectiveQuadToRelative(43f, 63f)
                quadToRelative(27f, 27f, 63f, 43f)
                reflectiveQuadToRelative(78f, 16f)
                close()
                moveToRelative(120f, -120f)
                quadToRelative(33f, 0f, 64.5f, -10f)
                reflectiveQuadToRelative(57.5f, -30f)
                quadToRelative(-59f, 0f, -110f, -22.5f)
                reflectiveQuadTo(403f, 557f)
                quadToRelative(-38f, -38f, -60.5f, -89f)
                reflectiveQuadTo(320f, 358f)
                quadToRelative(-20f, 26f, -30f, 57.5f)
                reflectiveQuadTo(280f, 480f)
                quadToRelative(0f, 42f, 15.5f, 78f)
                reflectiveQuadToRelative(43.5f, 63f)
                quadToRelative(27f, 28f, 63f, 43.5f)
                reflectiveQuadToRelative(78f, 15.5f)
                close()
                moveToRelative(120f, -120f)
                quadToRelative(18f, 0f, 34.5f, -3f)
                reflectiveQuadToRelative(33.5f, -9f)
                quadToRelative(22f, -60f, 6.5f, -115.5f)
                reflectiveQuadTo(621f, 339f)
                quadToRelative(-38f, -38f, -93.5f, -53.5f)
                reflectiveQuadTo(412f, 292f)
                quadToRelative(-6f, 17f, -9f, 33.5f)
                reflectiveQuadToRelative(-3f, 34.5f)
                quadToRelative(0f, 42f, 15.5f, 78f)
                reflectiveQuadToRelative(43.5f, 63f)
                quadToRelative(27f, 28f, 63f, 43.5f)
                reflectiveQuadToRelative(78f, 15.5f)
                close()
                moveToRelative(160f, -78f)
                quadToRelative(20f, -26f, 30f, -57.5f)
                reflectiveQuadToRelative(10f, -64.5f)
                quadToRelative(0f, -42f, -15.5f, -78f)
                reflectiveQuadTo(741f, 219f)
                quadToRelative(-27f, -28f, -63f, -43.5f)
                reflectiveQuadTo(600f, 160f)
                quadToRelative(-35f, 0f, -65.5f, 10f)
                reflectiveQuadTo(478f, 200f)
                quadToRelative(59f, 0f, 110f, 22.5f)
                reflectiveQuadToRelative(89f, 60.5f)
                quadToRelative(38f, 38f, 60.5f, 89f)
                reflectiveQuadTo(760f, 482f)
                close()
            }
        }.build()
        
        return _Animation!!
    }

private var _Animation: ImageVector? = null

