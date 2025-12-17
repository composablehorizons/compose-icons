package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Nest_detect: ImageVector
    get() {
        if (_Nest_detect != null) return _Nest_detect!!
        
        _Nest_detect = ImageVector.Builder(
            name = "nest_detect",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(380f, 880f)
                quadToRelative(-58f, 0f, -99f, -41f)
                reflectiveQuadToRelative(-41f, -99f)
                verticalLineToRelative(-580f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(320f, 80f)
                horizontalLineToRelative(120f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(520f, 160f)
                verticalLineToRelative(580f)
                quadToRelative(0f, 58f, -41f, 99f)
                reflectiveQuadToRelative(-99f, 41f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(440f, 740f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(380f, 680f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(320f, 740f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(380f, 800f)
                close()
                moveToRelative(300f, -80f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(600f, 640f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(680f, 240f)
                horizontalLineToRelative(40f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 320f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 720f)
                horizontalLineToRelative(-40f)
                close()
            }
        }.build()
        
        return _Nest_detect!!
    }

private var _Nest_detect: ImageVector? = null

