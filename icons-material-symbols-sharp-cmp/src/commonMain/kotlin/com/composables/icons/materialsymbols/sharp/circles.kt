package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Circles: ImageVector
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
                moveTo(666f, 600f)
                quadToRelative(33f, 2f, 65.5f, -3.5f)
                reflectiveQuadTo(794f, 578f)
                quadToRelative(-21f, 131f, -121f, 216.5f)
                reflectiveQuadTo(440f, 880f)
                quadToRelative(-75f, 0f, -140.5f, -28.5f)
                reflectiveQuadToRelative(-114f, -77f)
                quadToRelative(-48.5f, -48.5f, -77f, -114f)
                reflectiveQuadTo(80f, 520f)
                quadToRelative(0f, -133f, 85.5f, -233f)
                reflectiveQuadTo(382f, 166f)
                quadToRelative(-13f, 30f, -18.5f, 62.5f)
                reflectiveQuadTo(360f, 294f)
                quadToRelative(-72f, 25f, -116f, 87f)
                reflectiveQuadToRelative(-44f, 139f)
                quadToRelative(0f, 100f, 70f, 170f)
                reflectiveQuadToRelative(170f, 70f)
                quadToRelative(77f, 0f, 139f, -44f)
                reflectiveQuadToRelative(87f, -116f)
                close()
                moveToRelative(14f, -560f)
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

