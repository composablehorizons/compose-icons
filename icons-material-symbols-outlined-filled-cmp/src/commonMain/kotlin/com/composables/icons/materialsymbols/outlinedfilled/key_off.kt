package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Key_off: ImageVector
    get() {
        if (_Key_off != null) return _Key_off!!
        
        _Key_off = ImageVector.Builder(
            name = "key_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(790f, 903f)
                lineTo(488f, 601f)
                quadToRelative(-32f, 54f, -87f, 86.5f)
                reflectiveQuadTo(280f, 720f)
                quadToRelative(-100f, 0f, -170f, -70f)
                reflectiveQuadTo(40f, 480f)
                quadToRelative(0f, -66f, 32.5f, -121f)
                reflectiveQuadToRelative(86.5f, -87f)
                lineTo(57f, 170f)
                lineToRelative(57f, -56f)
                lineToRelative(732f, 733f)
                lineToRelative(-56f, 56f)
                close()
                moveToRelative(51f, -503f)
                lineToRelative(79f, 79f)
                lineToRelative(-160f, 160f)
                lineToRelative(-80f, -79f)
                lineToRelative(-3f, 4f)
                lineToRelative(-84f, -84f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(328f)
                close()
                moveTo(280f, 600f)
                quadToRelative(43f, 0f, 75f, -26.5f)
                reflectiveQuadToRelative(41f, -64.5f)
                lineToRelative(-22.5f, -22.5f)
                lineToRelative(-50f, -50f)
                lineToRelative(-50f, -50f)
                lineTo(251f, 364f)
                quadToRelative(-42f, 9f, -66.5f, 42.5f)
                reflectiveQuadTo(160f, 480f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                close()
            }
        }.build()
        
        return _Key_off!!
    }

private var _Key_off: ImageVector? = null

