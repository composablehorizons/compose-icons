package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Medication_liquid: ImageVector
    get() {
        if (_Medication_liquid != null) return _Medication_liquid!!
        
        _Medication_liquid = ImageVector.Builder(
            name = "medication_liquid",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 200f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
                moveToRelative(180f, 500f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-100f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-120f)
                horizontalLineTo(420f)
                verticalLineToRelative(-100f)
                horizontalLineTo(300f)
                verticalLineToRelative(100f)
                horizontalLineTo(200f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(100f)
                close()
                moveTo(80f, 840f)
                verticalLineToRelative(-600f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(600f)
                horizontalLineTo(80f)
                close()
                moveToRelative(680f, -290f)
                quadToRelative(-35f, -17f, -57.5f, -56.5f)
                reflectiveQuadTo(680f, 400f)
                quadToRelative(0f, -68f, 34.5f, -114f)
                reflectiveQuadToRelative(85.5f, -46f)
                quadToRelative(51f, 0f, 85.5f, 46f)
                reflectiveQuadTo(920f, 400f)
                quadToRelative(0f, 54f, -22.5f, 93.5f)
                reflectiveQuadTo(840f, 550f)
                verticalLineToRelative(290f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-290f)
                close()
            }
        }.build()
        
        return _Medication_liquid!!
    }

private var _Medication_liquid: ImageVector? = null

