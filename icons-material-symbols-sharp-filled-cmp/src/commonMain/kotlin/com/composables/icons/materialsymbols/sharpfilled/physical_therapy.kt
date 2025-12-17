package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Physical_therapy: ImageVector
    get() {
        if (_Physical_therapy != null) return _Physical_therapy!!
        
        _Physical_therapy = ImageVector.Builder(
            name = "physical_therapy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(640f, 680f)
                horizontalLineTo(375f)
                quadToRelative(-23f, 0f, -37.5f, 14f)
                reflectiveQuadTo(320f, 726f)
                quadToRelative(-3f, 18f, 5.5f, 35f)
                reflectiveQuadToRelative(30.5f, 25f)
                lineToRelative(229f, 91f)
                quadToRelative(10f, 4f, 19.5f, 2.5f)
                reflectiveQuadTo(622f, 873f)
                quadToRelative(8f, -5f, 13f, -13.5f)
                reflectiveQuadToRelative(5f, -19.5f)
                verticalLineToRelative(-160f)
                close()
                moveTo(400f, 80f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                close()
                moveToRelative(369f, 360f)
                quadToRelative(29f, 0f, 50f, 19.5f)
                reflectiveQuadToRelative(21f, 48.5f)
                quadToRelative(0f, 23f, -13f, 42f)
                reflectiveQuadToRelative(-35f, 27f)
                lineToRelative(-72f, 23f)
                horizontalLineTo(375f)
                quadToRelative(-57f, 0f, -96f, 39f)
                reflectiveQuadToRelative(-39f, 96f)
                quadToRelative(0f, 18f, 5f, 34.5f)
                reflectiveQuadToRelative(13f, 30.5f)
                horizontalLineTo(120f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(320f, 440f)
                horizontalLineToRelative(449f)
                close()
            }
        }.build()
        
        return _Physical_therapy!!
    }

private var _Physical_therapy: ImageVector? = null

