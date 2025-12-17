package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Family_link: ImageVector
    get() {
        if (_Family_link != null) return _Family_link!!
        
        _Family_link = ImageVector.Builder(
            name = "family_link",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(390f, 920f)
                quadToRelative(-51f, 0f, -90.5f, -30.5f)
                reflectiveQuadTo(246f, 811f)
                quadToRelative(-6f, -23f, -25f, -37f)
                reflectiveQuadToRelative(-43f, -14f)
                quadToRelative(-16f, 0f, -30f, 6.5f)
                reflectiveQuadTo(124f, 785f)
                lineToRelative(-61f, -51f)
                quadToRelative(21f, -26f, 51.5f, -40f)
                reflectiveQuadToRelative(63.5f, -14f)
                quadToRelative(51f, 0f, 91f, 30f)
                reflectiveQuadToRelative(54f, 79f)
                quadToRelative(6f, 23f, 25f, 37f)
                reflectiveQuadToRelative(42f, 14f)
                quadToRelative(19f, 0f, 34f, -10f)
                reflectiveQuadToRelative(26f, -25f)
                lineToRelative(1f, -2f)
                lineToRelative(-276f, -381f)
                quadToRelative(-8f, -11f, -11.5f, -23f)
                reflectiveQuadToRelative(-3.5f, -24f)
                quadToRelative(0f, -16f, 6f, -30.5f)
                reflectiveQuadToRelative(18f, -26.5f)
                lineToRelative(260f, -255f)
                quadToRelative(11f, -11f, 26f, -17f)
                reflectiveQuadToRelative(30f, -6f)
                quadToRelative(15f, 0f, 30f, 6f)
                reflectiveQuadToRelative(26f, 17f)
                lineToRelative(260f, 255f)
                quadToRelative(12f, 12f, 18f, 26.5f)
                reflectiveQuadToRelative(6f, 30.5f)
                quadToRelative(0f, 12f, -3.5f, 24f)
                reflectiveQuadTo(825f, 422f)
                lineTo(500f, 872f)
                quadToRelative(-18f, 25f, -48f, 36.5f)
                reflectiveQuadTo(390f, 920f)
                close()
            }
        }.build()
        
        return _Family_link!!
    }

private var _Family_link: ImageVector? = null

