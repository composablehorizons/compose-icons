package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Universal_currency: ImageVector
    get() {
        if (_Universal_currency != null) return _Universal_currency!!
        
        _Universal_currency = ImageVector.Builder(
            name = "universal_currency",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 760f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(560f)
                horizontalLineTo(80f)
                close()
                moveToRelative(120f, -200f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(360f, 520f)
                verticalLineToRelative(-70f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(320f, 410f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-30f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-60f)
                horizontalLineTo(200f)
                verticalLineToRelative(150f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(30f)
                horizontalLineTo(200f)
                verticalLineToRelative(60f)
                close()
                moveToRelative(240f, 80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-22f)
                quadToRelative(0f, -45f, -44f, -71.5f)
                reflectiveQuadTo(600f, 520f)
                quadToRelative(-72f, 0f, -116f, 26.5f)
                reflectiveQuadTo(440f, 618f)
                verticalLineToRelative(22f)
                close()
                moveToRelative(160f, -160f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(680f, 400f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(600f, 320f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(520f, 400f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(600f, 480f)
                close()
            }
        }.build()
        
        return _Universal_currency!!
    }

private var _Universal_currency: ImageVector? = null

