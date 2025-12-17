package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Ophthalmology: ImageVector
    get() {
        if (_Ophthalmology != null) return _Ophthalmology!!
        
        _Ophthalmology = ImageVector.Builder(
            name = "ophthalmology",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 120f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(21f, 21f)
                quadToRelative(12f, 12f, 15.5f, 28.5f)
                reflectiveQuadTo(492f, 202f)
                quadToRelative(-5f, 17f, -18f, 28f)
                reflectiveQuadToRelative(-30f, 13f)
                quadToRelative(-69f, 11f, -121.5f, 56.5f)
                reflectiveQuadTo(250f, 412f)
                quadToRelative(-4f, 13f, -14f, 20.5f)
                reflectiveQuadToRelative(-24f, 7.5f)
                horizontalLineToRelative(-52f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 400f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 360f)
                horizontalLineToRelative(23f)
                quadToRelative(29f, -69f, 84.5f, -119f)
                reflectiveQuadTo(395f, 171f)
                quadToRelative(-8f, -12f, -7f, -26f)
                reflectiveQuadToRelative(12f, -25f)
                close()
                moveToRelative(200f, 360f)
                quadToRelative(0f, -44f, 16.5f, -84f)
                reflectiveQuadToRelative(53.5f, -62f)
                quadToRelative(-17f, -23f, -38.5f, -40.5f)
                reflectiveQuadTo(585f, 264f)
                quadToRelative(-15f, -8f, -22.5f, -22f)
                reflectiveQuadToRelative(-2.5f, -30f)
                quadToRelative(5f, -16f, 20f, -24f)
                reflectiveQuadToRelative(30f, -1f)
                quadToRelative(48f, 22f, 86f, 58.5f)
                reflectiveQuadToRelative(64f, 84.5f)
                quadToRelative(42f, 20f, 61f, 61.5f)
                reflectiveQuadToRelative(19f, 88.5f)
                quadToRelative(0f, 47f, -19f, 88.5f)
                reflectiveQuadTo(760f, 630f)
                quadToRelative(-25f, 47f, -63f, 83.5f)
                reflectiveQuadTo(611f, 772f)
                quadToRelative(-16f, 7f, -31f, 0f)
                reflectiveQuadToRelative(-20f, -24f)
                quadToRelative(-5f, -16f, 3f, -30.5f)
                reflectiveQuadToRelative(23f, -22.5f)
                quadToRelative(25f, -12f, 46f, -29.5f)
                reflectiveQuadToRelative(38f, -39.5f)
                quadToRelative(-37f, -22f, -53.5f, -62f)
                reflectiveQuadTo(600f, 480f)
                close()
                moveTo(395f, 845f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -29f)
                quadToRelative(-72f, -20f, -128f, -69.5f)
                reflectiveQuadTo(183f, 600f)
                horizontalLineToRelative(-23f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 560f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 520f)
                horizontalLineToRelative(52f)
                quadToRelative(14f, 0f, 24f, 7.5f)
                reflectiveQuadToRelative(14f, 20.5f)
                quadToRelative(20f, 67f, 72.5f, 112.5f)
                reflectiveQuadTo(444f, 717f)
                quadToRelative(17f, 2f, 30f, 13.5f)
                reflectiveQuadToRelative(18f, 27.5f)
                quadToRelative(5f, 16f, 1.5f, 32f)
                reflectiveQuadTo(478f, 818f)
                lineToRelative(-27f, 27f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                close()
            }
        }.build()
        
        return _Ophthalmology!!
    }

private var _Ophthalmology: ImageVector? = null

