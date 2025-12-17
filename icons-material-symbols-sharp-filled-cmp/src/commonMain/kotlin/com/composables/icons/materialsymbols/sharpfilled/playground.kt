package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Playground: ImageVector
    get() {
        if (_Playground != null) return _Playground!!
        
        _Playground = ImageVector.Builder(
            name = "playground",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(42f)
                lineToRelative(40f, -600f)
                horizontalLineToRelative(395f)
                lineToRelative(41f, 600f)
                horizontalLineToRelative(162f)
                verticalLineToRelative(-246f)
                quadToRelative(-52f, -14f, -86f, -56f)
                reflectiveQuadToRelative(-34f, -98f)
                quadToRelative(0f, -34f, 13f, -63.5f)
                reflectiveQuadToRelative(36f, -51.5f)
                quadToRelative(-5f, -11f, -7f, -22f)
                reflectiveQuadToRelative(-2f, -23f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 12f, -2f, 23f)
                reflectiveQuadToRelative(-7f, 22f)
                quadToRelative(23f, 22f, 36f, 51.5f)
                reflectiveQuadToRelative(13f, 63.5f)
                quadToRelative(0f, 56f, -34f, 98f)
                reflectiveQuadToRelative(-86f, 56f)
                verticalLineToRelative(246f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(40f)
                close()
                moveToRelative(123f, -80f)
                horizontalLineToRelative(314f)
                lineToRelative(-35f, -520f)
                horizontalLineToRelative(-32f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(30f)
                verticalLineToRelative(80f)
                horizontalLineTo(200f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(30f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(-32f)
                lineToRelative(-35f, 520f)
                close()
                moveToRelative(127f, -160f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(360f)
                close()
            }
        }.build()
        
        return _Playground!!
    }

private var _Playground: ImageVector? = null

