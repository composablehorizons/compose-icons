package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Hardware: ImageVector
    get() {
        if (_Hardware != null) return _Hardware!!
        
        _Hardware = ImageVector.Builder(
            name = "hardware",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(360f, 800f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(280f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(560f, 840f)
                horizontalLineTo(400f)
                close()
                moveToRelative(-40f, -400f)
                verticalLineToRelative(-120f)
                horizontalLineTo(208f)
                quadToRelative(-19f, 0f, -31f, -14f)
                reflectiveQuadToRelative(-8f, -33f)
                quadToRelative(13f, -68f, 67.5f, -110.5f)
                reflectiveQuadTo(360f, 120f)
                horizontalLineToRelative(200f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(600f, 160f)
                verticalLineToRelative(80f)
                lineToRelative(102f, -102f)
                quadToRelative(8f, -8f, 19.5f, -13f)
                reflectiveQuadToRelative(23.5f, -5f)
                horizontalLineToRelative(15f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 160f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 440f)
                horizontalLineToRelative(-15f)
                quadToRelative(-12f, 0f, -23.5f, -5f)
                reflectiveQuadTo(702f, 422f)
                lineTo(600f, 320f)
                verticalLineToRelative(120f)
                horizontalLineTo(360f)
                close()
            }
        }.build()
        
        return _Hardware!!
    }

private var _Hardware: ImageVector? = null

