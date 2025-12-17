package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Cards: ImageVector
    get() {
        if (_Cards != null) return _Cards!!
        
        _Cards = ImageVector.Builder(
            name = "cards",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(420f, 460f)
                horizontalLineTo(280f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(240f, 420f)
                verticalLineToRelative(-140f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(280f, 240f)
                horizontalLineToRelative(140f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(460f, 280f)
                verticalLineToRelative(140f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(420f, 460f)
                close()
                moveToRelative(0f, 260f)
                horizontalLineTo(280f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(240f, 680f)
                verticalLineToRelative(-140f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(280f, 500f)
                horizontalLineToRelative(140f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(460f, 540f)
                verticalLineToRelative(140f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(420f, 720f)
                close()
                moveToRelative(260f, -260f)
                horizontalLineTo(540f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(500f, 420f)
                verticalLineToRelative(-140f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(540f, 240f)
                horizontalLineToRelative(140f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(720f, 280f)
                verticalLineToRelative(140f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(680f, 460f)
                close()
                moveToRelative(0f, 260f)
                horizontalLineTo(540f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(500f, 680f)
                verticalLineToRelative(-140f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(540f, 500f)
                horizontalLineToRelative(140f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(720f, 540f)
                verticalLineToRelative(140f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(680f, 720f)
                close()
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-560f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                close()
            }
        }.build()
        
        return _Cards!!
    }

private var _Cards: ImageVector? = null

