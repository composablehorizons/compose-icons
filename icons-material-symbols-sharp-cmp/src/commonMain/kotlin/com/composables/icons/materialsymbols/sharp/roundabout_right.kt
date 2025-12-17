package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Roundabout_right: ImageVector
    get() {
        if (_Roundabout_right != null) return _Roundabout_right!!
        
        _Roundabout_right = ImageVector.Builder(
            name = "roundabout_right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 840f)
                verticalLineToRelative(-246f)
                quadToRelative(-85f, -14f, -142.5f, -79.5f)
                reflectiveQuadTo(80f, 360f)
                quadToRelative(0f, -100f, 70f, -170f)
                reflectiveQuadToRelative(170f, -70f)
                quadToRelative(89f, 0f, 154.5f, 57.5f)
                reflectiveQuadTo(554f, 320f)
                horizontalLineToRelative(173f)
                lineToRelative(-63f, -64f)
                lineToRelative(56f, -56f)
                lineToRelative(160f, 160f)
                lineToRelative(-160f, 160f)
                lineToRelative(-57f, -56f)
                lineToRelative(64f, -64f)
                horizontalLineTo(478f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -66f, -46f, -113f)
                reflectiveQuadToRelative(-112f, -47f)
                quadToRelative(-66f, 0f, -113f, 47f)
                reflectiveQuadToRelative(-47f, 113f)
                quadToRelative(0f, 66f, 47f, 112f)
                reflectiveQuadToRelative(113f, 46f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(322f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Roundabout_right!!
    }

private var _Roundabout_right: ImageVector? = null

