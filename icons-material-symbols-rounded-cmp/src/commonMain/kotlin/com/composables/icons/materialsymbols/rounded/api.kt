package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Api: ImageVector
    get() {
        if (_Api != null) return _Api!!
        
        _Api = ImageVector.Builder(
            name = "api",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 560f)
                lineToRelative(-80f, -80f)
                lineToRelative(80f, -80f)
                lineToRelative(80f, 80f)
                lineToRelative(-80f, 80f)
                close()
                moveToRelative(-85f, -235f)
                lineTo(295f, 225f)
                lineToRelative(128f, -128f)
                quadToRelative(12f, -12f, 27f, -18f)
                reflectiveQuadToRelative(30f, -6f)
                quadToRelative(15f, 0f, 30f, 6f)
                reflectiveQuadToRelative(27f, 18f)
                lineToRelative(128f, 128f)
                lineToRelative(-100f, 100f)
                lineToRelative(-85f, -85f)
                lineToRelative(-85f, 85f)
                close()
                moveTo(225f, 665f)
                lineTo(97f, 537f)
                quadToRelative(-12f, -12f, -18f, -27f)
                reflectiveQuadToRelative(-6f, -30f)
                quadToRelative(0f, -15f, 6f, -30f)
                reflectiveQuadToRelative(18f, -27f)
                lineToRelative(128f, -128f)
                lineToRelative(100f, 100f)
                lineToRelative(-85f, 85f)
                lineToRelative(85f, 85f)
                lineToRelative(-100f, 100f)
                close()
                moveToRelative(510f, 0f)
                lineTo(635f, 565f)
                lineToRelative(85f, -85f)
                lineToRelative(-85f, -85f)
                lineToRelative(100f, -100f)
                lineToRelative(128f, 128f)
                quadToRelative(12f, 12f, 18f, 27f)
                reflectiveQuadToRelative(6f, 30f)
                quadToRelative(0f, 15f, -6f, 30f)
                reflectiveQuadToRelative(-18f, 27f)
                lineTo(735f, 665f)
                close()
                moveTo(423f, 863f)
                lineTo(295f, 735f)
                lineToRelative(100f, -100f)
                lineToRelative(85f, 85f)
                lineToRelative(85f, -85f)
                lineToRelative(100f, 100f)
                lineTo(537f, 863f)
                quadToRelative(-12f, 12f, -27f, 18f)
                reflectiveQuadToRelative(-30f, 6f)
                quadToRelative(-15f, 0f, -30f, -6f)
                reflectiveQuadToRelative(-27f, -18f)
                close()
            }
        }.build()
        
        return _Api!!
    }

private var _Api: ImageVector? = null

