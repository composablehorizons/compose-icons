package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Dry_cleaning: ImageVector
    get() {
        if (_Dry_cleaning != null) return _Dry_cleaning!!
        
        _Dry_cleaning = ImageVector.Builder(
            name = "dry_cleaning",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(280f, 800f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-64f)
                quadToRelative(-40f, 0f, -68f, -28f)
                reflectiveQuadToRelative(-28f, -68f)
                quadToRelative(0f, -29f, 16f, -53.5f)
                reflectiveQuadToRelative(42f, -36.5f)
                lineToRelative(262f, -116f)
                verticalLineToRelative(-26f)
                quadToRelative(-36f, -13f, -58f, -43.5f)
                reflectiveQuadTo(360f, 200f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(36f, 0f, 66f, 20f)
                reflectiveQuadToRelative(44f, 52f)
                lineToRelative(4f, 17f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(554f, 209f)
                quadToRelative(-13f, 0f, -22.5f, -7f)
                reflectiveQuadTo(517f, 184f)
                quadToRelative(-5f, -11f, -15f, -17.5f)
                reflectiveQuadToRelative(-22f, -6.5f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 200f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 240f)
                reflectiveQuadToRelative(28.5f, 11.5f)
                quadTo(520f, 263f, 520f, 280f)
                verticalLineToRelative(58f)
                lineToRelative(262f, 116f)
                quadToRelative(26f, 12f, 42f, 36.5f)
                reflectiveQuadToRelative(16f, 53.5f)
                quadToRelative(0f, 40f, -28f, 68f)
                reflectiveQuadToRelative(-68f, 28f)
                horizontalLineToRelative(-64f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(600f, 880f)
                horizontalLineTo(360f)
                close()
                moveTo(216f, 560f)
                horizontalLineToRelative(75f)
                quadToRelative(11f, -18f, 29f, -29f)
                reflectiveQuadToRelative(40f, -11f)
                horizontalLineToRelative(240f)
                quadToRelative(22f, 0f, 40f, 11f)
                reflectiveQuadToRelative(29f, 29f)
                horizontalLineToRelative(75f)
                quadToRelative(7f, 0f, 11.5f, -5f)
                reflectiveQuadToRelative(4.5f, -13f)
                quadToRelative(0f, -5f, -2.5f, -8.5f)
                reflectiveQuadTo(750f, 528f)
                lineTo(480f, 408f)
                lineTo(210f, 528f)
                quadToRelative(-5f, 2f, -7.5f, 5.5f)
                reflectiveQuadTo(200f, 542f)
                quadToRelative(0f, 8f, 4.5f, 13f)
                reflectiveQuadToRelative(11.5f, 5f)
                close()
            }
        }.build()
        
        return _Dry_cleaning!!
    }

private var _Dry_cleaning: ImageVector? = null

