package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Roundabout_right: ImageVector
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
                verticalLineToRelative(-243f)
                quadToRelative(-88f, -14f, -144f, -81.5f)
                reflectiveQuadTo(80f, 360f)
                quadToRelative(0f, -100f, 70f, -170f)
                reflectiveQuadToRelative(170f, -70f)
                quadToRelative(88f, 0f, 155.5f, 56f)
                reflectiveQuadTo(557f, 320f)
                horizontalLineToRelative(170f)
                lineToRelative(-63f, -64f)
                lineToRelative(56f, -56f)
                lineToRelative(160f, 160f)
                lineToRelative(-160f, 160f)
                lineToRelative(-57f, -56f)
                lineToRelative(64f, -64f)
                horizontalLineTo(556f)
                quadToRelative(-29f, 0f, -51f, -19f)
                reflectiveQuadToRelative(-27f, -48f)
                quadToRelative(-10f, -58f, -54.5f, -95.5f)
                reflectiveQuadTo(320f, 200f)
                quadToRelative(-66f, 0f, -113f, 47f)
                reflectiveQuadToRelative(-47f, 113f)
                quadToRelative(0f, 59f, 37.5f, 103.5f)
                reflectiveQuadTo(293f, 518f)
                quadToRelative(29f, 5f, 48f, 27f)
                reflectiveQuadToRelative(19f, 51f)
                verticalLineToRelative(244f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Roundabout_right!!
    }

private var _Roundabout_right: ImageVector? = null

