package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Network_node: ImageVector
    get() {
        if (_Network_node != null) return _Network_node!!
        
        _Network_node = ImageVector.Builder(
            name = "network_node",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(220f, 880f)
                quadToRelative(-58f, 0f, -99f, -41f)
                reflectiveQuadToRelative(-41f, -99f)
                quadToRelative(0f, -58f, 41f, -99f)
                reflectiveQuadToRelative(99f, -41f)
                quadToRelative(18f, 0f, 35f, 4.5f)
                reflectiveQuadToRelative(32f, 12.5f)
                lineToRelative(153f, -153f)
                verticalLineToRelative(-110f)
                quadToRelative(-44f, -13f, -72f, -49.5f)
                reflectiveQuadTo(340f, 220f)
                quadToRelative(0f, -58f, 41f, -99f)
                reflectiveQuadToRelative(99f, -41f)
                quadToRelative(58f, 0f, 99f, 41f)
                reflectiveQuadToRelative(41f, 99f)
                quadToRelative(0f, 48f, -28f, 84.5f)
                reflectiveQuadTo(520f, 354f)
                verticalLineToRelative(110f)
                lineToRelative(154f, 153f)
                quadToRelative(15f, -8f, 31.5f, -12.5f)
                reflectiveQuadTo(740f, 600f)
                quadToRelative(58f, 0f, 99f, 41f)
                reflectiveQuadToRelative(41f, 99f)
                quadToRelative(0f, 58f, -41f, 99f)
                reflectiveQuadToRelative(-99f, 41f)
                quadToRelative(-58f, 0f, -99f, -41f)
                reflectiveQuadToRelative(-41f, -99f)
                quadToRelative(0f, -18f, 4.5f, -35f)
                reflectiveQuadToRelative(12.5f, -32f)
                lineTo(480f, 536f)
                lineTo(343f, 673f)
                quadToRelative(8f, 15f, 12.5f, 32f)
                reflectiveQuadToRelative(4.5f, 35f)
                quadToRelative(0f, 58f, -41f, 99f)
                reflectiveQuadToRelative(-99f, 41f)
                close()
                moveToRelative(520f, -80f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(800f, 740f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(740f, 680f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(680f, 740f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(740f, 800f)
                close()
                moveTo(480f, 280f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(540f, 220f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(420f, 220f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(480f, 280f)
                close()
                moveTo(220f, 800f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(280f, 740f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(220f, 680f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(160f, 740f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(220f, 800f)
                close()
            }
        }.build()
        
        return _Network_node!!
    }

private var _Network_node: ImageVector? = null

