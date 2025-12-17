package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Stroke_partial: ImageVector
    get() {
        if (_Stroke_partial != null) return _Stroke_partial!!
        
        _Stroke_partial = ImageVector.Builder(
            name = "stroke_partial",
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
                moveToRelative(278f, -240f)
                horizontalLineTo(372f)
                lineToRelative(-40f, 40f)
                horizontalLineToRelative(396f)
                quadToRelative(8f, -10f, 14.5f, -19.5f)
                reflectiveQuadTo(755f, 640f)
                close()
                moveToRelative(40f, -120f)
                horizontalLineTo(493f)
                lineToRelative(-40f, 40f)
                horizontalLineToRelative(334f)
                quadToRelative(2f, -10f, 4f, -19.5f)
                reflectiveQuadToRelative(4f, -20.5f)
                close()
                moveToRelative(-8f, -120f)
                horizontalLineTo(613f)
                lineToRelative(-40f, 40f)
                horizontalLineToRelative(222f)
                quadToRelative(-2f, -11f, -4f, -20.5f)
                reflectiveQuadToRelative(-4f, -19.5f)
                close()
                moveToRelative(-57f, -116f)
                lineToRelative(-36f, 36f)
                horizontalLineToRelative(61f)
                quadToRelative(-5f, -10f, -11.5f, -18.5f)
                reflectiveQuadTo(730f, 284f)
                close()
                moveTo(224f, 676f)
                lineToRelative(451f, -449f)
                quadToRelative(-41f, -32f, -91f, -49.5f)
                reflectiveQuadTo(477f, 160f)
                quadToRelative(-134f, 0f, -227f, 93f)
                reflectiveQuadToRelative(-93f, 227f)
                quadToRelative(0f, 56f, 17.5f, 105.5f)
                reflectiveQuadTo(224f, 676f)
                close()
                moveToRelative(253f, 124f)
                quadToRelative(43f, 0f, 82f, -10f)
                reflectiveQuadToRelative(74f, -30f)
                horizontalLineTo(321f)
                quadToRelative(35f, 20f, 74f, 30f)
                reflectiveQuadToRelative(82f, 10f)
                close()
            }
        }.build()
        
        return _Stroke_partial!!
    }

private var _Stroke_partial: ImageVector? = null

