package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Location_home: ImageVector
    get() {
        if (_Location_home != null) return _Location_home!!
        
        _Location_home = ImageVector.Builder(
            name = "location_home",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 120f)
                lineToRelative(320f, 240f)
                verticalLineToRelative(480f)
                horizontalLineTo(160f)
                verticalLineToRelative(-480f)
                lineToRelative(320f, -240f)
                close()
                moveToRelative(0f, 480f)
                quadToRelative(50f, 0f, 85f, -35f)
                reflectiveQuadToRelative(35f, -85f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 440f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 480f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 520f)
                close()
                moveToRelative(0f, 200f)
                quadToRelative(-41f, 0f, -80f, 10f)
                reflectiveQuadToRelative(-74f, 30f)
                horizontalLineToRelative(308f)
                quadToRelative(-35f, -20f, -74f, -30f)
                reflectiveQuadToRelative(-80f, -10f)
                close()
                moveTo(240f, 400f)
                verticalLineToRelative(320f)
                quadToRelative(52f, -39f, 113f, -59.5f)
                reflectiveQuadTo(480f, 640f)
                quadToRelative(66f, 0f, 127f, 20.5f)
                reflectiveQuadTo(720f, 720f)
                verticalLineToRelative(-320f)
                lineTo(480f, 220f)
                lineTo(240f, 400f)
                close()
                moveToRelative(240f, 80f)
                close()
            }
        }.build()
        
        return _Location_home!!
    }

private var _Location_home: ImageVector? = null

