package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.No_luggage: ImageVector
    get() {
        if (_No_luggage != null) return _No_luggage!!
        
        _No_luggage = ImageVector.Builder(
            name = "no_luggage",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(760f, 645f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-245f)
                horizontalLineTo(435f)
                lineToRelative(-75f, -75f)
                verticalLineToRelative(-85f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(440f, 80f)
                horizontalLineToRelative(80f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(600f, 160f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 320f)
                verticalLineToRelative(325f)
                close()
                moveTo(600f, 360f)
                verticalLineToRelative(125f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-45f)
                horizontalLineToRelative(80f)
                close()
                moveTo(440f, 240f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveTo(320f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(280f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 760f)
                verticalLineToRelative(-440f)
                quadToRelative(0f, -24f, 12.5f, -44.5f)
                reflectiveQuadTo(248f, 247f)
                lineToRelative(73f, 73f)
                horizontalLineToRelative(-41f)
                verticalLineToRelative(440f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-80f)
                lineToRelative(80f, 80f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(680f, 840f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(640f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(600f, 840f)
                horizontalLineTo(360f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(320f, 880f)
                close()
                moveToRelative(40f, -160f)
                verticalLineToRelative(-304f)
                lineToRelative(80f, 80f)
                verticalLineToRelative(224f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(160f, -144f)
                lineToRelative(80f, 80f)
                verticalLineToRelative(64f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-144f)
                close()
                moveTo(819f, 932f)
                lineTo(27f, 140f)
                lineToRelative(57f, -57f)
                lineTo(876f, 875f)
                lineToRelative(-57f, 57f)
                close()
                moveTo(558f, 442f)
                close()
                moveToRelative(-94f, 134f)
                close()
            }
        }.build()
        
        return _No_luggage!!
    }

private var _No_luggage: ImageVector? = null

