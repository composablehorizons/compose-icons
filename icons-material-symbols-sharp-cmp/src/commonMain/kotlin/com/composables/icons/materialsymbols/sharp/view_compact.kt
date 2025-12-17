package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.View_compact: ImageVector
    get() {
        if (_View_compact != null) return _View_compact!!
        
        _View_compact = ImageVector.Builder(
            name = "view_compact",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 790f)
                verticalLineToRelative(-620f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(620f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -440f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-100f)
                horizontalLineTo(160f)
                verticalLineToRelative(100f)
                close()
                moveToRelative(180f, 0f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-100f)
                horizontalLineTo(340f)
                verticalLineToRelative(100f)
                close()
                moveToRelative(180f, 0f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-100f)
                horizontalLineTo(520f)
                verticalLineToRelative(100f)
                close()
                moveToRelative(180f, 0f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-100f)
                horizontalLineTo(700f)
                verticalLineToRelative(100f)
                close()
                moveToRelative(0f, 180f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-100f)
                horizontalLineTo(700f)
                verticalLineToRelative(100f)
                close()
                moveToRelative(-180f, 0f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-100f)
                horizontalLineTo(520f)
                verticalLineToRelative(100f)
                close()
                moveToRelative(-180f, 0f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-100f)
                horizontalLineTo(340f)
                verticalLineToRelative(100f)
                close()
                moveToRelative(-80f, -100f)
                horizontalLineTo(160f)
                verticalLineToRelative(100f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-100f)
                close()
                moveToRelative(440f, 280f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-100f)
                horizontalLineTo(700f)
                verticalLineToRelative(100f)
                close()
                moveToRelative(-180f, 0f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-100f)
                horizontalLineTo(520f)
                verticalLineToRelative(100f)
                close()
                moveToRelative(-180f, 0f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-100f)
                horizontalLineTo(340f)
                verticalLineToRelative(100f)
                close()
                moveToRelative(-180f, 0f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-100f)
                horizontalLineTo(160f)
                verticalLineToRelative(100f)
                close()
            }
        }.build()
        
        return _View_compact!!
    }

private var _View_compact: ImageVector? = null

