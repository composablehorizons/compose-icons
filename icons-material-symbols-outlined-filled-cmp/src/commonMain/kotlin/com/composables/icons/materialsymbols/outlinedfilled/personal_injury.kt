package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Personal_injury: ImageVector
    get() {
        if (_Personal_injury != null) return _Personal_injury!!
        
        _Personal_injury = ImageVector.Builder(
            name = "personal_injury",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 400f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                close()
                moveToRelative(-90f, 400f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(360f, 770f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(390f, 740f)
                horizontalLineToRelative(76f)
                lineToRelative(-28f, 60f)
                horizontalLineToRelative(-48f)
                close()
                moveTo(160f, 880f)
                verticalLineToRelative(-271f)
                quadToRelative(0f, -34f, 17f, -62.5f)
                reflectiveQuadToRelative(47f, -44.5f)
                quadToRelative(60f, -30f, 124.5f, -46f)
                reflectiveQuadTo(480f, 440f)
                quadToRelative(30f, 0f, 60.5f, 3f)
                reflectiveQuadToRelative(59.5f, 10f)
                lineToRelative(-97f, 207f)
                horizontalLineTo(390f)
                quadToRelative(-46f, 0f, -78f, 32f)
                reflectiveQuadToRelative(-32f, 78f)
                quadToRelative(0f, 46f, 32f, 78f)
                reflectiveQuadToRelative(78f, 32f)
                horizontalLineTo(160f)
                close()
                moveToRelative(518f, 0f)
                verticalLineToRelative(-403f)
                quadToRelative(15f, 5f, 29.5f, 11.5f)
                reflectiveQuadTo(736f, 502f)
                quadToRelative(30f, 16f, 47f, 44.5f)
                reflectiveQuadToRelative(17f, 62.5f)
                verticalLineToRelative(191f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 880f)
                horizontalLineToRelative(-42f)
                close()
            }
        }.build()
        
        return _Personal_injury!!
    }

private var _Personal_injury: ImageVector? = null

