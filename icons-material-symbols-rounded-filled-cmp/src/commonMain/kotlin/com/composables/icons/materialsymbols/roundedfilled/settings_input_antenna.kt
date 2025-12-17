package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Settings_input_antenna: ImageVector
    get() {
        if (_Settings_input_antenna != null) return _Settings_input_antenna!!
        
        _Settings_input_antenna = ImageVector.Builder(
            name = "settings_input_antenna",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 480f)
                quadToRelative(-17f, 0f, -29f, -10.5f)
                reflectiveQuadTo(41f, 444f)
                quadToRelative(7f, -85f, 44f, -159f)
                reflectiveQuadToRelative(96f, -128.5f)
                quadTo(240f, 102f, 317f, 71f)
                reflectiveQuadToRelative(163f, -31f)
                quadToRelative(86f, 0f, 163f, 31f)
                reflectiveQuadToRelative(136f, 85.5f)
                quadTo(838f, 211f, 875f, 285f)
                reflectiveQuadToRelative(44f, 159f)
                quadToRelative(2f, 15f, -10f, 25.5f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(-16f, 0f, -28f, -10f)
                reflectiveQuadToRelative(-14f, -26f)
                quadToRelative(-14f, -138f, -116f, -231f)
                reflectiveQuadToRelative(-242f, -93f)
                quadToRelative(-140f, 0f, -242f, 93f)
                reflectiveQuadTo(122f, 444f)
                quadToRelative(-2f, 16f, -14f, 26f)
                reflectiveQuadToRelative(-28f, 10f)
                close()
                moveToRelative(160f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11f)
                reflectiveQuadToRelative(-9.5f, -26f)
                quadToRelative(14f, -104f, 92.5f, -173.5f)
                reflectiveQuadTo(480f, 200f)
                quadToRelative(107f, 0f, 185.5f, 69.5f)
                reflectiveQuadTo(758f, 443f)
                quadToRelative(2f, 15f, -9.5f, 26f)
                reflectiveQuadTo(720f, 480f)
                quadToRelative(-16f, 0f, -28.5f, -8.5f)
                reflectiveQuadTo(677f, 448f)
                quadToRelative(-12f, -72f, -67f, -120f)
                reflectiveQuadToRelative(-130f, -48f)
                quadToRelative(-75f, 0f, -130f, 48f)
                reflectiveQuadToRelative(-67f, 120f)
                quadToRelative(-2f, 15f, -14.5f, 23.5f)
                reflectiveQuadTo(240f, 480f)
                close()
                moveToRelative(240f, 296f)
                lineToRelative(-92f, 92f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(108f, -108f)
                verticalLineToRelative(-132f)
                quadToRelative(-27f, -12f, -43.5f, -37f)
                reflectiveQuadTo(380f, 480f)
                quadToRelative(0f, -42f, 29f, -71f)
                reflectiveQuadToRelative(71f, -29f)
                quadToRelative(42f, 0f, 71f, 29f)
                reflectiveQuadToRelative(29f, 71f)
                quadToRelative(0f, 30f, -16.5f, 55f)
                reflectiveQuadTo(520f, 572f)
                verticalLineToRelative(132f)
                lineToRelative(108f, 108f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineToRelative(-92f, -92f)
                close()
            }
        }.build()
        
        return _Settings_input_antenna!!
    }

private var _Settings_input_antenna: ImageVector? = null

