package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Mobile_share_stack: ImageVector
    get() {
        if (_Mobile_share_stack != null) return _Mobile_share_stack!!
        
        _Mobile_share_stack = ImageVector.Builder(
            name = "mobile_share_stack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 920f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 840f)
                verticalLineToRelative(-600f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 200f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(240f, 240f)
                verticalLineToRelative(600f)
                horizontalLineToRelative(360f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(640f, 880f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(600f, 920f)
                horizontalLineTo(240f)
                close()
                moveToRelative(160f, -160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(320f, 680f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(400f, 40f)
                horizontalLineToRelative(320f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 120f)
                verticalLineToRelative(82f)
                quadToRelative(17f, 3f, 28.5f, 16.5f)
                reflectiveQuadTo(840f, 249f)
                verticalLineToRelative(62f)
                quadToRelative(0f, 17f, -11.5f, 30.5f)
                reflectiveQuadTo(800f, 358f)
                verticalLineToRelative(322f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 760f)
                horizontalLineTo(400f)
                close()
                moveToRelative(166f, -350f)
                lineToRelative(-7f, 7f)
                quadToRelative(-11f, 11f, -9.5f, 22.5f)
                reflectiveQuadTo(559f, 459f)
                quadToRelative(8f, 8f, 19.5f, 9.5f)
                reflectiveQuadTo(601f, 459f)
                lineToRelative(51f, -51f)
                quadToRelative(6f, -6f, 8.5f, -13f)
                reflectiveQuadToRelative(2.5f, -15f)
                quadToRelative(0f, -8f, -2.5f, -15f)
                reflectiveQuadToRelative(-8.5f, -13f)
                lineToRelative(-51f, -51f)
                quadToRelative(-11f, -11f, -22.5f, -9.5f)
                reflectiveQuadTo(559f, 301f)
                quadToRelative(-8f, 8f, -9.5f, 19.5f)
                reflectiveQuadTo(559f, 343f)
                lineToRelative(7f, 7f)
                horizontalLineToRelative(-86f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 390f)
                verticalLineToRelative(60f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(470f, 480f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(500f, 450f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(66f)
                close()
            }
        }.build()
        
        return _Mobile_share_stack!!
    }

private var _Mobile_share_stack: ImageVector? = null

