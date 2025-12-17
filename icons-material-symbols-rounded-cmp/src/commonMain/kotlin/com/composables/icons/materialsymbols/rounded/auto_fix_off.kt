package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Auto_fix_off: ImageVector
    get() {
        if (_Auto_fix_off != null) return _Auto_fix_off!!
        
        _Auto_fix_off = ImageVector.Builder(
            name = "auto_fix_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19.55f, 6.025f)
                lineToRelative(-0.5f, -1.075f)
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
                moveToRelative(-4f, 6.675f)
                lineTo(11.3f, 8.45f)
                lineToRelative(2.15f, -2.15f)
                quadToRelative(0.3f, -0.3f, 0.725f, -0.3f)
                reflectiveQuadToRelative(0.725f, 0.3f)
                lineToRelative(2.8f, 2.8f)
                quadToRelative(0.3f, 0.3f, 0.3f, 0.725f)
                reflectiveQuadToRelative(-0.3f, 0.725f)
                close()
                moveToRelative(3.55f, 9.2f)
                lineToRelative(-6.4f, -6.35f)
                lineToRelative(-6.15f, 6.15f)
                quadToRelative(-0.3f, 0.3f, -0.725f, 0.3f)
                reflectiveQuadToRelative(-0.725f, -0.3f)
                lineToRelative(-2.8f, -2.85f)
                quadToRelative(-0.275f, -0.275f, -0.275f, -0.7f)
                quadToRelative(0f, -0.425f, 0.275f, -0.7f)
                lineToRelative(6.15f, -6.15f)
                lineTo(2.1f, 4.9f)
                quadToRelative(-0.275f, -0.275f, -0.288f, -0.688f)
                quadTo(1.8f, 3.8f, 2.1f, 3.5f)
                quadToRelative(0.275f, -0.275f, 0.7f, -0.275f)
                quadToRelative(0.425f, 0f, 0.7f, 0.275f)
                lineToRelative(17f, 17f)
                quadToRelative(0.275f, 0.275f, 0.288f, 0.688f)
                quadToRelative(0.012f, 0.412f, -0.288f, 0.712f)
                quadToRelative(-0.275f, 0.275f, -0.688f, 0.275f)
                quadToRelative(-0.412f, 0f, -0.712f, -0.275f)
                close()
                moveTo(5.85f, 19.6f)
                lineToRelative(5.45f, -5.5f)
                lineToRelative(-1.4f, -1.4f)
                lineToRelative(-5.5f, 5.45f)
                close()
                moveToRelative(0f, 0f)
                lineTo(4.4f, 18.15f)
                lineToRelative(1.45f, 1.45f)
                close()
            }
        }.build()
        
        return _Auto_fix_off!!
    }

private var _Auto_fix_off: ImageVector? = null

