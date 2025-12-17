package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Swipe_down_alt: ImageVector
    get() {
        if (_Swipe_down_alt != null) return _Swipe_down_alt!!
        
        _Swipe_down_alt = ImageVector.Builder(
            name = "swipe_down_alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 863f)
                quadToRelative(-8f, 0f, -15f, -2.5f)
                reflectiveQuadToRelative(-13f, -8.5f)
                lineTo(348f, 748f)
                quadToRelative(-11f, -11f, -11f, -27.5f)
                reflectiveQuadToRelative(11f, -28.5f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(35f, 35f)
                verticalLineToRelative(-171f)
                quadToRelative(-69f, -14f, -114.5f, -68.5f)
                reflectiveQuadTo(280f, 360f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(680f, 360f)
                quadToRelative(0f, 73f, -45.5f, 127.5f)
                reflectiveQuadTo(520f, 556f)
                verticalLineToRelative(171f)
                lineToRelative(36f, -36f)
                quadToRelative(11f, -11f, 27.5f, -11f)
                reflectiveQuadToRelative(28.5f, 12f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineTo(508f, 852f)
                quadToRelative(-6f, 6f, -13f, 8.5f)
                reflectiveQuadTo(480f, 863f)
                close()
                moveToRelative(0f, -383f)
                quadToRelative(50f, 0f, 85f, -35f)
                reflectiveQuadToRelative(35f, -85f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                close()
                moveToRelative(0f, -120f)
                close()
            }
        }.build()
        
        return _Swipe_down_alt!!
    }

private var _Swipe_down_alt: ImageVector? = null

