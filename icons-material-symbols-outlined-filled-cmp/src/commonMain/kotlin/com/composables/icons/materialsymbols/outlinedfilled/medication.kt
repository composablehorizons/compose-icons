package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Medication: ImageVector
    get() {
        if (_Medication != null) return _Medication!!
        
        _Medication = ImageVector.Builder(
            name = "medication",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(420f, 700f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-100f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-120f)
                horizontalLineTo(540f)
                verticalLineToRelative(-100f)
                horizontalLineTo(420f)
                verticalLineToRelative(100f)
                horizontalLineTo(320f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(100f)
                close()
                moveTo(280f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 760f)
                verticalLineToRelative(-440f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(280f, 240f)
                horizontalLineToRelative(400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 320f)
                verticalLineToRelative(440f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(680f, 840f)
                horizontalLineTo(280f)
                close()
                moveToRelative(-40f, -640f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(80f)
                horizontalLineTo(240f)
                close()
            }
        }.build()
        
        return _Medication!!
    }

private var _Medication: ImageVector? = null

