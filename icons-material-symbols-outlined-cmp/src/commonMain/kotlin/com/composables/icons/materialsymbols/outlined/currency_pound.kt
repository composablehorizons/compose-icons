package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Currency_pound: ImageVector
    get() {
        if (_Currency_pound != null) return _Currency_pound!!
        
        _Currency_pound = ImageVector.Builder(
            name = "currency_pound",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 840f)
                verticalLineToRelative(-80f)
                lineToRelative(16.5f, -10f)
                quadToRelative(16.5f, -10f, 36f, -29.5f)
                reflectiveQuadToRelative(35.5f, -50f)
                quadToRelative(16f, -30.5f, 16f, -70.5f)
                quadToRelative(0f, -11f, -1.5f, -21f)
                reflectiveQuadToRelative(-3.5f, -19f)
                horizontalLineToRelative(-99f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(60f)
                quadToRelative(-21f, -33f, -40.5f, -69.5f)
                reflectiveQuadTo(240f, 320f)
                quadToRelative(0f, -92f, 64f, -156f)
                reflectiveQuadToRelative(156f, -64f)
                quadToRelative(71f, 0f, 126f, 39f)
                reflectiveQuadToRelative(79f, 101f)
                lineToRelative(-74f, 31f)
                quadToRelative(-15f, -40f, -50.5f, -65.5f)
                reflectiveQuadTo(460f, 180f)
                quadToRelative(-58f, 0f, -99f, 41f)
                reflectiveQuadToRelative(-41f, 99f)
                quadToRelative(0f, 48f, 24f, 80f)
                reflectiveQuadToRelative(49f, 80f)
                horizontalLineToRelative(167f)
                verticalLineToRelative(80f)
                horizontalLineTo(421f)
                quadToRelative(2f, 9f, 2.5f, 19f)
                reflectiveQuadToRelative(0.5f, 21f)
                quadToRelative(0f, 50f, -17.5f, 90f)
                reflectiveQuadTo(364f, 760f)
                horizontalLineToRelative(196f)
                quadToRelative(40f, 0f, 61f, -21f)
                reflectiveQuadToRelative(29f, -54f)
                lineToRelative(70f, 35f)
                quadToRelative(-11f, 55f, -56.5f, 87.5f)
                reflectiveQuadTo(560f, 840f)
                horizontalLineTo(240f)
                close()
            }
        }.build()
        
        return _Currency_pound!!
    }

private var _Currency_pound: ImageVector? = null

