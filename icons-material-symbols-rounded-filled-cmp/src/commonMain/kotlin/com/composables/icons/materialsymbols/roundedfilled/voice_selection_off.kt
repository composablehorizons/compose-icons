package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Voice_selection_off: ImageVector
    get() {
        if (_Voice_selection_off != null) return _Voice_selection_off!!
        
        _Voice_selection_off = ImageVector.Builder(
            name = "voice_selection_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(733f, 349f)
                quadToRelative(11f, -12f, 26.5f, -13f)
                reflectiveQuadToRelative(26.5f, 11f)
                quadToRelative(44f, 51f, 69f, 116f)
                reflectiveQuadToRelative(25f, 139f)
                quadToRelative(0f, 23f, -3f, 46.5f)
                reflectiveQuadToRelative(-8f, 46.5f)
                quadToRelative(-4f, 16f, -18.5f, 24.5f)
                reflectiveQuadTo(820f, 724f)
                quadToRelative(-16f, -4f, -24.5f, -18f)
                reflectiveQuadToRelative(-4.5f, -30f)
                quadToRelative(17f, -72f, 1f, -142.5f)
                reflectiveQuadTo(730f, 406f)
                quadToRelative(-11f, -13f, -9.5f, -29f)
                reflectiveQuadToRelative(12.5f, -28f)
                close()
                moveTo(342f, 174f)
                quadToRelative(-8f, -15f, -2.5f, -30.5f)
                reflectiveQuadTo(360f, 120f)
                quadToRelative(15f, -8f, 30.5f, -2.5f)
                reflectiveQuadTo(414f, 138f)
                lineToRelative(54f, 109f)
                quadToRelative(8f, 14f, 2f, 29f)
                reflectiveQuadToRelative(-20f, 22f)
                quadToRelative(-15f, 8f, -31f, 1.5f)
                reflectiveQuadTo(395f, 278f)
                lineToRelative(-53f, -104f)
                close()
                moveTo(160f, 611f)
                verticalLineToRelative(-51f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 520f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(360f, 400f)
                horizontalLineToRelative(41f)
                lineToRelative(80f, 80f)
                horizontalLineToRelative(-81f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(320f, 600f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(11f)
                quadToRelative(0f, 35f, 21.5f, 61.5f)
                reflectiveQuadTo(316f, 708f)
                lineToRelative(12f, 3f)
                quadToRelative(40f, 10f, 45f, 50f)
                reflectiveQuadToRelative(-31f, 60f)
                quadToRelative(-51f, 29f, -107f, 42f)
                reflectiveQuadTo(120f, 879f)
                quadToRelative(-17f, 1f, -28.5f, -10.5f)
                reflectiveQuadTo(80f, 840f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 799f)
                quadToRelative(36f, -2f, 70.5f, -8.5f)
                reflectiveQuadTo(259f, 772f)
                quadToRelative(-46f, -23f, -72.5f, -66.5f)
                reflectiveQuadTo(160f, 611f)
                close()
                moveTo(791f, 904f)
                lineTo(56f, 168f)
                quadToRelative(-11f, -11f, -11.5f, -27.5f)
                reflectiveQuadTo(56f, 112f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(736f, 736f)
                quadToRelative(11f, 11f, 11f, 27.5f)
                reflectiveQuadTo(848f, 904f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(791f, 904f)
                close()
            }
        }.build()
        
        return _Voice_selection_off!!
    }

private var _Voice_selection_off: ImageVector? = null

