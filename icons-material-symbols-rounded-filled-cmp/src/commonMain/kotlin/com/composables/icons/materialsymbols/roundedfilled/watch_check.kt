package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Watch_check: ImageVector
    get() {
        if (_Watch_check != null) return _Watch_check!!
        
        _Watch_check = ImageVector.Builder(
            name = "watch_check",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(438f, 494f)
                lineToRelative(113f, -113f)
                quadToRelative(12f, -12f, 28f, -12f)
                reflectiveQuadToRelative(28f, 12f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(607f, 438f)
                lineTo(466f, 579f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(409f, 579f)
                lineToRelative(-56f, -57f)
                quadToRelative(-12f, -12f, -12f, -28f)
                reflectiveQuadToRelative(12f, -28f)
                quadToRelative(12f, -12f, 28f, -11.5f)
                reflectiveQuadToRelative(28f, 11.5f)
                lineToRelative(29f, 28f)
                close()
                moveTo(420f, 880f)
                quadToRelative(-26f, 0f, -47.5f, -15.5f)
                reflectiveQuadTo(343f, 823f)
                lineToRelative(-23f, -77f)
                quadToRelative(-6f, -20f, -18.5f, -40.5f)
                reflectiveQuadTo(269f, 663f)
                quadToRelative(-34f, -37f, -51.5f, -84f)
                reflectiveQuadTo(200f, 480f)
                quadToRelative(0f, -51f, 17.5f, -98f)
                reflectiveQuadToRelative(51.5f, -85f)
                quadToRelative(20f, -23f, 32.5f, -43f)
                reflectiveQuadToRelative(18.5f, -40f)
                lineToRelative(23f, -77f)
                quadToRelative(8f, -26f, 29.5f, -41.5f)
                reflectiveQuadTo(420f, 80f)
                horizontalLineToRelative(120f)
                quadToRelative(26f, 0f, 47.5f, 15.5f)
                reflectiveQuadTo(617f, 137f)
                lineToRelative(23f, 77f)
                quadToRelative(6f, 20f, 18.5f, 40.5f)
                reflectiveQuadTo(691f, 297f)
                quadToRelative(34f, 37f, 51.5f, 84f)
                reflectiveQuadToRelative(17.5f, 99f)
                quadToRelative(0f, 51f, -17.5f, 98f)
                reflectiveQuadTo(691f, 663f)
                quadToRelative(-20f, 23f, -32.5f, 43f)
                reflectiveQuadTo(640f, 746f)
                lineToRelative(-23f, 77f)
                quadToRelative(-8f, 26f, -29.5f, 41.5f)
                reflectiveQuadTo(540f, 880f)
                horizontalLineTo(420f)
                close()
                moveToRelative(60f, -200f)
                quadToRelative(83f, 0f, 141.5f, -58.5f)
                reflectiveQuadTo(680f, 480f)
                quadToRelative(0f, -83f, -58.5f, -141.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(-83f, 0f, -141.5f, 58.5f)
                reflectiveQuadTo(280f, 480f)
                quadToRelative(0f, 83f, 58.5f, 141.5f)
                reflectiveQuadTo(480f, 680f)
                close()
            }
        }.build()
        
        return _Watch_check!!
    }

private var _Watch_check: ImageVector? = null

