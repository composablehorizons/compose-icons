package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Elevation: ImageVector
    get() {
        if (_Elevation != null) return _Elevation!!
        
        _Elevation = ImageVector.Builder(
            name = "elevation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(760f, 840f)
                horizontalLineTo(160f)
                quadToRelative(-25f, 0f, -35.5f, -21.5f)
                reflectiveQuadTo(128f, 777f)
                lineToRelative(188f, -264f)
                quadToRelative(11f, -16f, 28f, -24.5f)
                reflectiveQuadToRelative(37f, -8.5f)
                horizontalLineToRelative(161f)
                lineToRelative(228f, -266f)
                quadToRelative(18f, -21f, 44f, -11.5f)
                reflectiveQuadToRelative(26f, 37.5f)
                verticalLineToRelative(520f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                close()
                moveTo(300f, 400f)
                lineTo(176f, 575f)
                quadToRelative(-10f, 14f, -26f, 16.5f)
                reflectiveQuadToRelative(-30f, -7.5f)
                quadToRelative(-14f, -10f, -16.5f, -26f)
                reflectiveQuadToRelative(7.5f, -30f)
                lineToRelative(125f, -174f)
                quadToRelative(11f, -16f, 28f, -25f)
                reflectiveQuadToRelative(37f, -9f)
                horizontalLineToRelative(161f)
                lineToRelative(162f, -189f)
                quadToRelative(11f, -13f, 27f, -14f)
                reflectiveQuadToRelative(29f, 10f)
                quadToRelative(13f, 11f, 14f, 27f)
                reflectiveQuadToRelative(-10f, 29f)
                lineTo(522f, 372f)
                quadToRelative(-11f, 14f, -27f, 21f)
                reflectiveQuadToRelative(-33f, 7f)
                horizontalLineTo(300f)
                close()
                moveToRelative(-62f, 360f)
                horizontalLineToRelative(522f)
                verticalLineToRelative(-412f)
                lineTo(602f, 532f)
                quadToRelative(-11f, 14f, -27f, 21f)
                reflectiveQuadToRelative(-33f, 7f)
                horizontalLineTo(380f)
                lineTo(238f, 760f)
                close()
                moveToRelative(522f, 0f)
                close()
            }
        }.build()
        
        return _Elevation!!
    }

private var _Elevation: ImageVector? = null

