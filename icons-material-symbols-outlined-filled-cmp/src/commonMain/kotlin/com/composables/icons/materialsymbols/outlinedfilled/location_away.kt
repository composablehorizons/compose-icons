package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Location_away: ImageVector
    get() {
        if (_Location_away != null) return _Location_away!!
        
        _Location_away = ImageVector.Builder(
            name = "location_away",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 840f)
                verticalLineToRelative(-76f)
                quadToRelative(0f, -21f, 10.5f, -39.5f)
                reflectiveQuadTo(439f, 695f)
                quadToRelative(46f, -27f, 96.5f, -41f)
                reflectiveQuadTo(640f, 640f)
                quadToRelative(54f, 0f, 104.5f, 14f)
                reflectiveQuadToRelative(96.5f, 41f)
                quadToRelative(18f, 11f, 28.5f, 29.5f)
                reflectiveQuadTo(880f, 764f)
                verticalLineToRelative(76f)
                horizontalLineTo(400f)
                close()
                moveToRelative(-320f, 0f)
                verticalLineToRelative(-480f)
                lineToRelative(320f, -240f)
                lineToRelative(215f, 162f)
                quadToRelative(-75f, 9f, -125f, 65.5f)
                reflectiveQuadTo(440f, 480f)
                quadToRelative(0f, 31f, 8.5f, 58.5f)
                reflectiveQuadTo(473f, 590f)
                quadToRelative(-20f, 8f, -38.5f, 16.5f)
                reflectiveQuadTo(398f, 626f)
                quadToRelative(-36f, 21f, -57f, 58.5f)
                reflectiveQuadTo(320f, 764f)
                verticalLineToRelative(76f)
                horizontalLineTo(80f)
                close()
                moveToRelative(560f, -240f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
            }
        }.build()
        
        return _Location_away!!
    }

private var _Location_away: ImageVector? = null

