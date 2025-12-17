package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Psychology: ImageVector
    get() {
        if (_Psychology != null) return _Psychology!!
        
        _Psychology = ImageVector.Builder(
            name = "psychology",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(434f, 550f)
                lineToRelative(4f, 32f)
                quadToRelative(1f, 8f, 6.5f, 13f)
                reflectiveQuadToRelative(13.5f, 5f)
                horizontalLineToRelative(44f)
                quadToRelative(8f, 0f, 13.5f, -5f)
                reflectiveQuadToRelative(6.5f, -13f)
                lineToRelative(4f, -32f)
                quadToRelative(8f, -3f, 14.5f, -7f)
                reflectiveQuadToRelative(11.5f, -9f)
                lineToRelative(30f, 13f)
                quadToRelative(7f, 3f, 14f, 1f)
                reflectiveQuadToRelative(11f, -9f)
                lineToRelative(22f, -38f)
                quadToRelative(4f, -7f, 2.5f, -14f)
                reflectiveQuadToRelative(-7.5f, -12f)
                lineToRelative(-26f, -19f)
                quadToRelative(2f, -8f, 2f, -16f)
                reflectiveQuadToRelative(-2f, -16f)
                lineToRelative(26f, -19f)
                quadToRelative(6f, -5f, 7.5f, -12f)
                reflectiveQuadToRelative(-2.5f, -14f)
                lineToRelative(-22f, -38f)
                quadToRelative(-4f, -7f, -11f, -9f)
                reflectiveQuadToRelative(-14f, 1f)
                lineToRelative(-30f, 13f)
                quadToRelative(-5f, -5f, -11.5f, -9f)
                reflectiveQuadToRelative(-14.5f, -7f)
                lineToRelative(-4f, -32f)
                quadToRelative(-1f, -8f, -6.5f, -13f)
                reflectiveQuadToRelative(-13.5f, -5f)
                horizontalLineToRelative(-44f)
                quadToRelative(-8f, 0f, -13.5f, 5f)
                reflectiveQuadToRelative(-6.5f, 13f)
                lineToRelative(-4f, 32f)
                quadToRelative(-8f, 3f, -14.5f, 7f)
                reflectiveQuadToRelative(-11.5f, 9f)
                lineToRelative(-30f, -13f)
                quadToRelative(-7f, -3f, -14f, -1f)
                reflectiveQuadToRelative(-11f, 9f)
                lineToRelative(-22f, 38f)
                quadToRelative(-4f, 7f, -2.5f, 14f)
                reflectiveQuadToRelative(7.5f, 12f)
                lineToRelative(26f, 19f)
                quadToRelative(-2f, 8f, -2f, 16f)
                reflectiveQuadToRelative(2f, 16f)
                lineToRelative(-26f, 19f)
                quadToRelative(-6f, 5f, -7.5f, 12f)
                reflectiveQuadToRelative(2.5f, 14f)
                lineToRelative(22f, 38f)
                quadToRelative(4f, 7f, 11f, 9f)
                reflectiveQuadToRelative(14f, -1f)
                lineToRelative(30f, -13f)
                quadToRelative(5f, 5f, 11.5f, 9f)
                reflectiveQuadToRelative(14.5f, 7f)
                close()
                moveToRelative(46f, -50f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(420f, 440f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(480f, 380f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(540f, 440f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(480f, 500f)
                close()
                moveTo(280f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(240f, 840f)
                verticalLineToRelative(-132f)
                quadToRelative(-57f, -52f, -88.5f, -121.5f)
                reflectiveQuadTo(120f, 440f)
                quadToRelative(0f, -150f, 105f, -255f)
                reflectiveQuadToRelative(255f, -105f)
                quadToRelative(125f, 0f, 221.5f, 73.5f)
                reflectiveQuadTo(827f, 345f)
                lineToRelative(52f, 205f)
                quadToRelative(5f, 19f, -7f, 34.5f)
                reflectiveQuadTo(840f, 600f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(680f, 800f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(560f, 880f)
                horizontalLineTo(280f)
                close()
            }
        }.build()
        
        return _Psychology!!
    }

private var _Psychology: ImageVector? = null

