package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Swipe_right_alt: ImageVector
    get() {
        if (_Swipe_right_alt != null) return _Swipe_right_alt!!
        
        _Swipe_right_alt = ImageVector.Builder(
            name = "swipe_right_alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 680f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(160f, 480f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(360f, 280f)
                quadToRelative(73f, 0f, 127.5f, 45.5f)
                reflectiveQuadTo(556f, 440f)
                horizontalLineToRelative(171f)
                lineToRelative(-36f, -36f)
                quadToRelative(-11f, -11f, -11f, -27.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(104f, 104f)
                quadToRelative(6f, 6f, 8.5f, 13f)
                reflectiveQuadToRelative(2.5f, 15f)
                quadToRelative(0f, 8f, -2.5f, 15f)
                reflectiveQuadToRelative(-8.5f, 13f)
                lineTo(748f, 612f)
                quadToRelative(-11f, 11f, -27.5f, 11f)
                reflectiveQuadTo(692f, 612f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                lineToRelative(35f, -35f)
                horizontalLineTo(556f)
                quadToRelative(-14f, 69f, -68.5f, 114.5f)
                reflectiveQuadTo(360f, 680f)
                close()
            }
        }.build()
        
        return _Swipe_right_alt!!
    }

private var _Swipe_right_alt: ImageVector? = null

