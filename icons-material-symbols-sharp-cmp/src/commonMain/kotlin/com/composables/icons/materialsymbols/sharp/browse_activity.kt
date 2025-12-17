package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Browse_activity: ImageVector
    get() {
        if (_Browse_activity != null) return _Browse_activity!!
        
        _Browse_activity = ImageVector.Builder(
            name = "browse_activity",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 360f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-160f)
                horizontalLineTo(160f)
                verticalLineToRelative(160f)
                horizontalLineTo(80f)
                close()
                moveToRelative(0f, 360f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(280f)
                horizontalLineTo(80f)
                close()
                moveToRelative(0f, -280f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(264f)
                lineToRelative(59f, 115f)
                lineToRelative(134f, -235f)
                horizontalLineToRelative(48f)
                lineToRelative(60f, 120f)
                horizontalLineToRelative(235f)
                verticalLineToRelative(80f)
                horizontalLineTo(595f)
                lineToRelative(-37f, -75f)
                lineToRelative(-135f, 235f)
                horizontalLineToRelative(-48f)
                lineToRelative(-80f, -160f)
                horizontalLineTo(80f)
                close()
                moveTo(40f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(880f)
                verticalLineToRelative(80f)
                horizontalLineTo(40f)
                close()
                moveToRelative(440f, -420f)
                close()
            }
        }.build()
        
        return _Browse_activity!!
    }

private var _Browse_activity: ImageVector? = null

