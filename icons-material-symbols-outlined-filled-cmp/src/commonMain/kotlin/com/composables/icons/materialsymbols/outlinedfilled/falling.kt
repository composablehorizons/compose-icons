package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Falling: ImageVector
    get() {
        if (_Falling != null) return _Falling!!
        
        _Falling = ImageVector.Builder(
            name = "falling",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(540f, 900f)
                lineToRelative(-80f, -16f)
                lineToRelative(32f, -172f)
                lineToRelative(-144f, -108f)
                lineToRelative(-52f, -228f)
                lineToRelative(-88f, 76f)
                lineToRelative(32f, 152f)
                lineToRelative(-80f, 16f)
                lineToRelative(-40f, -196f)
                lineToRelative(178f, -159f)
                quadToRelative(23f, -20f, 54.5f, -16.5f)
                reflectiveQuadTo(413f, 264f)
                quadToRelative(32f, 14f, 66.5f, 20f)
                reflectiveQuadToRelative(69.5f, 1f)
                quadToRelative(35f, -5f, 64.5f, -23f)
                reflectiveQuadToRelative(56.5f, -40f)
                lineToRelative(50f, 62f)
                quadToRelative(-30f, 23f, -62f, 43f)
                reflectiveQuadToRelative(-69f, 31f)
                quadToRelative(-33f, 9f, -66.5f, 9.5f)
                reflectiveQuadTo(456f, 360f)
                lineToRelative(28f, 124f)
                lineToRelative(148f, -28f)
                lineToRelative(208f, 148f)
                lineToRelative(-48f, 64f)
                lineToRelative(-172f, -120f)
                lineToRelative(-144f, 28f)
                lineToRelative(108f, 80f)
                lineToRelative(-44f, 244f)
                close()
                moveTo(320f, 220f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(240f, 140f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(320f, 60f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(400f, 140f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(320f, 220f)
                close()
            }
        }.build()
        
        return _Falling!!
    }

private var _Falling: ImageVector? = null

