package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.View_apps: ImageVector
    get() {
        if (_View_apps != null) return _View_apps!!
        
        _View_apps = ImageVector.Builder(
            name = "view_apps",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 800f)
                verticalLineToRelative(-640f)
                lineToRelative(240f, 40f)
                verticalLineToRelative(560f)
                lineTo(40f, 800f)
                close()
                moveToRelative(320f, -40f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(560f)
                horizontalLineTo(360f)
                close()
                moveToRelative(560f, 40f)
                lineToRelative(-240f, -40f)
                verticalLineToRelative(-560f)
                lineToRelative(240f, -40f)
                verticalLineToRelative(640f)
                close()
                moveToRelative(-800f, -95f)
                lineToRelative(80f, -13f)
                verticalLineToRelative(-424f)
                lineToRelative(-80f, -14f)
                verticalLineToRelative(451f)
                close()
                moveToRelative(320f, -25f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(400f)
                close()
                moveToRelative(400f, 26f)
                verticalLineToRelative(-452f)
                lineToRelative(-80f, 14f)
                verticalLineToRelative(424f)
                lineToRelative(80f, 14f)
                close()
                moveToRelative(-720f, -1f)
                verticalLineToRelative(-451f)
                lineToRelative(80f, 14f)
                verticalLineToRelative(424f)
                lineToRelative(-80f, 13f)
                close()
                moveToRelative(320f, -25f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(400f, 26f)
                lineToRelative(-80f, -14f)
                verticalLineToRelative(-424f)
                lineToRelative(80f, -14f)
                verticalLineToRelative(452f)
                close()
            }
        }.build()
        
        return _View_apps!!
    }

private var _View_apps: ImageVector? = null

