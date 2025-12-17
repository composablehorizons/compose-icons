package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Factory: ImageVector
    get() {
        if (_Factory != null) return _Factory!!
        
        _Factory = ImageVector.Builder(
            name = "factory",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 800f)
                verticalLineToRelative(-348f)
                quadToRelative(0f, -24f, 13f, -44f)
                reflectiveQuadToRelative(36f, -30f)
                lineToRelative(175f, -74f)
                quadToRelative(20f, -8f, 38f, 3f)
                reflectiveQuadToRelative(18f, 33f)
                verticalLineToRelative(20f)
                lineToRelative(145f, -58f)
                quadToRelative(20f, -8f, 37.5f, 4f)
                reflectiveQuadToRelative(17.5f, 33f)
                verticalLineToRelative(61f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 880f)
                horizontalLineTo(160f)
                close()
                moveToRelative(280f, -160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(-160f, 0f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(320f, 0f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(272f, -380f)
                horizontalLineTo(687f)
                lineToRelative(29f, -225f)
                quadToRelative(2f, -15f, 13.5f, -25f)
                reflectiveQuadToRelative(26.5f, -10f)
                horizontalLineToRelative(49f)
                quadToRelative(15f, 0f, 26f, 10f)
                reflectiveQuadToRelative(13f, 25f)
                lineToRelative(28f, 225f)
                close()
            }
        }.build()
        
        return _Factory!!
    }

private var _Factory: ImageVector? = null

