package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Print_disabled: ImageVector
    get() {
        if (_Print_disabled != null) return _Print_disabled!!
        
        _Print_disabled = ImageVector.Builder(
            name = "print_disabled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(763f, 876f)
                lineTo(640f, 754f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(6f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(640f, 840f)
                horizontalLineTo(320f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(240f, 760f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 600f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -51f, 35f, -85.5f)
                reflectiveQuadToRelative(85f, -34.5f)
                horizontalLineToRelative(6f)
                lineTo(83f, 197f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadTo(83f, 140f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(680f, 680f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(763f, 876f)
                close()
                moveTo(320f, 760f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-6f)
                lineTo(486f, 600f)
                horizontalLineTo(320f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(560f, -160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 680f)
                horizontalLineToRelative(-6f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(754f, 640f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(794f, 600f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(760f, 400f)
                horizontalLineTo(517f)
                quadToRelative(-20f, 0f, -30f, -12.5f)
                reflectiveQuadTo(477f, 360f)
                quadToRelative(0f, -15f, 10f, -27.5f)
                reflectiveQuadToRelative(30f, -12.5f)
                horizontalLineToRelative(243f)
                quadToRelative(51f, 0f, 85.5f, 34.5f)
                reflectiveQuadTo(880f, 440f)
                verticalLineToRelative(160f)
                close()
                moveTo(160f, 440f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(320f, 520f)
                horizontalLineToRelative(86f)
                lineTo(286f, 400f)
                horizontalLineToRelative(-86f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(160f, 440f)
                close()
                moveToRelative(480f, -120f)
                verticalLineToRelative(-120f)
                horizontalLineTo(317f)
                quadToRelative(-20f, 0f, -30f, -12.5f)
                reflectiveQuadTo(277f, 160f)
                quadToRelative(0f, -15f, 10f, -27.5f)
                reflectiveQuadToRelative(30f, -12.5f)
                horizontalLineToRelative(323f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(720f, 200f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(80f, 180f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(760f, 460f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(720f, 420f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(680f, 460f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(720f, 500f)
                close()
                moveToRelative(40f, -100f)
                horizontalLineToRelative(40f)
                horizontalLineToRelative(-283f)
                horizontalLineToRelative(243f)
                close()
                moveToRelative(-600f, 0f)
                horizontalLineToRelative(126f)
                horizontalLineToRelative(-126f)
                close()
            }
        }.build()
        
        return _Print_disabled!!
    }

private var _Print_disabled: ImageVector? = null

