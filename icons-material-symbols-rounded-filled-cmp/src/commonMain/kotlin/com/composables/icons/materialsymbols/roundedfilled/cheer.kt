package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Cheer: ImageVector
    get() {
        if (_Cheer != null) return _Cheer!!
        
        _Cheer = ImageVector.Builder(
            name = "cheer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(303f, 181f)
                lineToRelative(-22f, -64f)
                quadToRelative(-4f, -11f, 1.5f, -22f)
                reflectiveQuadToRelative(17.5f, -15f)
                quadToRelative(11f, -4f, 22f, 2f)
                reflectiveQuadToRelative(15f, 17f)
                lineToRelative(22f, 63f)
                quadToRelative(4f, 11f, -2f, 22f)
                reflectiveQuadToRelative(-17f, 15f)
                quadToRelative(-12f, 4f, -22.5f, -1f)
                reflectiveQuadTo(303f, 181f)
                close()
                moveToRelative(147f, -51f)
                verticalLineToRelative(-60f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(480f, 40f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(510f, 70f)
                verticalLineToRelative(60f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(450f, 130f)
                close()
                moveToRelative(152f, 32f)
                lineToRelative(21f, -63f)
                quadToRelative(4f, -11f, 14.5f, -16.5f)
                reflectiveQuadTo(660f, 81f)
                quadToRelative(11f, 4f, 17f, 15f)
                reflectiveQuadToRelative(2f, 22f)
                lineToRelative(-22f, 63f)
                quadToRelative(-4f, 11f, -15f, 17f)
                reflectiveQuadToRelative(-22f, 2f)
                quadToRelative(-11f, -4f, -16.5f, -15.5f)
                reflectiveQuadTo(602f, 162f)
                close()
                moveToRelative(62f, 726f)
                quadToRelative(-34f, -5f, -59.5f, -27.5f)
                reflectiveQuadTo(568f, 806f)
                lineToRelative(-34f, -106f)
                quadToRelative(-11f, -35f, -1f, -69.5f)
                reflectiveQuadToRelative(36f, -57.5f)
                lineToRelative(49f, 152f)
                quadToRelative(2f, 8f, 9f, 11.5f)
                reflectiveQuadToRelative(15f, 1.5f)
                quadToRelative(8f, -2f, 11f, -9f)
                reflectiveQuadToRelative(1f, -15f)
                lineToRelative(-82f, -260f)
                quadToRelative(-13f, -41f, 2.5f, -80.5f)
                reflectiveQuadTo(627f, 313f)
                lineToRelative(14f, -8f)
                quadToRelative(15f, -8f, 31f, -3.5f)
                reflectiveQuadToRelative(24f, 19.5f)
                lineToRelative(158f, 298f)
                quadToRelative(5f, 10f, 14.5f, 15.5f)
                reflectiveQuadTo(889f, 640f)
                quadToRelative(11f, 0f, 19f, 9f)
                reflectiveQuadToRelative(6f, 20f)
                lineTo(881f, 881f)
                quadToRelative(-2f, 17f, -15f, 26f)
                reflectiveQuadToRelative(-30f, 7f)
                lineTo(664f, 888f)
                close()
                moveToRelative(-367f, 0f)
                lineTo(125f, 914f)
                quadToRelative(-17f, 2f, -30f, -7f)
                reflectiveQuadTo(80f, 881f)
                lineTo(47f, 669f)
                quadToRelative(-2f, -11f, 6f, -20f)
                reflectiveQuadToRelative(19f, -9f)
                quadToRelative(11f, 0f, 20.5f, -5.5f)
                reflectiveQuadTo(107f, 619f)
                lineToRelative(158f, -298f)
                quadToRelative(8f, -15f, 24f, -19.5f)
                reflectiveQuadToRelative(31f, 3.5f)
                lineToRelative(14f, 8f)
                quadToRelative(37f, 21f, 52.5f, 60.5f)
                reflectiveQuadTo(389f, 454f)
                lineToRelative(-83f, 260f)
                quadToRelative(-2f, 8f, 1f, 15f)
                reflectiveQuadToRelative(11f, 9f)
                quadToRelative(8f, 2f, 15f, -1.5f)
                reflectiveQuadToRelative(9f, -11.5f)
                lineToRelative(49f, -153f)
                quadToRelative(27f, 23f, 37f, 58f)
                reflectiveQuadToRelative(-1f, 70f)
                lineToRelative(-34f, 106f)
                quadToRelative(-11f, 32f, -36.5f, 54.5f)
                reflectiveQuadTo(297f, 888f)
                close()
            }
        }.build()
        
        return _Cheer!!
    }

private var _Cheer: ImageVector? = null

