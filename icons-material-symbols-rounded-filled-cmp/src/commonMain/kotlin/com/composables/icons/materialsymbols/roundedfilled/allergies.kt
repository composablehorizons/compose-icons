package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Allergies: ImageVector
    get() {
        if (_Allergies != null) return _Allergies!!
        
        _Allergies = ImageVector.Builder(
            name = "allergies",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(380f, 450f)
                verticalLineToRelative(230f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(420f, 720f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(460f, 680f)
                verticalLineToRelative(-235f)
                quadToRelative(0f, -7f, -1.5f, -14f)
                reflectiveQuadToRelative(-4.5f, -13f)
                lineToRelative(-60f, -120f)
                quadToRelative(-8f, -15f, -23.5f, -20.5f)
                reflectiveQuadTo(340f, 280f)
                quadToRelative(-15f, 8f, -20.5f, 23.5f)
                reflectiveQuadTo(322f, 334f)
                lineToRelative(58f, 116f)
                close()
                moveToRelative(200f, -1f)
                lineToRelative(58f, -115f)
                quadToRelative(7f, -15f, 2f, -30.5f)
                reflectiveQuadTo(620f, 280f)
                quadToRelative(-15f, -8f, -30.5f, -2.5f)
                reflectiveQuadTo(566f, 298f)
                lineToRelative(-60f, 119f)
                quadToRelative(-3f, 6f, -4.5f, 13f)
                reflectiveQuadToRelative(-1.5f, 14f)
                verticalLineToRelative(236f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(540f, 720f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(580f, 680f)
                verticalLineToRelative(-231f)
                close()
                moveToRelative(60f, 71f)
                quadToRelative(15f, 8f, 30.5f, 2.5f)
                reflectiveQuadTo(694f, 502f)
                lineToRelative(44f, -88f)
                quadToRelative(8f, -15f, 2.5f, -30.5f)
                reflectiveQuadTo(720f, 360f)
                quadToRelative(-15f, -8f, -30.5f, -2.5f)
                reflectiveQuadTo(666f, 378f)
                lineToRelative(-44f, 88f)
                quadToRelative(-8f, 15f, -2.5f, 30.5f)
                reflectiveQuadTo(640f, 520f)
                close()
                moveToRelative(-320f, 0f)
                quadToRelative(15f, -8f, 20.5f, -23.5f)
                reflectiveQuadTo(338f, 466f)
                lineToRelative(-44f, -88f)
                quadToRelative(-8f, -15f, -23.5f, -20.5f)
                reflectiveQuadTo(240f, 360f)
                quadToRelative(-15f, 8f, -20.5f, 23.5f)
                reflectiveQuadTo(222f, 414f)
                lineToRelative(44f, 88f)
                quadToRelative(8f, 15f, 23.5f, 20.5f)
                reflectiveQuadTo(320f, 520f)
                close()
                moveTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Allergies!!
    }

private var _Allergies: ImageVector? = null

