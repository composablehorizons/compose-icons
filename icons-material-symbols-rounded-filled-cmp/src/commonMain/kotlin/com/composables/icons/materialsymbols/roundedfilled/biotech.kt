package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Biotech: ImageVector
    get() {
        if (_Biotech != null) return _Biotech!!
        
        _Biotech = ImageVector.Builder(
            name = "biotech",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(200f, 800f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(240f, 760f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-80f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(200f, 480f)
                quadToRelative(0f, -57f, 29f, -105f)
                reflectiveQuadToRelative(80f, -73f)
                quadToRelative(-4f, 22f, 1.5f, 43f)
                reflectiveQuadToRelative(17.5f, 40f)
                quadToRelative(-23f, 16f, -35.5f, 41f)
                reflectiveQuadTo(280f, 480f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                horizontalLineToRelative(280f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(720f, 640f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(680f, 680f)
                horizontalLineTo(520f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(200f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(760f, 800f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(720f, 840f)
                horizontalLineTo(240f)
                close()
                moveToRelative(308f, -394f)
                horizontalLineToRelative(-1f)
                quadToRelative(-16f, 6f, -30.5f, -0.5f)
                reflectiveQuadTo(496f, 423f)
                lineToRelative(-6f, -16f)
                quadToRelative(20f, -16f, 31f, -38.5f)
                reflectiveQuadToRelative(11f, -48.5f)
                quadToRelative(0f, -47f, -33f, -79.5f)
                reflectiveQuadTo(418f, 208f)
                lineToRelative(-5f, -13f)
                quadToRelative(-5f, -16f, 1.5f, -30.5f)
                reflectiveQuadTo(437f, 144f)
                horizontalLineToRelative(1f)
                quadToRelative(-6f, -15f, 1f, -29.5f)
                reflectiveQuadToRelative(24f, -20.5f)
                quadToRelative(15f, -5f, 29.5f, 1.5f)
                reflectiveQuadTo(512f, 118f)
                quadToRelative(16f, -6f, 31f, 1f)
                reflectiveQuadToRelative(21f, 23f)
                lineToRelative(82f, 225f)
                quadToRelative(6f, 16f, -0.5f, 30.5f)
                reflectiveQuadTo(623f, 418f)
                horizontalLineToRelative(-1f)
                quadToRelative(6f, 16f, -1f, 31f)
                reflectiveQuadToRelative(-24f, 21f)
                quadToRelative(-15f, 5f, -29.5f, -1.5f)
                reflectiveQuadTo(548f, 446f)
                close()
                moveToRelative(-128f, -54f)
                quadToRelative(-30f, 0f, -51f, -21f)
                reflectiveQuadToRelative(-21f, -51f)
                quadToRelative(0f, -30f, 21f, -51f)
                reflectiveQuadToRelative(51f, -21f)
                quadToRelative(30f, 0f, 51f, 21f)
                reflectiveQuadToRelative(21f, 51f)
                quadToRelative(0f, 30f, -21f, 51f)
                reflectiveQuadToRelative(-51f, 21f)
                close()
            }
        }.build()
        
        return _Biotech!!
    }

private var _Biotech: ImageVector? = null

