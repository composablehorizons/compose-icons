package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Swipe_vertical: ImageVector
    get() {
        if (_Swipe_vertical != null) return _Swipe_vertical!!
        
        _Swipe_vertical = ImageVector.Builder(
            name = "swipe_vertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(658f, 833f)
                quadToRelative(-23f, 8f, -46.5f, 7.5f)
                reflectiveQuadTo(566f, 829f)
                lineTo(304f, 707f)
                lineToRelative(18f, -40f)
                quadToRelative(10f, -20f, 28f, -32.5f)
                reflectiveQuadToRelative(40f, -14.5f)
                lineToRelative(68f, -5f)
                lineToRelative(-112f, -307f)
                quadToRelative(-6f, -16f, 1f, -30.5f)
                reflectiveQuadToRelative(23f, -20.5f)
                quadToRelative(16f, -6f, 30.5f, 1f)
                reflectiveQuadToRelative(20.5f, 23f)
                lineToRelative(96f, 263f)
                lineToRelative(38f, -14f)
                lineToRelative(-37f, -103f)
                quadToRelative(-6f, -16f, -1f, -35.5f)
                reflectiveQuadToRelative(21f, -25.5f)
                quadToRelative(16f, -6f, 30.5f, 1f)
                reflectiveQuadToRelative(20.5f, 23f)
                lineToRelative(41f, 113f)
                lineToRelative(37f, -14f)
                lineToRelative(-27f, -75f)
                quadToRelative(-6f, -16f, 1f, -30.5f)
                reflectiveQuadToRelative(23f, -20.5f)
                quadToRelative(16f, -6f, 30.5f, 1f)
                reflectiveQuadToRelative(20.5f, 23f)
                lineToRelative(27f, 75f)
                lineToRelative(38f, -14f)
                quadToRelative(-6f, -16f, 1f, -30.5f)
                reflectiveQuadToRelative(23f, -20.5f)
                quadToRelative(16f, -6f, 30.5f, 1f)
                reflectiveQuadToRelative(20.5f, 23f)
                lineToRelative(55f, 150f)
                quadToRelative(23f, 63f, -4.5f, 122.5f)
                reflectiveQuadTo(815f, 776f)
                lineToRelative(-157f, 57f)
                close()
                moveTo(80f, 880f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(81f)
                quadToRelative(-59f, -72f, -90f, -159f)
                reflectiveQuadTo(40f, 480f)
                quadToRelative(0f, -94f, 31f, -181f)
                reflectiveQuadToRelative(90f, -159f)
                horizontalLineTo(80f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-116f)
                quadToRelative(-58f, 66f, -89f, 147f)
                reflectiveQuadToRelative(-31f, 169f)
                quadToRelative(0f, 88f, 31f, 169f)
                reflectiveQuadToRelative(89f, 147f)
                verticalLineToRelative(-116f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(200f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Swipe_vertical!!
    }

private var _Swipe_vertical: ImageVector? = null

