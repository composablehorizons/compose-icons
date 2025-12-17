package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Auto_fix_off: ImageVector
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
                moveTo(20f, 7f)
                lineToRelative(-0.95f, -2.05f)
                lineTo(17f, 4f)
                lineToRelative(2.05f, -0.95f)
                lineTo(20f, 1f)
                lineToRelative(0.95f, 2.05f)
                lineTo(23f, 4f)
                lineToRelative(-2.05f, 0.95f)
                close()
                moveToRelative(-4.45f, 5.7f)
                lineTo(11.3f, 8.45f)
                lineToRelative(2.15f, -2.15f)
                quadToRelative(0.3f, -0.3f, 0.725f, -0.3f)
                reflectiveQuadToRelative(0.725f, 0.3f)
                lineToRelative(2.8f, 2.8f)
                quadToRelative(0.3f, 0.3f, 0.3f, 0.725f)
                reflectiveQuadToRelative(-0.3f, 0.725f)
                close()
                moveToRelative(4.25f, 9.9f)
                lineToRelative(-7.1f, -7.05f)
                lineToRelative(-6.15f, 6.15f)
                quadToRelative(-0.3f, 0.3f, -0.725f, 0.3f)
                reflectiveQuadToRelative(-0.725f, -0.3f)
                lineToRelative(-2.8f, -2.85f)
                quadToRelative(-0.275f, -0.275f, -0.275f, -0.7f)
                quadToRelative(0f, -0.425f, 0.275f, -0.7f)
                lineToRelative(6.15f, -6.15f)
                lineTo(1.4f, 4.2f)
                lineToRelative(1.4f, -1.4f)
                lineToRelative(18.4f, 18.4f)
                close()
                moveToRelative(-13.95f, -3f)
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

