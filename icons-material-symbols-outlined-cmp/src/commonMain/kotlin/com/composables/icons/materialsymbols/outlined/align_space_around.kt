package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Align_space_around: ImageVector
    get() {
        if (_Align_space_around != null) return _Align_space_around!!
        
        _Align_space_around = ImageVector.Builder(
            name = "align_space_around",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(0f, 720f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(200f, -520f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(120f)
                horizontalLineTo(280f)
                close()
                moveToRelative(0f, 360f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(120f)
                horizontalLineTo(280f)
                close()
            }
        }.build()
        
        return _Align_space_around!!
    }

private var _Align_space_around: ImageVector? = null

