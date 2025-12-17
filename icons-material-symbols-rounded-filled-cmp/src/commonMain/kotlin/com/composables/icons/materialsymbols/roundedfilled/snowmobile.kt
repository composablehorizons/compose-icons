package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Snowmobile: ImageVector
    get() {
        if (_Snowmobile != null) return _Snowmobile!!
        
        _Snowmobile = ImageVector.Builder(
            name = "snowmobile",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 720f)
                horizontalLineToRelative(240f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(400f, 640f)
                lineToRelative(-110f, -33f)
                lineTo(80f, 720f)
                close()
                moveToRelative(870f, 0f)
                quadToRelative(0f, 6f, -2f, 12f)
                reflectiveQuadToRelative(-5f, 11f)
                quadToRelative(-16f, 26f, -43.5f, 41.5f)
                reflectiveQuadTo(840f, 800f)
                horizontalLineTo(640f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(600f, 760f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(640f, 720f)
                horizontalLineToRelative(77f)
                lineToRelative(-80f, -80f)
                horizontalLineTo(480f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                horizontalLineTo(80f)
                quadToRelative(-38f, 0f, -59f, -25f)
                reflectiveQuadTo(0f, 720f)
                quadToRelative(0f, -20f, 10f, -39f)
                reflectiveQuadToRelative(32f, -31f)
                lineToRelative(140f, -76f)
                lineToRelative(-113f, -34f)
                quadToRelative(-27f, -8f, -38.5f, -33.5f)
                reflectiveQuadTo(32f, 456f)
                lineToRelative(29f, -59f)
                quadToRelative(8f, -17f, 25f, -25.5f)
                reflectiveQuadToRelative(36f, -6.5f)
                lineToRelative(318f, 35f)
                lineToRelative(122f, -91f)
                lineToRelative(-32f, -29f)
                horizontalLineToRelative(-50f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 240f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 200f)
                horizontalLineToRelative(51f)
                quadToRelative(15f, 0f, 29f, 5f)
                reflectiveQuadToRelative(25f, 16f)
                lineToRelative(262f, 244f)
                quadToRelative(19f, 17f, 26f, 33.5f)
                reflectiveQuadToRelative(7f, 31.5f)
                quadToRelative(0f, 43f, -33f, 76.5f)
                reflectiveQuadTo(747f, 640f)
                lineToRelative(86f, 80f)
                horizontalLineToRelative(7f)
                quadToRelative(10f, 0f, 19f, -4.5f)
                reflectiveQuadToRelative(14f, -12.5f)
                quadToRelative(6f, -10f, 15.5f, -16.5f)
                reflectiveQuadTo(909f, 680f)
                quadToRelative(17f, 0f, 29f, 11.5f)
                reflectiveQuadToRelative(12f, 28.5f)
                close()
            }
        }.build()
        
        return _Snowmobile!!
    }

private var _Snowmobile: ImageVector? = null

