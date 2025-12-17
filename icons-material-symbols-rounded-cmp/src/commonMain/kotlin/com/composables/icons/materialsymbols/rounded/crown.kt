package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Crown: ImageVector
    get() {
        if (_Crown != null) return _Crown!!
        
        _Crown = ImageVector.Builder(
            name = "crown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 800f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(200f, 760f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(240f, 720f)
                horizontalLineToRelative(480f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(760f, 760f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(720f, 800f)
                horizontalLineTo(240f)
                close()
                moveToRelative(28f, -140f)
                quadToRelative(-29f, 0f, -51.5f, -19f)
                reflectiveQuadTo(189f, 593f)
                lineToRelative(-40f, -254f)
                quadToRelative(-2f, 0f, -4.5f, 0.5f)
                reflectiveQuadToRelative(-4.5f, 0.5f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(80f, 280f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(140f, 220f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(200f, 280f)
                quadToRelative(0f, 7f, -1.5f, 13f)
                reflectiveQuadToRelative(-3.5f, 11f)
                lineToRelative(125f, 56f)
                lineToRelative(125f, -171f)
                quadToRelative(-11f, -8f, -18f, -21f)
                reflectiveQuadToRelative(-7f, -28f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(540f, 140f)
                quadToRelative(0f, 15f, -7f, 28f)
                reflectiveQuadToRelative(-18f, 21f)
                lineToRelative(125f, 171f)
                lineToRelative(125f, -56f)
                quadToRelative(-2f, -5f, -3.5f, -11f)
                reflectiveQuadToRelative(-1.5f, -13f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(820f, 220f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(880f, 280f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(820f, 340f)
                quadToRelative(-2f, 0f, -4.5f, -0.5f)
                reflectiveQuadToRelative(-4.5f, -0.5f)
                lineToRelative(-40f, 254f)
                quadToRelative(-5f, 29f, -27.5f, 48f)
                reflectiveQuadTo(692f, 660f)
                horizontalLineTo(268f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(424f)
                lineToRelative(26f, -167f)
                lineToRelative(-46f, 20f)
                quadToRelative(-26f, 11f, -53f, 4f)
                reflectiveQuadToRelative(-44f, -30f)
                lineToRelative(-95f, -131f)
                lineToRelative(-95f, 131f)
                quadToRelative(-17f, 23f, -44f, 30f)
                reflectiveQuadToRelative(-53f, -4f)
                lineToRelative(-46f, -20f)
                lineToRelative(26f, 167f)
                close()
                moveToRelative(212f, 0f)
                close()
            }
        }.build()
        
        return _Crown!!
    }

private var _Crown: ImageVector? = null

