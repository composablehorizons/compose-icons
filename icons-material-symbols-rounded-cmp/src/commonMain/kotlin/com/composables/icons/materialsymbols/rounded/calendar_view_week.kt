package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Calendar_view_week: ImageVector
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
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(360f, -80f)
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
            }
        }.build()
        
        return _Calendar_view_week!!
    }

private var _Calendar_view_week: ImageVector? = null

