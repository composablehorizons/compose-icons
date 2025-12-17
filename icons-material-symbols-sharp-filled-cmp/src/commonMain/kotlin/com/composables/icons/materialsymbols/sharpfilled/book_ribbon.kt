package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Book_ribbon: ImageVector
    get() {
        if (_Book_ribbon != null) return _Book_ribbon!!
        
        _Book_ribbon = ImageVector.Builder(
            name = "book_ribbon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(620f, 560f)
                verticalLineToRelative(-440f)
                lineToRelative(120f, -40f)
                verticalLineToRelative(440f)
                lineToRelative(-120f, 40f)
                close()
                moveToRelative(220f, 104f)
                verticalLineToRelative(-481f)
                quadToRelative(21f, 8f, 41f, 17f)
                reflectiveQuadToRelative(39f, 22f)
                verticalLineToRelative(580f)
                quadToRelative(-47f, -39f, -103f, -60.5f)
                reflectiveQuadTo(700f, 720f)
                quadToRelative(-60f, 0f, -116f, 21f)
                reflectiveQuadToRelative(-104f, 59f)
                quadToRelative(-48f, -38f, -104f, -59f)
                reflectiveQuadToRelative(-116f, -21f)
                quadToRelative(-61f, 0f, -117f, 21.5f)
                reflectiveQuadTo(40f, 802f)
                verticalLineToRelative(-580f)
                quadToRelative(48f, -33f, 104.5f, -47.5f)
                reflectiveQuadTo(260f, 160f)
                quadToRelative(70f, 0f, 135.5f, 23f)
                reflectiveQuadTo(520f, 244f)
                verticalLineToRelative(438f)
                quadToRelative(42f, -20f, 87.5f, -31f)
                reflectiveQuadToRelative(92.5f, -11f)
                quadToRelative(36f, 0f, 71f, 6f)
                reflectiveQuadToRelative(69f, 18f)
                close()
            }
        }.build()
        
        return _Book_ribbon!!
    }

private var _Book_ribbon: ImageVector? = null

