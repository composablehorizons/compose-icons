package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Android: ImageVector
    get() {
        if (_Android != null) return _Android!!
        
        _Android = ImageVector.Builder(
            name = "android",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 720f)
                quadToRelative(9f, -107f, 65.5f, -197f)
                reflectiveQuadTo(256f, 380f)
                lineToRelative(-74f, -128f)
                quadToRelative(-6f, -9f, -3f, -19f)
                reflectiveQuadToRelative(13f, -15f)
                quadToRelative(8f, -5f, 18f, -2f)
                reflectiveQuadToRelative(16f, 12f)
                lineToRelative(74f, 128f)
                quadToRelative(86f, -36f, 180f, -36f)
                reflectiveQuadToRelative(180f, 36f)
                lineToRelative(74f, -128f)
                quadToRelative(6f, -9f, 16f, -12f)
                reflectiveQuadToRelative(18f, 2f)
                quadToRelative(10f, 5f, 13f, 15f)
                reflectiveQuadToRelative(-3f, 19f)
                lineToRelative(-74f, 128f)
                quadToRelative(94f, 53f, 150.5f, 143f)
                reflectiveQuadTo(920f, 720f)
                horizontalLineTo(40f)
                close()
                moveToRelative(240f, -110f)
                quadToRelative(21f, 0f, 35.5f, -14.5f)
                reflectiveQuadTo(330f, 560f)
                quadToRelative(0f, -21f, -14.5f, -35.5f)
                reflectiveQuadTo(280f, 510f)
                quadToRelative(-21f, 0f, -35.5f, 14.5f)
                reflectiveQuadTo(230f, 560f)
                quadToRelative(0f, 21f, 14.5f, 35.5f)
                reflectiveQuadTo(280f, 610f)
                close()
                moveToRelative(400f, 0f)
                quadToRelative(21f, 0f, 35.5f, -14.5f)
                reflectiveQuadTo(730f, 560f)
                quadToRelative(0f, -21f, -14.5f, -35.5f)
                reflectiveQuadTo(680f, 510f)
                quadToRelative(-21f, 0f, -35.5f, 14.5f)
                reflectiveQuadTo(630f, 560f)
                quadToRelative(0f, 21f, 14.5f, 35.5f)
                reflectiveQuadTo(680f, 610f)
                close()
            }
        }.build()
        
        return _Android!!
    }

private var _Android: ImageVector? = null

