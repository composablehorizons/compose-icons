package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Solo_dining: ImageVector
    get() {
        if (_Solo_dining != null) return _Solo_dining!!
        
        _Solo_dining = ImageVector.Builder(
            name = "solo_dining",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(380f, 320f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveTo(40f, 880f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-295f)
                quadToRelative(0f, -35f, 28.5f, -65f)
                reflectiveQuadToRelative(82.5f, -50f)
                quadToRelative(32f, -13f, 73f, -21.5f)
                reflectiveQuadToRelative(76f, -8.5f)
                quadToRelative(34f, 0f, 76.5f, 9f)
                reflectiveQuadToRelative(77.5f, 23f)
                quadToRelative(51f, 20f, 78.5f, 49.5f)
                reflectiveQuadTo(640f, 505f)
                verticalLineToRelative(55f)
                horizontalLineTo(417f)
                lineToRelative(60f, 240f)
                horizontalLineToRelative(83f)
                lineToRelative(-40f, -160f)
                horizontalLineToRelative(400f)
                lineToRelative(-40f, 160f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(80f)
                horizontalLineTo(40f)
                close()
            }
        }.build()
        
        return _Solo_dining!!
    }

private var _Solo_dining: ImageVector? = null

