package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Stroke_full: ImageVector
    get() {
        if (_Stroke_full != null) return _Stroke_full!!
        
        _Stroke_full = ImageVector.Builder(
            name = "stroke_full",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(477f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(194f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(77f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(194f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(477f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(760f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(877f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(760f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(477f, 880f)
                close()
                moveToRelative(91f, -93f)
                quadToRelative(78f, -23f, 135.5f, -80.5f)
                reflectiveQuadTo(784f, 571f)
                lineTo(568f, 787f)
                close()
                moveTo(171f, 386f)
                lineToRelative(212f, -212f)
                quadToRelative(-77f, 23f, -133f, 79f)
                reflectiveQuadToRelative(-79f, 133f)
                close()
                moveToRelative(-4f, 176f)
                lineToRelative(392f, -391f)
                quadToRelative(-12f, -3f, -24f, -5f)
                reflectiveQuadToRelative(-25f, -4f)
                lineTo(159f, 513f)
                quadToRelative(2f, 13f, 3.5f, 25f)
                reflectiveQuadToRelative(4.5f, 24f)
                close()
                moveToRelative(57f, 114f)
                lineToRelative(449f, -450f)
                quadToRelative(-8f, -6f, -16.5f, -12f)
                reflectiveQuadTo(639f, 203f)
                lineTo(200f, 642f)
                quadToRelative(5f, 9f, 11f, 17.5f)
                reflectiveQuadToRelative(13f, 16.5f)
                close()
                moveToRelative(91f, 81f)
                lineToRelative(438f, -439f)
                quadToRelative(-5f, -9f, -11f, -17.5f)
                reflectiveQuadTo(730f, 284f)
                lineTo(281f, 734f)
                quadToRelative(8f, 6f, 16.5f, 12f)
                reflectiveQuadToRelative(17.5f, 11f)
                close()
                moveToRelative(129f, 41f)
                lineToRelative(351f, -351f)
                quadToRelative(-2f, -13f, -4f, -25f)
                reflectiveQuadToRelative(-5f, -24f)
                lineTo(395f, 789f)
                quadToRelative(12f, 3f, 24f, 5f)
                reflectiveQuadToRelative(25f, 4f)
                close()
            }
        }.build()
        
        return _Stroke_full!!
    }

private var _Stroke_full: ImageVector? = null

