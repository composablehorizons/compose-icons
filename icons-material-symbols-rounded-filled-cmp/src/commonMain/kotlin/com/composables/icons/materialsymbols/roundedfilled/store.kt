package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Store: ImageVector
    get() {
        if (_Store != null) return _Store!!
        
        _Store = ImageVector.Builder(
            name = "store",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 160f)
                horizontalLineToRelative(560f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 200f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 240f)
                horizontalLineTo(200f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 200f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 160f)
                close()
                moveToRelative(0f, 640f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 760f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(-7f)
                quadToRelative(-19f, 0f, -31f, -14.5f)
                reflectiveQuadToRelative(-8f, -33.5f)
                lineToRelative(40f, -200f)
                quadToRelative(3f, -14f, 14f, -23f)
                reflectiveQuadToRelative(25f, -9f)
                horizontalLineToRelative(574f)
                quadToRelative(14f, 0f, 25f, 9f)
                reflectiveQuadToRelative(14f, 23f)
                lineToRelative(40f, 200f)
                quadToRelative(4f, 19f, -8f, 33.5f)
                reflectiveQuadTo(807f, 560f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 800f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(720f, 760f)
                verticalLineToRelative(-200f)
                horizontalLineTo(560f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(520f, 800f)
                horizontalLineTo(200f)
                close()
                moveToRelative(40f, -80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-160f)
                horizontalLineTo(240f)
                verticalLineToRelative(160f)
                close()
            }
        }.build()
        
        return _Store!!
    }

private var _Store: ImageVector? = null

