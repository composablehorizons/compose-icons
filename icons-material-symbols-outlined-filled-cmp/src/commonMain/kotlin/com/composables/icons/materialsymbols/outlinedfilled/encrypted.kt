package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Encrypted: ImageVector
    get() {
        if (_Encrypted != null) return _Encrypted!!
        
        _Encrypted = ImageVector.Builder(
            name = "encrypted",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(420f, 600f)
                horizontalLineToRelative(120f)
                lineToRelative(-23f, -129f)
                quadToRelative(20f, -10f, 31.5f, -29f)
                reflectiveQuadToRelative(11.5f, -42f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 320f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(400f, 400f)
                quadToRelative(0f, 23f, 11.5f, 42f)
                reflectiveQuadToRelative(31.5f, 29f)
                lineToRelative(-23f, 129f)
                close()
                moveToRelative(60f, 280f)
                quadToRelative(-139f, -35f, -229.5f, -159.5f)
                reflectiveQuadTo(160f, 444f)
                verticalLineToRelative(-244f)
                lineToRelative(320f, -120f)
                lineToRelative(320f, 120f)
                verticalLineToRelative(244f)
                quadToRelative(0f, 152f, -90.5f, 276.5f)
                reflectiveQuadTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Encrypted!!
    }

private var _Encrypted: ImageVector? = null

