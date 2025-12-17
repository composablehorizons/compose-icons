package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Transition_slide: ImageVector
    get() {
        if (_Transition_slide != null) return _Transition_slide!!
        
        _Transition_slide = ImageVector.Builder(
            name = "transition_slide",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(40f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(120f, 160f)
                horizontalLineToRelative(80f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(280f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(200f, 800f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(0f, -79f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-482f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(482f)
                close()
                moveToRelative(320f, 79f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(360f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(440f, 160f)
                horizontalLineToRelative(400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(920f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(840f, 800f)
                horizontalLineTo(440f)
                close()
                moveToRelative(0f, -79f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-482f)
                horizontalLineTo(440f)
                verticalLineToRelative(482f)
                close()
                moveToRelative(-240f, 0f)
                verticalLineToRelative(-482f)
                verticalLineToRelative(482f)
                close()
                moveToRelative(240f, 0f)
                verticalLineToRelative(-482f)
                verticalLineToRelative(482f)
                close()
            }
        }.build()
        
        return _Transition_slide!!
    }

private var _Transition_slide: ImageVector? = null

