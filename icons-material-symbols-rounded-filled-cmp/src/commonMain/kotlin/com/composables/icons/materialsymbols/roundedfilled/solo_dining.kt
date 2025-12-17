package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Solo_dining: ImageVector
    get() {
        if (_Solo_dining != null) return _Solo_dining!!
        
        _Solo_dining = ImageVector.Builder(
            name = "solo_dining",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(380f, 320f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveTo(80f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(40f, 840f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(80f, 800f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-295f)
                quadToRelative(0f, -35f, 28.5f, -65f)
                reflectiveQuadToRelative(82.5f, -50f)
                quadToRelative(32f, -13f, 73f, -21.5f)
                reflectiveQuadToRelative(76f, -8.5f)
                quadToRelative(34f, 0f, 76.5f, 9f)
                reflectiveQuadToRelative(77.5f, 23f)
                quadToRelative(51f, 20f, 78.5f, 49.5f)
                reflectiveQuadTo(640f, 505f)
                verticalLineToRelative(15f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(600f, 560f)
                horizontalLineToRelative(-80f)
                quadToRelative(-39f, 0f, -63.5f, 30.5f)
                reflectiveQuadTo(442f, 659f)
                lineToRelative(35f, 141f)
                horizontalLineToRelative(83f)
                quadToRelative(-1f, -3f, -1.5f, -5.5f)
                reflectiveQuadTo(557f, 789f)
                lineToRelative(-25f, -99f)
                quadToRelative(-5f, -19f, 7f, -34.5f)
                reflectiveQuadToRelative(32f, -15.5f)
                horizontalLineToRelative(298f)
                quadToRelative(20f, 0f, 32f, 15.5f)
                reflectiveQuadToRelative(7f, 34.5f)
                lineToRelative(-25f, 99f)
                quadToRelative(-1f, 3f, -1.5f, 5.5f)
                reflectiveQuadTo(880f, 800f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 840f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 880f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Solo_dining!!
    }

private var _Solo_dining: ImageVector? = null

