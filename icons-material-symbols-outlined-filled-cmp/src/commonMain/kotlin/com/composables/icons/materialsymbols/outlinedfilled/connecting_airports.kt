package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Connecting_airports: ImageVector
    get() {
        if (_Connecting_airports != null) return _Connecting_airports!!
        
        _Connecting_airports = ImageVector.Builder(
            name = "connecting_airports",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(624f, 856f)
                lineTo(520f, 680f)
                horizontalLineTo(400f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(360f, 640f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(400f, 600f)
                horizontalLineToRelative(120f)
                lineToRelative(104f, -176f)
                horizontalLineToRelative(44f)
                lineToRelative(-52f, 176f)
                horizontalLineToRelative(114f)
                lineToRelative(30f, -40f)
                horizontalLineToRelative(40f)
                lineToRelative(-24f, 80f)
                lineToRelative(24f, 80f)
                horizontalLineToRelative(-40f)
                lineToRelative(-30f, -40f)
                horizontalLineTo(616f)
                lineToRelative(52f, 176f)
                horizontalLineToRelative(-44f)
                close()
                moveTo(292f, 536f)
                lineToRelative(52f, -176f)
                horizontalLineTo(230f)
                lineToRelative(-30f, 40f)
                horizontalLineToRelative(-40f)
                lineToRelative(24f, -80f)
                lineToRelative(-24f, -80f)
                horizontalLineToRelative(40f)
                lineToRelative(30f, 40f)
                horizontalLineToRelative(114f)
                lineToRelative(-52f, -176f)
                horizontalLineToRelative(44f)
                lineToRelative(104f, 176f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(600f, 320f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(560f, 360f)
                horizontalLineTo(440f)
                lineTo(336f, 536f)
                horizontalLineToRelative(-44f)
                close()
            }
        }.build()
        
        return _Connecting_airports!!
    }

private var _Connecting_airports: ImageVector? = null

