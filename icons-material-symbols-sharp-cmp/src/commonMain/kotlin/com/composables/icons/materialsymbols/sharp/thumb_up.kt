package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Thumb_up: ImageVector
    get() {
        if (_Thumb_up != null) return _Thumb_up!!
        
        _Thumb_up = ImageVector.Builder(
            name = "thumb_up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 840f)
                verticalLineToRelative(-520f)
                lineToRelative(280f, -280f)
                lineToRelative(74f, 74f)
                lineToRelative(-52f, 206f)
                horizontalLineToRelative(338f)
                verticalLineToRelative(176f)
                lineTo(774f, 840f)
                horizontalLineTo(280f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(360f)
                lineToRelative(120f, -280f)
                verticalLineToRelative(-80f)
                horizontalLineTo(480f)
                lineToRelative(54f, -220f)
                lineToRelative(-174f, 174f)
                verticalLineToRelative(406f)
                close()
                moveToRelative(0f, -406f)
                verticalLineToRelative(406f)
                verticalLineToRelative(-406f)
                close()
                moveTo(80f, 840f)
                verticalLineToRelative(-520f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Thumb_up!!
    }

private var _Thumb_up: ImageVector? = null

