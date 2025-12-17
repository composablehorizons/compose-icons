package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Calculate: ImageVector
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
                moveTo(320f, 720f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(200f, -30f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-60f)
                horizontalLineTo(520f)
                verticalLineToRelative(60f)
                close()
                moveToRelative(0f, -100f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-60f)
                horizontalLineTo(520f)
                verticalLineToRelative(60f)
                close()
                moveToRelative(44f, -152f)
                lineToRelative(56f, -56f)
                lineToRelative(56f, 56f)
                lineToRelative(42f, -42f)
                lineToRelative(-56f, -58f)
                lineToRelative(56f, -56f)
                lineToRelative(-42f, -42f)
                lineToRelative(-56f, 56f)
                lineToRelative(-56f, -56f)
                lineToRelative(-42f, 42f)
                lineToRelative(56f, 56f)
                lineToRelative(-56f, 58f)
                lineToRelative(42f, 42f)
                close()
                moveToRelative(-314f, -70f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-60f)
                horizontalLineTo(250f)
                verticalLineToRelative(60f)
                close()
                moveToRelative(-50f, 472f)
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
                moveToRelative(0f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-560f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(0f, -560f)
                verticalLineToRelative(560f)
                verticalLineToRelative(-560f)
                close()
            }
        }.build()
        
        return _Calculate!!
    }

private var _Calculate: ImageVector? = null

