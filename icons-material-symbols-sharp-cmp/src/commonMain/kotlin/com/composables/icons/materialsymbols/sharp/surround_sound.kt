package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Surround_sound: ImageVector
    get() {
        if (_Surround_sound != null) return _Surround_sound!!
        
        _Surround_sound = ImageVector.Builder(
            name = "surround_sound",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 600f)
                quadToRelative(50f, 0f, 85f, -35f)
                reflectiveQuadToRelative(35f, -85f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                close()
                moveToRelative(198f, 78f)
                quadToRelative(40f, -40f, 61f, -91f)
                reflectiveQuadToRelative(21f, -107f)
                quadToRelative(0f, -56f, -21f, -107f)
                reflectiveQuadToRelative(-61f, -91f)
                lineToRelative(-56f, 56f)
                quadToRelative(29f, 29f, 43.5f, 65.5f)
                reflectiveQuadTo(680f, 480f)
                quadToRelative(0f, 40f, -14.5f, 76.5f)
                reflectiveQuadTo(622f, 622f)
                lineToRelative(56f, 56f)
                close()
                moveToRelative(-396f, 0f)
                lineToRelative(56f, -56f)
                quadToRelative(-29f, -29f, -43.5f, -65.5f)
                reflectiveQuadTo(280f, 480f)
                quadToRelative(0f, -40f, 14.5f, -76.5f)
                reflectiveQuadTo(338f, 338f)
                lineToRelative(-56f, -56f)
                quadToRelative(-40f, 40f, -61f, 91f)
                reflectiveQuadToRelative(-21f, 107f)
                quadToRelative(0f, 56f, 21f, 107f)
                reflectiveQuadToRelative(61f, 91f)
                close()
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(640f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-480f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-480f)
                verticalLineToRelative(480f)
                close()
            }
        }.build()
        
        return _Surround_sound!!
    }

private var _Surround_sound: ImageVector? = null

