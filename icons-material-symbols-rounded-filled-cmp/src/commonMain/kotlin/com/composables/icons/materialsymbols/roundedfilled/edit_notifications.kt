package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Edit_notifications: ImageVector
    get() {
        if (_Edit_notifications != null) return _Edit_notifications!!
        
        _Edit_notifications = ImageVector.Builder(
            name = "edit_notifications",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 800f)
                horizontalLineToRelative(160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(280f, -120f)
                horizontalLineTo(200f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 720f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 680f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-280f)
                quadToRelative(0f, -83f, 50f, -147.5f)
                reflectiveQuadTo(420f, 168f)
                verticalLineToRelative(-28f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(540f, 140f)
                verticalLineToRelative(28f)
                quadToRelative(15f, 5f, 16.5f, 22f)
                reflectiveQuadTo(545f, 220f)
                lineTo(424f, 340f)
                quadToRelative(-11f, 11f, -17.5f, 26f)
                reflectiveQuadToRelative(-6.5f, 31f)
                verticalLineToRelative(123f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(480f, 600f)
                horizontalLineToRelative(123f)
                quadToRelative(16f, 0f, 31f, -6f)
                reflectiveQuadToRelative(26f, -17f)
                lineToRelative(9f, -9f)
                quadToRelative(14f, -14f, 32.5f, -6.5f)
                reflectiveQuadTo(720f, 589f)
                verticalLineToRelative(91f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 720f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 760f)
                close()
                moveTo(480f, 480f)
                verticalLineToRelative(-66f)
                quadToRelative(0f, -8f, 3f, -16f)
                reflectiveQuadToRelative(9f, -13f)
                lineToRelative(209f, -208f)
                quadToRelative(8f, -8f, 19f, -12.5f)
                reflectiveQuadToRelative(23f, -4.5f)
                quadToRelative(12f, 0f, 23.5f, 5f)
                reflectiveQuadToRelative(19.5f, 13f)
                lineToRelative(37f, 37f)
                quadToRelative(8f, 9f, 12.5f, 19.5f)
                reflectiveQuadTo(840f, 257f)
                quadToRelative(0f, 12f, -4.5f, 23.5f)
                reflectiveQuadTo(823f, 300f)
                lineTo(615f, 508f)
                quadToRelative(-6f, 6f, -13.5f, 9f)
                reflectiveQuadToRelative(-15.5f, 3f)
                horizontalLineToRelative(-66f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(480f, 480f)
                close()
                moveToRelative(263f, -184f)
                lineToRelative(37f, -39f)
                lineToRelative(-37f, -37f)
                lineToRelative(-38f, 38f)
                lineToRelative(38f, 38f)
                close()
            }
        }.build()
        
        return _Edit_notifications!!
    }

private var _Edit_notifications: ImageVector? = null

