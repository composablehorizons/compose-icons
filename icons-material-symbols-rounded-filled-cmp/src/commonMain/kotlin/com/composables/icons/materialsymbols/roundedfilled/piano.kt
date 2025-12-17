package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Piano: ImageVector
    get() {
        if (_Piano != null) return _Piano!!
        
        _Piano = ImageVector.Builder(
            name = "piano",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
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
                horizontalLineToRelative(130f)
                verticalLineToRelative(-180f)
                horizontalLineToRelative(-10f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(280f, 540f)
                verticalLineToRelative(-340f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(430f, 0f)
                horizontalLineToRelative(130f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(340f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(640f, 580f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(180f)
                close()
                moveToRelative(-240f, 0f)
                horizontalLineToRelative(180f)
                verticalLineToRelative(-180f)
                horizontalLineToRelative(-10f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(520f, 540f)
                verticalLineToRelative(-340f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(340f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(400f, 580f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(180f)
                close()
            }
        }.build()
        
        return _Piano!!
    }

private var _Piano: ImageVector? = null

