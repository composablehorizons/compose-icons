package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Roundabout_left: ImageVector
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
                verticalLineToRelative(-244f)
                quadToRelative(0f, -29f, 19f, -51f)
                reflectiveQuadToRelative(48f, -27f)
                quadToRelative(58f, -10f, 95.5f, -54.5f)
                reflectiveQuadTo(800f, 360f)
                quadToRelative(0f, -66f, -47f, -113f)
                reflectiveQuadToRelative(-113f, -47f)
                quadToRelative(-59f, 0f, -103.5f, 37.5f)
                reflectiveQuadTo(482f, 333f)
                quadToRelative(-5f, 29f, -27f, 48f)
                reflectiveQuadToRelative(-51f, 19f)
                horizontalLineTo(233f)
                lineToRelative(64f, 64f)
                lineToRelative(-57f, 56f)
                lineTo(80f, 360f)
                lineToRelative(160f, -160f)
                lineToRelative(56f, 56f)
                lineToRelative(-63f, 64f)
                horizontalLineToRelative(170f)
                quadToRelative(14f, -88f, 81.5f, -144f)
                reflectiveQuadTo(640f, 120f)
                quadToRelative(100f, 0f, 170f, 70f)
                reflectiveQuadToRelative(70f, 170f)
                quadToRelative(0f, 88f, -56f, 155.5f)
                reflectiveQuadTo(680f, 597f)
                verticalLineToRelative(243f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Roundabout_left!!
    }

private var _Roundabout_left: ImageVector? = null

