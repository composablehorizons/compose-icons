package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Chess_knight: ImageVector
    get() {
        if (_Chess_knight != null) return _Chess_knight!!
        
        _Chess_knight = ImageVector.Builder(
            name = "chess_knight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 880f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -23f, 12f, -41.5f)
                reflectiveQuadToRelative(32f, -29.5f)
                lineToRelative(196f, -99f)
                verticalLineToRelative(-70f)
                lineToRelative(-139f, 69f)
                quadToRelative(-12f, 6f, -25f, 9f)
                reflectiveQuadToRelative(-26f, 3f)
                quadToRelative(-31f, 0f, -58.5f, -16f)
                reflectiveQuadTo(149f, 499f)
                quadToRelative(-14f, -27f, -12f, -57.5f)
                reflectiveQuadToRelative(19f, -56.5f)
                lineToRelative(124f, -185f)
                lineToRelative(-80f, -120f)
                horizontalLineToRelative(240f)
                quadToRelative(133f, 0f, 226.5f, 93f)
                reflectiveQuadTo(760f, 400f)
                verticalLineToRelative(480f)
                horizontalLineTo(200f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -100f, -70f, -170f)
                reflectiveQuadToRelative(-170f, -70f)
                horizontalLineToRelative(-90f)
                lineToRelative(26f, 40f)
                lineToRelative(-153f, 230f)
                quadToRelative(-5f, 8f, -5.5f, 16.5f)
                reflectiveQuadTo(221f, 463f)
                quadToRelative(5f, 11f, 13.5f, 14.5f)
                reflectiveQuadTo(251f, 481f)
                quadToRelative(3f, 0f, 15f, -3f)
                lineToRelative(254f, -128f)
                verticalLineToRelative(250f)
                lineTo(280f, 720f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(160f, -320f)
                close()
            }
        }.build()
        
        return _Chess_knight!!
    }

private var _Chess_knight: ImageVector? = null

