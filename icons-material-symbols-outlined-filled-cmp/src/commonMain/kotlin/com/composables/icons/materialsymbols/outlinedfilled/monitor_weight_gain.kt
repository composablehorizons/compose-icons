package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Monitor_weight_gain: ImageVector
    get() {
        if (_Monitor_weight_gain != null) return _Monitor_weight_gain!!
        
        _Monitor_weight_gain = ImageVector.Builder(
            name = "monitor_weight_gain",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(720f, 920f)
                verticalLineToRelative(-120f)
                horizontalLineTo(600f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(800f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(480f, 480f)
                quadToRelative(50f, 0f, 85f, -35f)
                reflectiveQuadToRelative(35f, -85f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                close()
                moveToRelative(-60f, -100f)
                quadToRelative(-8f, 0f, -14f, -6f)
                reflectiveQuadToRelative(-6f, -14f)
                quadToRelative(0f, -8f, 6f, -14f)
                reflectiveQuadToRelative(14f, -6f)
                quadToRelative(8f, 0f, 14f, 6f)
                reflectiveQuadToRelative(6f, 14f)
                quadToRelative(0f, 8f, -6f, 14f)
                reflectiveQuadToRelative(-14f, 6f)
                close()
                moveToRelative(60f, 0f)
                quadToRelative(-8f, 0f, -14f, -6f)
                reflectiveQuadToRelative(-6f, -14f)
                quadToRelative(0f, -8f, 6f, -14f)
                reflectiveQuadToRelative(14f, -6f)
                quadToRelative(8f, 0f, 14f, 6f)
                reflectiveQuadToRelative(6f, 14f)
                quadToRelative(0f, 8f, -6f, 14f)
                reflectiveQuadToRelative(-14f, 6f)
                close()
                moveToRelative(60f, 0f)
                quadToRelative(-8f, 0f, -14f, -6f)
                reflectiveQuadToRelative(-6f, -14f)
                quadToRelative(0f, -8f, 6f, -14f)
                reflectiveQuadToRelative(14f, -6f)
                quadToRelative(8f, 0f, 14f, 6f)
                reflectiveQuadToRelative(6f, 14f)
                quadToRelative(0f, 8f, -6f, 14f)
                reflectiveQuadToRelative(-14f, 6f)
                close()
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(334f)
                quadToRelative(-20f, -7f, -40f, -10.5f)
                reflectiveQuadToRelative(-40f, -3.5f)
                quadToRelative(-100f, 0f, -170f, 70f)
                reflectiveQuadToRelative(-70f, 170f)
                quadToRelative(0f, 20f, 3.5f, 40f)
                reflectiveQuadToRelative(10.5f, 40f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _Monitor_weight_gain!!
    }

private var _Monitor_weight_gain: ImageVector? = null

