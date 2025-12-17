package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Dataset_linked: ImageVector
    get() {
        if (_Dataset_linked != null) return _Dataset_linked!!
        
        _Dataset_linked = ImageVector.Builder(
            name = "dataset_linked",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 800f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(363f)
                quadToRelative(-10f, -2f, -19.5f, -2.5f)
                reflectiveQuadTo(800f, 440f)
                horizontalLineTo(560f)
                quadToRelative(-37f, 0f, -70.5f, 10.5f)
                reflectiveQuadTo(427f, 480f)
                horizontalLineTo(280f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(43f)
                quadToRelative(-2f, 10f, -2.5f, 19.5f)
                reflectiveQuadTo(320f, 680f)
                quadToRelative(0f, 32f, 8f, 62.5f)
                reflectiveQuadToRelative(24f, 57.5f)
                horizontalLineTo(120f)
                close()
                moveToRelative(160f, -400f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-160f)
                horizontalLineTo(280f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(280f, 440f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(480f, 680f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(560f, 760f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(-40f, -440f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-160f)
                horizontalLineTo(520f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(40f, 320f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(560f)
                close()
                moveToRelative(160f, 120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(880f, 680f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(800f, 600f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                quadToRelative(66f, 0f, 113f, 46.5f)
                reflectiveQuadTo(960f, 680f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Dataset_linked!!
    }

private var _Dataset_linked: ImageVector? = null

