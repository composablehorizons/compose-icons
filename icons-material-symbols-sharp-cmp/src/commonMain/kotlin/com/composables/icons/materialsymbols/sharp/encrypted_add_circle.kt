package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Encrypted_add_circle: ImageVector
    get() {
        if (_Encrypted_add_circle != null) return _Encrypted_add_circle!!
        
        _Encrypted_add_circle = ImageVector.Builder(
            name = "encrypted_add_circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 444f)
                verticalLineToRelative(-244f)
                lineToRelative(320f, -120f)
                lineToRelative(320f, 120f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-144f)
                lineToRelative(-240f, -90f)
                lineToRelative(-240f, 90f)
                verticalLineToRelative(188f)
                quadToRelative(0f, 45f, 11.5f, 90f)
                reflectiveQuadToRelative(32.5f, 86.5f)
                quadToRelative(21f, 41.5f, 50.5f, 76.5f)
                reflectiveQuadToRelative(65.5f, 61f)
                verticalLineToRelative(92f)
                quadToRelative(-107f, -55f, -173.5f, -165.5f)
                reflectiveQuadTo(160f, 444f)
                close()
                moveToRelative(320f, 22f)
                close()
                moveToRelative(180f, 334f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-100f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-40f)
                horizontalLineTo(700f)
                verticalLineToRelative(-100f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(100f)
                horizontalLineTo(560f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(100f)
                close()
                moveToRelative(20f, 80f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(480f, 680f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(680f, 480f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(880f, 680f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(680f, 880f)
                close()
                moveTo(480f, 480f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(560f, 400f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 320f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(400f, 400f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(480f, 480f)
                close()
            }
        }.build()
        
        return _Encrypted_add_circle!!
    }

private var _Encrypted_add_circle: ImageVector? = null

