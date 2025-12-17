package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Soap: ImageVector
    get() {
        if (_Soap != null) return _Soap!!
        
        _Soap = ImageVector.Builder(
            name = "soap",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(630f, 320f)
                quadToRelative(-29f, 0f, -49.5f, -20.5f)
                reflectiveQuadTo(560f, 250f)
                quadToRelative(0f, -29f, 20.5f, -49.5f)
                reflectiveQuadTo(630f, 180f)
                quadToRelative(29f, 0f, 49.5f, 20.5f)
                reflectiveQuadTo(700f, 250f)
                quadToRelative(0f, 29f, -20.5f, 49.5f)
                reflectiveQuadTo(630f, 320f)
                close()
                moveToRelative(210f, 0f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(760f, 240f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(840f, 160f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(920f, 240f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(840f, 320f)
                close()
                moveTo(700f, 160f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(640f, 100f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(700f, 40f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(760f, 100f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(700f, 160f)
                close()
                moveTo(240f, 880f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-216f)
                quadToRelative(0f, -31f, 14.5f, -57.5f)
                reflectiveQuadTo(135f, 403f)
                lineToRelative(306f, -199f)
                quadToRelative(11f, -7f, 23f, -5.5f)
                reflectiveQuadToRelative(21f, 10.5f)
                quadToRelative(20f, 20f, 23.5f, 47.5f)
                reflectiveQuadTo(497f, 308f)
                lineToRelative(-45f, 72f)
                horizontalLineToRelative(308f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 420f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 460f)
                horizontalLineTo(380f)
                quadToRelative(-23f, 0f, -35f, -20.5f)
                reflectiveQuadToRelative(1f, -40.5f)
                lineToRelative(39f, -63f)
                lineToRelative(-207f, 134f)
                quadToRelative(-9f, 5f, -13.5f, 14f)
                reflectiveQuadToRelative(-4.5f, 20f)
                verticalLineToRelative(216f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(240f, 800f)
                horizontalLineToRelative(480f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(760f, 840f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(720f, 880f)
                horizontalLineTo(240f)
                close()
                moveToRelative(600f, -280f)
                horizontalLineTo(520f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(480f, 560f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(520f, 520f)
                horizontalLineToRelative(320f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 560f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 600f)
                close()
                moveToRelative(-40f, 140f)
                horizontalLineTo(520f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(480f, 700f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(520f, 660f)
                horizontalLineToRelative(280f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 700f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 740f)
                close()
                moveTo(320f, 630f)
                close()
            }
        }.build()
        
        return _Soap!!
    }

private var _Soap: ImageVector? = null

