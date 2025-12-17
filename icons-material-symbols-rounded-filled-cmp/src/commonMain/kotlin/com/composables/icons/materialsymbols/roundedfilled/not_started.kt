package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Not_started: ImageVector
    get() {
        if (_Not_started != null) return _Not_started!!
        
        _Not_started = ImageVector.Builder(
            name = "not_started",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 640f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(400f, 600f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(360f, 320f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(320f, 360f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(360f, 640f)
                close()
                moveToRelative(167f, -31f)
                lineToRelative(156f, -104f)
                quadToRelative(14f, -9f, 14f, -25f)
                reflectiveQuadToRelative(-14f, -25f)
                lineTo(527f, 351f)
                quadToRelative(-15f, -10f, -31f, -1.5f)
                reflectiveQuadTo(480f, 376f)
                verticalLineToRelative(208f)
                quadToRelative(0f, 18f, 16f, 26.5f)
                reflectiveQuadToRelative(31f, -1.5f)
                close()
                moveTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Not_started!!
    }

private var _Not_started: ImageVector? = null

