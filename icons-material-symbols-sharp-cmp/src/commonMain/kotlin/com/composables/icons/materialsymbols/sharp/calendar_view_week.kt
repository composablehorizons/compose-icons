package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Calendar_view_week: ImageVector
    get() {
        if (_Calendar_view_week != null) return _Calendar_view_week!!
        
        _Calendar_view_week = ImageVector.Builder(
            name = "calendar_view_week",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(520f, 720f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-480f)
                horizontalLineTo(520f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(-180f, 0f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-480f)
                horizontalLineTo(340f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(-180f, 0f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-480f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(540f, 0f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-480f)
                horizontalLineTo(700f)
                verticalLineToRelative(480f)
                close()
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(640f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Calendar_view_week!!
    }

private var _Calendar_view_week: ImageVector? = null

