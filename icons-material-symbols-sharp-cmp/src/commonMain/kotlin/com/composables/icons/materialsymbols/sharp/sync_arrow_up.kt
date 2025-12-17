package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Sync_arrow_up: ImageVector
    get() {
        if (_Sync_arrow_up != null) return _Sync_arrow_up!!
        
        _Sync_arrow_up = ImageVector.Builder(
            name = "sync_arrow_up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 780f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(57f)
                quadToRelative(-47f, -42f, -72f, -99.5f)
                reflectiveQuadTo(40f, 480f)
                quadToRelative(0f, -107f, 67f, -189.5f)
                reflectiveQuadTo(280f, 186f)
                verticalLineToRelative(82f)
                quadToRelative(-72f, 20f, -116f, 78.5f)
                reflectiveQuadTo(120f, 479f)
                quadToRelative(0f, 50f, 21f, 93.5f)
                reflectiveQuadToRelative(59f, 75.5f)
                verticalLineToRelative(-68f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                horizontalLineTo(80f)
                close()
                moveToRelative(320f, -6f)
                verticalLineToRelative(-82f)
                quadToRelative(72f, -20f, 116f, -78.5f)
                reflectiveQuadTo(560f, 481f)
                quadToRelative(0f, -50f, -21f, -93.5f)
                reflectiveQuadTo(480f, 312f)
                verticalLineToRelative(68f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-57f)
                quadToRelative(47f, 42f, 72f, 99.5f)
                reflectiveQuadTo(640f, 480f)
                quadToRelative(0f, 107f, -67f, 189.5f)
                reflectiveQuadTo(400f, 774f)
                close()
                moveToRelative(340f, 26f)
                verticalLineToRelative(-488f)
                lineToRelative(-44f, 44f)
                lineToRelative(-56f, -56f)
                lineToRelative(140f, -140f)
                lineToRelative(140f, 140f)
                lineToRelative(-57f, 56f)
                lineToRelative(-43f, -43f)
                verticalLineToRelative(487f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Sync_arrow_up!!
    }

private var _Sync_arrow_up: ImageVector? = null

