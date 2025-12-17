package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Screenshot: ImageVector
    get() {
        if (_Screenshot != null) return _Screenshot!!
        
        _Screenshot = ImageVector.Builder(
            name = "screenshot",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(580f, 620f)
                verticalLineToRelative(-70f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(610f, 520f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(640f, 550f)
                verticalLineToRelative(90f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(600f, 680f)
                horizontalLineToRelative(-90f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(480f, 650f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(510f, 620f)
                horizontalLineToRelative(70f)
                close()
                moveTo(380f, 340f)
                verticalLineToRelative(70f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(350f, 440f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(320f, 410f)
                verticalLineToRelative(-90f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(360f, 280f)
                horizontalLineToRelative(90f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(480f, 310f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(450f, 340f)
                horizontalLineToRelative(-70f)
                close()
                moveTo(280f, 920f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 840f)
                verticalLineToRelative(-720f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(280f, 40f)
                horizontalLineToRelative(400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 120f)
                verticalLineToRelative(720f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(680f, 920f)
                horizontalLineTo(280f)
                close()
                moveToRelative(0f, -120f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-40f)
                horizontalLineTo(280f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-480f)
                horizontalLineTo(280f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(0f, -560f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-40f)
                horizontalLineTo(280f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-40f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(0f, 640f)
                verticalLineToRelative(40f)
                verticalLineToRelative(-40f)
                close()
            }
        }.build()
        
        return _Screenshot!!
    }

private var _Screenshot: ImageVector? = null

