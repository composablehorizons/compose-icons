package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.H_mobiledata_badge: ImageVector
    get() {
        if (_H_mobiledata_badge != null) return _H_mobiledata_badge!!
        
        _H_mobiledata_badge = ImageVector.Builder(
            name = "h_mobiledata_badge",
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
                moveToRelative(200f, -320f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(600f, 680f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(640f, 640f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(600f, 280f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(560f, 320f)
                verticalLineToRelative(120f)
                horizontalLineTo(400f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(360f, 280f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(320f, 320f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(360f, 680f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(400f, 640f)
                verticalLineToRelative(-120f)
                close()
            }
        }.build()
        
        return _H_mobiledata_badge!!
    }

private var _H_mobiledata_badge: ImageVector? = null

