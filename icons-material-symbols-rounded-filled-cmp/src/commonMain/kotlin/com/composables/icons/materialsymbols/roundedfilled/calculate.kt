package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Calculate: ImageVector
    get() {
        if (_Calculate != null) return _Calculate!!
        
        _Calculate = ImageVector.Builder(
            name = "calculate",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 640f)
                verticalLineToRelative(50f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(350f, 720f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(380f, 690f)
                verticalLineToRelative(-50f)
                horizontalLineToRelative(50f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(460f, 610f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(430f, 580f)
                horizontalLineToRelative(-50f)
                verticalLineToRelative(-50f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(350f, 500f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(320f, 530f)
                verticalLineToRelative(50f)
                horizontalLineToRelative(-50f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(240f, 610f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(270f, 640f)
                horizontalLineToRelative(50f)
                close()
                moveToRelative(230f, 50f)
                horizontalLineToRelative(140f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(720f, 660f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(690f, 630f)
                horizontalLineTo(550f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(520f, 660f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(550f, 690f)
                close()
                moveToRelative(0f, -100f)
                horizontalLineToRelative(140f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(720f, 560f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(690f, 530f)
                horizontalLineTo(550f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(520f, 560f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(550f, 590f)
                close()
                moveToRelative(70f, -208f)
                lineToRelative(35f, 35f)
                quadToRelative(9f, 9f, 21f, 9f)
                reflectiveQuadToRelative(21f, -9f)
                quadToRelative(8f, -8f, 8.5f, -20.5f)
                reflectiveQuadTo(698f, 375f)
                lineToRelative(-36f, -37f)
                lineToRelative(35f, -35f)
                quadToRelative(9f, -9f, 9f, -21f)
                reflectiveQuadToRelative(-9f, -21f)
                quadToRelative(-9f, -9f, -21f, -9f)
                reflectiveQuadToRelative(-21f, 9f)
                lineToRelative(-35f, 35f)
                lineToRelative(-35f, -35f)
                quadToRelative(-9f, -9f, -21f, -9f)
                reflectiveQuadToRelative(-21f, 9f)
                quadToRelative(-9f, 9f, -9f, 21f)
                reflectiveQuadToRelative(9f, 21f)
                lineToRelative(35f, 35f)
                lineToRelative(-36f, 37f)
                quadToRelative(-8f, 9f, -8f, 21f)
                reflectiveQuadToRelative(9f, 21f)
                quadToRelative(9f, 9f, 21f, 9f)
                reflectiveQuadToRelative(21f, -9f)
                lineToRelative(35f, -35f)
                close()
                moveToRelative(-340f, -14f)
                horizontalLineToRelative(140f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(450f, 338f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(420f, 308f)
                horizontalLineTo(280f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(250f, 338f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(280f, 368f)
                close()
                moveToRelative(-80f, 472f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _Calculate!!
    }

private var _Calculate: ImageVector? = null

