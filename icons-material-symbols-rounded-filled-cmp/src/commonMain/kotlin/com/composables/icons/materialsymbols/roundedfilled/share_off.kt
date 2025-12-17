package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Share_off: ImageVector
    get() {
        if (_Share_off != null) return _Share_off!!
        
        _Share_off = ImageVector.Builder(
            name = "share_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 920f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(40f, 720f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(240f, 520f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(440f, 720f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(240f, 920f)
                close()
                moveToRelative(0f, -172f)
                lineToRelative(56f, 57f)
                quadToRelative(6f, 6f, 14f, 6f)
                reflectiveQuadToRelative(14f, -6f)
                quadToRelative(6f, -6f, 6f, -14.5f)
                reflectiveQuadToRelative(-6f, -14.5f)
                lineToRelative(-56f, -56f)
                lineToRelative(57f, -57f)
                quadToRelative(6f, -6f, 6f, -14f)
                reflectiveQuadToRelative(-6f, -14f)
                quadToRelative(-6f, -6f, -14f, -6f)
                reflectiveQuadToRelative(-14f, 6f)
                lineToRelative(-57f, 57f)
                lineToRelative(-57f, -57f)
                quadToRelative(-6f, -6f, -14f, -6f)
                reflectiveQuadToRelative(-14f, 6f)
                quadToRelative(-6f, 6f, -6f, 14f)
                reflectiveQuadToRelative(6f, 14f)
                lineToRelative(57f, 57f)
                lineToRelative(-57f, 57f)
                quadToRelative(-6f, 6f, -6f, 14f)
                reflectiveQuadToRelative(6f, 14f)
                quadToRelative(6f, 6f, 14f, 6f)
                reflectiveQuadToRelative(14f, -6f)
                lineToRelative(57f, -57f)
                close()
                moveToRelative(82f, -356f)
                lineToRelative(282f, -164f)
                quadToRelative(-2f, -6f, -3f, -13.5f)
                reflectiveQuadToRelative(-1f, -14.5f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                quadToRelative(-23f, 0f, -44f, -8.5f)
                reflectiveQuadTo(638f, 288f)
                lineTo(368f, 445f)
                quadToRelative(-12f, 8f, -26f, 9f)
                reflectiveQuadToRelative(-28f, -4f)
                quadToRelative(-18f, -5f, -36.5f, -7.5f)
                reflectiveQuadTo(240f, 440f)
                quadToRelative(-22f, 0f, -42.5f, 3.5f)
                reflectiveQuadTo(157f, 453f)
                quadToRelative(-12f, 4f, -21f, -4f)
                reflectiveQuadToRelative(-5f, -19f)
                quadToRelative(14f, -31f, 43.5f, -50.5f)
                reflectiveQuadTo(240f, 360f)
                quadToRelative(23f, 0f, 44f, 8.5f)
                reflectiveQuadToRelative(38f, 23.5f)
                close()
                moveTo(720f, 880f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -7f, 1f, -14.5f)
                reflectiveQuadToRelative(3f, -13.5f)
                lineToRelative(-87f, -50f)
                quadToRelative(-13f, -8f, -17f, -21f)
                reflectiveQuadToRelative(4f, -26f)
                quadToRelative(8f, -13f, 21.5f, -17f)
                reflectiveQuadToRelative(26.5f, 4f)
                lineToRelative(86f, 50f)
                quadToRelative(17f, -15f, 38f, -23.5f)
                reflectiveQuadToRelative(44f, -8.5f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
            }
        }.build()
        
        return _Share_off!!
    }

private var _Share_off: ImageVector? = null

