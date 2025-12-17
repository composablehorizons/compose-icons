package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Auto_fix_normal: ImageVector
    get() {
        if (_Auto_fix_normal != null) return _Auto_fix_normal!!
        
        _Auto_fix_normal = ImageVector.Builder(
            name = "auto_fix_normal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19.05f, 4.95f)
                lineToRelative(-1.075f, -0.5f)
                quadTo(17.7f, 4.325f, 17.7f, 4f)
                reflectiveQuadToRelative(0.275f, -0.45f)
                lineToRelative(1.075f, -0.5f)
                lineToRelative(0.5f, -1.075f)
                quadToRelative(0.125f, -0.275f, 0.45f, -0.275f)
                reflectiveQuadToRelative(0.45f, 0.275f)
                lineToRelative(0.5f, 1.075f)
                lineToRelative(1.075f, 0.5f)
                quadToRelative(0.275f, 0.125f, 0.275f, 0.45f)
                reflectiveQuadToRelative(-0.275f, 0.45f)
                lineToRelative(-1.075f, 0.5f)
                lineToRelative(-0.5f, 1.075f)
                quadToRelative(-0.125f, 0.275f, -0.45f, 0.275f)
                reflectiveQuadToRelative(-0.45f, -0.275f)
                close()
                moveTo(5.1f, 21.7f)
                lineToRelative(-2.8f, -2.8f)
                quadToRelative(-0.3f, -0.3f, -0.3f, -0.725f)
                reflectiveQuadToRelative(0.3f, -0.725f)
                lineTo(13.45f, 6.3f)
                quadToRelative(0.3f, -0.3f, 0.725f, -0.3f)
                reflectiveQuadToRelative(0.725f, 0.3f)
                lineToRelative(2.8f, 2.8f)
                quadToRelative(0.3f, 0.3f, 0.3f, 0.725f)
                reflectiveQuadToRelative(-0.3f, 0.725f)
                lineTo(6.55f, 21.7f)
                quadToRelative(-0.3f, 0.3f, -0.725f, 0.3f)
                reflectiveQuadToRelative(-0.725f, -0.3f)
                close()
                moveToRelative(9.075f, -10.475f)
                lineToRelative(1.4f, -1.4f)
                lineToRelative(-1.4f, -1.4f)
                lineToRelative(-1.4f, 1.4f)
                close()
            }
        }.build()
        
        return _Auto_fix_normal!!
    }

private var _Auto_fix_normal: ImageVector? = null

