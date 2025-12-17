package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.View_compact: ImageVector
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
                moveTo(880f, 790f)
                verticalLineToRelative(-620f)
                verticalLineToRelative(620f)
                close()
                moveTo(80f, 350f)
                verticalLineToRelative(-180f)
                horizontalLineToRelative(170f)
                verticalLineToRelative(180f)
                horizontalLineTo(80f)
                close()
                moveToRelative(210f, 0f)
                verticalLineToRelative(-180f)
                horizontalLineToRelative(170f)
                verticalLineToRelative(180f)
                horizontalLineTo(290f)
                close()
                moveToRelative(210f, 0f)
                verticalLineToRelative(-180f)
                horizontalLineToRelative(170f)
                verticalLineToRelative(180f)
                horizontalLineTo(500f)
                close()
                moveToRelative(210f, 0f)
                verticalLineToRelative(-180f)
                horizontalLineToRelative(170f)
                verticalLineToRelative(180f)
                horizontalLineTo(710f)
                close()
                moveToRelative(0f, 220f)
                verticalLineToRelative(-180f)
                horizontalLineToRelative(170f)
                verticalLineToRelative(180f)
                horizontalLineTo(710f)
                close()
                moveToRelative(-210f, 0f)
                verticalLineToRelative(-180f)
                horizontalLineToRelative(170f)
                verticalLineToRelative(180f)
                horizontalLineTo(500f)
                close()
                moveToRelative(-210f, 0f)
                verticalLineToRelative(-180f)
                horizontalLineToRelative(170f)
                verticalLineToRelative(180f)
                horizontalLineTo(290f)
                close()
                moveToRelative(-210f, 0f)
                verticalLineToRelative(-180f)
                horizontalLineToRelative(170f)
                verticalLineToRelative(180f)
                horizontalLineTo(80f)
                close()
                moveToRelative(630f, 220f)
                verticalLineToRelative(-180f)
                horizontalLineToRelative(170f)
                verticalLineToRelative(180f)
                horizontalLineTo(710f)
                close()
                moveToRelative(-210f, 0f)
                verticalLineToRelative(-180f)
                horizontalLineToRelative(170f)
                verticalLineToRelative(180f)
                horizontalLineTo(500f)
                close()
                moveToRelative(-210f, 0f)
                verticalLineToRelative(-180f)
                horizontalLineToRelative(170f)
                verticalLineToRelative(180f)
                horizontalLineTo(290f)
                close()
                moveToRelative(-210f, 0f)
                verticalLineToRelative(-180f)
                horizontalLineToRelative(170f)
                verticalLineToRelative(180f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _View_compact!!
    }

private var _View_compact: ImageVector? = null

