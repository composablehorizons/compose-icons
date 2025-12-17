package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Cached: ImageVector
    get() {
        if (_Cached != null) return _Cached!!
        
        _Cached = ImageVector.Builder(
            name = "cached",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(482f, 800f)
                quadToRelative(-134f, 0f, -228f, -93f)
                reflectiveQuadToRelative(-94f, -227f)
                verticalLineToRelative(-7f)
                lineToRelative(-64f, 64f)
                lineToRelative(-56f, -56f)
                lineToRelative(160f, -160f)
                lineToRelative(160f, 160f)
                lineToRelative(-56f, 56f)
                lineToRelative(-64f, -64f)
                verticalLineToRelative(7f)
                quadToRelative(0f, 100f, 70.5f, 170f)
                reflectiveQuadTo(482f, 720f)
                quadToRelative(26f, 0f, 51f, -6f)
                reflectiveQuadToRelative(49f, -18f)
                lineToRelative(60f, 60f)
                quadToRelative(-38f, 22f, -78f, 33f)
                reflectiveQuadToRelative(-82f, 11f)
                close()
                moveToRelative(278f, -161f)
                lineTo(600f, 479f)
                lineToRelative(56f, -56f)
                lineToRelative(64f, 64f)
                verticalLineToRelative(-7f)
                quadToRelative(0f, -100f, -70.5f, -170f)
                reflectiveQuadTo(478f, 240f)
                quadToRelative(-26f, 0f, -51f, 6f)
                reflectiveQuadToRelative(-49f, 18f)
                lineToRelative(-60f, -60f)
                quadToRelative(38f, -22f, 78f, -33f)
                reflectiveQuadToRelative(82f, -11f)
                quadToRelative(134f, 0f, 228f, 93f)
                reflectiveQuadToRelative(94f, 227f)
                verticalLineToRelative(7f)
                lineToRelative(64f, -64f)
                lineToRelative(56f, 56f)
                lineToRelative(-160f, 160f)
                close()
            }
        }.build()
        
        return _Cached!!
    }

private var _Cached: ImageVector? = null

