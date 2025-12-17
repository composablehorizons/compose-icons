package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Cases: ImageVector
    get() {
        if (_Cases != null) return _Cases!!
        
        _Cases = ImageVector.Builder(
            name = "cases",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 880f)
                verticalLineToRelative(-520f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(440f)
                horizontalLineToRelative(680f)
                verticalLineToRelative(80f)
                horizontalLineTo(40f)
                close()
                moveToRelative(160f, -160f)
                verticalLineToRelative(-520f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(520f)
                horizontalLineTo(200f)
                close()
                moveToRelative(280f, -520f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-80f)
                horizontalLineTo(480f)
                verticalLineToRelative(80f)
                close()
                moveTo(280f, 640f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-360f)
                horizontalLineTo(280f)
                verticalLineToRelative(360f)
                close()
                moveToRelative(0f, -360f)
                verticalLineToRelative(360f)
                verticalLineToRelative(-360f)
                close()
            }
        }.build()
        
        return _Cases!!
    }

private var _Cases: ImageVector? = null

