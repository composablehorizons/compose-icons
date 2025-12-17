package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Dry: ImageVector
    get() {
        if (_Dry != null) return _Dry!!
        
        _Dry = ImageVector.Builder(
            name = "dry",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 880f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-216f)
                quadToRelative(0f, -31f, 14.5f, -57.5f)
                reflectiveQuadTo(135f, 403f)
                lineToRelative(306f, -199f)
                quadToRelative(11f, -7f, 23f, -5.5f)
                reflectiveQuadToRelative(21f, 10.5f)
                quadToRelative(20f, 20f, 23.5f, 47.5f)
                reflectiveQuadTo(497f, 308f)
                lineToRelative(-45f, 72f)
                horizontalLineToRelative(308f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 420f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 460f)
                horizontalLineTo(380f)
                quadToRelative(-23f, 0f, -35f, -20.5f)
                reflectiveQuadToRelative(1f, -40.5f)
                lineToRelative(39f, -63f)
                lineToRelative(-207f, 134f)
                quadToRelative(-9f, 5f, -13.5f, 14f)
                reflectiveQuadToRelative(-4.5f, 20f)
                verticalLineToRelative(216f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(240f, 800f)
                horizontalLineToRelative(480f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(760f, 840f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(720f, 880f)
                horizontalLineTo(240f)
                close()
                moveToRelative(600f, -280f)
                horizontalLineTo(520f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(480f, 560f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(520f, 520f)
                horizontalLineToRelative(320f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 560f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 600f)
                close()
                moveToRelative(-40f, 140f)
                horizontalLineTo(520f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(480f, 700f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(520f, 660f)
                horizontalLineToRelative(280f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 700f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 740f)
                close()
                moveTo(320f, 630f)
                close()
                moveToRelative(249f, -428f)
                quadToRelative(-24f, -32f, -36f, -61f)
                reflectiveQuadToRelative(-12f, -63f)
                quadToRelative(0f, -16f, 11f, -27f)
                reflectiveQuadToRelative(27f, -11f)
                quadToRelative(16f, 0f, 26.5f, 11f)
                reflectiveQuadToRelative(11.5f, 27f)
                quadToRelative(2f, 29f, 14f, 48f)
                reflectiveQuadToRelative(30f, 45f)
                quadToRelative(20f, 27f, 29f, 53f)
                reflectiveQuadToRelative(9f, 57f)
                quadToRelative(0f, 17f, -11f, 28f)
                reflectiveQuadToRelative(-28f, 11f)
                quadToRelative(-16f, 0f, -27f, -11.5f)
                reflectiveQuadTo(602f, 281f)
                quadToRelative(-1f, -22f, -8.5f, -39.5f)
                reflectiveQuadTo(569f, 202f)
                close()
                moveToRelative(160f, 0f)
                quadToRelative(-24f, -32f, -35.5f, -61f)
                reflectiveQuadTo(682f, 78f)
                quadToRelative(0f, -16f, 11f, -27f)
                reflectiveQuadToRelative(27f, -11f)
                quadToRelative(15f, 0f, 25.5f, 11f)
                reflectiveQuadToRelative(11.5f, 27f)
                quadToRelative(2f, 29f, 14f, 48f)
                reflectiveQuadToRelative(30f, 45f)
                quadToRelative(20f, 27f, 29f, 53f)
                reflectiveQuadToRelative(9f, 57f)
                quadToRelative(0f, 16f, -11f, 27.5f)
                reflectiveQuadTo(801f, 320f)
                quadToRelative(-16f, 0f, -27f, -11f)
                reflectiveQuadToRelative(-11f, -27f)
                quadToRelative(-1f, -23f, -9f, -40.5f)
                reflectiveQuadTo(729f, 202f)
                close()
            }
        }.build()
        
        return _Dry!!
    }

private var _Dry: ImageVector? = null

