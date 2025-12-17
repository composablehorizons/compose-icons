package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Send_and_archive: ImageVector
    get() {
        if (_Send_and_archive != null) return _Send_and_archive!!
        
        _Send_and_archive = ImageVector.Builder(
            name = "send_and_archive",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(660f, 724f)
                lineToRelative(-58f, -58f)
                quadToRelative(-6f, -6f, -14f, -6f)
                reflectiveQuadToRelative(-14f, 6f)
                quadToRelative(-6f, 6f, -6f, 14f)
                reflectiveQuadToRelative(6f, 14f)
                lineToRelative(78f, 78f)
                quadToRelative(12f, 12f, 28f, 12f)
                reflectiveQuadToRelative(28f, -12f)
                lineToRelative(78f, -78f)
                quadToRelative(6f, -6f, 6f, -14f)
                reflectiveQuadToRelative(-6f, -14f)
                quadToRelative(-6f, -6f, -14f, -6f)
                reflectiveQuadToRelative(-14f, 6f)
                lineToRelative(-58f, 58f)
                verticalLineToRelative(-144f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                verticalLineToRelative(144f)
                close()
                moveToRelative(-540f, 16f)
                verticalLineToRelative(-520f)
                quadToRelative(0f, -22f, 17.5f, -33.5f)
                reflectiveQuadTo(175f, 183f)
                lineToRelative(399f, 167f)
                quadToRelative(19f, 8f, 23f, 23.5f)
                reflectiveQuadToRelative(-2f, 29.5f)
                quadToRelative(-6f, 14f, -20f, 22f)
                reflectiveQuadToRelative(-33f, 0f)
                lineTo(200f, 280f)
                verticalLineToRelative(140f)
                lineToRelative(124f, 31f)
                quadToRelative(11f, 3f, 16.5f, 11f)
                reflectiveQuadToRelative(5.5f, 18f)
                quadToRelative(0f, 10f, -5.5f, 18f)
                reflectiveQuadTo(324f, 509f)
                lineToRelative(-124f, 31f)
                verticalLineToRelative(140f)
                lineToRelative(149f, -63f)
                quadToRelative(19f, -8f, 32.5f, -0.5f)
                reflectiveQuadTo(401f, 638f)
                quadToRelative(6f, 14f, 2f, 29.5f)
                reflectiveQuadTo(380f, 691f)
                lineToRelative(-204f, 86f)
                quadToRelative(-20f, 8f, -38f, -3.5f)
                reflectiveQuadTo(120f, 740f)
                close()
                moveTo(680f, 880f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(480f, 680f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(680f, 480f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(880f, 680f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(680f, 880f)
                close()
                moveTo(337f, 480f)
                close()
            }
        }.build()
        
        return _Send_and_archive!!
    }

private var _Send_and_archive: ImageVector? = null

