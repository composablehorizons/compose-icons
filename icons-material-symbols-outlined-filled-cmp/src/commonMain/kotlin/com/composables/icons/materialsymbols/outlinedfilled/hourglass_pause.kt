package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Hourglass_pause: ImageVector
    get() {
        if (_Hourglass_pause != null) return _Hourglass_pause!!
        
        _Hourglass_pause = ImageVector.Builder(
            name = "hourglass_pause",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 880f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -61f, 28.5f, -114.5f)
                reflectiveQuadTo(348f, 480f)
                quadToRelative(-51f, -32f, -79.5f, -85.5f)
                reflectiveQuadTo(240f, 280f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 48f, -18f, 92f)
                reflectiveQuadToRelative(-51f, 77f)
                quadToRelative(-47f, 12f, -85.5f, 37.5f)
                reflectiveQuadTo(499f, 548f)
                quadToRelative(-28f, 36f, -43.5f, 80f)
                reflectiveQuadTo(440f, 720f)
                quadToRelative(0f, 43f, 13f, 84f)
                reflectiveQuadToRelative(38f, 76f)
                horizontalLineTo(160f)
                close()
                moveToRelative(560f, 40f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(520f, 720f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(720f, 520f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(920f, 720f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(720f, 920f)
                close()
                moveToRelative(-70f, -120f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(100f, 0f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(160f)
                close()
            }
        }.build()
        
        return _Hourglass_pause!!
    }

private var _Hourglass_pause: ImageVector? = null

