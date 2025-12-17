package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.No_luggage: ImageVector
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
                verticalLineToRelative(-165f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(405f)
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
                moveTo(200f, 840f)
                verticalLineToRelative(-584f)
                lineToRelative(80f, 80f)
                verticalLineToRelative(424f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-24f)
                lineToRelative(80f, 80f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-40f)
                horizontalLineTo(360f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(160f, -120f)
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

