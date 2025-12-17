package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Ophthalmology: ImageVector
    get() {
        if (_Ophthalmology != null) return _Ophthalmology!!
        
        _Ophthalmology = ImageVector.Builder(
            name = "ophthalmology",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 440f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(63f)
                quadToRelative(29f, -69f, 84.5f, -118.5f)
                reflectiveQuadTo(395f, 172f)
                lineToRelative(-23f, -24f)
                lineToRelative(56f, -56f)
                lineToRelative(50f, 49f)
                quadToRelative(12f, 12f, 15.5f, 28.5f)
                reflectiveQuadTo(492f, 202f)
                quadToRelative(-5f, 17f, -18f, 28f)
                reflectiveQuadToRelative(-30f, 13f)
                quadToRelative(-69f, 11f, -121.5f, 56.5f)
                reflectiveQuadTo(250f, 412f)
                lineToRelative(-8f, 28f)
                horizontalLineTo(120f)
                close()
                moveToRelative(480f, 40f)
                quadToRelative(0f, -44f, 16.5f, -84f)
                reflectiveQuadToRelative(53.5f, -62f)
                quadToRelative(-23f, -30f, -53.5f, -51.5f)
                reflectiveQuadTo(549f, 250f)
                lineToRelative(23f, -77f)
                quadToRelative(62f, 18f, 110f, 59f)
                reflectiveQuadToRelative(78f, 98f)
                quadToRelative(42f, 20f, 61f, 61.5f)
                reflectiveQuadToRelative(19f, 88.5f)
                quadToRelative(0f, 47f, -19f, 89f)
                reflectiveQuadToRelative(-61f, 61f)
                quadToRelative(-30f, 57f, -79f, 98f)
                reflectiveQuadToRelative(-110f, 59f)
                lineToRelative(-23f, -77f)
                quadToRelative(36f, -11f, 67.5f, -32.5f)
                reflectiveQuadTo(670f, 626f)
                quadToRelative(-37f, -22f, -53.5f, -62f)
                reflectiveQuadTo(600f, 480f)
                close()
                moveTo(423f, 873f)
                lineToRelative(-56f, -57f)
                lineToRelative(28f, -28f)
                quadToRelative(-72f, -20f, -128f, -69.5f)
                reflectiveQuadTo(183f, 600f)
                horizontalLineToRelative(-63f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(122f)
                lineToRelative(8f, 28f)
                quadToRelative(20f, 67f, 72.5f, 112.5f)
                reflectiveQuadTo(444f, 717f)
                quadToRelative(17f, 2f, 30f, 13.5f)
                reflectiveQuadToRelative(18f, 27.5f)
                quadToRelative(5f, 16f, 1.5f, 32f)
                reflectiveQuadTo(478f, 818f)
                lineToRelative(-55f, 55f)
                close()
            }
        }.build()
        
        return _Ophthalmology!!
    }

private var _Ophthalmology: ImageVector? = null

