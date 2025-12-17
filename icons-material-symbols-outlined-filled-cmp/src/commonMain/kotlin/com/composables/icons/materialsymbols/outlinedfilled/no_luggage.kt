package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.No_luggage: ImageVector
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
                moveTo(819f, 932f)
                lineTo(718f, 831f)
                quadToRelative(-8f, 5f, -17.5f, 7f)
                reflectiveQuadToRelative(-20.5f, 2f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(640f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(600f, 840f)
                horizontalLineTo(360f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(320f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(280f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 760f)
                verticalLineToRelative(-447f)
                lineTo(27f, 140f)
                lineToRelative(57f, -57f)
                lineTo(876f, 875f)
                lineToRelative(-57f, 57f)
                close()
                moveTo(360f, 720f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-167f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(247f)
                close()
                moveToRelative(160f, 0f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-7f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(87f)
                close()
                moveToRelative(240f, -75f)
                lineTo(600f, 485f)
                verticalLineToRelative(-125f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(45f)
                lineTo(360f, 245f)
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
                moveTo(440f, 240f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _No_luggage!!
    }

private var _No_luggage: ImageVector? = null

