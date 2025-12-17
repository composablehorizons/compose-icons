package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Deployed_code_update: ImageVector
    get() {
        if (_Deployed_code_update != null) return _Deployed_code_update!!
        
        _Deployed_code_update = ImageVector.Builder(
            name = "deployed_code_update",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(720f, 880f)
                lineToRelative(120f, -120f)
                lineToRelative(-28f, -28f)
                lineToRelative(-72f, 72f)
                verticalLineToRelative(-164f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(164f)
                lineToRelative(-72f, -72f)
                lineToRelative(-28f, 28f)
                lineTo(720f, 880f)
                close()
                moveTo(480f, 434f)
                lineTo(243f, 297f)
                lineToRelative(-43f, 25f)
                verticalLineToRelative(42f)
                lineToRelative(280f, 162f)
                lineToRelative(280f, -162f)
                verticalLineToRelative(-42f)
                lineToRelative(-43f, -25f)
                lineToRelative(-237f, 137f)
                close()
                moveTo(440f, 869f)
                lineTo(160f, 708f)
                quadToRelative(-19f, -11f, -29.5f, -29f)
                reflectiveQuadTo(120f, 639f)
                verticalLineToRelative(-318f)
                quadToRelative(0f, -22f, 10.5f, -40f)
                reflectiveQuadToRelative(29.5f, -29f)
                lineToRelative(280f, -161f)
                quadToRelative(19f, -11f, 40f, -11f)
                reflectiveQuadToRelative(40f, 11f)
                lineToRelative(280f, 161f)
                quadToRelative(19f, 11f, 29.5f, 29f)
                reflectiveQuadToRelative(10.5f, 40f)
                verticalLineToRelative(186f)
                quadToRelative(-27f, -13f, -57.5f, -20f)
                reflectiveQuadToRelative(-62.5f, -7f)
                quadToRelative(-116f, 0f, -198f, 82f)
                reflectiveQuadToRelative(-82f, 198f)
                quadToRelative(0f, 32f, 6.5f, 61.5f)
                reflectiveQuadTo(466f, 878f)
                quadToRelative(-7f, -2f, -13.5f, -3.5f)
                reflectiveQuadTo(440f, 869f)
                close()
                moveTo(720f, 960f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(520f, 760f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(720f, 560f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(920f, 760f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(720f, 960f)
                close()
            }
        }.build()
        
        return _Deployed_code_update!!
    }

private var _Deployed_code_update: ImageVector? = null

