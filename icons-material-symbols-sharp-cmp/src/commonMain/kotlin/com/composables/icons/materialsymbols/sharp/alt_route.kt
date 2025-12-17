package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Alt_route: ImageVector
    get() {
        if (_Alt_route != null) return _Alt_route!!
        
        _Alt_route = ImageVector.Builder(
            name = "alt_route",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 880f)
                verticalLineToRelative(-200f)
                quadToRelative(0f, -56f, -17f, -83f)
                reflectiveQuadToRelative(-45f, -53f)
                lineToRelative(57f, -57f)
                quadToRelative(12f, 11f, 23f, 23.5f)
                reflectiveQuadToRelative(22f, 26.5f)
                quadToRelative(14f, -19f, 28.5f, -33.5f)
                reflectiveQuadTo(538f, 475f)
                quadToRelative(38f, -35f, 69f, -81f)
                reflectiveQuadToRelative(33f, -161f)
                lineToRelative(-63f, 63f)
                lineToRelative(-57f, -56f)
                lineToRelative(160f, -160f)
                lineToRelative(160f, 160f)
                lineToRelative(-56f, 56f)
                lineToRelative(-64f, -63f)
                quadToRelative(-2f, 143f, -44f, 203.5f)
                reflectiveQuadTo(592f, 535f)
                quadToRelative(-32f, 29f, -52f, 56.5f)
                reflectiveQuadTo(520f, 680f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(248f, 327f)
                quadToRelative(-4f, -20f, -5.5f, -44f)
                reflectiveQuadToRelative(-2.5f, -50f)
                lineToRelative(-64f, 63f)
                lineToRelative(-56f, -56f)
                lineToRelative(160f, -160f)
                lineToRelative(160f, 160f)
                lineToRelative(-57f, 56f)
                lineToRelative(-63f, -62f)
                quadToRelative(0f, 21f, 2f, 39.5f)
                reflectiveQuadToRelative(4f, 34.5f)
                lineToRelative(-78f, 19f)
                close()
                moveToRelative(86f, 176f)
                quadToRelative(-20f, -21f, -38.5f, -49f)
                reflectiveQuadTo(263f, 385f)
                lineToRelative(77f, -19f)
                quadToRelative(10f, 27f, 23f, 46f)
                reflectiveQuadToRelative(28f, 34f)
                lineToRelative(-57f, 57f)
                close()
            }
        }.build()
        
        return _Alt_route!!
    }

private var _Alt_route: ImageVector? = null

