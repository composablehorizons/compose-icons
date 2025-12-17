package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Swipe_up_alt: ImageVector
    get() {
        if (_Swipe_up_alt != null) return _Swipe_up_alt!!
        
        _Swipe_up_alt = ImageVector.Builder(
            name = "swipe_up_alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 800f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(280f, 600f)
                quadToRelative(0f, -73f, 45.5f, -127.5f)
                reflectiveQuadTo(440f, 404f)
                verticalLineToRelative(-171f)
                lineToRelative(-36f, 36f)
                quadToRelative(-11f, 11f, -27.5f, 11f)
                reflectiveQuadTo(348f, 268f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(104f, -104f)
                quadToRelative(6f, -6f, 13f, -8.5f)
                reflectiveQuadToRelative(15f, -2.5f)
                quadToRelative(8f, 0f, 15f, 2.5f)
                reflectiveQuadToRelative(13f, 8.5f)
                lineToRelative(104f, 104f)
                quadToRelative(11f, 11f, 11f, 27.5f)
                reflectiveQuadTo(612f, 268f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(555f, 268f)
                lineToRelative(-35f, -35f)
                verticalLineToRelative(171f)
                quadToRelative(69f, 14f, 114.5f, 68.5f)
                reflectiveQuadTo(680f, 600f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(480f, 800f)
                close()
            }
        }.build()
        
        return _Swipe_up_alt!!
    }

private var _Swipe_up_alt: ImageVector? = null

