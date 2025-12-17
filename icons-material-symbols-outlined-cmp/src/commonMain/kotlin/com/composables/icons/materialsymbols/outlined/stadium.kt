package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Stadium: ImageVector
    get() {
        if (_Stadium != null) return _Stadium!!
        
        _Stadium = ImageVector.Builder(
            name = "stadium",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 280f)
                verticalLineToRelative(-160f)
                lineToRelative(160f, 80f)
                lineToRelative(-160f, 80f)
                close()
                moveToRelative(600f, 0f)
                verticalLineToRelative(-160f)
                lineToRelative(160f, 80f)
                lineToRelative(-160f, 80f)
                close()
                moveToRelative(-280f, -40f)
                verticalLineToRelative(-160f)
                lineToRelative(160f, 80f)
                lineToRelative(-160f, 80f)
                close()
                moveToRelative(0f, 640f)
                quadToRelative(-76f, -2f, -141.5f, -12.5f)
                reflectiveQuadToRelative(-114f, -26.5f)
                quadTo(136f, 825f, 108f, 804f)
                reflectiveQuadToRelative(-28f, -44f)
                verticalLineToRelative(-360f)
                quadToRelative(0f, -25f, 31.5f, -46.5f)
                reflectiveQuadToRelative(85.5f, -38f)
                quadToRelative(54f, -16.5f, 127f, -26f)
                reflectiveQuadToRelative(156f, -9.5f)
                quadToRelative(83f, 0f, 156f, 9.5f)
                reflectiveQuadToRelative(127f, 26f)
                quadToRelative(54f, 16.5f, 85.5f, 38f)
                reflectiveQuadTo(880f, 400f)
                verticalLineToRelative(360f)
                quadToRelative(0f, 23f, -28f, 44f)
                reflectiveQuadToRelative(-76.5f, 37f)
                quadToRelative(-48.5f, 16f, -114f, 26.5f)
                reflectiveQuadTo(520f, 880f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(40f, -440f)
                quadToRelative(97f, 0f, 167.5f, -11.5f)
                reflectiveQuadTo(760f, 402f)
                quadToRelative(0f, -5f, -76f, -23.5f)
                reflectiveQuadTo(480f, 360f)
                quadToRelative(-128f, 0f, -204f, 18.5f)
                reflectiveQuadTo(200f, 402f)
                quadToRelative(42f, 15f, 112.5f, 26.5f)
                reflectiveQuadTo(480f, 440f)
                close()
                moveTo(360f, 794f)
                verticalLineToRelative(-154f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(154f)
                quadToRelative(80f, -8f, 131f, -23.5f)
                reflectiveQuadToRelative(69f, -27.5f)
                verticalLineToRelative(-271f)
                quadToRelative(-55f, 22f, -138f, 35f)
                reflectiveQuadToRelative(-182f, 13f)
                quadToRelative(-99f, 0f, -182f, -13f)
                reflectiveQuadToRelative(-138f, -35f)
                verticalLineToRelative(271f)
                quadToRelative(18f, 12f, 69f, 27.5f)
                reflectiveQuadTo(360f, 794f)
                close()
                moveToRelative(120f, -161f)
                close()
            }
        }.build()
        
        return _Stadium!!
    }

private var _Stadium: ImageVector? = null

