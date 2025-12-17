package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Draft_orders: ImageVector
    get() {
        if (_Draft_orders != null) return _Draft_orders!!
        
        _Draft_orders = ImageVector.Builder(
            name = "draft_orders",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(134f, 0f, 227f, -93f)
                reflectiveQuadToRelative(93f, -227f)
                quadToRelative(0f, -134f, -93f, -227f)
                reflectiveQuadToRelative(-227f, -93f)
                quadToRelative(-134f, 0f, -227f, 93f)
                reflectiveQuadToRelative(-93f, 227f)
                quadToRelative(0f, 134f, 93f, 227f)
                reflectiveQuadToRelative(227f, 93f)
                close()
                moveTo(320f, 600f)
                verticalLineToRelative(-66f)
                quadToRelative(0f, -8f, 3f, -15.5f)
                reflectiveQuadToRelative(9f, -13.5f)
                lineToRelative(209f, -208f)
                quadToRelative(9f, -9f, 20f, -13f)
                reflectiveQuadToRelative(22f, -4f)
                quadToRelative(12f, 0f, 23f, 4.5f)
                reflectiveQuadToRelative(20f, 13.5f)
                lineToRelative(37f, 37f)
                quadToRelative(8f, 9f, 12.5f, 20f)
                reflectiveQuadToRelative(4.5f, 22f)
                quadToRelative(0f, 11f, -4f, 22.5f)
                reflectiveQuadTo(663f, 420f)
                lineTo(455f, 628f)
                quadToRelative(-6f, 6f, -13.5f, 9f)
                reflectiveQuadToRelative(-15.5f, 3f)
                horizontalLineToRelative(-66f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(320f, 600f)
                close()
                moveToRelative(263f, -184f)
                lineToRelative(37f, -39f)
                lineToRelative(-37f, -37f)
                lineToRelative(-38f, 38f)
                lineToRelative(38f, 38f)
                close()
            }
        }.build()
        
        return _Draft_orders!!
    }

private var _Draft_orders: ImageVector? = null

