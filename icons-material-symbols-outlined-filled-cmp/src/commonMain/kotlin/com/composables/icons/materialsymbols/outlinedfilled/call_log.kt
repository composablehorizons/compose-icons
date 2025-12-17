package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Call_log: ImageVector
    get() {
        if (_Call_log != null) return _Call_log!!
        
        _Call_log = ImageVector.Builder(
            name = "call_log",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(80f)
                horizontalLineTo(480f)
                close()
                moveToRelative(0f, 160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(80f)
                horizontalLineTo(480f)
                close()
                moveToRelative(0f, 160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(80f)
                horizontalLineTo(480f)
                close()
                moveTo(758f, 880f)
                quadToRelative(-125f, 0f, -247f, -54.5f)
                reflectiveQuadTo(289f, 671f)
                quadTo(189f, 571f, 134.5f, 449f)
                reflectiveQuadTo(80f, 202f)
                quadToRelative(0f, -18f, 12f, -30f)
                reflectiveQuadToRelative(30f, -12f)
                horizontalLineToRelative(162f)
                quadToRelative(14f, 0f, 25f, 9.5f)
                reflectiveQuadToRelative(13f, 22.5f)
                lineToRelative(26f, 140f)
                quadToRelative(2f, 16f, -1f, 27f)
                reflectiveQuadToRelative(-11f, 19f)
                lineToRelative(-97f, 98f)
                quadToRelative(20f, 37f, 47.5f, 71.5f)
                reflectiveQuadTo(347f, 614f)
                quadToRelative(31f, 31f, 65f, 57.5f)
                reflectiveQuadToRelative(72f, 48.5f)
                lineToRelative(94f, -94f)
                quadToRelative(9f, -9f, 23.5f, -13.5f)
                reflectiveQuadTo(630f, 610f)
                lineToRelative(138f, 28f)
                quadToRelative(14f, 4f, 23f, 14.5f)
                reflectiveQuadToRelative(9f, 23.5f)
                verticalLineToRelative(162f)
                quadToRelative(0f, 18f, -12f, 30f)
                reflectiveQuadToRelative(-30f, 12f)
                close()
            }
        }.build()
        
        return _Call_log!!
    }

private var _Call_log: ImageVector? = null

