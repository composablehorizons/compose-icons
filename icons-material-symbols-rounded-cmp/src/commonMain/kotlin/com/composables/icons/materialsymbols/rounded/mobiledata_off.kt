package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Mobiledata_off: ImageVector
    get() {
        if (_Mobiledata_off != null) return _Mobiledata_off!!
        
        _Mobiledata_off = ImageVector.Builder(
            name = "mobiledata_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 686f)
                lineToRelative(34f, -34f)
                quadToRelative(12f, -12f, 28f, -11.5f)
                reflectiveQuadToRelative(28f, 11.5f)
                quadToRelative(12f, 12f, 12.5f, 28.5f)
                reflectiveQuadTo(491f, 709f)
                lineTo(388f, 812f)
                quadToRelative(-6f, 6f, -13f, 8.5f)
                reflectiveQuadToRelative(-15f, 2.5f)
                quadToRelative(-8f, 0f, -15f, -2.5f)
                reflectiveQuadToRelative(-13f, -8.5f)
                lineTo(229f, 709f)
                quadToRelative(-12f, -12f, -11.5f, -28.5f)
                reflectiveQuadTo(230f, 652f)
                quadToRelative(12f, -11f, 28f, -11.5f)
                reflectiveQuadToRelative(28f, 11.5f)
                lineToRelative(34f, 34f)
                verticalLineToRelative(-254f)
                lineTo(84f, 196f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(680f, 680f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineTo(400f, 512f)
                verticalLineToRelative(174f)
                close()
                moveToRelative(200f, -216f)
                quadToRelative(-17f, 0f, -28.5f, -12f)
                reflectiveQuadTo(560f, 429f)
                verticalLineToRelative(-157f)
                lineToRelative(-36f, 36f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(104f, -104f)
                quadToRelative(6f, -6f, 13f, -8.5f)
                reflectiveQuadToRelative(15f, -2.5f)
                quadToRelative(8f, 0f, 15f, 2.5f)
                reflectiveQuadToRelative(13f, 8.5f)
                lineToRelative(104f, 104f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineToRelative(-36f, -36f)
                verticalLineToRelative(158f)
                quadToRelative(0f, 18f, -12f, 29f)
                reflectiveQuadToRelative(-28f, 11f)
                close()
            }
        }.build()
        
        return _Mobiledata_off!!
    }

private var _Mobiledata_off: ImageVector? = null

