package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Massage: ImageVector
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
                moveTo(314f, 551f)
                quadToRelative(-44f, -5f, -78.5f, -31f)
                reflectiveQuadTo(184f, 453f)
                lineTo(80f, 200f)
                lineToRelative(240f, -120f)
                lineToRelative(80f, 120f)
                horizontalLineToRelative(208f)
                quadToRelative(16f, 0f, 31f, 6.5f)
                reflectiveQuadToRelative(26f, 17.5f)
                lineToRelative(222f, 222f)
                quadToRelative(13f, 14f, 11f, 32f)
                reflectiveQuadToRelative(-17f, 29f)
                lineToRelative(-12f, 9f)
                quadToRelative(-20f, 14f, -45f, 13.5f)
                reflectiveQuadTo(777f, 517f)
                lineTo(510f, 368f)
                lineToRelative(-80f, -6f)
                quadToRelative(-13f, -1f, -22f, 7f)
                reflectiveQuadToRelative(-10f, 21f)
                quadToRelative(-1f, 12f, 7.5f, 21.5f)
                reflectiveQuadTo(426f, 422f)
                lineToRelative(66f, 5f)
                lineToRelative(87f, 50f)
                quadToRelative(19f, 10f, 23.5f, 27.5f)
                reflectiveQuadTo(601f, 539f)
                quadToRelative(-6f, 17f, -22.5f, 28f)
                reflectiveQuadToRelative(-40.5f, 9f)
                lineToRelative(-224f, -25f)
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

