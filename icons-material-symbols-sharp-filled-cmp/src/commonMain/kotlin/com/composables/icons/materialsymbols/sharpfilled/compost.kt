package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Compost: ImageVector
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
                verticalLineToRelative(-100f)
                lineToRelative(160f, 160f)
                lineToRelative(-160f, 160f)
                verticalLineToRelative(-100f)
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
                quadToRelative(0f, -17f, -5.5f, -32f)
                reflectiveQuadTo(280f, 380f)
                quadToRelative(50f, -1f, 89f, 9f)
                quadToRelative(34f, 9f, 62f, 29.5f)
                reflectiveQuadToRelative(29f, 61.5f)
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
                quadToRelative(23f, 0f, 38f, -6f)
                reflectiveQuadToRelative(25f, -14f)
                quadToRelative(11f, -9f, 17f, -20f)
                quadToRelative(4f, 67f, -7f, 120f)
                quadToRelative(-9f, 45f, -34f, 82.5f)
                reflectiveQuadTo(600f, 520f)
                quadToRelative(-15f, 0f, -28.5f, -4f)
                reflectiveQuadTo(547f, 505f)
                quadToRelative(-7f, 19f, -16f, 50.5f)
                reflectiveQuadTo(517f, 623f)
                quadToRelative(38f, 7f, 67f, 26f)
                reflectiveQuadToRelative(44f, 45f)
                quadToRelative(51f, -35f, 81.5f, -91f)
                reflectiveQuadTo(740f, 480f)
                horizontalLineToRelative(120f)
                quadToRelative(0f, 79f, -30f, 148f)
                reflectiveQuadToRelative(-81.5f, 120.5f)
                quadTo(697f, 800f, 628f, 830f)
                reflectiveQuadToRelative(-148f, 30f)
                close()
            }
        }.build()
        
        return _Compost!!
    }

private var _Compost: ImageVector? = null

