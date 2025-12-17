package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Two_pager_store: ImageVector
    get() {
        if (_Two_pager_store != null) return _Two_pager_store!!
        
        _Two_pager_store = ImageVector.Builder(
            name = "two_pager_store",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(620f, 880f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(560f, 820f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(60f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(820f, 880f)
                horizontalLineTo(620f)
                close()
                moveToRelative(-460f, -80f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-200f)
                horizontalLineTo(520f)
                verticalLineToRelative(200f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(440f, 520f)
                verticalLineToRelative(280f)
                horizontalLineTo(160f)
                close()
                moveToRelative(423f, -80f)
                quadToRelative(-28f, 0f, -45f, -22f)
                reflectiveQuadToRelative(-12f, -50f)
                lineToRelative(16f, -80f)
                quadToRelative(5f, -21f, 21f, -34.5f)
                reflectiveQuadToRelative(37f, -13.5f)
                horizontalLineToRelative(240f)
                quadToRelative(21f, 0f, 37f, 13.5f)
                reflectiveQuadToRelative(21f, 34.5f)
                lineToRelative(16f, 80f)
                quadToRelative(5f, 28f, -12f, 50f)
                reflectiveQuadToRelative(-45f, 22f)
                horizontalLineTo(583f)
                close()
                moveToRelative(-383f, -80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-80f)
                horizontalLineTo(200f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, -120f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-80f)
                horizontalLineTo(200f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, -120f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-80f)
                horizontalLineTo(200f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(360f, 0f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineTo(560f)
                close()
            }
        }.build()
        
        return _Two_pager_store!!
    }

private var _Two_pager_store: ImageVector? = null

