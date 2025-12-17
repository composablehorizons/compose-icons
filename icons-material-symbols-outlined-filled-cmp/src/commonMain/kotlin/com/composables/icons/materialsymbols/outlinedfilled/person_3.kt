package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Person_3: ImageVector
    get() {
        if (_Person_3 != null) return _Person_3!!
        
        _Person_3 = ImageVector.Builder(
            name = "person_3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 560f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -22f, 7f, -41.5f)
                reflectiveQuadToRelative(21f, -35.5f)
                quadToRelative(-4f, -10f, -6f, -21f)
                reflectiveQuadToRelative(-2f, -22f)
                quadToRelative(0f, -38f, 20.5f, -67.5f)
                reflectiveQuadTo(374f, 209f)
                quadToRelative(20f, -23f, 47f, -36f)
                reflectiveQuadToRelative(59f, -13f)
                quadToRelative(32f, 0f, 59f, 13f)
                reflectiveQuadToRelative(47f, 36f)
                quadToRelative(33f, 14f, 53.5f, 43.5f)
                reflectiveQuadTo(660f, 320f)
                quadToRelative(0f, 11f, -2f, 22f)
                reflectiveQuadToRelative(-6f, 21f)
                quadToRelative(14f, 16f, 21f, 35.5f)
                reflectiveQuadToRelative(7f, 41.5f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                horizontalLineTo(400f)
                close()
                moveTo(160f, 880f)
                verticalLineToRelative(-112f)
                quadToRelative(0f, -34f, 17.5f, -62.5f)
                reflectiveQuadTo(224f, 662f)
                quadToRelative(62f, -31f, 126f, -46.5f)
                reflectiveQuadTo(480f, 600f)
                quadToRelative(66f, 0f, 130f, 15.5f)
                reflectiveQuadTo(736f, 662f)
                quadToRelative(29f, 15f, 46.5f, 43.5f)
                reflectiveQuadTo(800f, 768f)
                verticalLineToRelative(112f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Person_3!!
    }

private var _Person_3: ImageVector? = null

