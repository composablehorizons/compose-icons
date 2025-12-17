package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Pinboard_unread: ImageVector
    get() {
        if (_Pinboard_unread != null) return _Pinboard_unread!!
        
        _Pinboard_unread = ImageVector.Builder(
            name = "pinboard_unread",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(720f, 320f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveToRelative(-196f, -80f)
                horizontalLineTo(120f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 200f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 160f)
                horizontalLineToRelative(404f)
                quadToRelative(-2f, 10f, -3f, 19.5f)
                reflectiveQuadToRelative(-1f, 20.5f)
                quadToRelative(0f, 11f, 1f, 20.5f)
                reflectiveQuadToRelative(3f, 19.5f)
                close()
                moveToRelative(-4f, 560f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(480f, 760f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(520f, 720f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(-337f)
                quadToRelative(24f, -11f, 44f, -27f)
                reflectiveQuadToRelative(36f, -36f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 800f)
                horizontalLineTo(520f)
                close()
                moveTo(260f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(220f, 840f)
                verticalLineToRelative(-160f)
                horizontalLineTo(103f)
                quadToRelative(-23f, 0f, -34f, -20f)
                reflectiveQuadToRelative(0f, -40f)
                lineToRelative(71f, -126f)
                verticalLineToRelative(-94f)
                horizontalLineToRelative(-20f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 360f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 320f)
                horizontalLineToRelative(280f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(440f, 360f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(400f, 400f)
                horizontalLineToRelative(-20f)
                verticalLineToRelative(94f)
                lineToRelative(71f, 126f)
                quadToRelative(11f, 20f, 0f, 40f)
                reflectiveQuadToRelative(-34f, 20f)
                horizontalLineTo(300f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(260f, 880f)
                close()
            }
        }.build()
        
        return _Pinboard_unread!!
    }

private var _Pinboard_unread: ImageVector? = null

