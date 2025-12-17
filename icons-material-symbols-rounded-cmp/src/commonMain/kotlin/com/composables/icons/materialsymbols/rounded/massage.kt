package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Massage: ImageVector
    get() {
        if (_Massage != null) return _Massage!!
        
        _Massage = ImageVector.Builder(
            name = "massage",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(323f, 472f)
                lineToRelative(210f, 23f)
                lineToRelative(16f, -34f)
                lineToRelative(-61f, -33f)
                lineToRelative(-54f, -5f)
                quadToRelative(-17f, -2f, -27.5f, -13.5f)
                reflectiveQuadTo(398f, 381f)
                quadToRelative(2f, -17f, 13.5f, -28f)
                reflectiveQuadToRelative(28.5f, -9f)
                lineToRelative(72f, 5f)
                lineToRelative(221f, 123f)
                quadToRelative(17f, 10f, 35.5f, 12.5f)
                reflectiveQuadTo(802f, 476f)
                lineTo(606f, 280f)
                horizontalLineTo(357f)
                lineToRelative(-65f, -96f)
                lineToRelative(-110f, 55f)
                lineToRelative(76f, 183f)
                quadToRelative(8f, 21f, 25.5f, 34f)
                reflectiveQuadToRelative(39.5f, 16f)
                close()
                moveToRelative(-9f, 79f)
                quadToRelative(-44f, -5f, -78.5f, -31f)
                reflectiveQuadTo(184f, 453f)
                lineToRelative(-76f, -184f)
                quadToRelative(-12f, -29f, -1f, -58.5f)
                reflectiveQuadToRelative(39f, -43.5f)
                lineToRelative(111f, -55f)
                quadToRelative(27f, -14f, 56f, -6.5f)
                reflectiveQuadToRelative(46f, 33.5f)
                lineToRelative(41f, 61f)
                horizontalLineToRelative(208f)
                quadToRelative(16f, 0f, 31f, 6.5f)
                reflectiveQuadToRelative(26f, 17.5f)
                lineToRelative(227f, 228f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                lineToRelative(-6f, 6f)
                quadToRelative(-38f, 38f, -91f, 45.5f)
                reflectiveQuadTo(695f, 541f)
                lineToRelative(-76f, -41f)
                lineToRelative(-13f, 29f)
                quadToRelative(-11f, 23f, -33f, 35.5f)
                reflectiveQuadToRelative(-48f, 9.5f)
                lineToRelative(-211f, -23f)
                close()
                moveTo(168f, 829f)
                quadToRelative(-16f, 5f, -30f, -3.5f)
                reflectiveQuadTo(119f, 801f)
                quadToRelative(-5f, -17f, 3.5f, -30.5f)
                reflectiveQuadTo(148f, 752f)
                lineToRelative(150f, -40f)
                quadToRelative(72f, -19f, 153f, -35.5f)
                reflectiveQuadTo(599f, 660f)
                quadToRelative(66f, 0f, 124f, 23.5f)
                reflectiveQuadTo(836f, 748f)
                quadToRelative(13f, 9f, 13.5f, 24.5f)
                reflectiveQuadTo(839f, 800f)
                quadToRelative(-11f, 12f, -27f, 14.5f)
                reflectiveQuadToRelative(-30f, -7.5f)
                quadToRelative(-45f, -32f, -91.5f, -49.5f)
                reflectiveQuadTo(599f, 740f)
                quadToRelative(-64f, 0f, -141f, 16.5f)
                reflectiveQuadTo(319f, 789f)
                lineToRelative(-151f, 40f)
                close()
            }
        }.build()
        
        return _Massage!!
    }

private var _Massage: ImageVector? = null

