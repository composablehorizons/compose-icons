package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Hr_resting: ImageVector
    get() {
        if (_Hr_resting != null) return _Hr_resting!!
        
        _Hr_resting = ImageVector.Builder(
            name = "hr_resting",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
                moveToRelative(97f, -384f)
                quadToRelative(-29f, -27f, -42.5f, -64f)
                reflectiveQuadTo(161f, 316f)
                quadToRelative(0f, -81f, 55.5f, -138.5f)
                reflectiveQuadTo(352f, 120f)
                quadToRelative(36f, 0f, 69f, 13f)
                reflectiveQuadToRelative(59f, 38f)
                quadToRelative(26f, -25f, 59f, -38f)
                reflectiveQuadToRelative(69f, -13f)
                quadToRelative(81f, 0f, 136.5f, 58f)
                reflectiveQuadTo(800f, 317f)
                quadToRelative(0f, 39f, -14.5f, 74.5f)
                reflectiveQuadTo(744f, 455f)
                lineTo(480f, 711f)
                lineTo(217f, 456f)
                close()
                moveToRelative(56f, -56f)
                lineToRelative(207f, 200f)
                lineToRelative(208f, -201f)
                quadToRelative(17f, -16f, 25f, -37.5f)
                reflectiveQuadToRelative(8f, -44.5f)
                quadToRelative(0f, -48f, -32.5f, -82f)
                reflectiveQuadTo(609f, 201f)
                quadToRelative(-22f, 0f, -42.5f, 8.5f)
                reflectiveQuadTo(531f, 234f)
                lineToRelative(-51f, 52f)
                lineToRelative(-50f, -52f)
                quadToRelative(-16f, -16f, -35.5f, -25f)
                reflectiveQuadToRelative(-42.5f, -9f)
                quadToRelative(-47f, 0f, -79.5f, 34f)
                reflectiveQuadTo(240f, 316f)
                quadToRelative(0f, 23f, 8f, 45f)
                reflectiveQuadToRelative(25f, 39f)
                close()
                moveToRelative(207f, 0f)
                close()
            }
        }.build()
        
        return _Hr_resting!!
    }

private var _Hr_resting: ImageVector? = null

