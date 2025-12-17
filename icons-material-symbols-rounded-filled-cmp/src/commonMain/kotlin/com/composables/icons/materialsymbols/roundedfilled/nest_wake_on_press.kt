package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Nest_wake_on_press: ImageVector
    get() {
        if (_Nest_wake_on_press != null) return _Nest_wake_on_press!!
        
        _Nest_wake_on_press = ImageVector.Builder(
            name = "nest_wake_on_press",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(820f, 520f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(760f, 460f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(820f, 160f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(880f, 220f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(820f, 520f)
                close()
                moveTo(328f, 840f)
                quadToRelative(-18f, 0f, -36.5f, -6.5f)
                reflectiveQuadTo(262f, 816f)
                lineTo(107f, 653f)
                quadToRelative(-11f, -12f, -11f, -28.5f)
                reflectiveQuadToRelative(11f, -27.5f)
                lineToRelative(6f, -6f)
                quadToRelative(7f, -7f, 16.5f, -10f)
                reflectiveQuadToRelative(20.5f, -1f)
                lineToRelative(130f, 30f)
                verticalLineToRelative(-430f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(340f, 120f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(400f, 180f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(36f)
                quadToRelative(8f, 0f, 18f, 2f)
                reflectiveQuadToRelative(18f, 6f)
                lineToRelative(164f, 82f)
                quadToRelative(23f, 11f, 35f, 34.5f)
                reflectiveQuadToRelative(8f, 48.5f)
                lineToRelative(-25f, 178f)
                quadToRelative(-5f, 30f, -27f, 49.5f)
                reflectiveQuadTo(575f, 840f)
                horizontalLineTo(328f)
                close()
            }
        }.build()
        
        return _Nest_wake_on_press!!
    }

private var _Nest_wake_on_press: ImageVector? = null

