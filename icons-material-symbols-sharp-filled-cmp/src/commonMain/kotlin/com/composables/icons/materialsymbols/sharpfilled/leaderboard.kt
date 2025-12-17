package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Leaderboard: ImageVector
    get() {
        if (_Leaderboard != null) return _Leaderboard!!
        
        _Leaderboard = ImageVector.Builder(
            name = "leaderboard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 840f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(220f)
                verticalLineToRelative(480f)
                horizontalLineTo(80f)
                close()
                moveToRelative(290f, 0f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(220f)
                verticalLineToRelative(720f)
                horizontalLineTo(370f)
                close()
                moveToRelative(290f, 0f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(220f)
                verticalLineToRelative(400f)
                horizontalLineTo(660f)
                close()
            }
        }.build()
        
        return _Leaderboard!!
    }

private var _Leaderboard: ImageVector? = null

