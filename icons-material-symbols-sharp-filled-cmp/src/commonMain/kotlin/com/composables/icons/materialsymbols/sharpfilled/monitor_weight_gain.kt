package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Monitor_weight_gain: ImageVector
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
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(414f)
                quadToRelative(-20f, -7f, -40f, -10.5f)
                reflectiveQuadToRelative(-40f, -3.5f)
                quadToRelative(-100f, 0f, -170f, 70f)
                reflectiveQuadToRelative(-70f, 170f)
                quadToRelative(0f, 20f, 3.5f, 40f)
                reflectiveQuadToRelative(10.5f, 40f)
                horizontalLineTo(120f)
                close()
                moveToRelative(280f, -460f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-40f)
                close()
                moveToRelative(60f, 0f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-40f)
                close()
                moveToRelative(60f, 0f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-40f)
                close()
            }
        }.build()
        
        return _Monitor_weight_gain!!
    }

private var _Monitor_weight_gain: ImageVector? = null

