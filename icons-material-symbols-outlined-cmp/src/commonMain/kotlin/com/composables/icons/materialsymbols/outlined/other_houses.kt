package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Other_houses: ImageVector
    get() {
        if (_Other_houses != null) return _Other_houses!!
        
        _Other_houses = ImageVector.Builder(
            name = "other_houses",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 840f)
                verticalLineToRelative(-375f)
                lineToRelative(-72f, 55f)
                lineToRelative(-48f, -64f)
                lineToRelative(440f, -336f)
                lineToRelative(440f, 336f)
                lineToRelative(-48f, 63f)
                lineToRelative(-72f, -54f)
                verticalLineToRelative(375f)
                horizontalLineTo(160f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-356f)
                lineTo(480f, 221f)
                lineTo(240f, 404f)
                verticalLineToRelative(356f)
                close()
                moveToRelative(0f, 0f)
                horizontalLineToRelative(480f)
                horizontalLineToRelative(-480f)
                close()
                moveToRelative(80f, -160f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(280f, 560f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(320f, 520f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(360f, 560f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(320f, 600f)
                close()
                moveToRelative(160f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 560f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 520f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 560f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 600f)
                close()
                moveToRelative(160f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(600f, 560f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(640f, 520f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(680f, 560f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(640f, 600f)
                close()
            }
        }.build()
        
        return _Other_houses!!
    }

private var _Other_houses: ImageVector? = null

