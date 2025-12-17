package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Format_list_numbered: ImageVector
    get() {
        if (_Format_list_numbered != null) return _Format_list_numbered!!
        
        _Format_list_numbered = ImageVector.Builder(
            name = "format_list_numbered",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 880f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-30f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-30f)
                horizontalLineTo(120f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(90f)
                lineToRelative(-40f, 30f)
                lineToRelative(40f, 30f)
                verticalLineToRelative(90f)
                horizontalLineTo(120f)
                close()
                moveToRelative(0f, -280f)
                verticalLineToRelative(-150f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-30f)
                horizontalLineTo(120f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(150f)
                horizontalLineTo(180f)
                verticalLineToRelative(30f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(60f)
                horizontalLineTo(120f)
                close()
                moveToRelative(60f, -280f)
                verticalLineToRelative(-180f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(180f, 440f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(80f)
                horizontalLineTo(360f)
                close()
                moveToRelative(0f, -240f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(80f)
                horizontalLineTo(360f)
                close()
                moveToRelative(0f, -240f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(80f)
                horizontalLineTo(360f)
                close()
            }
        }.build()
        
        return _Format_list_numbered!!
    }

private var _Format_list_numbered: ImageVector? = null

