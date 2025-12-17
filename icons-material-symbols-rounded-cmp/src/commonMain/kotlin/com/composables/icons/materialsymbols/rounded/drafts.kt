package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Drafts: ImageVector
    get() {
        if (_Drafts != null) return _Drafts!!
        
        _Drafts = ImageVector.Builder(
            name = "drafts",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(521f, 64f)
                lineToRelative(321f, 192f)
                quadToRelative(18f, 11f, 28f, 30f)
                reflectiveQuadToRelative(10f, 40f)
                verticalLineToRelative(434f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 840f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 760f)
                verticalLineToRelative(-434f)
                quadToRelative(0f, -21f, 10f, -40f)
                reflectiveQuadToRelative(28f, -30f)
                lineToRelative(321f, -192f)
                quadToRelative(19f, -11f, 41f, -11f)
                reflectiveQuadToRelative(41f, 11f)
                close()
                moveToRelative(-41f, 442f)
                lineToRelative(312f, -186f)
                lineToRelative(-312f, -186f)
                lineToRelative(-312f, 186f)
                lineToRelative(312f, 186f)
                close()
                moveToRelative(-41f, 69f)
                lineTo(160f, 408f)
                verticalLineToRelative(352f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-352f)
                lineTo(521f, 575f)
                quadToRelative(-19f, 11f, -41f, 11f)
                reflectiveQuadToRelative(-41f, -11f)
                close()
                moveToRelative(82f, 185f)
                horizontalLineToRelative(279f)
                horizontalLineToRelative(-640f)
                horizontalLineToRelative(361f)
                close()
            }
        }.build()
        
        return _Drafts!!
    }

private var _Drafts: ImageVector? = null

