package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Mobile_hand_off: ImageVector
    get() {
        if (_Mobile_hand_off != null) return _Mobile_hand_off!!
        
        _Mobile_hand_off = ImageVector.Builder(
            name = "mobile_hand_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 800f)
                verticalLineToRelative(-528f)
                lineTo(28f, 140f)
                lineToRelative(56f, -56f)
                lineTo(876f, 876f)
                lineToRelative(-57f, 56f)
                lineToRelative(-398f, -398f)
                quadToRelative(-17f, 4f, -33f, 12f)
                reflectiveQuadToRelative(-30f, 22f)
                lineToRelative(-66f, 67f)
                lineTo(496f, 880f)
                horizontalLineTo(240f)
                close()
                moveToRelative(320f, -432f)
                lineTo(202f, 90f)
                quadToRelative(8f, -5f, 17.5f, -7.5f)
                reflectiveQuadTo(240f, 80f)
                horizontalLineToRelative(360f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(680f, 160f)
                verticalLineToRelative(80f)
                horizontalLineTo(560f)
                verticalLineToRelative(208f)
                close()
                moveTo(420f, 280f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(460f, 240f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(420f, 200f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(380f, 240f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(420f, 280f)
                close()
                moveToRelative(380f, 408f)
                lineTo(640f, 528f)
                verticalLineToRelative(-208f)
                horizontalLineToRelative(40f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                verticalLineToRelative(248f)
                close()
                moveTo(638f, 880f)
                quadToRelative(-18f, 0f, -34.5f, -7.5f)
                reflectiveQuadTo(576f, 851f)
                lineTo(400f, 640f)
                lineToRelative(15f, -15f)
                quadToRelative(11f, -11f, 27.5f, -13.5f)
                reflectiveQuadTo(474f, 617f)
                lineToRelative(286f, 143f)
                lineToRelative(35f, 35f)
                quadToRelative(-11f, 37f, -42.5f, 61f)
                reflectiveQuadTo(680f, 880f)
                horizontalLineToRelative(-42f)
                close()
            }
        }.build()
        
        return _Mobile_hand_off!!
    }

private var _Mobile_hand_off: ImageVector? = null

