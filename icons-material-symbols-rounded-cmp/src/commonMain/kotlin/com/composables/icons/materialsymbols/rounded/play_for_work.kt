package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Play_for_work: ImageVector
    get() {
        if (_Play_for_work != null) return _Play_for_work!!
        
        _Play_for_work = ImageVector.Builder(
            name = "play_for_work",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 800f)
                quadToRelative(-90f, 0f, -157f, -56.5f)
                reflectiveQuadTo(243f, 600f)
                quadToRelative(-2f, -16f, 9f, -28f)
                reflectiveQuadToRelative(28f, -12f)
                quadToRelative(17f, 0f, 28.5f, 8.5f)
                reflectiveQuadTo(323f, 591f)
                quadToRelative(11f, 57f, 55.5f, 93f)
                reflectiveQuadTo(480f, 720f)
                quadToRelative(57f, 0f, 101.5f, -36f)
                reflectiveQuadToRelative(55.5f, -93f)
                quadToRelative(3f, -14f, 14.5f, -22.5f)
                reflectiveQuadTo(680f, 560f)
                quadToRelative(17f, 0f, 28f, 12f)
                reflectiveQuadToRelative(9f, 28f)
                quadToRelative(-13f, 87f, -80f, 143.5f)
                reflectiveQuadTo(480f, 800f)
                close()
                moveToRelative(-40f, -354f)
                verticalLineToRelative(-206f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 200f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 240f)
                verticalLineToRelative(206f)
                lineToRelative(36f, -36f)
                quadToRelative(12f, -12f, 28f, -11.5f)
                reflectiveQuadToRelative(28f, 12.5f)
                quadToRelative(11f, 12f, 11.5f, 28f)
                reflectiveQuadTo(612f, 467f)
                lineTo(508f, 571f)
                quadToRelative(-6f, 6f, -13f, 8.5f)
                reflectiveQuadToRelative(-15f, 2.5f)
                quadToRelative(-8f, 0f, -15f, -2.5f)
                reflectiveQuadToRelative(-13f, -8.5f)
                lineTo(348f, 467f)
                quadToRelative(-11f, -11f, -11f, -27.5f)
                reflectiveQuadToRelative(11f, -28.5f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(35f, 35f)
                close()
            }
        }.build()
        
        return _Play_for_work!!
    }

private var _Play_for_work: ImageVector? = null

