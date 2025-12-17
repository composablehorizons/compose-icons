package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Not_listed_location: ImageVector
    get() {
        if (_Not_listed_location != null) return _Not_listed_location!!
        
        _Not_listed_location = ImageVector.Builder(
            name = "not_listed_location",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 640f)
                quadToRelative(17f, 0f, 29.5f, -12.5f)
                reflectiveQuadTo(522f, 598f)
                quadToRelative(0f, -17f, -12.5f, -29.5f)
                reflectiveQuadTo(480f, 556f)
                quadToRelative(-17f, 0f, -29.5f, 12.5f)
                reflectiveQuadTo(438f, 598f)
                quadToRelative(0f, 17f, 12.5f, 29.5f)
                reflectiveQuadTo(480f, 640f)
                close()
                moveToRelative(-30f, -124f)
                horizontalLineToRelative(60f)
                quadToRelative(0f, -19f, 1.5f, -30f)
                reflectiveQuadToRelative(4.5f, -18f)
                quadToRelative(4f, -8f, 11.5f, -16.5f)
                reflectiveQuadTo(552f, 426f)
                quadToRelative(21f, -21f, 31.5f, -42f)
                reflectiveQuadToRelative(10.5f, -42f)
                quadToRelative(0f, -47f, -31f, -74.5f)
                reflectiveQuadTo(480f, 240f)
                quadToRelative(-41f, 0f, -72f, 23f)
                reflectiveQuadToRelative(-42f, 61f)
                lineToRelative(54f, 22f)
                quadToRelative(7f, -23f, 23f, -35.5f)
                reflectiveQuadToRelative(37f, -12.5f)
                quadToRelative(24f, 0f, 39f, 13f)
                reflectiveQuadToRelative(15f, 33f)
                quadToRelative(0f, 17f, -7.5f, 29.5f)
                reflectiveQuadTo(500f, 402f)
                quadToRelative(-17f, 14f, -27f, 25.5f)
                reflectiveQuadTo(458f, 450f)
                quadToRelative(-5f, 10f, -6.5f, 24.5f)
                reflectiveQuadTo(450f, 516f)
                close()
                moveToRelative(30f, 364f)
                quadTo(319f, 743f, 239.5f, 625.5f)
                reflectiveQuadTo(160f, 408f)
                quadToRelative(0f, -150f, 96.5f, -239f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(127f, 0f, 223.5f, 89f)
                reflectiveQuadTo(800f, 408f)
                quadToRelative(0f, 100f, -79.5f, 217.5f)
                reflectiveQuadTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Not_listed_location!!
    }

private var _Not_listed_location: ImageVector? = null

