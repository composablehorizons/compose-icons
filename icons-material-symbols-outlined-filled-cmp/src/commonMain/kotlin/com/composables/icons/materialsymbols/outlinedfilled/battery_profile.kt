package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Battery_profile: ImageVector
    get() {
        if (_Battery_profile != null) return _Battery_profile!!
        
        _Battery_profile = ImageVector.Builder(
            name = "battery_profile",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(280f, 840f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(320f, 160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(680f, 200f)
                verticalLineToRelative(200f)
                quadToRelative(-115f, 0f, -197f, 81f)
                reflectiveQuadToRelative(-82f, 198f)
                quadToRelative(0f, 57f, 21.5f, 109f)
                reflectiveQuadTo(485f, 880f)
                horizontalLineTo(320f)
                close()
                moveToRelative(320f, 0f)
                lineToRelative(-12f, -60f)
                quadToRelative(-12f, -5f, -22.5f, -11f)
                reflectiveQuadTo(585f, 795f)
                lineToRelative(-58f, 20f)
                lineToRelative(-40f, -69f)
                lineToRelative(45f, -40f)
                quadToRelative(-2f, -15f, -2f, -25.5f)
                reflectiveQuadToRelative(2f, -25.5f)
                lineToRelative(-45f, -40f)
                lineToRelative(40f, -69f)
                lineToRelative(58f, 20f)
                quadToRelative(10f, -8f, 20.5f, -14.5f)
                reflectiveQuadTo(628f, 540f)
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
                reflectiveQuadTo(732f, 820f)
                lineToRelative(-12f, 60f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(40f, -120f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(760f, 680f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(680f, 600f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(600f, 680f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(680f, 760f)
                close()
            }
        }.build()
        
        return _Battery_profile!!
    }

private var _Battery_profile: ImageVector? = null

