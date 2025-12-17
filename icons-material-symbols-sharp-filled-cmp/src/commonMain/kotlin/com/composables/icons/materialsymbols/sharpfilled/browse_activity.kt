package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Browse_activity: ImageVector
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
                moveTo(40f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(880f)
                verticalLineToRelative(80f)
                horizontalLineTo(40f)
                close()
                moveToRelative(40f, -120f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(215f)
                lineToRelative(80f, 160f)
                horizontalLineToRelative(48f)
                lineToRelative(135f, -235f)
                lineToRelative(37f, 75f)
                horizontalLineToRelative(285f)
                verticalLineToRelative(280f)
                horizontalLineTo(80f)
                close()
                moveToRelative(323f, -245f)
                lineToRelative(-59f, -115f)
                horizontalLineTo(80f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(240f)
                horizontalLineTo(645f)
                lineToRelative(-60f, -120f)
                horizontalLineToRelative(-48f)
                lineTo(403f, 475f)
                close()
            }
        }.build()
        
        return _Browse_activity!!
    }

private var _Browse_activity: ImageVector? = null

