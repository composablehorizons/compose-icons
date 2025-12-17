package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Content_cut: ImageVector
    get() {
        if (_Content_cut != null) return _Content_cut!!
        
        _Content_cut = ImageVector.Builder(
            name = "content_cut",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(760f, 840f)
                lineTo(480f, 560f)
                lineToRelative(-94f, 94f)
                quadToRelative(8f, 15f, 11f, 32f)
                reflectiveQuadToRelative(3f, 34f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadTo(240f, 880f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadTo(80f, 720f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(17f, 0f, 34f, 3f)
                reflectiveQuadToRelative(32f, 11f)
                lineToRelative(94f, -94f)
                lineToRelative(-94f, -94f)
                quadToRelative(-15f, 8f, -32f, 11f)
                reflectiveQuadToRelative(-34f, 3f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadTo(80f, 240f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 17f, -3f, 34f)
                reflectiveQuadToRelative(-11f, 32f)
                lineToRelative(494f, 494f)
                verticalLineToRelative(40f)
                horizontalLineTo(760f)
                close()
                moveTo(600f, 440f)
                lineToRelative(-80f, -80f)
                lineToRelative(240f, -240f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(40f)
                lineTo(600f, 440f)
                close()
                moveTo(240f, 320f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(320f, 240f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(240f, 160f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(160f, 240f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(240f, 320f)
                close()
                moveToRelative(240f, 180f)
                quadToRelative(8f, 0f, 14f, -6f)
                reflectiveQuadToRelative(6f, -14f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                quadToRelative(0f, 8f, 6f, 14f)
                reflectiveQuadToRelative(14f, 6f)
                close()
                moveTo(240f, 800f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(320f, 720f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(240f, 640f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(160f, 720f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(240f, 800f)
                close()
            }
        }.build()
        
        return _Content_cut!!
    }

private var _Content_cut: ImageVector? = null

