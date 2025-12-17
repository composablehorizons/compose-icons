package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Orbit: ImageVector
    get() {
        if (_Orbit != null) return _Orbit!!
        
        _Orbit = ImageVector.Builder(
            name = "orbit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 860f)
                quadToRelative(-58f, 0f, -99f, -41f)
                reflectiveQuadToRelative(-41f, -99f)
                quadToRelative(0f, -58f, 41f, -99f)
                reflectiveQuadToRelative(99f, -41f)
                quadToRelative(58f, 0f, 99f, 41f)
                reflectiveQuadToRelative(41f, 99f)
                quadToRelative(0f, 22f, -6.5f, 42.5f)
                reflectiveQuadTo(354f, 801f)
                verticalLineToRelative(-27f)
                quadToRelative(30f, 13f, 62f, 19.5f)
                reflectiveQuadToRelative(64f, 6.5f)
                quadToRelative(134f, 0f, 227f, -93f)
                reflectiveQuadToRelative(93f, -227f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                quadToRelative(-45f, 0f, -88f, -9.5f)
                reflectiveQuadTo(309f, 842f)
                quadToRelative(-16f, 9f, -33.5f, 13.5f)
                reflectiveQuadTo(240f, 860f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(300f, 720f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(240f, 660f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(180f, 720f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(240f, 780f)
                close()
                moveToRelative(240f, -160f)
                quadToRelative(-58f, 0f, -99f, -41f)
                reflectiveQuadToRelative(-41f, -99f)
                quadToRelative(0f, -58f, 41f, -99f)
                reflectiveQuadToRelative(99f, -41f)
                quadToRelative(58f, 0f, 99f, 41f)
                reflectiveQuadToRelative(41f, 99f)
                quadToRelative(0f, 58f, -41f, 99f)
                reflectiveQuadToRelative(-99f, 41f)
                close()
                moveTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(45f, 0f, 88f, 9.5f)
                reflectiveQuadToRelative(83f, 28.5f)
                quadToRelative(16f, -9f, 33.5f, -13.5f)
                reflectiveQuadTo(720f, 100f)
                quadToRelative(58f, 0f, 99f, 41f)
                reflectiveQuadToRelative(41f, 99f)
                quadToRelative(0f, 58f, -41f, 99f)
                reflectiveQuadToRelative(-99f, 41f)
                quadToRelative(-58f, 0f, -99f, -41f)
                reflectiveQuadToRelative(-41f, -99f)
                quadToRelative(0f, -22f, 6.5f, -42.5f)
                reflectiveQuadTo(606f, 159f)
                verticalLineToRelative(27f)
                quadToRelative(-30f, -13f, -62f, -19.5f)
                reflectiveQuadToRelative(-64f, -6.5f)
                quadToRelative(-134f, 0f, -227f, 93f)
                reflectiveQuadToRelative(-93f, 227f)
                horizontalLineTo(80f)
                close()
                moveToRelative(640f, -180f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(780f, 240f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(720f, 180f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(660f, 240f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(720f, 300f)
                close()
                moveTo(240f, 720f)
                close()
                moveToRelative(480f, -480f)
                close()
            }
        }.build()
        
        return _Orbit!!
    }

private var _Orbit: ImageVector? = null

