package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Voice_selection: ImageVector
    get() {
        if (_Voice_selection != null) return _Voice_selection!!
        
        _Voice_selection = ImageVector.Builder(
            name = "voice_selection",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 880f)
                verticalLineToRelative(-80f)
                quadToRelative(46f, 0f, 91f, -6f)
                reflectiveQuadToRelative(88f, -22f)
                quadToRelative(-46f, -23f, -72.5f, -66.5f)
                reflectiveQuadTo(160f, 611f)
                verticalLineToRelative(-91f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(135f)
                lineTo(324f, 138f)
                lineToRelative(72f, -36f)
                lineToRelative(131f, 262f)
                quadToRelative(20f, 40f, -3f, 78f)
                reflectiveQuadToRelative(-68f, 38f)
                horizontalLineToRelative(-56f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(320f, 600f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(11f)
                quadToRelative(0f, 35f, 21.5f, 61.5f)
                reflectiveQuadTo(316f, 708f)
                lineToRelative(12f, 3f)
                quadToRelative(40f, 10f, 45f, 50f)
                reflectiveQuadToRelative(-31f, 60f)
                quadToRelative(-60f, 33f, -126.5f, 46f)
                reflectiveQuadTo(80f, 880f)
                close()
                moveToRelative(572f, -114f)
                lineToRelative(-57f, -56f)
                quadToRelative(21f, -21f, 33f, -48.5f)
                reflectiveQuadToRelative(12f, -59.5f)
                quadToRelative(0f, -32f, -12f, -59.5f)
                reflectiveQuadTo(595f, 494f)
                lineToRelative(57f, -57f)
                quadToRelative(32f, 32f, 50f, 74.5f)
                reflectiveQuadToRelative(18f, 90.5f)
                quadToRelative(0f, 48f, -18f, 90f)
                reflectiveQuadToRelative(-50f, 74f)
                close()
                moveTo(765f, 880f)
                lineToRelative(-57f, -57f)
                quadToRelative(43f, -43f, 67.5f, -99.5f)
                reflectiveQuadTo(800f, 602f)
                quadToRelative(0f, -66f, -24.5f, -122f)
                reflectiveQuadTo(708f, 381f)
                lineToRelative(57f, -57f)
                quadToRelative(54f, 54f, 84.5f, 125f)
                reflectiveQuadTo(880f, 602f)
                quadToRelative(0f, 81f, -30.5f, 152.5f)
                reflectiveQuadTo(765f, 880f)
                close()
            }
        }.build()
        
        return _Voice_selection!!
    }

private var _Voice_selection: ImageVector? = null

