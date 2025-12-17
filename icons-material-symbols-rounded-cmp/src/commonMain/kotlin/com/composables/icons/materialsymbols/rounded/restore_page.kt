package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Restore_page: ImageVector
    get() {
        if (_Restore_page != null) return _Restore_page!!
        
        _Restore_page = ImageVector.Builder(
            name = "restore_page",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(388f, 430f)
                quadToRelative(17f, -18f, 41f, -29f)
                reflectiveQuadToRelative(51f, -11f)
                quadToRelative(54f, 0f, 92f, 38f)
                reflectiveQuadToRelative(38f, 92f)
                quadToRelative(0f, 54f, -38f, 92f)
                reflectiveQuadToRelative(-92f, 38f)
                quadToRelative(-36f, 0f, -65.5f, -18f)
                reflectiveQuadTo(368f, 585f)
                quadToRelative(-6f, -11f, -17.5f, -14.5f)
                reflectiveQuadTo(328f, 572f)
                quadToRelative(-12f, 5f, -16.5f, 17.5f)
                reflectiveQuadTo(314f, 613f)
                quadToRelative(24f, 44f, 68f, 70.5f)
                reflectiveQuadToRelative(98f, 26.5f)
                quadToRelative(78f, 0f, 134f, -56f)
                reflectiveQuadToRelative(56f, -134f)
                quadToRelative(0f, -78f, -56f, -134f)
                reflectiveQuadToRelative(-134f, -56f)
                quadToRelative(-38f, 0f, -71f, 14f)
                reflectiveQuadToRelative(-59f, 38f)
                verticalLineToRelative(-32f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(320f, 320f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(290f, 350f)
                verticalLineToRelative(110f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(320f, 490f)
                horizontalLineToRelative(110f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(460f, 460f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(430f, 430f)
                horizontalLineToRelative(-42f)
                close()
                moveTo(240f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 80f)
                horizontalLineToRelative(287f)
                quadToRelative(16f, 0f, 30.5f, 6f)
                reflectiveQuadToRelative(25.5f, 17f)
                lineToRelative(194f, 194f)
                quadToRelative(11f, 11f, 17f, 25.5f)
                reflectiveQuadToRelative(6f, 30.5f)
                verticalLineToRelative(447f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 880f)
                horizontalLineTo(240f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-446f)
                lineTo(526f, 160f)
                horizontalLineTo(240f)
                verticalLineToRelative(640f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-640f)
                verticalLineToRelative(640f)
                close()
            }
        }.build()
        
        return _Restore_page!!
    }

private var _Restore_page: ImageVector? = null

