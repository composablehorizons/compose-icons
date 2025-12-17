package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.`9k`: ImageVector
    get() {
        if (_9k != null) return _9k!!
        
        _9k = ImageVector.Builder(
            name = "9k",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(260f, 600f)
                horizontalLineToRelative(180f)
                verticalLineToRelative(-240f)
                horizontalLineTo(260f)
                verticalLineToRelative(140f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(40f)
                horizontalLineTo(260f)
                verticalLineToRelative(60f)
                close()
                moveToRelative(60f, -140f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(200f, 140f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-90f)
                lineToRelative(70f, 90f)
                horizontalLineToRelative(73f)
                lineToRelative(-93f, -120f)
                lineToRelative(93f, -120f)
                horizontalLineToRelative(-73f)
                lineToRelative(-70f, 90f)
                verticalLineToRelative(-90f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(240f)
                close()
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(720f)
                horizontalLineTo(120f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-560f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-560f)
                verticalLineToRelative(560f)
                close()
            }
        }.build()
        
        return _9k!!
    }

private var _9k: ImageVector? = null

