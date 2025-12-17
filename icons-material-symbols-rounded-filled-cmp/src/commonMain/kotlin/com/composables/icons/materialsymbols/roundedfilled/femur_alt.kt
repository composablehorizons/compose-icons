package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Femur_alt: ImageVector
    get() {
        if (_Femur_alt != null) return _Femur_alt!!
        
        _Femur_alt = ImageVector.Builder(
            name = "femur_alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(540f, 520f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(580f, 480f)
                quadToRelative(0f, -6f, -6f, -23f)
                quadToRelative(11f, -4f, 18.5f, -14f)
                reflectiveQuadToRelative(7.5f, -23f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(560f, 380f)
                quadToRelative(-13f, 0f, -23f, 7f)
                reflectiveQuadToRelative(-14f, 19f)
                lineToRelative(-146f, -70f)
                quadToRelative(1f, -3f, 3f, -16f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(340f, 280f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(300f, 320f)
                quadToRelative(0f, 6f, 7f, 22f)
                quadToRelative(-11f, 4f, -19f, 14f)
                reflectiveQuadToRelative(-8f, 24f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(320f, 420f)
                quadToRelative(14f, 0f, 24f, -7.5f)
                reflectiveQuadToRelative(14f, -19.5f)
                lineToRelative(146f, 70f)
                lineToRelative(-4f, 17f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(540f, 520f)
                close()
                moveToRelative(181f, -194f)
                quadToRelative(19f, 29f, 29f, 62f)
                reflectiveQuadToRelative(10f, 69f)
                verticalLineToRelative(363f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(700f, 880f)
                horizontalLineTo(430f)
                quadToRelative(-17f, 0f, -29.5f, -9.5f)
                reflectiveQuadTo(383f, 845f)
                quadToRelative(-24f, -84f, -23.5f, -158.5f)
                reflectiveQuadTo(364f, 569f)
                quadToRelative(-1f, 0f, 0f, 0f)
                quadToRelative(-37f, -8f, -92.5f, -26f)
                reflectiveQuadTo(159f, 489f)
                quadToRelative(-17f, -11f, -20f, -31.5f)
                reflectiveQuadToRelative(9f, -37.5f)
                lineToRelative(185f, -259f)
                quadToRelative(13f, -17f, 33.5f, -23f)
                reflectiveQuadToRelative(40.5f, 3f)
                lineToRelative(212f, 97f)
                quadToRelative(32f, 14f, 57.5f, 36.5f)
                reflectiveQuadTo(721f, 326f)
                close()
            }
        }.build()
        
        return _Femur_alt!!
    }

private var _Femur_alt: ImageVector? = null

