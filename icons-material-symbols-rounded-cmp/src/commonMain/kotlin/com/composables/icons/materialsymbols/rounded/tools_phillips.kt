package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Tools_phillips: ImageVector
    get() {
        if (_Tools_phillips != null) return _Tools_phillips!!
        
        _Tools_phillips = ImageVector.Builder(
            name = "tools_phillips",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(280f, 800f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(320f, 760f)
                horizontalLineToRelative(320f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(680f, 800f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(640f, 840f)
                horizontalLineTo(320f)
                close()
                moveToRelative(0f, -120f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(280f, 680f)
                verticalLineToRelative(-333f)
                quadToRelative(0f, -13f, 4f, -25f)
                reflectiveQuadToRelative(12f, -23f)
                lineToRelative(122f, -163f)
                quadToRelative(6f, -8f, 14f, -12f)
                reflectiveQuadToRelative(18f, -4f)
                horizontalLineToRelative(60f)
                quadToRelative(10f, 0f, 18f, 4f)
                reflectiveQuadToRelative(14f, 12f)
                lineToRelative(122f, 163f)
                quadToRelative(8f, 11f, 12f, 23f)
                reflectiveQuadToRelative(4f, 25f)
                verticalLineToRelative(333f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(640f, 720f)
                horizontalLineTo(320f)
                close()
                moveToRelative(40f, -80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-87f)
                lineTo(480f, 433f)
                lineTo(360f, 553f)
                verticalLineToRelative(87f)
                close()
                moveToRelative(0f, -200f)
                lineToRelative(80f, -80f)
                verticalLineToRelative(-120f)
                lineToRelative(-80f, 107f)
                verticalLineToRelative(93f)
                close()
                moveToRelative(240f, 0f)
                verticalLineToRelative(-93f)
                lineToRelative(-80f, -107f)
                verticalLineToRelative(120f)
                lineToRelative(80f, 80f)
                close()
                moveToRelative(0f, 200f)
                horizontalLineTo(360f)
                horizontalLineToRelative(240f)
                close()
            }
        }.build()
        
        return _Tools_phillips!!
    }

private var _Tools_phillips: ImageVector? = null

