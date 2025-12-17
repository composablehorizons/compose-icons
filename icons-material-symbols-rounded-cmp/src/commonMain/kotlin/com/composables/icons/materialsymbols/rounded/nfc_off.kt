package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Nfc_off: ImageVector
    get() {
        if (_Nfc_off != null) return _Nfc_off!!
        
        _Nfc_off = ImageVector.Builder(
            name = "nfc_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-527f)
                lineToRelative(-65f, -65f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadTo(55f, 111f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(736f, 736f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(791f, 903f)
                lineToRelative(-64f, -63f)
                horizontalLineTo(200f)
                close()
                moveToRelative(0f, -527f)
                verticalLineToRelative(447f)
                horizontalLineToRelative(447f)
                lineToRelative(-80f, -80f)
                horizontalLineTo(320f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(280f, 640f)
                verticalLineToRelative(-247f)
                lineToRelative(-80f, -80f)
                close()
                moveToRelative(160f, 287f)
                horizontalLineToRelative(127f)
                lineTo(360f, 473f)
                verticalLineToRelative(127f)
                close()
                moveToRelative(320f, -280f)
                verticalLineToRelative(166f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(640f, 526f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(600f, 486f)
                verticalLineToRelative(-126f)
                horizontalLineTo(455f)
                quadToRelative(-5f, 0f, -7.5f, -2.5f)
                reflectiveQuadTo(445f, 350f)
                verticalLineToRelative(-30f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(485f, 280f)
                horizontalLineToRelative(155f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(680f, 320f)
                close()
                moveToRelative(160f, -120f)
                verticalLineToRelative(446f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 686f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(760f, 646f)
                verticalLineToRelative(-446f)
                horizontalLineTo(314f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(274f, 160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(314f, 120f)
                horizontalLineToRelative(446f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                close()
                moveTo(424f, 536f)
                close()
                moveToRelative(113f, -113f)
                close()
            }
        }.build()
        
        return _Nfc_off!!
    }

private var _Nfc_off: ImageVector? = null

