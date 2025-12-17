package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Account_circle_off: ImageVector
    get() {
        if (_Account_circle_off != null) return _Account_circle_off!!
        
        _Account_circle_off = ImageVector.Builder(
            name = "account_circle_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 800f)
                quadToRelative(43f, 0f, 84f, -11.5f)
                reflectiveQuadToRelative(78f, -33.5f)
                lineTo(487f, 600f)
                horizontalLineToRelative(-7f)
                quadToRelative(-54f, 0f, -106f, 14f)
                reflectiveQuadToRelative(-99f, 41.78f)
                quadToRelative(-17f, 9.93f, -18.5f, 29.77f)
                quadToRelative(-1.5f, 19.85f, 12.5f, 33.74f)
                quadToRelative(44f, 37.71f, 98f, 59.21f)
                reflectiveQuadTo(480f, 800f)
                close()
                moveTo(791f, 903f)
                lineToRelative(-90f, -89f)
                quadToRelative(-49f, 32f, -105f, 49f)
                reflectiveQuadTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -59f, 16.5f, -115f)
                reflectiveQuadTo(145f, 259f)
                lineToRelative(-90f, -91f)
                quadToRelative(-12f, -12f, -11.5f, -28.5f)
                reflectiveQuadTo(56f, 111f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(735f, 736f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(791f, 903f)
                close()
                moveToRelative(12f, -235f)
                quadToRelative(-10f, 0f, -19f, -3.5f)
                reflectiveQuadTo(767f, 653f)
                lineTo(604f, 490f)
                quadToRelative(-8f, -8f, -8.5f, -18.5f)
                reflectiveQuadTo(601f, 451f)
                quadToRelative(10f, -16f, 14.5f, -34f)
                reflectiveQuadToRelative(4.5f, -37f)
                quadToRelative(0f, -58f, -41f, -99f)
                reflectiveQuadToRelative(-99f, -41f)
                quadToRelative(-19f, 0f, -37f, 5f)
                reflectiveQuadToRelative(-34f, 14f)
                quadToRelative(-10f, 5f, -20.5f, 5f)
                reflectiveQuadToRelative(-18.5f, -8f)
                lineToRelative(-63f, -63f)
                quadToRelative(-8f, -8f, -11.5f, -17f)
                reflectiveQuadToRelative(-3.5f, -19f)
                quadToRelative(0f, -14f, 6.5f, -25.5f)
                reflectiveQuadTo(319f, 114f)
                quadToRelative(38f, -17f, 78.5f, -25.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 42f, -8.5f, 82.5f)
                reflectiveQuadTo(846f, 641f)
                quadToRelative(-6f, 14f, -17.5f, 20.5f)
                reflectiveQuadTo(803f, 668f)
                close()
            }
        }.build()
        
        return _Account_circle_off!!
    }

private var _Account_circle_off: ImageVector? = null

