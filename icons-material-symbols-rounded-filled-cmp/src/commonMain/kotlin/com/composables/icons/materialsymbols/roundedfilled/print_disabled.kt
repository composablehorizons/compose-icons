package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Print_disabled: ImageVector
    get() {
        if (_Print_disabled != null) return _Print_disabled!!
        
        _Print_disabled = ImageVector.Builder(
            name = "print_disabled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(763f, 876f)
                lineTo(640f, 754f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(6f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(640f, 840f)
                horizontalLineTo(320f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(240f, 760f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 600f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -51f, 35f, -85.5f)
                reflectiveQuadToRelative(85f, -34.5f)
                horizontalLineToRelative(6f)
                lineTo(83f, 197f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadTo(83f, 140f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(680f, 680f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(763f, 876f)
                close()
                moveTo(320f, 760f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-6f)
                lineTo(486f, 600f)
                horizontalLineTo(320f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(522f, -91f)
                quadToRelative(-16f, 9f, -34f, 8f)
                reflectiveQuadToRelative(-32f, -15f)
                lineTo(502f, 388f)
                quadToRelative(-19f, -19f, -8.5f, -43.5f)
                reflectiveQuadTo(531f, 320f)
                horizontalLineToRelative(229f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 25f, -11f, 42.5f)
                reflectiveQuadTo(842f, 669f)
                close()
                moveTo(427f, 280f)
                quadToRelative(-16f, 0f, -30.5f, -6f)
                reflectiveQuadTo(371f, 257f)
                lineToRelative(-69f, -69f)
                quadToRelative(-19f, -19f, -8.5f, -43.5f)
                reflectiveQuadTo(331f, 120f)
                horizontalLineToRelative(309f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(720f, 200f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(680f, 280f)
                horizontalLineTo(427f)
                close()
                moveToRelative(293f, 220f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(760f, 460f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(720f, 420f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(680f, 460f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(720f, 500f)
                close()
            }
        }.build()
        
        return _Print_disabled!!
    }

private var _Print_disabled: ImageVector? = null

