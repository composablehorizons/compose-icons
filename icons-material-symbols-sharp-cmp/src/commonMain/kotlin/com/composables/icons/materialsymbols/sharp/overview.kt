package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Overview: ImageVector
    get() {
        if (_Overview != null) return _Overview!!
        
        _Overview = ImageVector.Builder(
            name = "overview",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(787f, 815f)
                lineToRelative(28f, -28f)
                lineToRelative(-75f, -75f)
                verticalLineToRelative(-112f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(128f)
                lineToRelative(87f, 87f)
                close()
                moveToRelative(-667f, 25f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(348f)
                quadToRelative(-19f, -9f, -39f, -15.5f)
                reflectiveQuadToRelative(-41f, -9.5f)
                verticalLineToRelative(-243f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(242f)
                quadToRelative(3f, 22f, 9.5f, 42f)
                reflectiveQuadToRelative(15.5f, 38f)
                horizontalLineTo(120f)
                close()
                moveToRelative(80f, -120f)
                verticalLineToRelative(40f)
                verticalLineToRelative(-560f)
                verticalLineToRelative(243f)
                verticalLineToRelative(-3f)
                verticalLineToRelative(280f)
                close()
                moveToRelative(80f, -40f)
                horizontalLineToRelative(163f)
                quadToRelative(3f, -21f, 9.5f, -41f)
                reflectiveQuadToRelative(14.5f, -39f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, -160f)
                horizontalLineToRelative(244f)
                quadToRelative(32f, -30f, 71.5f, -50f)
                reflectiveQuadToRelative(84.5f, -27f)
                verticalLineToRelative(-3f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, -160f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-80f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                close()
                moveTo(720f, 920f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(520f, 720f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(720f, 520f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(920f, 720f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(720f, 920f)
                close()
            }
        }.build()
        
        return _Overview!!
    }

private var _Overview: ImageVector? = null

