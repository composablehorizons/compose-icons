package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Lightbulb: ImageVector
    get() {
        if (_Lightbulb != null) return _Lightbulb!!
        
        _Lightbulb = ImageVector.Builder(
            name = "lightbulb",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 800f)
                horizontalLineToRelative(160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveTo(320f, 760f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(80f)
                horizontalLineTo(320f)
                close()
                moveToRelative(10f, -120f)
                quadToRelative(-69f, -41f, -109.5f, -110f)
                reflectiveQuadTo(180f, 380f)
                quadToRelative(0f, -125f, 87.5f, -212.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(125f, 0f, 212.5f, 87.5f)
                reflectiveQuadTo(780f, 380f)
                quadToRelative(0f, 81f, -40.5f, 150f)
                reflectiveQuadTo(630f, 640f)
                horizontalLineTo(330f)
                close()
                moveToRelative(24f, -80f)
                horizontalLineToRelative(252f)
                quadToRelative(45f, -32f, 69.5f, -79f)
                reflectiveQuadTo(700f, 380f)
                quadToRelative(0f, -92f, -64f, -156f)
                reflectiveQuadToRelative(-156f, -64f)
                quadToRelative(-92f, 0f, -156f, 64f)
                reflectiveQuadToRelative(-64f, 156f)
                quadToRelative(0f, 54f, 24.5f, 101f)
                reflectiveQuadToRelative(69.5f, 79f)
                close()
                moveToRelative(126f, 0f)
                close()
            }
        }.build()
        
        return _Lightbulb!!
    }

private var _Lightbulb: ImageVector? = null

