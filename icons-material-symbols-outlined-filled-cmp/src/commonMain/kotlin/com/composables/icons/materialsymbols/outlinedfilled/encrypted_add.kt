package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Encrypted_add: ImageVector
    get() {
        if (_Encrypted_add != null) return _Encrypted_add!!
        
        _Encrypted_add = ImageVector.Builder(
            name = "encrypted_add",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(680f, 880f)
                verticalLineToRelative(-120f)
                horizontalLineTo(560f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(760f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(-200f, 0f)
                quadToRelative(-139f, -35f, -229.5f, -159.5f)
                reflectiveQuadTo(160f, 444f)
                verticalLineToRelative(-244f)
                lineToRelative(320f, -120f)
                lineToRelative(320f, 120f)
                verticalLineToRelative(244f)
                quadToRelative(0f, 12f, -0.5f, 24.5f)
                reflectiveQuadTo(797f, 493f)
                quadToRelative(-18f, -6f, -38.5f, -9.5f)
                reflectiveQuadTo(718f, 480f)
                quadToRelative(-56f, 1f, -103.5f, 24.5f)
                reflectiveQuadTo(534f, 568f)
                lineToRelative(-17f, -97f)
                quadToRelative(20f, -10f, 31.5f, -29f)
                reflectiveQuadToRelative(11.5f, -42f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 320f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(400f, 400f)
                quadToRelative(0f, 23f, 11.5f, 42f)
                reflectiveQuadToRelative(31.5f, 29f)
                lineToRelative(-23f, 129f)
                horizontalLineToRelative(92f)
                quadToRelative(-15f, 26f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 720f)
                quadToRelative(0f, 39f, 12.5f, 75.5f)
                reflectiveQuadTo(528f, 864f)
                quadToRelative(-12f, 5f, -24f, 9f)
                reflectiveQuadToRelative(-24f, 7f)
                close()
            }
        }.build()
        
        return _Encrypted_add!!
    }

private var _Encrypted_add: ImageVector? = null

