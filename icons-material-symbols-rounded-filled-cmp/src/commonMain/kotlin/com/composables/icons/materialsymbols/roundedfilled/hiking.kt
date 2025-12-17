package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Hiking: ImageVector
    get() {
        if (_Hiking != null) return _Hiking!!
        
        _Hiking = ImageVector.Builder(
            name = "hiking",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(436f, 600f)
                lineTo(371f, 888f)
                quadToRelative(-3f, 14f, -14.5f, 23f)
                reflectiveQuadTo(330f, 920f)
                quadToRelative(-20f, 0f, -32f, -15f)
                reflectiveQuadToRelative(-8f, -34f)
                lineToRelative(113f, -573f)
                quadToRelative(6f, -29f, 27f, -43.5f)
                reflectiveQuadToRelative(44f, -14.5f)
                quadToRelative(23f, 0f, 42.5f, 10f)
                reflectiveQuadToRelative(31.5f, 30f)
                lineToRelative(40f, 64f)
                quadToRelative(18f, 29f, 46.5f, 52.5f)
                reflectiveQuadTo(700f, 431f)
                verticalLineToRelative(-41f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(730f, 360f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(760f, 390f)
                verticalLineToRelative(500f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(730f, 920f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(700f, 890f)
                verticalLineToRelative(-376f)
                quadToRelative(-48f, -11f, -89f, -35f)
                reflectiveQuadToRelative(-71f, -59f)
                lineToRelative(-24f, 120f)
                lineToRelative(72f, 68f)
                quadToRelative(6f, 6f, 9f, 13.5f)
                reflectiveQuadToRelative(3f, 15.5f)
                verticalLineToRelative(243f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(560f, 920f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(520f, 880f)
                verticalLineToRelative(-200f)
                lineToRelative(-84f, -80f)
                close()
                moveToRelative(-178f, -82f)
                lineToRelative(-46f, -9f)
                quadToRelative(-16f, -3f, -25f, -16.5f)
                reflectiveQuadToRelative(-6f, -30.5f)
                lineToRelative(30f, -157f)
                quadToRelative(6f, -34f, 36f, -51.5f)
                reflectiveQuadToRelative(65f, -10.5f)
                quadToRelative(17f, 3f, 25.5f, 16.5f)
                reflectiveQuadTo(343f, 290f)
                lineToRelative(-38f, 196f)
                quadToRelative(-3f, 17f, -16.5f, 26f)
                reflectiveQuadToRelative(-30.5f, 6f)
                close()
                moveToRelative(282f, -298f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(460f, 140f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(540f, 60f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(620f, 140f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(540f, 220f)
                close()
            }
        }.build()
        
        return _Hiking!!
    }

private var _Hiking: ImageVector? = null

