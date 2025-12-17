package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Person_play: ImageVector
    get() {
        if (_Person_play != null) return _Person_play!!
        
        _Person_play = ImageVector.Builder(
            name = "person_play",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(192f, 468f)
                lineTo(92f, 368f)
                quadToRelative(-12f, -12f, -12f, -28f)
                reflectiveQuadToRelative(12f, -28f)
                lineToRelative(100f, -100f)
                quadToRelative(12f, -12f, 28f, -12f)
                reflectiveQuadToRelative(28f, 12f)
                lineToRelative(100f, 100f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                lineTo(248f, 468f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                close()
                moveTo(400f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(360f, 840f)
                verticalLineToRelative(-160f)
                quadToRelative(-50f, -4f, -99f, -11f)
                reflectiveQuadToRelative(-98f, -18f)
                quadToRelative(-17f, -4f, -27.5f, -19f)
                reflectiveQuadToRelative(-5.5f, -32f)
                quadToRelative(5f, -17f, 20.5f, -25f)
                reflectiveQuadToRelative(32.5f, -4f)
                quadToRelative(73f, 17f, 147.5f, 23f)
                reflectiveQuadToRelative(149.5f, 6f)
                quadToRelative(75f, 0f, 149.5f, -6f)
                reflectiveQuadTo(777f, 571f)
                quadToRelative(17f, -4f, 32.5f, 4f)
                reflectiveQuadToRelative(20.5f, 25f)
                quadToRelative(5f, 17f, -5.5f, 32f)
                reflectiveQuadTo(797f, 651f)
                quadToRelative(-49f, 11f, -98f, 18f)
                reflectiveQuadToRelative(-99f, 11f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(560f, 880f)
                horizontalLineTo(400f)
                close()
                moveToRelative(80f, -600f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveToRelative(0f, 280f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 560f)
                close()
                moveToRelative(191f, -100f)
                lineToRelative(-46f, -80f)
                quadToRelative(-5f, -9f, -5f, -20f)
                reflectiveQuadToRelative(5f, -20f)
                lineToRelative(46f, -80f)
                quadToRelative(5f, -10f, 14f, -15f)
                reflectiveQuadToRelative(20f, -5f)
                horizontalLineToRelative(90f)
                quadToRelative(11f, 0f, 20f, 5f)
                reflectiveQuadToRelative(14f, 15f)
                lineToRelative(46f, 80f)
                quadToRelative(5f, 9f, 5f, 20f)
                reflectiveQuadToRelative(-5f, 20f)
                lineToRelative(-46f, 80f)
                quadToRelative(-5f, 10f, -14f, 15f)
                reflectiveQuadToRelative(-20f, 5f)
                horizontalLineToRelative(-90f)
                quadToRelative(-11f, 0f, -20f, -5f)
                reflectiveQuadToRelative(-14f, -15f)
                close()
            }
        }.build()
        
        return _Person_play!!
    }

private var _Person_play: ImageVector? = null

