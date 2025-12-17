package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Badge: ImageVector
    get() {
        if (_Badge != null) return _Badge!!
        
        _Badge = ImageVector.Builder(
            name = "badge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 720f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-18f)
                quadToRelative(0f, -17f, -9.5f, -31.5f)
                reflectiveQuadTo(444f, 648f)
                quadToRelative(-20f, -9f, -40.5f, -13.5f)
                reflectiveQuadTo(360f, 630f)
                quadToRelative(-23f, 0f, -43.5f, 4.5f)
                reflectiveQuadTo(276f, 648f)
                quadToRelative(-17f, 8f, -26.5f, 22.5f)
                reflectiveQuadTo(240f, 702f)
                verticalLineToRelative(18f)
                close()
                moveToRelative(320f, -60f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-60f)
                horizontalLineTo(560f)
                verticalLineToRelative(60f)
                close()
                moveToRelative(-200f, -60f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(420f, 540f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(360f, 480f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(300f, 540f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(360f, 600f)
                close()
                moveToRelative(200f, -60f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-60f)
                horizontalLineTo(560f)
                verticalLineToRelative(60f)
                close()
                moveTo(80f, 880f)
                verticalLineToRelative(-600f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(600f)
                horizontalLineTo(80f)
                close()
                moveToRelative(360f, -520f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(200f)
                close()
            }
        }.build()
        
        return _Badge!!
    }

private var _Badge: ImageVector? = null

