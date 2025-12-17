package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.App_badging: ImageVector
    get() {
        if (_App_badging != null) return _App_badging!!
        
        _App_badging = ImageVector.Builder(
            name = "app_badging",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(720f, 360f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 126.5f, -85.5f)
                reflectiveQuadTo(479f, 80f)
                quadToRelative(36f, 0f, 51f, 5f)
                reflectiveQuadToRelative(20f, 19f)
                quadToRelative(4f, 9f, 2.5f, 19f)
                reflectiveQuadToRelative(-7.5f, 20f)
                quadToRelative(-13f, 21f, -19f, 45f)
                reflectiveQuadToRelative(-6f, 52f)
                quadToRelative(0f, 83f, 58.5f, 141.5f)
                reflectiveQuadTo(720f, 440f)
                quadToRelative(26f, 0f, 50.5f, -6f)
                reflectiveQuadToRelative(46.5f, -19f)
                quadToRelative(10f, -5f, 20f, -6.5f)
                reflectiveQuadToRelative(18f, 2.5f)
                quadToRelative(14f, 5f, 19.5f, 20f)
                reflectiveQuadToRelative(5.5f, 50f)
                quadToRelative(0f, 83f, -31.5f, 155.5f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
            }
        }.build()
        
        return _App_badging!!
    }

private var _App_badging: ImageVector? = null

