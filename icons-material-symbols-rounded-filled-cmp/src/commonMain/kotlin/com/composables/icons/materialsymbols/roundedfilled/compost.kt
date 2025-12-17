package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Compost: ImageVector
    get() {
        if (_Compost != null) return _Compost!!
        
        _Compost = ImageVector.Builder(
            name = "compost",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 860f)
                quadToRelative(-79f, 0f, -148f, -30f)
                reflectiveQuadToRelative(-120.5f, -81.5f)
                quadTo(160f, 697f, 130f, 628f)
                reflectiveQuadToRelative(-30f, -148f)
                quadToRelative(0f, -79f, 30f, -148f)
                reflectiveQuadToRelative(81.5f, -120.5f)
                quadTo(263f, 160f, 332f, 130f)
                reflectiveQuadToRelative(148f, -30f)
                verticalLineToRelative(-52f)
                quadToRelative(0f, -14f, 12f, -19f)
                reflectiveQuadToRelative(22f, 5f)
                lineToRelative(98f, 98f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                lineToRelative(-98f, 98f)
                quadToRelative(-10f, 10f, -22f, 5f)
                reflectiveQuadToRelative(-12f, -19f)
                verticalLineToRelative(-52f)
                quadToRelative(-108f, 0f, -184f, 76f)
                reflectiveQuadToRelative(-76f, 184f)
                quadToRelative(0f, 66f, 30.5f, 122.5f)
                reflectiveQuadTo(332f, 694f)
                quadToRelative(16f, -28f, 47.5f, -47.5f)
                reflectiveQuadTo(452f, 622f)
                quadToRelative(-3f, -21f, -8f, -42f)
                reflectiveQuadToRelative(-12f, -39f)
                quadToRelative(-11f, 9f, -24f, 14f)
                reflectiveQuadToRelative(-28f, 5f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(300f, 480f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -8f, -1.5f, -15.5f)
                reflectiveQuadTo(295f, 410f)
                quadToRelative(-5f, -11f, 1.5f, -20.5f)
                reflectiveQuadTo(314f, 381f)
                quadToRelative(45f, 2f, 95f, 22f)
                reflectiveQuadToRelative(51f, 77f)
                quadToRelative(0f, 9f, -1.5f, 16.5f)
                reflectiveQuadTo(453f, 512f)
                quadToRelative(-13f, -10f, -26f, -18f)
                reflectiveQuadToRelative(-27f, -14f)
                quadToRelative(17f, 13f, 39f, 40f)
                reflectiveQuadToRelative(41f, 64f)
                quadToRelative(20f, -49f, 50f, -96.5f)
                reflectiveQuadToRelative(70f, -87.5f)
                quadToRelative(-23f, 16f, -44f, 34f)
                reflectiveQuadToRelative(-41f, 38f)
                quadToRelative(-7f, -11f, -11f, -24.5f)
                reflectiveQuadToRelative(-4f, -27.5f)
                quadToRelative(0f, -42f, 29f, -71f)
                reflectiveQuadToRelative(71f, -29f)
                horizontalLineToRelative(40f)
                quadToRelative(14f, 0f, 29.5f, -3.5f)
                reflectiveQuadTo(696f, 303f)
                quadToRelative(7f, -7f, 16f, -3.5f)
                reflectiveQuadToRelative(9f, 13.5f)
                quadToRelative(0f, 25f, -3.5f, 60.5f)
                reflectiveQuadToRelative(-16f, 68f)
                quadTo(689f, 474f, 665f, 497f)
                reflectiveQuadToRelative(-65f, 23f)
                quadToRelative(-15f, 0f, -28.5f, -4f)
                reflectiveQuadTo(547f, 505f)
                quadToRelative(-7f, 19f, -16f, 50.5f)
                reflectiveQuadTo(517f, 623f)
                quadToRelative(38f, 7f, 67f, 26f)
                reflectiveQuadToRelative(44f, 45f)
                quadToRelative(42f, -29f, 70f, -72f)
                reflectiveQuadToRelative(38f, -95f)
                quadToRelative(5f, -25f, 22.5f, -42f)
                reflectiveQuadToRelative(41.5f, -17f)
                quadToRelative(26f, 0f, 43.5f, 18.5f)
                reflectiveQuadTo(857f, 530f)
                quadToRelative(-18f, 141f, -124.5f, 235.5f)
                reflectiveQuadTo(480f, 860f)
                close()
            }
        }.build()
        
        return _Compost!!
    }

private var _Compost: ImageVector? = null

