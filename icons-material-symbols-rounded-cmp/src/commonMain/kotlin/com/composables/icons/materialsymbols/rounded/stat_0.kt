package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Stat_0: ImageVector
    get() {
        if (_Stat_0 != null) return _Stat_0!!
        
        _Stat_0 = ImageVector.Builder(
            name = "stat_0",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(423f, 703f)
                lineTo(257f, 537f)
                quadToRelative(-12f, -12f, -18f, -27f)
                reflectiveQuadToRelative(-6f, -30f)
                quadToRelative(0f, -15f, 6f, -30f)
                reflectiveQuadToRelative(18f, -27f)
                lineToRelative(166f, -166f)
                quadToRelative(12f, -12f, 27f, -18f)
                reflectiveQuadToRelative(30f, -6f)
                quadToRelative(15f, 0f, 30f, 6f)
                reflectiveQuadToRelative(27f, 18f)
                lineToRelative(166f, 166f)
                quadToRelative(12f, 12f, 18f, 27f)
                reflectiveQuadToRelative(6f, 30f)
                quadToRelative(0f, 15f, -6f, 30f)
                reflectiveQuadToRelative(-18f, 27f)
                lineTo(537f, 703f)
                quadToRelative(-12f, 12f, -27f, 18f)
                reflectiveQuadToRelative(-30f, 6f)
                quadToRelative(-15f, 0f, -30f, -6f)
                reflectiveQuadToRelative(-27f, -18f)
                close()
                moveToRelative(57f, -57f)
                lineToRelative(166f, -166f)
                lineToRelative(-166f, -166f)
                lineToRelative(-166f, 166f)
                lineToRelative(166f, 166f)
                close()
                moveToRelative(0f, -166f)
                close()
            }
        }.build()
        
        return _Stat_0!!
    }

private var _Stat_0: ImageVector? = null

