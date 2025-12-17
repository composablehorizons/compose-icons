package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Location_disabled: ImageVector
    get() {
        if (_Location_disabled != null) return _Location_disabled!!
        
        _Location_disabled = ImageVector.Builder(
            name = "location_disabled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(918f, 482f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(878f, 522f)
                horizontalLineToRelative(-40f)
                quadToRelative(-3f, 26f, -9f, 49.5f)
                reflectiveQuadTo(813f, 618f)
                quadToRelative(-6f, 15f, -22f, 20f)
                reflectiveQuadToRelative(-30f, -3f)
                quadToRelative(-14f, -8f, -19f, -23.5f)
                reflectiveQuadToRelative(1f, -31.5f)
                quadToRelative(8f, -23f, 12.5f, -47.5f)
                reflectiveQuadTo(760f, 482f)
                quadToRelative(0f, -116f, -82f, -198f)
                reflectiveQuadToRelative(-198f, -82f)
                quadToRelative(-26f, 0f, -50.5f, 4.5f)
                reflectiveQuadTo(382f, 219f)
                quadToRelative(-16f, 6f, -31.5f, 1f)
                reflectiveQuadTo(327f, 201f)
                quadToRelative(-8f, -14f, -3f, -30f)
                reflectiveQuadToRelative(20f, -22f)
                quadToRelative(23f, -10f, 46.5f, -16f)
                reflectiveQuadToRelative(49.5f, -9f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 44f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 84f)
                verticalLineToRelative(40f)
                quadToRelative(125f, 14f, 214.5f, 103.5f)
                reflectiveQuadTo(838f, 442f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(918f, 482f)
                close()
                moveTo(440f, 880f)
                verticalLineToRelative(-40f)
                quadToRelative(-125f, -14f, -214.5f, -103.5f)
                reflectiveQuadTo(122f, 522f)
                horizontalLineTo(82f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(42f, 482f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(82f, 442f)
                horizontalLineToRelative(40f)
                quadToRelative(5f, -42f, 19f, -79.5f)
                reflectiveQuadToRelative(35f, -72.5f)
                lineToRelative(-92f, -92f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(679f, 679f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(819f, 878f)
                quadToRelative(-12f, 11f, -28.5f, 11.5f)
                reflectiveQuadTo(762f, 878f)
                lineToRelative(-90f, -92f)
                quadToRelative(-35f, 21f, -72.5f, 35f)
                reflectiveQuadTo(520f, 840f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 920f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 880f)
                close()
                moveToRelative(40f, -118f)
                quadToRelative(36f, 0f, 70f, -8.5f)
                reflectiveQuadToRelative(64f, -25.5f)
                lineTo(234f, 348f)
                quadToRelative(-17f, 30f, -25.5f, 64f)
                reflectiveQuadToRelative(-8.5f, 70f)
                quadToRelative(0f, 116f, 82f, 198f)
                reflectiveQuadToRelative(198f, 82f)
                close()
            }
        }.build()
        
        return _Location_disabled!!
    }

private var _Location_disabled: ImageVector? = null

