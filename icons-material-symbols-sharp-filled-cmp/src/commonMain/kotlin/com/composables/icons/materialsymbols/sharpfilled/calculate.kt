package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Calculate: ImageVector
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
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(720f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Calculate!!
    }

private var _Calculate: ImageVector? = null

