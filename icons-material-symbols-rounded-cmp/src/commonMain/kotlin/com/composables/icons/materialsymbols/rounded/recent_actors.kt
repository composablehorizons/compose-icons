package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Recent_actors: ImageVector
    get() {
        if (_Recent_actors != null) return _Recent_actors!!
        
        _Recent_actors = ImageVector.Builder(
            name = "recent_actors",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 760f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(40f, 680f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(120f, 200f)
                horizontalLineToRelative(400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(600f, 280f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(520f, 760f)
                horizontalLineTo(120f)
                close()
                moveToRelative(0f, -146f)
                quadToRelative(44f, -26f, 94f, -40f)
                reflectiveQuadToRelative(106f, -14f)
                quadToRelative(56f, 0f, 106f, 14f)
                reflectiveQuadToRelative(94f, 40f)
                verticalLineToRelative(-334f)
                horizontalLineTo(120f)
                verticalLineToRelative(334f)
                close()
                moveToRelative(200f, 26f)
                quadToRelative(-41f, 0f, -80f, 10f)
                reflectiveQuadToRelative(-74f, 30f)
                horizontalLineToRelative(308f)
                quadToRelative(-35f, -20f, -74f, -30f)
                reflectiveQuadToRelative(-80f, -10f)
                close()
                moveToRelative(0f, -110f)
                quadToRelative(-45f, 0f, -77.5f, -32.5f)
                reflectiveQuadTo(210f, 420f)
                quadToRelative(0f, -45f, 32.5f, -77.5f)
                reflectiveQuadTo(320f, 310f)
                quadToRelative(45f, 0f, 77.5f, 32.5f)
                reflectiveQuadTo(430f, 420f)
                quadToRelative(0f, 45f, -32.5f, 77.5f)
                reflectiveQuadTo(320f, 530f)
                close()
                moveToRelative(0f, -74f)
                quadToRelative(15f, 0f, 25.5f, -10.5f)
                reflectiveQuadTo(356f, 420f)
                quadToRelative(0f, -15f, -10.5f, -25.5f)
                reflectiveQuadTo(320f, 384f)
                quadToRelative(-15f, 0f, -25.5f, 10.5f)
                reflectiveQuadTo(284f, 420f)
                quadToRelative(0f, 15f, 10.5f, 25.5f)
                reflectiveQuadTo(320f, 456f)
                close()
                moveToRelative(400f, 304f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(680f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(720f, 200f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(760f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(720f, 760f)
                close()
                moveToRelative(160f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(840f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(880f, 200f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 760f)
                close()
                moveTo(320f, 420f)
                close()
                moveToRelative(0f, 260f)
                close()
            }
        }.build()
        
        return _Recent_actors!!
    }

private var _Recent_actors: ImageVector? = null

