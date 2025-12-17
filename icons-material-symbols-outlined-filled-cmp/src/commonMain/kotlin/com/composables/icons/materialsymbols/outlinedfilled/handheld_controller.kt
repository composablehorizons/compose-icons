package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Handheld_controller: ImageVector
    get() {
        if (_Handheld_controller != null) return _Handheld_controller!!
        
        _Handheld_controller = ImageVector.Builder(
            name = "handheld_controller",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 720f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(-100f, 1f, -170f, -69.5f)
                reflectiveQuadTo(40f, 320f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(120f, 240f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(127f)
                quadToRelative(16f, 0f, 30.5f, 6f)
                reflectiveQuadToRelative(25.5f, 17f)
                lineToRelative(335f, 335f)
                quadToRelative(42f, 42f, 42f, 100f)
                reflectiveQuadToRelative(-42f, 100f)
                quadToRelative(-42f, 42f, -100f, 42f)
                reflectiveQuadToRelative(-100f, -42f)
                lineToRelative(-78f, -78f)
                horizontalLineTo(440f)
                close()
                moveToRelative(0f, -160f)
                horizontalLineToRelative(-81f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(440f, 640f)
                horizontalLineToRelative(80f)
                lineToRelative(-80f, -80f)
                close()
            }
        }.build()
        
        return _Handheld_controller!!
    }

private var _Handheld_controller: ImageVector? = null

