package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Room_preferences: ImageVector
    get() {
        if (_Room_preferences != null) return _Room_preferences!!
        
        _Room_preferences = ImageVector.Builder(
            name = "room_preferences",
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
                horizontalLineToRelative(80f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(187f)
                quadToRelative(-73f, 35f, -116.5f, 103.5f)
                reflectiveQuadTo(440f, 680f)
                quadToRelative(0f, 42f, 13f, 83.5f)
                reflectiveQuadToRelative(37f, 76.5f)
                horizontalLineTo(120f)
                close()
                moveToRelative(320f, -320f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(480f, 480f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(440f, 440f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(400f, 480f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(440f, 520f)
                close()
                moveTo(680f, 880f)
                lineToRelative(-12f, -60f)
                quadToRelative(-12f, -5f, -22.5f, -11f)
                reflectiveQuadTo(625f, 795f)
                lineToRelative(-58f, 20f)
                lineToRelative(-40f, -69f)
                lineToRelative(45f, -40f)
                quadToRelative(-2f, -15f, -2f, -25.5f)
                reflectiveQuadToRelative(2f, -25.5f)
                lineToRelative(-45f, -40f)
                lineToRelative(40f, -69f)
                lineToRelative(58f, 20f)
                quadToRelative(10f, -8f, 20.5f, -14.5f)
                reflectiveQuadTo(668f, 540f)
                lineToRelative(12f, -60f)
                horizontalLineToRelative(80f)
                lineToRelative(12f, 60f)
                quadToRelative(12f, 5f, 22.5f, 11f)
                reflectiveQuadToRelative(20.5f, 14f)
                lineToRelative(58f, -20f)
                lineToRelative(40f, 69f)
                lineToRelative(-45f, 40f)
                quadToRelative(2f, 15f, 2f, 25.5f)
                reflectiveQuadToRelative(-2f, 25.5f)
                lineToRelative(45f, 40f)
                lineToRelative(-40f, 69f)
                lineToRelative(-58f, -19f)
                quadToRelative(-10f, 8f, -20.5f, 14f)
                reflectiveQuadTo(772f, 820f)
                lineToRelative(-12f, 60f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(40f, -120f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(800f, 680f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(720f, 600f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(640f, 680f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(720f, 760f)
                close()
            }
        }.build()
        
        return _Room_preferences!!
    }

private var _Room_preferences: ImageVector? = null

