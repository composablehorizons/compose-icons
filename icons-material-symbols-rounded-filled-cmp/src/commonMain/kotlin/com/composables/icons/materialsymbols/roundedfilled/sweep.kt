package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Sweep: ImageVector
    get() {
        if (_Sweep != null) return _Sweep!!
        
        _Sweep = ImageVector.Builder(
            name = "sweep",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 720f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(400f, 680f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(440f, 640f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(640f, 680f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(600f, 720f)
                horizontalLineTo(440f)
                close()
                moveTo(242f, 606f)
                lineToRelative(338.86f, -339f)
                quadToRelative(12.03f, -12f, 28.07f, -12f)
                reflectiveQuadTo(637f, 267f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(637f, 324f)
                lineTo(270.13f, 692f)
                quadToRelative(-12.03f, 12f, -28.06f, 12f)
                quadToRelative(-16.04f, 0f, -28.07f, -12f)
                lineTo(42f, 520.25f)
                quadToRelative(-12f, -12.05f, -11.5f, -28.63f)
                quadTo(31f, 475.05f, 43f, 463f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(142f, 143f)
                close()
                moveToRelative(358f, -46f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(560f, 520f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(600f, 480f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 520f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 560f)
                horizontalLineTo(600f)
                close()
                moveToRelative(160f, -160f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(720f, 360f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(760f, 320f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(960f, 360f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(920f, 400f)
                horizontalLineTo(760f)
                close()
            }
        }.build()
        
        return _Sweep!!
    }

private var _Sweep: ImageVector? = null

