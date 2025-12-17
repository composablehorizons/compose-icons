package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Flashlight_on: ImageVector
    get() {
        if (_Flashlight_on != null) return _Flashlight_on!!
        
        _Flashlight_on = ImageVector.Builder(
            name = "flashlight_on",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 880f)
                verticalLineToRelative(-440f)
                lineToRelative(-80f, -120f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(240f)
                lineToRelative(-80f, 120f)
                verticalLineToRelative(440f)
                horizontalLineTo(320f)
                close()
                moveToRelative(160f, -260f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(420f, 560f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(480f, 500f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(540f, 560f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(480f, 620f)
                close()
                moveTo(320f, 200f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-40f)
                horizontalLineTo(320f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(320f, 80f)
                horizontalLineTo(320f)
                verticalLineToRelative(16f)
                lineToRelative(80f, 120f)
                verticalLineToRelative(384f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-384f)
                lineToRelative(80f, -120f)
                verticalLineToRelative(-16f)
                close()
                moveTo(480f, 480f)
                close()
            }
        }.build()
        
        return _Flashlight_on!!
    }

private var _Flashlight_on: ImageVector? = null

