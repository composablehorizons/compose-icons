package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Dynamic_feed: ImageVector
    get() {
        if (_Dynamic_feed != null) return _Dynamic_feed!!
        
        _Dynamic_feed = ImageVector.Builder(
            name = "dynamic_feed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 840f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(160f, -160f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(80f)
                horizontalLineTo(240f)
                close()
                moveToRelative(160f, -160f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(400f)
                horizontalLineTo(400f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-160f)
                horizontalLineTo(480f)
                verticalLineToRelative(160f)
                close()
            }
        }.build()
        
        return _Dynamic_feed!!
    }

private var _Dynamic_feed: ImageVector? = null

