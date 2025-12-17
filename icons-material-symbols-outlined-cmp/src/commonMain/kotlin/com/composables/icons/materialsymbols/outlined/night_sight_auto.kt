package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Night_sight_auto: ImageVector
    get() {
        if (_Night_sight_auto != null) return _Night_sight_auto!!
        
        _Night_sight_auto = ImageVector.Builder(
            name = "night_sight_auto",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 760f)
                quadToRelative(52f, 0f, 99f, -21f)
                reflectiveQuadToRelative(81f, -60f)
                quadToRelative(-128f, -8f, -214f, -99.5f)
                reflectiveQuadTo(320f, 360f)
                quadToRelative(0f, -13f, 1f, -25.5f)
                reflectiveQuadToRelative(3f, -24.5f)
                quadToRelative(-57f, 32f, -90.5f, 88f)
                reflectiveQuadTo(200f, 520f)
                quadToRelative(0f, 100f, 70f, 170f)
                reflectiveQuadToRelative(170f, 70f)
                close()
                moveToRelative(0f, 80f)
                quadToRelative(-134f, 0f, -227f, -93f)
                reflectiveQuadToRelative(-93f, -227f)
                quadToRelative(0f, -134f, 93f, -227f)
                reflectiveQuadToRelative(227f, -93f)
                quadToRelative(5f, 0f, 10f, 0.5f)
                reflectiveQuadToRelative(10f, 0.5f)
                quadToRelative(-29f, 32f, -44.5f, 73f)
                reflectiveQuadTo(400f, 360f)
                quadToRelative(0f, 100f, 70f, 170f)
                reflectiveQuadToRelative(170f, 70f)
                quadToRelative(31f, 0f, 60.5f, -7.5f)
                reflectiveQuadTo(756f, 570f)
                quadToRelative(-18f, 118f, -108f, 194f)
                reflectiveQuadToRelative(-208f, 76f)
                close()
                moveToRelative(112f, -400f)
                lineToRelative(128f, -360f)
                horizontalLineToRelative(80f)
                lineToRelative(128f, 360f)
                horizontalLineToRelative(-76f)
                lineToRelative(-28f, -80f)
                horizontalLineTo(656f)
                lineToRelative(-28f, 80f)
                horizontalLineToRelative(-76f)
                close()
                moveToRelative(122f, -134f)
                horizontalLineToRelative(92f)
                lineToRelative(-46f, -146f)
                lineToRelative(-46f, 146f)
                close()
                moveTo(407f, 579f)
                close()
            }
        }.build()
        
        return _Night_sight_auto!!
    }

private var _Night_sight_auto: ImageVector? = null

