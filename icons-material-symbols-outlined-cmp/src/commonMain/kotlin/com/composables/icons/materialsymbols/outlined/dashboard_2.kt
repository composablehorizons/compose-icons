package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Dashboard_2: ImageVector
    get() {
        if (_Dashboard_2 != null) return _Dashboard_2!!
        
        _Dashboard_2 = ImageVector.Builder(
            name = "dashboard_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(600f, 800f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(280f)
                horizontalLineTo(600f)
                close()
                moveTo(440f, 440f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(440f)
                verticalLineToRelative(280f)
                horizontalLineTo(440f)
                close()
                moveTo(80f, 800f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(440f)
                verticalLineToRelative(280f)
                horizontalLineTo(80f)
                close()
                moveToRelative(0f, -360f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(280f)
                horizontalLineTo(80f)
                close()
                moveToRelative(440f, -80f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(-120f)
                horizontalLineTo(520f)
                verticalLineToRelative(120f)
                close()
                moveTo(160f, 720f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(-120f)
                horizontalLineTo(160f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(520f, 0f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineTo(680f)
                verticalLineToRelative(120f)
                close()
                moveTo(160f, 360f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineTo(160f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(360f, 0f)
                close()
                moveToRelative(-80f, 240f)
                close()
                moveToRelative(240f, 0f)
                close()
                moveTo(280f, 360f)
                close()
            }
        }.build()
        
        return _Dashboard_2!!
    }

private var _Dashboard_2: ImageVector? = null

