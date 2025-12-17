package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Circles: ImageVector
    get() {
        if (_Circles != null) return _Circles!!
        
        _Circles = ImageVector.Builder(
            name = "circles",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 880f)
                quadToRelative(-75f, 0f, -140.5f, -28.5f)
                reflectiveQuadToRelative(-114f, -77f)
                quadToRelative(-48.5f, -48.5f, -77f, -114f)
                reflectiveQuadTo(80f, 520f)
                quadToRelative(0f, -97f, 47f, -180f)
                reflectiveQuadToRelative(131f, -129f)
                quadToRelative(22f, -12f, 45f, -2.5f)
                reflectiveQuadToRelative(34f, 33.5f)
                quadToRelative(10f, 22f, 0f, 44f)
                reflectiveQuadToRelative(-31f, 35f)
                quadToRelative(-52f, 31f, -79f, 85f)
                reflectiveQuadToRelative(-27f, 114f)
                quadToRelative(0f, 100f, 70f, 170f)
                reflectiveQuadToRelative(170f, 70f)
                quadToRelative(60f, 0f, 115f, -26.5f)
                reflectiveQuadToRelative(84f, -79.5f)
                quadToRelative(12f, -22f, 33.5f, -34f)
                reflectiveQuadToRelative(44.5f, -4f)
                quadToRelative(26f, 9f, 37f, 32f)
                reflectiveQuadToRelative(0f, 46f)
                quadToRelative(-45f, 88f, -130f, 137f)
                reflectiveQuadTo(440f, 880f)
                close()
                moveToRelative(240f, -840f)
                quadToRelative(100f, 0f, 170f, 70f)
                reflectiveQuadToRelative(70f, 170f)
                quadToRelative(0f, 100f, -70f, 170f)
                reflectiveQuadToRelative(-170f, 70f)
                quadToRelative(-100f, 0f, -170f, -70f)
                reflectiveQuadToRelative(-70f, -170f)
                quadToRelative(0f, -100f, 70f, -170f)
                reflectiveQuadToRelative(170f, -70f)
                close()
                moveToRelative(0f, 360f)
                quadToRelative(50f, 0f, 85f, -35f)
                reflectiveQuadToRelative(35f, -85f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                close()
                moveToRelative(0f, -120f)
                close()
                moveTo(433f, 527f)
                close()
            }
        }.build()
        
        return _Circles!!
    }

private var _Circles: ImageVector? = null

