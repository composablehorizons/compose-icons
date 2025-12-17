package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Amend: ImageVector
    get() {
        if (_Amend != null) return _Amend!!
        
        _Amend = ImageVector.Builder(
            name = "amend",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 640f)
                horizontalLineToRelative(320f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(680f, 600f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(640f, 560f)
                horizontalLineTo(320f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(280f, 600f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(320f, 640f)
                close()
                moveToRelative(63f, -220f)
                quadToRelative(20f, -19f, 45f, -29.5f)
                reflectiveQuadToRelative(52f, -10.5f)
                quadToRelative(40f, 0f, 73f, 22f)
                reflectiveQuadToRelative(50f, 58f)
                quadToRelative(5f, 11f, 16.5f, 15f)
                reflectiveQuadToRelative(22.5f, -1f)
                quadToRelative(12f, -5f, 17f, -16f)
                reflectiveQuadToRelative(-1f, -22f)
                quadToRelative(-26f, -52f, -73.5f, -84f)
                reflectiveQuadTo(480f, 320f)
                quadToRelative(-39f, 0f, -75.5f, 15f)
                reflectiveQuadTo(340f, 378f)
                verticalLineToRelative(-28f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(310f, 320f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(280f, 350f)
                verticalLineToRelative(100f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(310f, 480f)
                horizontalLineToRelative(100f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(440f, 450f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(410f, 420f)
                horizontalLineToRelative(-27f)
                close()
                moveToRelative(97f, 460f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(134f, 0f, 227f, -93f)
                reflectiveQuadToRelative(93f, -227f)
                quadToRelative(0f, -134f, -93f, -227f)
                reflectiveQuadToRelative(-227f, -93f)
                quadToRelative(-134f, 0f, -227f, 93f)
                reflectiveQuadToRelative(-93f, 227f)
                quadToRelative(0f, 134f, 93f, 227f)
                reflectiveQuadToRelative(227f, 93f)
                close()
                moveToRelative(0f, -320f)
                close()
            }
        }.build()
        
        return _Amend!!
    }

private var _Amend: ImageVector? = null

