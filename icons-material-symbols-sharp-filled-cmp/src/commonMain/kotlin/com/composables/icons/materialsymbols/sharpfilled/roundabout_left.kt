package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Roundabout_left: ImageVector
    get() {
        if (_Roundabout_left != null) return _Roundabout_left!!
        
        _Roundabout_left = ImageVector.Builder(
            name = "roundabout_left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(600f, 840f)
                verticalLineToRelative(-322f)
                horizontalLineToRelative(40f)
                quadToRelative(66f, 0f, 113f, -46f)
                reflectiveQuadToRelative(47f, -112f)
                quadToRelative(0f, -66f, -47f, -113f)
                reflectiveQuadToRelative(-113f, -47f)
                quadToRelative(-66f, 0f, -112f, 47f)
                reflectiveQuadToRelative(-46f, 113f)
                verticalLineToRelative(40f)
                horizontalLineTo(233f)
                lineToRelative(64f, 64f)
                lineToRelative(-57f, 56f)
                lineTo(80f, 360f)
                lineToRelative(160f, -160f)
                lineToRelative(56f, 56f)
                lineToRelative(-63f, 64f)
                horizontalLineToRelative(173f)
                quadToRelative(14f, -85f, 79.5f, -142.5f)
                reflectiveQuadTo(640f, 120f)
                quadToRelative(100f, 0f, 170f, 70f)
                reflectiveQuadToRelative(70f, 170f)
                quadToRelative(0f, 89f, -57.5f, 154.5f)
                reflectiveQuadTo(680f, 594f)
                verticalLineToRelative(246f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Roundabout_left!!
    }

private var _Roundabout_left: ImageVector? = null

