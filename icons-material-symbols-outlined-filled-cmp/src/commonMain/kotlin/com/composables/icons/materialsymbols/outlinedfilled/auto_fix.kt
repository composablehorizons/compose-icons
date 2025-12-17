package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Auto_fix: ImageVector
    get() {
        if (_Auto_fix != null) return _Auto_fix!!
        
        _Auto_fix = ImageVector.Builder(
            name = "auto_fix",
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
                moveTo(8.5f, 7f)
                lineToRelative(-0.95f, -2.05f)
                lineTo(5.5f, 4f)
                lineToRelative(2.05f, -0.95f)
                lineTo(8.5f, 1f)
                lineToRelative(0.95f, 2.05f)
                lineTo(11.5f, 4f)
                lineToRelative(-2.05f, 0.95f)
                close()
                moveTo(20f, 18.5f)
                lineToRelative(-0.95f, -2.05f)
                lineTo(17f, 15.5f)
                lineToRelative(2.05f, -0.95f)
                lineToRelative(0.95f, -2.05f)
                lineToRelative(0.95f, 2.05f)
                lineToRelative(2.05f, 0.95f)
                lineToRelative(-2.05f, 0.95f)
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
        
        return _Auto_fix!!
    }

private var _Auto_fix: ImageVector? = null

