package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Universal_currency: ImageVector
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
                moveTo(300f, 500f)
                horizontalLineToRelative(-70f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(200f, 530f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(230f, 560f)
                horizontalLineToRelative(90f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(360f, 520f)
                verticalLineToRelative(-70f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(320f, 410f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-30f)
                horizontalLineToRelative(70f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(360f, 350f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(330f, 320f)
                horizontalLineTo(230f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(200f, 350f)
                verticalLineToRelative(90f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(230f, 470f)
                horizontalLineToRelative(70f)
                verticalLineToRelative(30f)
                close()
                moveToRelative(300f, 20f)
                quadToRelative(-72f, 0f, -116f, 26.5f)
                reflectiveQuadTo(440f, 618f)
                verticalLineToRelative(2f)
                quadToRelative(0f, 8f, 6f, 14f)
                reflectiveQuadToRelative(14f, 6f)
                horizontalLineToRelative(280f)
                quadToRelative(8f, 0f, 14f, -6f)
                reflectiveQuadToRelative(6f, -14f)
                verticalLineToRelative(-2f)
                quadToRelative(0f, -45f, -44f, -71.5f)
                reflectiveQuadTo(600f, 520f)
                close()
                moveToRelative(0f, -40f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(680f, 400f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(600f, 320f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(520f, 400f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(600f, 480f)
                close()
                moveTo(160f, 760f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 680f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 200f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 280f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 760f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-400f)
                horizontalLineTo(160f)
                verticalLineToRelative(400f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-400f)
                verticalLineToRelative(400f)
                close()
            }
        }.build()
        
        return _Universal_currency!!
    }

private var _Universal_currency: ImageVector? = null

